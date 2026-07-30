package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import cn.hutool.core.text.l;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

@Deprecated
/* loaded from: classes3.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);
    private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);

    private static final class CellResolution {
        final int columns;
        final int rows;

        CellResolution(int i8, int i9) {
            this.columns = i8;
            this.rows = i9;
        }
    }

    private static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        FrameAndTickRate(float f8, int i8, int i9) {
            this.effectiveFrameRate = f8;
            this.subFrameRate = i8;
            this.tickRate = i9;
        }
    }

    private static final class TtsExtent {
        final int height;
        final int width;

        TtsExtent(int i8, int i9) {
            this.width = i8;
            this.height = i9;
        }
    }

    public TtmlDecoder() {
        super(TAG);
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    private static TtmlStyle createIfNull(@Nullable TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static boolean isSupportedTag(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals("br") || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals("region") || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    @Nullable
    private static Layout.Alignment parseAlignment(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static CellResolution parseCellResolution(XmlPullParser xmlPullParser, CellResolution cellResolution) {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return cellResolution;
        }
        try {
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new CellResolution(parseInt, parseInt2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + parseInt + l.SPACE + parseInt2);
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return cellResolution;
        }
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) {
        Matcher matcher;
        String str2;
        String[] split = Util.split(str, "\\s+");
        if (split.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else {
            if (split.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + split.length + ".");
            }
            matcher = FONT_SIZE.matcher(split[1]);
            Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) Assertions.checkNotNull(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                ttmlStyle.setFontSizeUnit(3);
                break;
            case "em":
                ttmlStyle.setFontSizeUnit(2);
                break;
            case "px":
                ttmlStyle.setFontSizeUnit(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) {
        float f8;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (Util.split(attributeValue2, l.SPACE).length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f8 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f8 = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i8 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i8 = Integer.parseInt(attributeValue3);
        }
        int i9 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i9 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(parseInt * f8, i8, i9);
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, CellResolution cellResolution, @Nullable TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        parseStyleAttributes.chain(map.get(str));
                    }
                }
                String id = parseStyleAttributes.getId();
                if (id != null) {
                    map.put(id, parseStyleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion parseRegionAttributes = parseRegionAttributes(xmlPullParser, cellResolution, ttsExtent);
                if (parseRegionAttributes != null) {
                    map2.put(parseRegionAttributes.id, parseRegionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, TtmlNode.TAG_METADATA)) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static TtmlNode parseNode(XmlPullParser xmlPullParser, @Nullable TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) {
        long j8;
        long j9;
        char c8;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j10 = C.TIME_UNSET;
        long j11 = C.TIME_UNSET;
        long j12 = C.TIME_UNSET;
        for (int i8 = 0; i8 < attributeCount; i8++) {
            String attributeName = xmlPullParser.getAttributeName(i8);
            String attributeValue = xmlPullParser.getAttributeValue(i8);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals(ATTR_DURATION)) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals(ATTR_BEGIN)) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals(ATTR_IMAGE)) {
                        c8 = 5;
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
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j12 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 2:
                    j11 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 3:
                    j10 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 4:
                    String[] parseStyleIds = parseStyleIds(attributeValue);
                    if (parseStyleIds.length > 0) {
                        strArr = parseStyleIds;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ttmlNode != null) {
            long j13 = ttmlNode.startTimeUs;
            j8 = C.TIME_UNSET;
            if (j13 != C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET) {
                    j10 += j13;
                }
                if (j11 != C.TIME_UNSET) {
                    j11 += j13;
                }
            }
        } else {
            j8 = C.TIME_UNSET;
        }
        long j14 = j10;
        if (j11 == j8) {
            if (j12 != j8) {
                j9 = j14 + j12;
            } else if (ttmlNode != null) {
                long j15 = ttmlNode.endTimeUs;
                if (j15 != j8) {
                    j9 = j15;
                }
            }
            return TtmlNode.buildNode(xmlPullParser.getName(), j14, j9, parseStyleAttributes, strArr, str2, str, ttmlNode);
        }
        j9 = j11;
        return TtmlNode.buildNode(xmlPullParser.getName(), j14, j9, parseStyleAttributes, strArr, str2, str, ttmlNode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a9, code lost:
    
        if (r0.equals("tb") == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017c  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TtmlRegion parseRegionAttributes(XmlPullParser xmlPullParser, CellResolution cellResolution, @Nullable TtsExtent ttsExtent) {
        float parseFloat;
        float f8;
        float parseFloat2;
        float parseFloat3;
        CellResolution cellResolution2;
        float f9;
        int i8;
        String attributeValue;
        int i9;
        String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
        if (attributeValue2 == null) {
            return null;
        }
        String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin");
        if (attributeValue3 == null) {
            Log.w(TAG, "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = PERCENTAGE_COORDINATES;
        Matcher matcher = pattern.matcher(attributeValue3);
        Pattern pattern2 = PIXEL_COORDINATES;
        Matcher matcher2 = pattern2.matcher(attributeValue3);
        if (matcher.matches()) {
            try {
                float parseFloat4 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                parseFloat = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(2))) / 100.0f;
                f8 = parseFloat4;
            } catch (NumberFormatException unused) {
                Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue3);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                Log.w(TAG, "Ignoring region with unsupported origin: " + attributeValue3);
                return null;
            }
            if (ttsExtent == null) {
                Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue3);
                return null;
            }
            try {
                int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)));
                f8 = parseInt / ttsExtent.width;
                parseFloat = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2))) / ttsExtent.height;
            } catch (NumberFormatException unused2) {
                Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue3);
                return null;
            }
        }
        String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue4 == null) {
            Log.w(TAG, "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(attributeValue4);
        Matcher matcher4 = pattern2.matcher(attributeValue4);
        if (matcher3.matches()) {
            try {
                parseFloat2 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                parseFloat3 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue3);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                Log.w(TAG, "Ignoring region with unsupported extent: " + attributeValue3);
                return null;
            }
            if (ttsExtent == null) {
                Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue3);
                return null;
            }
            try {
                int parseInt2 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(1)));
                parseFloat2 = parseInt2 / ttsExtent.width;
                parseFloat3 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(2))) / ttsExtent.height;
            } catch (NumberFormatException unused4) {
                Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue3);
                return null;
            }
        }
        String attributeValue5 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        char c8 = 0;
        if (attributeValue5 != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue5);
            lowerCase.hashCode();
            if (lowerCase.equals(TtmlNode.CENTER)) {
                cellResolution2 = cellResolution;
                f9 = parseFloat + (parseFloat3 / 2.0f);
                i8 = 1;
            } else if (lowerCase.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                cellResolution2 = cellResolution;
                f9 = parseFloat + parseFloat3;
                i8 = 2;
            }
            float f10 = 1.0f / cellResolution2.rows;
            attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
            if (attributeValue != null) {
                String lowerCase2 = Ascii.toLowerCase(attributeValue);
                lowerCase2.hashCode();
                switch (lowerCase2.hashCode()) {
                    case 3694:
                        break;
                    case 3553396:
                        if (lowerCase2.equals(TtmlNode.VERTICAL_LR)) {
                            c8 = 1;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 3553576:
                        if (lowerCase2.equals(TtmlNode.VERTICAL_RL)) {
                            c8 = 2;
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
                    case 1:
                        i9 = 2;
                        break;
                    case 2:
                        i9 = 1;
                        break;
                }
                return new TtmlRegion(attributeValue2, f8, f9, 0, i8, parseFloat2, parseFloat3, 1, f10, i9);
            }
            i9 = Integer.MIN_VALUE;
            return new TtmlRegion(attributeValue2, f8, f9, 0, i8, parseFloat2, parseFloat3, 1, f10, i9);
        }
        cellResolution2 = cellResolution;
        f9 = parseFloat;
        i8 = 0;
        float f102 = 1.0f / cellResolution2.rows;
        attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
        if (attributeValue != null) {
        }
        i9 = Integer.MIN_VALUE;
        return new TtmlRegion(attributeValue2, f8, f9, 0, i8, parseFloat2, parseFloat3, 1, f102, i9);
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            Log.w(TAG, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e8) {
            Log.w(TAG, "Failed to parse shear: " + str, e8);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e0, code lost:
    
        if (r3.equals("text") == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        char c8;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            String attributeValue = xmlPullParser.getAttributeValue(i8);
            String attributeName = xmlPullParser.getAttributeName(i8);
            attributeName.hashCode();
            char c9 = 5;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c8 = 5;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_RUBY)) {
                        c8 = 6;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c8 = 7;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_SHEAR)) {
                        c8 = '\b';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_COMBINE)) {
                        c8 = '\t';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c8 = '\n';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_EMPHASIS)) {
                        c8 = 11;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_RUBY_POSITION)) {
                        c8 = '\f';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        c8 = '\r';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals(TtmlNode.ATTR_EBUTTS_MULTI_ROW_ALIGN)) {
                        c8 = 14;
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
                    ttmlStyle = createIfNull(ttmlStyle).setItalic(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case 2:
                    ttmlStyle = createIfNull(ttmlStyle).setTextAlign(parseAlignment(attributeValue));
                    break;
                case 3:
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    switch (lowerCase) {
                        case "nounderline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                            break;
                        case "underline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            break;
                        case "nolinethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                            break;
                        case "linethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                            break;
                    }
                case 4:
                    ttmlStyle = createIfNull(ttmlStyle).setBold(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    switch (lowerCase2.hashCode()) {
                        case -618561360:
                            if (lowerCase2.equals(TtmlNode.RUBY_BASE_CONTAINER)) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -410956671:
                            if (lowerCase2.equals(TtmlNode.RUBY_CONTAINER)) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -250518009:
                            if (lowerCase2.equals(TtmlNode.RUBY_DELIMITER)) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -136074796:
                            if (lowerCase2.equals(TtmlNode.RUBY_TEXT_CONTAINER)) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3016401:
                            if (lowerCase2.equals(TtmlNode.RUBY_BASE)) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 3556653:
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    switch (c9) {
                        case 0:
                        case 4:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                            break;
                        case 1:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(1);
                            break;
                        case 2:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(4);
                            break;
                        case 3:
                        case 5:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                            break;
                    }
                case 7:
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        Log.w(TAG, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\b':
                    ttmlStyle = createIfNull(ttmlStyle).setShearPercentage(parseShear(attributeValue));
                    break;
                case '\t':
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (lowerCase3.equals(TtmlNode.COMBINE_ALL)) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(true);
                        break;
                    } else if (lowerCase3.equals("none")) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        Log.w(TAG, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case 11:
                    ttmlStyle = createIfNull(ttmlStyle).setTextEmphasis(TextEmphasis.parse(attributeValue));
                    break;
                case '\f':
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(1);
                        break;
                    } else if (lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        Log.w(TAG, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 14:
                    ttmlStyle = createIfNull(ttmlStyle).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static String[] parseStyleIds(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : Util.split(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) {
        double d8;
        double d9;
        Matcher matcher = CLOCK_TIME.matcher(str);
        char c8 = 4;
        if (matcher.matches()) {
            double parseLong = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) * 3600) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) * 60) + Long.parseLong((String) Assertions.checkNotNull(matcher.group(3)));
            String group = matcher.group(4);
            double d10 = i.DOUBLE_EPSILON;
            double parseDouble = parseLong + (group != null ? Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / frameAndTickRate.effectiveFrameRate : 0.0d);
            if (matcher.group(6) != null) {
                d10 = (Long.parseLong(r13) / frameAndTickRate.subFrameRate) / frameAndTickRate.effectiveFrameRate;
            }
            return (long) ((parseDouble + d10) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double parseDouble2 = Double.parseDouble((String) Assertions.checkNotNull(matcher2.group(1)));
        String str2 = (String) Assertions.checkNotNull(matcher2.group(2));
        str2.hashCode();
        switch (str2.hashCode()) {
            case 102:
                if (str2.equals("f")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case 104:
                if (str2.equals(CmcdHeadersFactory.STREAMING_FORMAT_HLS)) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case 109:
                if (str2.equals("m")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 116:
                if (str2.equals("t")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 3494:
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
                d8 = frameAndTickRate.effectiveFrameRate;
                parseDouble2 /= d8;
                break;
            case 1:
                d9 = 3600.0d;
                break;
            case 2:
                d9 = 60.0d;
                break;
            case 3:
                d8 = frameAndTickRate.tickRate;
                parseDouble2 /= d8;
                break;
            case 4:
                d8 = 1000.0d;
                parseDouble2 /= d8;
                break;
        }
        parseDouble2 *= d9;
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Nullable
    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i8, boolean z7) {
        FrameAndTickRate frameAndTickRate;
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new TtmlRegion(""));
            TtsExtent ttsExtent = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i8), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRate2 = DEFAULT_FRAME_AND_TICK_RATE;
            CellResolution cellResolution = DEFAULT_CELL_RESOLUTION;
            TtmlSubtitle ttmlSubtitle = null;
            int i9 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i9 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRate2 = parseFrameAndTickRates(newPullParser);
                            cellResolution = parseCellResolution(newPullParser, DEFAULT_CELL_RESOLUTION);
                            ttsExtent = parseTtsExtent(newPullParser);
                        }
                        TtsExtent ttsExtent2 = ttsExtent;
                        FrameAndTickRate frameAndTickRate3 = frameAndTickRate2;
                        CellResolution cellResolution2 = cellResolution;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                frameAndTickRate = frameAndTickRate3;
                                parseHeader(newPullParser, hashMap, cellResolution2, ttsExtent2, hashMap2, hashMap3);
                            } else {
                                frameAndTickRate = frameAndTickRate3;
                                try {
                                    TtmlNode parseNode = parseNode(newPullParser, ttmlNode, hashMap2, frameAndTickRate);
                                    arrayDeque.push(parseNode);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(parseNode);
                                    }
                                } catch (SubtitleDecoderException e8) {
                                    Log.w(TAG, "Suppressing parser error", e8);
                                    i9++;
                                }
                            }
                            frameAndTickRate2 = frameAndTickRate;
                        } else {
                            Log.i(TAG, "Ignoring unsupported tag: " + newPullParser.getName());
                            i9++;
                            frameAndTickRate2 = frameAndTickRate3;
                        }
                        ttsExtent = ttsExtent2;
                        cellResolution = cellResolution2;
                    } else if (eventType == 4) {
                        ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i9++;
                } else if (eventType == 3) {
                    i9--;
                }
                newPullParser.next();
            }
            if (ttmlSubtitle != null) {
                return ttmlSubtitle;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e9) {
            throw new IllegalStateException("Unexpected error when reading input.", e9);
        } catch (XmlPullParserException e10) {
            throw new SubtitleDecoderException("Unable to decode source", e10);
        }
    }
}
