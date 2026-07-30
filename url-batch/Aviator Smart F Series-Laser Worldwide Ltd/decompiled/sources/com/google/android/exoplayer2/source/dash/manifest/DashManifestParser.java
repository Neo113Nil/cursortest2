package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.arthenica.ffmpegkit.x;
import com.baidu.ar.util.SystemInfoUtil;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

@Deprecated
/* loaded from: classes3.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    protected static final class RepresentationInfo {
        public final ImmutableList<BaseUrl> baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;

        @Nullable
        public final String drmSchemeType;
        public final List<Descriptor> essentialProperties;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List<Descriptor> supplementalProperties;

        public RepresentationInfo(Format format, List<BaseUrl> list, SegmentBase segmentBase, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j8) {
            this.format = format;
            this.baseUrls = ImmutableList.copyOf((Collection) list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j8;
        }
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j8, long j9, int i8, long j10) {
        int ceilDivide = i8 >= 0 ? i8 + 1 : (int) Util.ceilDivide(j10 - j8, j9);
        for (int i9 = 0; i9 < ceilDivide; i9++) {
            list.add(buildSegmentTimelineElement(j8, j9));
            j8 += j9;
        }
        return j8;
    }

    private static int checkContentTypeConsistency(int i8, int i9) {
        if (i8 == -1) {
            return i9;
        }
        if (i9 == -1) {
            return i8;
        }
        Assertions.checkState(i8 == i9);
        return i8;
    }

    @Nullable
    private static String checkLanguageConsistency(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i8 = 0;
        while (true) {
            if (i8 >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i8);
            if (C.CLEARKEY_UUID.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                arrayList.remove(i8);
                break;
            }
            i8++;
        }
        if (str == null) {
            return;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i9);
            if (C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i9, new DrmInitData.SchemeData(C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                int i8 = 0;
                while (true) {
                    if (i8 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i8).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i8++;
                }
            }
        }
    }

    private static long getFinalAvailabilityTimeOffset(long j8, long j9) {
        if (j9 != C.TIME_UNSET) {
            j8 = j9;
        }
        return j8 == Long.MAX_VALUE ? C.TIME_UNSET : j8;
    }

    @Nullable
    private static String getSampleMimeType(@Nullable String str, @Nullable String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (MimeTypes.isText(str)) {
            return str;
        }
        if (MimeTypes.isImage(str)) {
            return str;
        }
        if (!MimeTypes.APPLICATION_MP4.equals(str)) {
            return null;
        }
        String mediaMimeType = MimeTypes.getMediaMimeType(str2);
        return MimeTypes.TEXT_VTT.equals(mediaMimeType) ? MimeTypes.APPLICATION_MP4VTT : mediaMimeType;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) {
        if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i8 = 1;
            while (i8 != 0) {
                xmlPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                    i8++;
                } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                    i8--;
                }
            }
        }
    }

    protected static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Descriptor descriptor = list.get(i8);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    protected static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Descriptor descriptor = list.get(i8);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    protected static long parseDateTime(XmlPullParser xmlPullParser, String str, long j8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j8 : Util.parseXsDateTime(attributeValue);
    }

    protected static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) {
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", null);
        String parseString3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(parseString, parseString2, parseString3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        char c8;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String lowerCase = Ascii.toLowerCase(attributeValue);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case 1596796:
                if (lowerCase.equals("4000")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case 2937391:
                if (lowerCase.equals("a000")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case 3094035:
                if (lowerCase.equals("f801")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 3133436:
                if (lowerCase.equals("fa01")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
        }
        return -1;
    }

    protected static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt <= 0 || parseInt >= 33) {
            return -1;
        }
        return parseInt;
    }

    protected static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    protected static long parseDuration(XmlPullParser xmlPullParser, String str, long j8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j8 : Util.parseXsDuration(attributeValue);
    }

    protected static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            Descriptor descriptor = list.get(i8);
            String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && MimeTypes.CODEC_E_AC3_JOC.equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    protected static float parseFloat(XmlPullParser xmlPullParser, String str, float f8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f8 : Float.parseFloat(attributeValue);
    }

    protected static float parseFrameRate(XmlPullParser xmlPullParser, float f8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f8;
        }
        Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
        if (!matcher.matches()) {
            return f8;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    protected static int parseInt(XmlPullParser xmlPullParser, String str, int i8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i8 : Integer.parseInt(attributeValue);
    }

    protected static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            Descriptor descriptor = list.get(i8);
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    protected static long parseLong(XmlPullParser xmlPullParser, String str, long j8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j8 : Long.parseLong(attributeValue);
    }

    protected static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt < 0) {
            return -1;
        }
        int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
        if (parseInt < iArr.length) {
            return iArr[parseInt];
        }
        return -1;
    }

    protected static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static String parseText(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return str2;
    }

    protected AdaptationSet buildAdaptationSet(long j8, int i8, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        return new AdaptationSet(j8, i8, list, list2, list3, list4);
    }

    protected EventMessage buildEvent(String str, String str2, long j8, long j9, byte[] bArr) {
        return new EventMessage(str, str2, j9, j8, bArr);
    }

    protected EventStream buildEventStream(String str, String str2, long j8, long[] jArr, EventMessage[] eventMessageArr) {
        return new EventStream(str, str2, j8, jArr, eventMessageArr);
    }

    protected Format buildFormat(@Nullable String str, @Nullable String str2, int i8, int i9, float f8, int i10, int i11, int i12, @Nullable String str3, List<Descriptor> list, List<Descriptor> list2, @Nullable String str4, List<Descriptor> list3, List<Descriptor> list4) {
        String str5 = str4;
        String sampleMimeType = getSampleMimeType(str2, str5);
        if (MimeTypes.AUDIO_E_AC3.equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if (MimeTypes.AUDIO_E_AC3_JOC.equals(sampleMimeType)) {
                str5 = MimeTypes.CODEC_E_AC3_JOC;
            }
        }
        int parseSelectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int parseRoleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> parseTileCountFromProperties = parseTileCountFromProperties(list3);
        Format.Builder language = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str5).setPeakBitrate(i12).setSelectionFlags(parseSelectionFlagsFromRoleDescriptors).setRoleFlags(parseRoleFlagsFromRoleDescriptors).setLanguage(str3);
        int i13 = -1;
        Format.Builder tileCountVertical = language.setTileCountHorizontal(parseTileCountFromProperties != null ? ((Integer) parseTileCountFromProperties.first).intValue() : -1).setTileCountVertical(parseTileCountFromProperties != null ? ((Integer) parseTileCountFromProperties.second).intValue() : -1);
        if (MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i8).setHeight(i9).setFrameRate(f8);
        } else if (MimeTypes.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i10).setSampleRate(i11);
        } else if (MimeTypes.isText(sampleMimeType)) {
            if (MimeTypes.APPLICATION_CEA608.equals(sampleMimeType)) {
                i13 = parseCea608AccessibilityChannel(list2);
            } else if (MimeTypes.APPLICATION_CEA708.equals(sampleMimeType)) {
                i13 = parseCea708AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(i13);
        } else if (MimeTypes.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i8).setHeight(i9);
        }
        return tileCountVertical.build();
    }

    protected DashManifest buildMediaPresentationDescription(long j8, long j9, long j10, boolean z7, long j11, long j12, long j13, long j14, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        return new DashManifest(j8, j9, j10, z7, j11, j12, j13, j14, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    protected Period buildPeriod(@Nullable String str, long j8, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        return new Period(str, j8, list, list2, descriptor);
    }

    protected RangedUri buildRangedUri(String str, long j8, long j9) {
        return new RangedUri(str, j8, j9);
    }

    protected Representation buildRepresentation(RepresentationInfo representationInfo, @Nullable String str, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        Format.Builder buildUpon = representationInfo.format.buildUpon();
        if (str != null) {
            buildUpon.setLabel(str);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            buildUpon.setDrmInitData(new DrmInitData(str2, arrayList3));
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, buildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    protected SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j8, long j9, long j10, long j11, @Nullable List<SegmentBase.SegmentTimelineElement> list, long j12, @Nullable List<RangedUri> list2, long j13, long j14) {
        return new SegmentBase.SegmentList(rangedUri, j8, j9, j10, j11, list, j12, list2, Util.msToUs(j13), Util.msToUs(j14));
    }

    protected SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j8, long j9, long j10, long j11, long j12, List<SegmentBase.SegmentTimelineElement> list, long j13, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j14, long j15) {
        return new SegmentBase.SegmentTemplate(rangedUri, j8, j9, j10, j11, j12, list, j13, urlTemplate, urlTemplate2, Util.msToUs(j14), Util.msToUs(j15));
    }

    protected SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j8, long j9) {
        return new SegmentBase.SegmentTimelineElement(j8, j9);
    }

    protected SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j8, long j9, long j10, long j11) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j8, j9, j10, j11);
    }

    protected UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x030f A[LOOP:0: B:2:0x007e->B:10:0x030f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02d0 A[EDGE_INSN: B:11:0x02d0->B:12:0x02d0 BREAK  A[LOOP:0: B:2:0x007e->B:10:0x030f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AdaptationSet parseAdaptationSet(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable SegmentBase segmentBase, long j8, long j9, long j10, long j11, long j12, boolean z7) {
        long j13;
        ArrayList<Descriptor> arrayList;
        Object obj;
        long j14;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList<DrmInitData.SchemeData> arrayList7;
        String str;
        String str2;
        ArrayList arrayList8;
        int i8;
        ArrayList<Descriptor> arrayList9;
        long parseAvailabilityTimeOffsetUs;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long parseLong = parseLong(xmlPullParser2, "id", -1L);
        int parseContentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int parseInt = parseInt(xmlPullParser2, x.KEY_WIDTH, -1);
        int parseInt2 = parseInt(xmlPullParser2, x.KEY_HEIGHT, -1);
        float parseFrameRate = parseFrameRate(xmlPullParser2, -1.0f);
        int parseInt3 = parseInt(xmlPullParser2, "audioSamplingRate", -1);
        String str3 = BaseWatchFaceProvider.LANG;
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, BaseWatchFaceProvider.LANG);
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList<DrmInitData.SchemeData> arrayList10 = new ArrayList<>();
        ArrayList<Descriptor> arrayList11 = new ArrayList<>();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        SegmentBase segmentBase2 = segmentBase;
        int i9 = parseContentType;
        String str4 = attributeValue3;
        String str5 = attributeValue4;
        String str6 = null;
        int i10 = -1;
        boolean z8 = false;
        long j15 = j9;
        long j16 = j10;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z8) {
                    j15 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser2, j15);
                    z8 = true;
                }
                j13 = j16;
                arrayList = arrayList11;
                arrayList17.addAll(dashManifestParser.parseBaseUrl(xmlPullParser2, list, z7));
            } else {
                j13 = j16;
                arrayList = arrayList11;
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                    Object obj2 = parseContentProtection.first;
                    if (obj2 != null) {
                        str6 = (String) obj2;
                    }
                    Object obj3 = parseContentProtection.second;
                    if (obj3 != null) {
                        arrayList10.add((DrmInitData.SchemeData) obj3);
                    }
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentComponent")) {
                        String checkLanguageConsistency = checkLanguageConsistency(str4, xmlPullParser2.getAttributeValue(null, str3));
                        int checkContentTypeConsistency = checkContentTypeConsistency(i9, parseContentType(xmlPullParser));
                        str2 = checkLanguageConsistency;
                        obj = null;
                        j14 = j15;
                        arrayList2 = arrayList17;
                        arrayList8 = arrayList16;
                        arrayList3 = arrayList15;
                        arrayList4 = arrayList14;
                        arrayList5 = arrayList13;
                        arrayList6 = arrayList12;
                        arrayList7 = arrayList10;
                        str = str3;
                        i8 = checkContentTypeConsistency;
                        arrayList9 = arrayList;
                    } else {
                        int i11 = i9;
                        String str7 = str4;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Role")) {
                            arrayList13.add(parseDescriptor(xmlPullParser2, "Role"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AudioChannelConfiguration")) {
                            i10 = parseAudioChannelConfiguration(xmlPullParser);
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Accessibility")) {
                            arrayList12.add(parseDescriptor(xmlPullParser2, "Accessibility"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                            arrayList14.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                            arrayList15.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Representation")) {
                            j14 = j15;
                            arrayList2 = arrayList17;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList14;
                            arrayList5 = arrayList13;
                            arrayList6 = arrayList12;
                            arrayList7 = arrayList10;
                            str = str3;
                            obj = null;
                            str2 = str7;
                            RepresentationInfo parseRepresentation = parseRepresentation(xmlPullParser, !arrayList17.isEmpty() ? arrayList17 : list, attributeValue, attributeValue2, parseInt, parseInt2, parseFrameRate, i10, parseInt3, str7, arrayList5, arrayList6, arrayList4, arrayList3, segmentBase2, j11, j8, j14, j13, j12, z7);
                            int checkContentTypeConsistency2 = checkContentTypeConsistency(i11, MimeTypes.getTrackType(parseRepresentation.format.sampleMimeType));
                            arrayList8 = arrayList16;
                            arrayList8.add(parseRepresentation);
                            xmlPullParser2 = xmlPullParser;
                            i8 = checkContentTypeConsistency2;
                            arrayList9 = arrayList;
                        } else {
                            obj = null;
                            j14 = j15;
                            arrayList2 = arrayList17;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList14;
                            arrayList5 = arrayList13;
                            arrayList6 = arrayList12;
                            arrayList7 = arrayList10;
                            str = str3;
                            str2 = str7;
                            arrayList8 = arrayList16;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                                segmentBase2 = parseSegmentBase(xmlPullParser, (SegmentBase.SingleSegmentBase) segmentBase2);
                                i8 = i11;
                                arrayList9 = arrayList;
                                j16 = j13;
                                xmlPullParser2 = xmlPullParser;
                            } else {
                                if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                                    parseAvailabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j13);
                                    i8 = i11;
                                    segmentBase2 = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentBase2, j11, j8, j14, parseAvailabilityTimeOffsetUs, j12);
                                    xmlPullParser2 = xmlPullParser;
                                } else {
                                    j16 = j13;
                                    i8 = i11;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                                        parseAvailabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j16);
                                        xmlPullParser2 = xmlPullParser;
                                        segmentBase2 = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentBase2, arrayList3, j11, j8, j14, parseAvailabilityTimeOffsetUs, j12);
                                    } else {
                                        xmlPullParser2 = xmlPullParser;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                            arrayList9 = arrayList;
                                            arrayList9.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                        } else {
                                            arrayList9 = arrayList;
                                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Label")) {
                                                str5 = parseLabel(xmlPullParser);
                                            } else if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                                                parseAdaptationSetChild(xmlPullParser);
                                            }
                                        }
                                    }
                                }
                                j16 = parseAvailabilityTimeOffsetUs;
                                arrayList9 = arrayList;
                            }
                            if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                                break;
                            }
                            arrayList11 = arrayList9;
                            arrayList16 = arrayList8;
                            j15 = j14;
                            arrayList17 = arrayList2;
                            arrayList15 = arrayList3;
                            arrayList14 = arrayList4;
                            arrayList13 = arrayList5;
                            arrayList12 = arrayList6;
                            arrayList10 = arrayList7;
                            str3 = str;
                            i9 = i8;
                            str4 = str2;
                            dashManifestParser = this;
                        }
                        obj = null;
                        j14 = j15;
                        arrayList2 = arrayList17;
                        arrayList3 = arrayList15;
                        arrayList4 = arrayList14;
                        arrayList5 = arrayList13;
                        arrayList6 = arrayList12;
                        arrayList7 = arrayList10;
                        str = str3;
                        i8 = i11;
                        str2 = str7;
                        arrayList9 = arrayList;
                        j16 = j13;
                        arrayList8 = arrayList16;
                        if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                        }
                    }
                    j16 = j13;
                    if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                    }
                }
            }
            j16 = j13;
            arrayList2 = arrayList17;
            arrayList8 = arrayList16;
            arrayList3 = arrayList15;
            arrayList4 = arrayList14;
            arrayList5 = arrayList13;
            arrayList6 = arrayList12;
            arrayList7 = arrayList10;
            str = str3;
            i8 = i9;
            str2 = str4;
            obj = null;
            j14 = j15;
            arrayList9 = arrayList;
            if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
            }
        }
        ArrayList arrayList18 = new ArrayList(arrayList8.size());
        for (int i12 = 0; i12 < arrayList8.size(); i12++) {
            arrayList18.add(buildRepresentation((RepresentationInfo) arrayList8.get(i12), str5, str6, arrayList7, arrayList9));
        }
        return buildAdaptationSet(parseLong, i8, arrayList18, arrayList6, arrayList4, arrayList3);
    }

    protected void parseAdaptationSetChild(XmlPullParser xmlPullParser) {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) {
        char c8;
        String parseString = parseString(xmlPullParser, "schemeIdUri", null);
        parseString.hashCode();
        int i8 = -1;
        switch (parseString.hashCode()) {
            case -2128649360:
                if (parseString.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1352850286:
                if (parseString.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -1138141449:
                if (parseString.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -986633423:
                if (parseString.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -79006963:
                if (parseString.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 312179081:
                if (parseString.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 2036691300:
                if (parseString.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
            case 4:
                i8 = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case 1:
                i8 = parseInt(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                i8 = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case 3:
                i8 = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case 5:
                i8 = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return i8;
    }

    protected long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j8;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected List<BaseUrl> parseBaseUrl(XmlPullParser xmlPullParser, List<BaseUrl> list, boolean z7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z7 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String parseText = parseText(xmlPullParser, "BaseURL");
        if (UriUtil.isAbsolute(parseText)) {
            if (attributeValue3 == null) {
                attributeValue3 = parseText;
            }
            return Lists.newArrayList(new BaseUrl(parseText, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            BaseUrl baseUrl = list.get(i8);
            String resolve = UriUtil.resolve(baseUrl.url, parseText);
            String str = attributeValue3 == null ? resolve : attributeValue3;
            if (z7) {
                parseInt = baseUrl.priority;
                parseInt2 = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new BaseUrl(resolve, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xmlPullParser) {
        String str;
        ?? r32;
        String str2;
        String str3;
        ?? r42;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue);
            lowerCase.hashCode();
            switch (lowerCase) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    r32 = C.CLEARKEY_UUID;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r42 = str2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    r32 = C.PLAYREADY_UUID;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r42 = str2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    r32 = C.WIDEVINE_UUID;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r42 = str2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    str = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValueIgnorePrefix = XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(attributeValueIgnorePrefix) && !"00000000-0000-0000-0000-000000000000".equals(attributeValueIgnorePrefix)) {
                        String[] split = attributeValueIgnorePrefix.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i8 = 0; i8 < split.length; i8++) {
                            uuidArr[i8] = UUID.fromString(split[i8]);
                        }
                        r32 = C.COMMON_PSSH_UUID;
                        str3 = null;
                        r42 = PsshAtomUtil.buildPsshAtom(r32, uuidArr, null);
                        break;
                    } else {
                        r32 = null;
                        str2 = r32;
                        str3 = str2;
                        r42 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if (!XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r42 = r42;
                } else if (!XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r42 = r42;
                } else if (r42 == 0 && XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                    byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                    UUID parseUuid = PsshAtomUtil.parseUuid(decode);
                    if (parseUuid == null) {
                        Log.w(TAG, "Skipping malformed cenc:pssh data");
                        r32 = parseUuid;
                        r42 = 0;
                    } else {
                        r42 = decode;
                        r32 = parseUuid;
                    }
                } else {
                    if (r42 == 0) {
                        ?? r62 = C.PLAYREADY_UUID;
                        if (r62.equals(r32) && XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r42 = PsshAtomUtil.buildPsshAtom(r62, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    maybeSkipTag(xmlPullParser);
                    r42 = r42;
                }
            } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r32 != null ? new DrmInitData.SchemeData(r32, str3, MimeTypes.VIDEO_MP4, r42) : null);
        }
        str = null;
        r32 = null;
        str2 = r32;
        str3 = str2;
        r42 = str2;
        do {
            xmlPullParser.next();
            if (!XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl")) {
            }
            if (!XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r32 != null ? new DrmInitData.SchemeData(r32, str3, MimeTypes.VIDEO_MP4, r42) : null);
    }

    protected int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    protected Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j8, long j9, ByteArrayOutputStream byteArrayOutputStream) {
        long parseLong = parseLong(xmlPullParser, "id", 0L);
        long parseLong2 = parseLong(xmlPullParser, "duration", C.TIME_UNSET);
        long parseLong3 = parseLong(xmlPullParser, "presentationTime", 0L);
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(parseLong2, 1000L, j8);
        long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parseLong3 - j9, 1000000L, j8);
        String parseString = parseString(xmlPullParser, "messageData", null);
        byte[] parseEventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(scaleLargeTimestamp2);
        if (parseString != null) {
            parseEventObject = Util.getUtf8Bytes(parseString);
        }
        return Pair.create(valueOf, buildEvent(str, str2, parseLong, scaleLargeTimestamp, parseEventObject));
    }

    protected byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, Charsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i8 = 0; i8 < xmlPullParser.getAttributeCount(); i8++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i8), xmlPullParser.getAttributeName(i8), xmlPullParser.getAttributeValue(i8));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected EventStream parseEventStream(XmlPullParser xmlPullParser) {
        ByteArrayOutputStream byteArrayOutputStream;
        long j8;
        ArrayList arrayList;
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", "");
        long parseLong = parseLong(xmlPullParser, "timescale", 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j9 = parseLong2;
                j8 = parseLong2;
                arrayList = arrayList2;
                arrayList.add(parseEvent(xmlPullParser, parseString, parseString2, parseLong, j9, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j8 = parseLong2;
                arrayList = arrayList2;
                maybeSkipTag(xmlPullParser);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            parseLong2 = j8;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            Pair pair = (Pair) arrayList.get(i8);
            jArr[i8] = ((Long) pair.first).longValue();
            eventMessageArr[i8] = (EventMessage) pair.second;
        }
        return buildEventStream(parseString, parseString2, parseLong, jArr, eventMessageArr);
    }

    protected RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
    }

    protected String parseLabel(XmlPullParser xmlPullParser) {
        return parseText(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e7 A[LOOP:0: B:18:0x00a4->B:26:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected DashManifest parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) {
        long j8;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j9;
        Throwable th;
        ArrayList arrayList3;
        long j10;
        boolean z7;
        long j11;
        DashManifestParser dashManifestParser = this;
        boolean isDvbProfileDeclared = dashManifestParser.isDvbProfileDeclared(dashManifestParser.parseProfiles(xmlPullParser, "profiles", new String[0]));
        long j12 = C.TIME_UNSET;
        long parseDateTime = parseDateTime(xmlPullParser, "availabilityStartTime", C.TIME_UNSET);
        long parseDuration = parseDuration(xmlPullParser, "mediaPresentationDuration", C.TIME_UNSET);
        long parseDuration2 = parseDuration(xmlPullParser, "minBufferTime", C.TIME_UNSET);
        Throwable th2 = null;
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long parseDuration3 = equals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", C.TIME_UNSET) : -9223372036854775807L;
        long parseDuration4 = equals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", C.TIME_UNSET) : -9223372036854775807L;
        long parseDuration5 = equals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", C.TIME_UNSET) : -9223372036854775807L;
        long parseDateTime2 = parseDateTime(xmlPullParser, "publishTime", C.TIME_UNSET);
        long j13 = equals ? 0L : -9223372036854775807L;
        ArrayList newArrayList = Lists.newArrayList(new BaseUrl(uri.toString(), uri.toString(), isDvbProfileDeclared ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long j14 = equals ? -9223372036854775807L : 0L;
        ProgramInformation programInformation = null;
        UtcTimingElement utcTimingElement = null;
        Uri uri2 = null;
        ServiceDescriptionElement serviceDescriptionElement = null;
        boolean z8 = false;
        boolean z9 = false;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z8) {
                    j13 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j13);
                    z8 = true;
                }
                arrayList5.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, newArrayList, isDvbProfileDeclared));
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ProgramInformation")) {
                programInformation = parseProgramInformation(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "UTCTiming")) {
                utcTimingElement = parseUtcTiming(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Location")) {
                uri2 = UriUtil.resolveToUri(uri.toString(), xmlPullParser.nextText());
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ServiceDescription")) {
                serviceDescriptionElement = parseServiceDescription(xmlPullParser);
            } else {
                if (!XmlPullParserUtil.isStartTag(xmlPullParser, "Period") || z9) {
                    j8 = j13;
                    arrayList = arrayList5;
                    arrayList2 = newArrayList;
                    j9 = j12;
                    th = th2;
                    arrayList3 = arrayList4;
                    maybeSkipTag(xmlPullParser);
                } else {
                    j8 = j13;
                    ArrayList arrayList6 = arrayList4;
                    arrayList = arrayList5;
                    arrayList2 = newArrayList;
                    j9 = j12;
                    th = th2;
                    Pair<Period, Long> parsePeriod = parsePeriod(xmlPullParser, !arrayList5.isEmpty() ? arrayList5 : newArrayList, j14, j8, parseDateTime, parseDuration4, isDvbProfileDeclared);
                    Period period = (Period) parsePeriod.first;
                    if (period.startMs != j9) {
                        long longValue = ((Long) parsePeriod.second).longValue();
                        if (longValue == j9) {
                            arrayList3 = arrayList6;
                            j10 = j9;
                        } else {
                            j10 = period.startMs + longValue;
                            arrayList3 = arrayList6;
                        }
                        arrayList3.add(period);
                        j14 = j10;
                        z7 = z9;
                    } else {
                        if (!equals) {
                            throw ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList6.size(), th);
                        }
                        arrayList3 = arrayList6;
                        z7 = true;
                    }
                    z9 = z7;
                }
                j13 = j8;
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                    arrayList4 = arrayList3;
                    th2 = th;
                    arrayList5 = arrayList;
                    newArrayList = arrayList2;
                    j12 = j9;
                    dashManifestParser = this;
                } else {
                    if (parseDuration == j9) {
                        if (j14 != j9) {
                            j11 = j14;
                            if (arrayList3.isEmpty()) {
                                return buildMediaPresentationDescription(parseDateTime, j11, parseDuration2, equals, parseDuration3, parseDuration4, parseDuration5, parseDateTime2, programInformation, utcTimingElement, serviceDescriptionElement, uri2, arrayList3);
                            }
                            throw ParserException.createForMalformedManifest("No periods found.", th);
                        }
                        if (!equals) {
                            throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th);
                        }
                    }
                    j11 = parseDuration;
                    if (arrayList3.isEmpty()) {
                    }
                }
            }
            arrayList = arrayList5;
            arrayList2 = newArrayList;
            j9 = j12;
            th = th2;
            arrayList3 = arrayList4;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
            }
        }
    }

    protected Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, List<BaseUrl> list, long j8, long j9, long j10, long j11, boolean z7) {
        long j12;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j13;
        SegmentBase parseSegmentTemplate;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long parseDuration = parseDuration(xmlPullParser2, "start", j8);
        long j14 = C.TIME_UNSET;
        long j15 = j10 != C.TIME_UNSET ? j10 + parseDuration : -9223372036854775807L;
        long parseDuration2 = parseDuration(xmlPullParser2, "duration", C.TIME_UNSET);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j16 = j9;
        long j17 = -9223372036854775807L;
        SegmentBase segmentBase = null;
        Descriptor descriptor = null;
        boolean z8 = false;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z8) {
                    j16 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser2, j16);
                    z8 = true;
                }
                arrayList6.addAll(dashManifestParser.parseBaseUrl(xmlPullParser2, list, z7));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j13 = j14;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AdaptationSet")) {
                    j12 = j16;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(parseAdaptationSet(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, segmentBase, parseDuration2, j16, j17, j15, j11, z7));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j12 = j16;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EventStream")) {
                        arrayList7.add(parseEventStream(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        segmentBase = parseSegmentBase(xmlPullParser2, null);
                        obj = null;
                        j16 = j12;
                        j13 = C.TIME_UNSET;
                    } else {
                        arrayList3 = arrayList7;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                            long parseAvailabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, C.TIME_UNSET);
                            obj = null;
                            parseSegmentTemplate = parseSegmentList(xmlPullParser, null, j15, parseDuration2, j12, parseAvailabilityTimeOffsetUs, j11);
                            j17 = parseAvailabilityTimeOffsetUs;
                            j16 = j12;
                            j13 = C.TIME_UNSET;
                        } else {
                            obj = null;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                long parseAvailabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, C.TIME_UNSET);
                                j13 = -9223372036854775807L;
                                parseSegmentTemplate = parseSegmentTemplate(xmlPullParser, null, ImmutableList.of(), j15, parseDuration2, j12, parseAvailabilityTimeOffsetUs2, j11);
                                j17 = parseAvailabilityTimeOffsetUs2;
                                j16 = j12;
                            } else {
                                j13 = C.TIME_UNSET;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AssetIdentifier")) {
                                    descriptor = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser);
                                }
                                j16 = j12;
                            }
                        }
                        segmentBase = parseSegmentTemplate;
                    }
                }
                obj = null;
                j13 = C.TIME_UNSET;
                j16 = j12;
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(attributeValue, parseDuration, arrayList2, arrayList3, descriptor), Long.valueOf(parseDuration2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j14 = j13;
            dashManifestParser = this;
        }
    }

    protected String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(SystemInfoUtil.COMMA);
    }

    protected ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) {
        String str = null;
        String parseString = parseString(xmlPullParser, "moreInformationURL", null);
        String parseString2 = parseString(xmlPullParser, BaseWatchFaceProvider.LANG, null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.TAG_COPYRIGHT)) {
                str3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str4 = str3;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(str, str2, str4, parseString, parseString2);
            }
            str3 = str4;
        }
    }

    protected RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j8;
        long j9;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j8 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j9 = (Long.parseLong(split[1]) - j8) + 1;
                return buildRangedUri(attributeValue, j8, j9);
            }
        } else {
            j8 = 0;
        }
        j9 = -1;
        return buildRangedUri(attributeValue, j8, j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ee A[LOOP:0: B:2:0x006a->B:11:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0198 A[EDGE_INSN: B:12:0x0198->B:13:0x0198 BREAK  A[LOOP:0: B:2:0x006a->B:11:0x01ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable String str, @Nullable String str2, int i8, int i9, float f8, int i10, int i11, @Nullable String str3, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, List<Descriptor> list5, @Nullable SegmentBase segmentBase, long j8, long j9, long j10, long j11, long j12, boolean z7) {
        long j13;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i12;
        long parseAvailabilityTimeOffsetUs;
        ArrayList arrayList7;
        SegmentBase segmentBase2;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        DashManifestParser dashManifestParser = this;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int parseInt = parseInt(xmlPullParser, "bandwidth", -1);
        String parseString = parseString(xmlPullParser, "mimeType", str);
        String parseString2 = parseString(xmlPullParser, "codecs", str2);
        int parseInt2 = parseInt(xmlPullParser, x.KEY_WIDTH, i8);
        int parseInt3 = parseInt(xmlPullParser, x.KEY_HEIGHT, i9);
        float parseFrameRate = parseFrameRate(xmlPullParser, f8);
        int parseInt4 = parseInt(xmlPullParser, "audioSamplingRate", i11);
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList(list4);
        ArrayList arrayList15 = new ArrayList(list5);
        ArrayList arrayList16 = new ArrayList();
        int i13 = i10;
        SegmentBase segmentBase3 = segmentBase;
        long j14 = j10;
        String str4 = null;
        boolean z8 = false;
        long j15 = j11;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z8) {
                    j14 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j14);
                    z8 = true;
                }
                arrayList16.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, list, z7));
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "AudioChannelConfiguration")) {
                segmentBase2 = segmentBase3;
                arrayList10 = arrayList16;
                arrayList4 = arrayList12;
                i12 = parseAudioChannelConfiguration(xmlPullParser);
                arrayList5 = arrayList13;
                arrayList6 = arrayList15;
                arrayList11 = arrayList10;
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                    break;
                }
                arrayList15 = arrayList6;
                arrayList13 = arrayList5;
                arrayList12 = arrayList4;
                segmentBase3 = segmentBase2;
                dashManifestParser = this;
                i13 = i12;
                arrayList16 = arrayList11;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                segmentBase3 = dashManifestParser.parseSegmentBase(xmlPullParser, (SegmentBase.SingleSegmentBase) segmentBase3);
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                    parseAvailabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j15);
                    j13 = j14;
                    arrayList9 = arrayList16;
                    arrayList = arrayList15;
                    arrayList2 = arrayList13;
                    arrayList3 = arrayList14;
                    segmentBase3 = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentBase3, j8, j9, j13, parseAvailabilityTimeOffsetUs, j12);
                    arrayList4 = arrayList12;
                } else {
                    j13 = j14;
                    ArrayList arrayList17 = arrayList16;
                    arrayList = arrayList15;
                    arrayList2 = arrayList13;
                    arrayList3 = arrayList14;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                        parseAvailabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j15);
                        arrayList4 = arrayList12;
                        segmentBase3 = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentBase3, list5, j8, j9, j13, parseAvailabilityTimeOffsetUs, j12);
                        arrayList9 = arrayList17;
                    } else {
                        arrayList4 = arrayList12;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "ContentProtection")) {
                            Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                            Object obj = parseContentProtection.first;
                            if (obj != null) {
                                str4 = (String) obj;
                            }
                            Object obj2 = parseContentProtection.second;
                            if (obj2 != null) {
                                arrayList4.add((DrmInitData.SchemeData) obj2);
                            }
                            i12 = i13;
                            arrayList8 = arrayList17;
                            j14 = j13;
                            arrayList6 = arrayList;
                            arrayList5 = arrayList2;
                            arrayList14 = arrayList3;
                            arrayList7 = arrayList8;
                            segmentBase2 = segmentBase3;
                            arrayList11 = arrayList7;
                            if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                            }
                        } else {
                            if (XmlPullParserUtil.isStartTag(xmlPullParser, "InbandEventStream")) {
                                arrayList5 = arrayList2;
                                arrayList5.add(parseDescriptor(xmlPullParser, "InbandEventStream"));
                                arrayList6 = arrayList;
                                arrayList14 = arrayList3;
                            } else {
                                arrayList5 = arrayList2;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser, "EssentialProperty")) {
                                    arrayList14 = arrayList3;
                                    arrayList14.add(parseDescriptor(xmlPullParser, "EssentialProperty"));
                                    arrayList6 = arrayList;
                                } else {
                                    arrayList14 = arrayList3;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SupplementalProperty")) {
                                        arrayList6 = arrayList;
                                        arrayList6.add(parseDescriptor(xmlPullParser, "SupplementalProperty"));
                                    } else {
                                        arrayList6 = arrayList;
                                        maybeSkipTag(xmlPullParser);
                                    }
                                }
                            }
                            i12 = i13;
                            j14 = j13;
                            arrayList7 = arrayList17;
                            segmentBase2 = segmentBase3;
                            arrayList11 = arrayList7;
                            if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                            }
                        }
                    }
                }
                i12 = i13;
                j15 = parseAvailabilityTimeOffsetUs;
                arrayList8 = arrayList9;
                j14 = j13;
                arrayList6 = arrayList;
                arrayList5 = arrayList2;
                arrayList14 = arrayList3;
                arrayList7 = arrayList8;
                segmentBase2 = segmentBase3;
                arrayList11 = arrayList7;
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                }
            }
            arrayList10 = arrayList16;
            arrayList4 = arrayList12;
            i12 = i13;
            segmentBase2 = segmentBase3;
            arrayList5 = arrayList13;
            arrayList6 = arrayList15;
            arrayList11 = arrayList10;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
            }
        }
        ArrayList arrayList18 = arrayList6;
        ArrayList arrayList19 = arrayList14;
        ArrayList arrayList20 = arrayList5;
        Format buildFormat = buildFormat(attributeValue, parseString, parseInt2, parseInt3, parseFrameRate, i12, parseInt4, parseInt, str3, list2, list3, parseString2, arrayList19, arrayList18);
        if (segmentBase2 == null) {
            segmentBase2 = new SegmentBase.SingleSegmentBase();
        }
        boolean isEmpty = arrayList11.isEmpty();
        List<BaseUrl> list6 = arrayList11;
        if (isEmpty) {
            list6 = list;
        }
        return new RepresentationInfo(buildFormat, list6, segmentBase2, str4, arrayList4, arrayList20, arrayList19, arrayList18, -1L);
    }

    protected int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int parseTvaAudioPurposeCsValue;
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Descriptor descriptor = list.get(i9);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                parseTvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else if (Ascii.equalsIgnoreCase("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                parseTvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
            }
            i8 |= parseTvaAudioPurposeCsValue;
        }
        return i8;
    }

    protected int parseRoleFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/trickmode", list.get(i9).schemeIdUri)) {
                i8 |= 16384;
            }
        }
        return i8;
    }

    protected int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Descriptor descriptor = list.get(i9);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                i8 |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return i8;
    }

    protected SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, @Nullable SegmentBase.SingleSegmentBase singleSegmentBase) {
        long j8;
        long j9;
        long parseLong = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j10 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j11 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j9 = Long.parseLong(split[0]);
            j8 = (Long.parseLong(split[1]) - j9) + 1;
        } else {
            j8 = j11;
            j9 = j10;
        }
        RangedUri rangedUri = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase"));
        return buildSingleSegmentBase(rangedUri, parseLong, parseLong2, j9, j8);
    }

    protected SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentList segmentList, long j8, long j9, long j10, long j11, long j12) {
        long parseLong = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long parseLong3 = parseLong(xmlPullParser, "duration", segmentList != null ? segmentList.duration : C.TIME_UNSET);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j10, j11);
        List<SegmentBase.SegmentTimelineElement> list = null;
        List<RangedUri> list2 = null;
        RangedUri rangedUri = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                list = parseSegmentTimeline(xmlPullParser, parseLong, j9);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(parseSegmentUrl(xmlPullParser));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList"));
        if (segmentList != null) {
            if (rangedUri == null) {
                rangedUri = segmentList.initialization;
            }
            if (list == null) {
                list = segmentList.segmentTimeline;
            }
            if (list2 == null) {
                list2 = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(rangedUri, parseLong, parseLong2, parseLong4, parseLong3, list, finalAvailabilityTimeOffset, list2, j12, j8);
    }

    protected SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j8, long j9, long j10, long j11, long j12) {
        long parseLong = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long parseLong3 = parseLong(xmlPullParser, "duration", segmentTemplate != null ? segmentTemplate.duration : C.TIME_UNSET);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j10, j11);
        List<SegmentBase.SegmentTimelineElement> list2 = null;
        UrlTemplate parseUrlTemplate = parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate parseUrlTemplate2 = parseUrlTemplate(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri rangedUri = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                list2 = parseSegmentTimeline(xmlPullParser, parseLong, j9);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate"));
        if (segmentTemplate != null) {
            if (rangedUri == null) {
                rangedUri = segmentTemplate.initialization;
            }
            if (list2 == null) {
                list2 = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(rangedUri, parseLong, parseLong2, parseLong4, parseLastSegmentNumberSupplementalProperty, parseLong3, list2, finalAvailabilityTimeOffset, parseUrlTemplate2, parseUrlTemplate, j12, j8);
    }

    protected List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j8, long j9) {
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        long j11 = -9223372036854775807L;
        boolean z7 = false;
        int i8 = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                long parseLong = parseLong(xmlPullParser, "t", C.TIME_UNSET);
                if (z7) {
                    j10 = addSegmentTimelineElementsToList(arrayList, j10, j11, i8, parseLong);
                }
                if (parseLong == C.TIME_UNSET) {
                    parseLong = j10;
                }
                j11 = parseLong(xmlPullParser, "d", C.TIME_UNSET);
                i8 = parseInt(xmlPullParser, "r", 0);
                j10 = parseLong;
                z7 = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z7) {
            addSegmentTimelineElementsToList(arrayList, j10, j11, i8, Util.scaleLargeTimestamp(j9, j8, 1000L));
        }
        return arrayList;
    }

    protected RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    protected int parseSelectionFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Descriptor descriptor = list.get(i9);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                i8 |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return i8;
    }

    protected ServiceDescriptionElement parseServiceDescription(XmlPullParser xmlPullParser) {
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        float f8 = -3.4028235E38f;
        float f9 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Latency")) {
                j8 = parseLong(xmlPullParser, "target", C.TIME_UNSET);
                j9 = parseLong(xmlPullParser, "min", C.TIME_UNSET);
                j10 = parseLong(xmlPullParser, "max", C.TIME_UNSET);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "PlaybackRate")) {
                f8 = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f9 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j11 = j8;
            long j12 = j9;
            long j13 = j10;
            float f10 = f8;
            float f11 = f9;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new ServiceDescriptionElement(j11, j12, j13, f10, f11);
            }
            j8 = j11;
            j9 = j12;
            j10 = j13;
            f8 = f10;
            f9 = f11;
        }
    }

    @Nullable
    protected Pair<Integer, Integer> parseTileCountFromProperties(List<Descriptor> list) {
        String str;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Descriptor descriptor = list.get(i8);
            if ((Ascii.equalsIgnoreCase("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || Ascii.equalsIgnoreCase("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && (str = descriptor.value) != null) {
                String[] split = Util.split(str, "x");
                if (split.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    protected int parseTvaAudioPurposeCsValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    @Nullable
    protected UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, @Nullable UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    protected UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return parseMediaPresentationDescription(newPullParser, uri);
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e8) {
            throw ParserException.createForMalformedManifest(null, e8);
        }
    }
}
