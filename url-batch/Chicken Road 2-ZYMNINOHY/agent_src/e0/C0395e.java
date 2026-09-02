package e0;

import E1.C0025a;
import S0.w;
import T.AbstractC0088f;
import T.C0093k;
import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.C0099q;
import T.C0102u;
import T.F;
import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import v2.G;
import v2.I;
import v2.a0;

/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395e extends DefaultHandler implements u0.p {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f8365b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8366c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f8367d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f8368e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f8369f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f8370a;

    public C0395e() {
        try {
            this.f8370a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    public static long a(ArrayList arrayList, long j4, long j5, int i4, long j6) {
        int i5;
        if (i4 >= 0) {
            i5 = i4 + 1;
        } else {
            String str = J.f3263a;
            i5 = (int) ((((j6 - j4) + j5) - 1) / j5);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(new q(j4, j5));
            j4 += j5;
        }
        return j4;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i4 = 1;
            while (i4 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i4++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i4--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r13.equals("fa01") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019b, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ae, code lost:
    
        if (r13 < 33) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(XmlPullParser xmlPullParser, String str) {
        char c4;
        int parseInt;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i4 = 5;
        char c5 = 4;
        int i5 = 0;
        int i6 = -1;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -2060825028:
                if (attributeValue.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
            case 5:
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                parseInt = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (parseInt > 0) {
                    break;
                }
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int parseInt2 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & parseInt2) == 0) {
                        parseInt = 0;
                        while (true) {
                            int[] iArr = f8368e;
                            if (i5 >= iArr.length) {
                                break;
                            } else {
                                parseInt += ((parseInt2 >> i5) & 1) * iArr[i5];
                                i5++;
                            }
                        }
                    } else {
                        String[] W4 = J.W(str);
                        if (W4.length != 0) {
                            List h2 = new L3.h(new t(new u2.b('.'))).h(U.i.D(W4[0].trim()));
                            if (h2.size() == 4 && ((String) h2.get(0)).equals("ac-4")) {
                                String str2 = (String) h2.get(3);
                                str2.getClass();
                                if (!str2.equals("03")) {
                                    if (str2.equals("04")) {
                                        i6 = 21;
                                        break;
                                    }
                                } else {
                                    i6 = 18;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    i6 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case 3:
            case 7:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue5 != null) {
                    String D3 = U.i.D(attributeValue5);
                    D3.getClass();
                    switch (D3.hashCode()) {
                        case 1596796:
                            if (D3.equals("4000")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 2937391:
                            if (D3.equals("a000")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 3094034:
                            if (D3.equals("f800")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 3094035:
                            if (D3.equals("f801")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case 0:
                            i4 = 1;
                            break;
                        case 1:
                            i4 = 2;
                            break;
                        case 3:
                            i4 = 6;
                            break;
                        case 4:
                            i4 = 8;
                            break;
                    }
                    i6 = i4;
                    break;
                }
                i4 = -1;
                i6 = i4;
            case 4:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt3 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (parseInt3 >= 0) {
                    int[] iArr2 = f8369f;
                    if (parseInt3 < iArr2.length) {
                        i6 = iArr2[parseInt3];
                        break;
                    }
                }
                break;
            case 6:
                String attributeValue7 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue7 != null) {
                    parseInt = Integer.bitCount(Integer.parseInt(attributeValue7, 16));
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC0108a.k(xmlPullParser, "AudioChannelConfiguration"));
        return i6;
    }

    public static long d(XmlPullParser xmlPullParser, long j4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j4;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0108a.k(xmlPullParser, "BaseURL"));
        if (str != null && AbstractC0108a.i(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return v2.r.n(new C0392b(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C0392b c0392b = (C0392b) arrayList.get(i4);
            String p2 = AbstractC0108a.p(c0392b.f8342a, str);
            String str2 = attributeValue3 == null ? p2 : attributeValue3;
            if (z) {
                parseInt = c0392b.f8344c;
                parseInt2 = c0392b.f8345d;
                str2 = c0392b.f8343b;
            }
            arrayList2.add(new C0392b(parseInt, parseInt2, p2, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair f(XmlPullParser xmlPullParser) {
        String str;
        ?? r7;
        String str2;
        String str3;
        ?? r8;
        char c4;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String D3 = U.i.D(attributeValue);
            D3.getClass();
            switch (D3.hashCode()) {
                case -1980789791:
                    if (D3.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 489446379:
                    if (D3.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 755418770:
                    if (D3.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1812765994:
                    if (D3.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    r7 = AbstractC0088f.f2781c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 1:
                    r7 = AbstractC0088f.f2783e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 2:
                    r7 = AbstractC0088f.f2782d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r8 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i4);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i4);
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i5 = 0; i5 < split.length; i5++) {
                            uuidArr[i5] = UUID.fromString(split[i5]);
                        }
                        r7 = AbstractC0088f.f2780b;
                        str3 = null;
                        r8 = w.a(r7, uuidArr, null);
                        break;
                    } else {
                        AbstractC0108a.s("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r7 = null;
                        str2 = r7;
                        str3 = str2;
                        r8 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if ((!AbstractC0108a.m(xmlPullParser, "clearkey:Laurl") || AbstractC0108a.m(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r8 = r8;
                } else if (AbstractC0108a.m(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r8 = r8;
                } else {
                    if (r8 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            t1.h i6 = w.i(decode);
                            UUID uuid = i6 == null ? null : (UUID) i6.f15398b;
                            if (uuid == null) {
                                AbstractC0108a.s("MpdParser", "Skipping malformed cenc:pssh data");
                                r7 = uuid;
                                r8 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r8 = decode;
                                r7 = uuid2;
                            }
                        }
                    }
                    if (r8 == 0) {
                        ?? r10 = AbstractC0088f.f2783e;
                        if (r10.equals(r7) && AbstractC0108a.m(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r8 = w.a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r8 = r8;
                }
            } while (!AbstractC0108a.k(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r7 != null ? new C0093k(r7, str3, "video/mp4", r8) : null);
        }
        str = null;
        r7 = null;
        str2 = r7;
        str3 = str2;
        r8 = str2;
        do {
            xmlPullParser.next();
            if (AbstractC0108a.m(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r8 = r8;
        } while (!AbstractC0108a.k(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r7 != null ? new C0093k(r7, str3, "video/mp4", r8) : null);
    }

    public static int g(XmlPullParser xmlPullParser) {
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

    public static C0396f h(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!AbstractC0108a.k(xmlPullParser, str));
        return new C0396f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j4;
        }
        Matcher matcher = J.f3267e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float j(XmlPullParser xmlPullParser, float f4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f8365b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0fb9 A[LOOP:5: B:183:0x0410->B:192:0x0fb9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0e3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0cad A[LOOP:11: B:356:0x0693->B:365:0x0cad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x1399 A[LOOP:1: B:35:0x00cd->B:43:0x1399, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x1365 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0b58  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0c7f  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0c67  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0b30 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0393c k(XmlPullParser xmlPullParser, Uri uri) {
        int i4;
        boolean z;
        int i5;
        int i6;
        long j4;
        ArrayList arrayList;
        boolean z4;
        long j5;
        long j6;
        ArrayList arrayList2;
        long j7;
        long j8;
        ArrayList arrayList3;
        long j9;
        ArrayList arrayList4;
        String str;
        String str2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j10;
        ArrayList arrayList7;
        String str3;
        String str4;
        long j11;
        long j12;
        String str5;
        String str6;
        long j13;
        String str7;
        String str8;
        long j14;
        String str9;
        String str10;
        ByteArrayOutputStream byteArrayOutputStream;
        long j15;
        ByteArrayOutputStream byteArrayOutputStream2;
        ArrayList arrayList8;
        long j16;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String str11;
        ArrayList arrayList11;
        String str12;
        String str13;
        String str14;
        String str15;
        float f4;
        String str16;
        String str17;
        ArrayList arrayList12;
        String str18;
        String str19;
        String str20;
        ArrayList arrayList13;
        long j17;
        String str21;
        ArrayList arrayList14;
        String str22;
        String str23;
        ArrayList arrayList15;
        int i7;
        ArrayList arrayList16;
        long j18;
        ArrayList arrayList17;
        String str24;
        int i8;
        String str25;
        String str26;
        ArrayList arrayList18;
        int parseInt;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        long j19;
        String str33;
        ArrayList arrayList19;
        int i9;
        String str34;
        int i10;
        int i11;
        ArrayList arrayList20;
        ArrayList arrayList21;
        String str35;
        long j20;
        ArrayList arrayList22;
        String str36;
        ArrayList arrayList23;
        long j21;
        String str37;
        ArrayList arrayList24;
        ArrayList arrayList25;
        String str38;
        s sVar;
        int i12;
        String str39;
        String str40;
        String str41;
        String d4;
        ArrayList arrayList26;
        String str42;
        String str43;
        int i13;
        ArrayList arrayList27;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList28;
        Pair pair;
        int parseInt2;
        int i17;
        String str44;
        int i18;
        int i19;
        String str45;
        String str46;
        int i20;
        m kVar;
        String str47;
        ArrayList arrayList29;
        long j22;
        int i21 = 0;
        String[] strArr = new String[0];
        String str48 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(StringUtils.COMMA);
        }
        int length = strArr.length;
        int i22 = 0;
        while (true) {
            i4 = 1;
            if (i22 >= length) {
                z = false;
                break;
            }
            if (strArr[i22].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i22++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j23 = -9223372036854775807L;
        long P4 = attributeValue2 == null ? -9223372036854775807L : J.P(attributeValue2);
        long i23 = i(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long i24 = i(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long i25 = equals ? i(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long i26 = equals ? i(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long i27 = equals ? i(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long P5 = attributeValue3 == null ? -9223372036854775807L : J.P(attributeValue3);
        long j24 = equals ? 0L : -9223372036854775807L;
        ArrayList n = v2.r.n(new C0392b(z ? 1 : Integer.MIN_VALUE, 1, uri.toString(), uri.toString()));
        ArrayList arrayList30 = new ArrayList();
        ArrayList arrayList31 = new ArrayList();
        long j25 = equals ? -9223372036854775807L : 0L;
        int i28 = 0;
        int i29 = 0;
        i iVar = null;
        C0025a c0025a = null;
        Uri uri2 = null;
        C0102u c0102u = null;
        while (true) {
            xmlPullParser.next();
            String str49 = "BaseURL";
            if (AbstractC0108a.m(xmlPullParser, "BaseURL")) {
                if (i28 == 0) {
                    j24 = d(xmlPullParser, j24);
                    i28 = i4;
                }
                arrayList31.addAll(e(xmlPullParser, n, z));
                arrayList = n;
                arrayList2 = arrayList31;
                j8 = j25;
                z4 = z;
                i5 = i21;
                i6 = i4;
                arrayList3 = arrayList30;
                j6 = j23;
            } else {
                i5 = i21;
                i6 = i4;
                String str50 = "lang";
                if (AbstractC0108a.m(xmlPullParser, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser.getAttributeValue(str48, "moreInformationURL");
                    String str51 = attributeValue4 == null ? str48 : attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str48, "lang");
                    String str52 = attributeValue5 == null ? str48 : attributeValue5;
                    String str53 = str48;
                    String str54 = str53;
                    String str55 = str54;
                    while (true) {
                        xmlPullParser.next();
                        j4 = j23;
                        if (AbstractC0108a.m(xmlPullParser, "Title")) {
                            str53 = xmlPullParser.nextText();
                        } else if (AbstractC0108a.m(xmlPullParser, "Source")) {
                            str54 = xmlPullParser.nextText();
                        } else if (AbstractC0108a.m(xmlPullParser, "Copyright")) {
                            str55 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                        String str56 = str53;
                        String str57 = str54;
                        String str58 = str55;
                        if (AbstractC0108a.k(xmlPullParser, "ProgramInformation")) {
                            i iVar2 = new i(str56, str57, str58, str51, str52);
                            arrayList = n;
                            arrayList2 = arrayList31;
                            j8 = j25;
                            z4 = z;
                            arrayList3 = arrayList30;
                            iVar = iVar2;
                        } else {
                            str53 = str56;
                            str54 = str57;
                            str55 = str58;
                            j23 = j4;
                        }
                    }
                } else {
                    j4 = j23;
                    if (AbstractC0108a.m(xmlPullParser, "UTCTiming")) {
                        arrayList = n;
                        arrayList2 = arrayList31;
                        j8 = j25;
                        c0025a = new C0025a(xmlPullParser.getAttributeValue(str48, "schemeIdUri"), xmlPullParser.getAttributeValue(str48, "value"), 2);
                    } else if (AbstractC0108a.m(xmlPullParser, "Location")) {
                        uri2 = AbstractC0108a.q(uri.toString(), xmlPullParser.nextText());
                        arrayList = n;
                        arrayList2 = arrayList31;
                        j8 = j25;
                    } else {
                        if (AbstractC0108a.m(xmlPullParser, "ServiceDescription")) {
                            float f5 = -3.4028235E38f;
                            float f6 = -3.4028235E38f;
                            long j26 = j4;
                            long j27 = j26;
                            long j28 = j27;
                            while (true) {
                                xmlPullParser.next();
                                if (AbstractC0108a.m(xmlPullParser, "Latency")) {
                                    arrayList = n;
                                    String attributeValue6 = xmlPullParser.getAttributeValue(null, "target");
                                    j26 = attributeValue6 == null ? j4 : Long.parseLong(attributeValue6);
                                    String attributeValue7 = xmlPullParser.getAttributeValue(null, "min");
                                    j27 = attributeValue7 == null ? j4 : Long.parseLong(attributeValue7);
                                    String attributeValue8 = xmlPullParser.getAttributeValue(null, "max");
                                    j28 = attributeValue8 == null ? j4 : Long.parseLong(attributeValue8);
                                } else {
                                    arrayList = n;
                                    if (AbstractC0108a.m(xmlPullParser, "PlaybackRate")) {
                                        String attributeValue9 = xmlPullParser.getAttributeValue(null, "min");
                                        f5 = attributeValue9 == null ? -3.4028235E38f : Float.parseFloat(attributeValue9);
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "max");
                                        f6 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    }
                                }
                                long j29 = j26;
                                long j30 = j24;
                                long j31 = j27;
                                long j32 = i26;
                                long j33 = j28;
                                if (AbstractC0108a.k(xmlPullParser, "ServiceDescription")) {
                                    C0102u c0102u2 = new C0102u();
                                    c0102u2.f2883a = j29;
                                    c0102u2.f2884b = j31;
                                    c0102u2.f2885c = j33;
                                    c0102u2.f2886d = f5;
                                    c0102u2.f2887e = f6;
                                    c0102u = c0102u2;
                                    z4 = z;
                                    j24 = j30;
                                    j5 = j32;
                                    j6 = j4;
                                    arrayList2 = arrayList31;
                                    j8 = j25;
                                    arrayList3 = arrayList30;
                                } else {
                                    j28 = j33;
                                    i26 = j32;
                                    n = arrayList;
                                    j27 = j31;
                                    j24 = j30;
                                    j26 = j29;
                                }
                            }
                        } else {
                            arrayList = n;
                            long j34 = j24;
                            long j35 = i26;
                            if (AbstractC0108a.m(xmlPullParser, "Period") && i29 == 0) {
                                ArrayList arrayList32 = !arrayList31.isEmpty() ? arrayList31 : arrayList;
                                String str59 = "id";
                                String attributeValue11 = xmlPullParser.getAttributeValue(null, "id");
                                long i30 = i(xmlPullParser, "start", j25);
                                String str60 = "duration";
                                String str61 = "value";
                                long j36 = P4 != j4 ? P4 + i30 : j4;
                                long i31 = i(xmlPullParser, "duration", j4);
                                ArrayList arrayList33 = new ArrayList();
                                ArrayList arrayList34 = new ArrayList();
                                ArrayList arrayList35 = new ArrayList();
                                long j37 = j4;
                                String str62 = "schemeIdUri";
                                String str63 = "Period";
                                int i32 = i5;
                                long j38 = j34;
                                s sVar2 = null;
                                while (true) {
                                    xmlPullParser.next();
                                    if (AbstractC0108a.m(xmlPullParser, str49)) {
                                        if (i32 == 0) {
                                            j38 = d(xmlPullParser, j38);
                                            i32 = i6;
                                        }
                                        arrayList35.addAll(e(xmlPullParser, arrayList32, z));
                                        arrayList4 = arrayList32;
                                        str5 = str59;
                                        str = str49;
                                        str4 = str60;
                                        str3 = str61;
                                        z4 = z;
                                        j9 = j38;
                                        str2 = str50;
                                        j5 = j35;
                                        j11 = j36;
                                        arrayList7 = arrayList33;
                                        arrayList5 = arrayList34;
                                        str6 = str63;
                                        j6 = -9223372036854775807L;
                                        arrayList6 = arrayList35;
                                        arrayList2 = arrayList31;
                                        j12 = i31;
                                        j7 = j34;
                                        j10 = j25;
                                    } else {
                                        j9 = j38;
                                        String str64 = "SegmentTemplate";
                                        if (AbstractC0108a.m(xmlPullParser, "AdaptationSet")) {
                                            if (arrayList35.isEmpty()) {
                                                arrayList8 = arrayList32;
                                                arrayList4 = arrayList8;
                                            } else {
                                                arrayList4 = arrayList32;
                                                arrayList8 = arrayList35;
                                            }
                                            String attributeValue12 = xmlPullParser.getAttributeValue(null, str59);
                                            long parseLong = attributeValue12 == null ? -1L : Long.parseLong(attributeValue12);
                                            int g4 = g(xmlPullParser);
                                            String str65 = "AdaptationSet";
                                            String attributeValue13 = xmlPullParser.getAttributeValue(null, "mimeType");
                                            ArrayList arrayList36 = arrayList35;
                                            ArrayList arrayList37 = arrayList31;
                                            String attributeValue14 = xmlPullParser.getAttributeValue(null, "codecs");
                                            long j39 = j25;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
                                            xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
                                            String str66 = str60;
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt3 = attributeValue16 == null ? -1 : Integer.parseInt(attributeValue16);
                                            String str67 = str61;
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt4 = attributeValue17 == null ? -1 : Integer.parseInt(attributeValue17);
                                            float j40 = j(xmlPullParser, -1.0f);
                                            String str68 = "SegmentList";
                                            String str69 = "SegmentBase";
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            int parseInt5 = attributeValue18 == null ? -1 : Integer.parseInt(attributeValue18);
                                            String attributeValue19 = xmlPullParser.getAttributeValue(null, str50);
                                            String str70 = "audioSamplingRate";
                                            String attributeValue20 = xmlPullParser.getAttributeValue(null, "label");
                                            ArrayList arrayList38 = new ArrayList();
                                            String str71 = attributeValue20;
                                            ArrayList arrayList39 = new ArrayList();
                                            ArrayList arrayList40 = arrayList38;
                                            ArrayList arrayList41 = new ArrayList();
                                            ArrayList arrayList42 = new ArrayList();
                                            float f7 = j40;
                                            ArrayList arrayList43 = new ArrayList();
                                            String str72 = "height";
                                            ArrayList arrayList44 = new ArrayList();
                                            String str73 = "width";
                                            ArrayList arrayList45 = new ArrayList();
                                            String str74 = "scte214:supplementalProfiles";
                                            ArrayList arrayList46 = new ArrayList();
                                            ArrayList arrayList47 = new ArrayList();
                                            String str75 = str59;
                                            String str76 = "mimeType";
                                            String str77 = "codecs";
                                            int i33 = i5;
                                            s sVar3 = sVar2;
                                            long j41 = j37;
                                            long j42 = j9;
                                            String str78 = attributeValue19;
                                            int i34 = -1;
                                            String str79 = "scte214:supplementalCodecs";
                                            int i35 = g4;
                                            String str80 = null;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (AbstractC0108a.m(xmlPullParser, str49)) {
                                                    if (i33 == 0) {
                                                        j42 = d(xmlPullParser, j42);
                                                        i33 = i6;
                                                    }
                                                    j16 = j42;
                                                    arrayList47.addAll(e(xmlPullParser, arrayList8, z));
                                                } else {
                                                    j16 = j42;
                                                    if (AbstractC0108a.m(xmlPullParser, "ContentProtection")) {
                                                        Pair f8 = f(xmlPullParser);
                                                        Object obj = f8.first;
                                                        if (obj != null) {
                                                            str80 = (String) obj;
                                                        }
                                                        Object obj2 = f8.second;
                                                        if (obj2 != null) {
                                                            arrayList39.add((C0093k) obj2);
                                                        }
                                                    } else if (AbstractC0108a.m(xmlPullParser, "ContentComponent")) {
                                                        String attributeValue21 = xmlPullParser.getAttributeValue(null, str50);
                                                        if (str78 == null) {
                                                            str78 = attributeValue21;
                                                        } else if (attributeValue21 != null) {
                                                            AbstractC0124a.t(str78.equals(attributeValue21));
                                                        }
                                                        int g5 = g(xmlPullParser);
                                                        if (i35 == -1) {
                                                            i35 = g5;
                                                        } else if (g5 != -1) {
                                                            AbstractC0124a.t(i35 == g5 ? i6 : i5);
                                                        }
                                                        arrayList10 = arrayList8;
                                                        str11 = str78;
                                                        str = str49;
                                                        arrayList11 = arrayList45;
                                                        z4 = z;
                                                        arrayList9 = arrayList39;
                                                        arrayList15 = arrayList42;
                                                        arrayList7 = arrayList33;
                                                        arrayList5 = arrayList34;
                                                        str14 = str66;
                                                        str15 = str67;
                                                        str22 = str68;
                                                        str23 = str69;
                                                        arrayList17 = arrayList40;
                                                        arrayList16 = arrayList41;
                                                        f4 = f7;
                                                        str16 = str74;
                                                        str17 = str75;
                                                        arrayList12 = arrayList47;
                                                        str18 = str79;
                                                        str19 = str77;
                                                        str20 = str76;
                                                        j17 = j36;
                                                        str21 = attributeValue14;
                                                        arrayList14 = arrayList43;
                                                        j5 = j35;
                                                        j12 = i31;
                                                        arrayList6 = arrayList36;
                                                        arrayList2 = arrayList37;
                                                        i8 = i35;
                                                        str24 = str50;
                                                        j7 = j34;
                                                        str12 = str64;
                                                        j10 = j39;
                                                        arrayList13 = arrayList44;
                                                        str25 = str65;
                                                        if (AbstractC0108a.k(xmlPullParser, str25)) {
                                                            i6 = 1;
                                                            str65 = str25;
                                                            arrayList40 = arrayList17;
                                                            arrayList41 = arrayList16;
                                                            str69 = str23;
                                                            str64 = str12;
                                                            arrayList37 = arrayList2;
                                                            arrayList45 = arrayList11;
                                                            arrayList44 = arrayList13;
                                                            arrayList47 = arrayList12;
                                                            j42 = j16;
                                                            arrayList42 = arrayList15;
                                                            arrayList8 = arrayList10;
                                                            f7 = f4;
                                                            str49 = str;
                                                            arrayList33 = arrayList7;
                                                            arrayList34 = arrayList5;
                                                            str67 = str15;
                                                            str66 = str14;
                                                            str50 = str24;
                                                            str68 = str22;
                                                            j39 = j10;
                                                            j34 = j7;
                                                            i35 = i8;
                                                            arrayList39 = arrayList9;
                                                            i31 = j12;
                                                            arrayList36 = arrayList6;
                                                            attributeValue14 = str21;
                                                            str78 = str11;
                                                            j35 = j5;
                                                            arrayList43 = arrayList14;
                                                            z = z4;
                                                            j36 = j17;
                                                            str75 = str17;
                                                            str76 = str20;
                                                            str77 = str19;
                                                            str79 = str18;
                                                            str74 = str16;
                                                        } else {
                                                            ArrayList arrayList48 = new ArrayList(arrayList46.size());
                                                            int i36 = i5;
                                                            while (i36 < arrayList46.size()) {
                                                                ArrayList arrayList49 = arrayList46;
                                                                C0394d c0394d = (C0394d) arrayList49.get(i36);
                                                                C0096n a3 = c0394d.f8359a.a();
                                                                if (str71 == null || !arrayList17.isEmpty()) {
                                                                    str45 = str71;
                                                                    a3.f2821c = I.k(arrayList17);
                                                                } else {
                                                                    str45 = str71;
                                                                    a3.f2820b = str45;
                                                                }
                                                                String str81 = c0394d.f8362d;
                                                                if (str81 == null) {
                                                                    str81 = str80;
                                                                }
                                                                ArrayList arrayList50 = c0394d.f8363e;
                                                                ArrayList arrayList51 = arrayList17;
                                                                arrayList50.addAll(arrayList9);
                                                                long j43 = j12;
                                                                if (arrayList50.isEmpty()) {
                                                                    str46 = str24;
                                                                    i20 = i36;
                                                                    arrayList46 = arrayList49;
                                                                } else {
                                                                    int i37 = i5;
                                                                    while (true) {
                                                                        if (i37 < arrayList50.size()) {
                                                                            C0093k c0093k = (C0093k) arrayList50.get(i37);
                                                                            str46 = str24;
                                                                            if (!AbstractC0088f.f2781c.equals(c0093k.f2797b) || (str47 = c0093k.f2798c) == null) {
                                                                                i37++;
                                                                                str24 = str46;
                                                                            } else {
                                                                                arrayList50.remove(i37);
                                                                            }
                                                                        } else {
                                                                            str46 = str24;
                                                                            str47 = null;
                                                                        }
                                                                    }
                                                                    if (str47 != null) {
                                                                        int i38 = i5;
                                                                        while (i38 < arrayList50.size()) {
                                                                            C0093k c0093k2 = (C0093k) arrayList50.get(i38);
                                                                            int i39 = i36;
                                                                            if (AbstractC0088f.f2780b.equals(c0093k2.f2797b) && c0093k2.f2798c == null) {
                                                                                arrayList29 = arrayList49;
                                                                                arrayList50.set(i38, new C0093k(AbstractC0088f.f2781c, str47, c0093k2.f2799d, c0093k2.f2800e));
                                                                            } else {
                                                                                arrayList29 = arrayList49;
                                                                            }
                                                                            i38++;
                                                                            i36 = i39;
                                                                            arrayList49 = arrayList29;
                                                                        }
                                                                    }
                                                                    i20 = i36;
                                                                    arrayList46 = arrayList49;
                                                                    for (int size = arrayList50.size() - 1; size >= 0; size--) {
                                                                        C0093k c0093k3 = (C0093k) arrayList50.get(size);
                                                                        if (c0093k3.f2800e == null) {
                                                                            int i40 = i5;
                                                                            while (true) {
                                                                                if (i40 < arrayList50.size()) {
                                                                                    C0093k c0093k4 = (C0093k) arrayList50.get(i40);
                                                                                    if (c0093k4.f2800e != null && c0093k3.f2800e == null) {
                                                                                        UUID uuid = c0093k3.f2797b;
                                                                                        c0093k4.getClass();
                                                                                        UUID uuid2 = AbstractC0088f.f2779a;
                                                                                        UUID uuid3 = c0093k4.f2797b;
                                                                                        if (((uuid2.equals(uuid3) || uuid.equals(uuid3)) ? 1 : i5) != 0) {
                                                                                            arrayList50.remove(size);
                                                                                        }
                                                                                    }
                                                                                    i40++;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    a3.f2833q = new C0094l(arrayList50, str81);
                                                                }
                                                                ArrayList arrayList52 = c0394d.f8364f;
                                                                arrayList52.addAll(arrayList16);
                                                                C0097o c0097o = new C0097o(a3);
                                                                I i41 = c0394d.f8360b;
                                                                s sVar4 = c0394d.f8361c;
                                                                if (sVar4 instanceof r) {
                                                                    kVar = new l(c0097o, i41, (r) sVar4, arrayList52);
                                                                } else {
                                                                    if (!(sVar4 instanceof n)) {
                                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                    }
                                                                    kVar = new k(c0097o, i41, (n) sVar4, arrayList52);
                                                                }
                                                                arrayList48.add(kVar);
                                                                i36 = i20 + 1;
                                                                str71 = str45;
                                                                arrayList17 = arrayList51;
                                                                str24 = str46;
                                                                j12 = j43;
                                                            }
                                                            str2 = str24;
                                                            i6 = 1;
                                                            arrayList7.add(new C0391a(parseLong, i8, arrayList48, arrayList15, arrayList13, arrayList11));
                                                            j11 = j17;
                                                            str3 = str15;
                                                            str4 = str14;
                                                            str5 = str17;
                                                            j6 = -9223372036854775807L;
                                                        }
                                                    } else {
                                                        if (AbstractC0108a.m(xmlPullParser, "Role")) {
                                                            arrayList43.add(h(xmlPullParser, "Role"));
                                                        } else {
                                                            String str82 = "AudioChannelConfiguration";
                                                            if (AbstractC0108a.m(xmlPullParser, "AudioChannelConfiguration")) {
                                                                i34 = c(xmlPullParser, attributeValue14);
                                                            } else {
                                                                String str83 = "ContentProtection";
                                                                if (AbstractC0108a.m(xmlPullParser, "Accessibility")) {
                                                                    arrayList42.add(h(xmlPullParser, "Accessibility"));
                                                                } else if (AbstractC0108a.m(xmlPullParser, "EssentialProperty")) {
                                                                    arrayList44.add(h(xmlPullParser, "EssentialProperty"));
                                                                } else {
                                                                    arrayList9 = arrayList39;
                                                                    if (AbstractC0108a.m(xmlPullParser, "SupplementalProperty")) {
                                                                        arrayList45.add(h(xmlPullParser, "SupplementalProperty"));
                                                                        arrayList10 = arrayList8;
                                                                        str11 = str78;
                                                                        i7 = i35;
                                                                        str = str49;
                                                                        arrayList11 = arrayList45;
                                                                        z4 = z;
                                                                        arrayList15 = arrayList42;
                                                                        str24 = str50;
                                                                        arrayList7 = arrayList33;
                                                                        arrayList5 = arrayList34;
                                                                        str12 = str64;
                                                                        str13 = str65;
                                                                        str14 = str66;
                                                                        str15 = str67;
                                                                        str22 = str68;
                                                                        str23 = str69;
                                                                        arrayList17 = arrayList40;
                                                                        arrayList16 = arrayList41;
                                                                        f4 = f7;
                                                                        str16 = str74;
                                                                        str17 = str75;
                                                                        j18 = j41;
                                                                        arrayList12 = arrayList47;
                                                                        str18 = str79;
                                                                        str19 = str77;
                                                                        str20 = str76;
                                                                        j17 = j36;
                                                                        str21 = attributeValue14;
                                                                        arrayList14 = arrayList43;
                                                                        j5 = j35;
                                                                        j12 = i31;
                                                                        arrayList6 = arrayList36;
                                                                        arrayList2 = arrayList37;
                                                                        j7 = j34;
                                                                        j10 = j39;
                                                                        arrayList13 = arrayList44;
                                                                        j41 = j18;
                                                                        i8 = i7;
                                                                        str25 = str13;
                                                                        if (AbstractC0108a.k(xmlPullParser, str25)) {
                                                                        }
                                                                    } else {
                                                                        String str84 = str50;
                                                                        ArrayList arrayList53 = arrayList42;
                                                                        if (AbstractC0108a.m(xmlPullParser, "Representation")) {
                                                                            arrayList10 = arrayList8;
                                                                            if (arrayList47.isEmpty()) {
                                                                                str26 = "Representation";
                                                                                arrayList18 = arrayList10;
                                                                            } else {
                                                                                str26 = "Representation";
                                                                                arrayList18 = arrayList47;
                                                                            }
                                                                            String str85 = "SupplementalProperty";
                                                                            String str86 = str75;
                                                                            String str87 = "EssentialProperty";
                                                                            String attributeValue22 = xmlPullParser.getAttributeValue(null, str86);
                                                                            String str88 = str86;
                                                                            String attributeValue23 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                            if (attributeValue23 == null) {
                                                                                str27 = str76;
                                                                                parseInt = -1;
                                                                            } else {
                                                                                String str89 = str76;
                                                                                parseInt = Integer.parseInt(attributeValue23);
                                                                                str27 = str89;
                                                                            }
                                                                            String attributeValue24 = xmlPullParser.getAttributeValue(null, str27);
                                                                            String str90 = str77;
                                                                            str20 = str27;
                                                                            String str91 = attributeValue24 == null ? attributeValue13 : attributeValue24;
                                                                            String attributeValue25 = xmlPullParser.getAttributeValue(null, str90);
                                                                            String str92 = str79;
                                                                            str19 = str90;
                                                                            String str93 = attributeValue25 == null ? attributeValue14 : attributeValue25;
                                                                            String attributeValue26 = xmlPullParser.getAttributeValue(null, str92);
                                                                            String str94 = str74;
                                                                            str18 = str92;
                                                                            String str95 = attributeValue26 == null ? attributeValue15 : attributeValue26;
                                                                            xmlPullParser.getAttributeValue(null, str94);
                                                                            str16 = str94;
                                                                            String str96 = str73;
                                                                            String attributeValue27 = xmlPullParser.getAttributeValue(null, str96);
                                                                            int parseInt6 = attributeValue27 == null ? parseInt3 : Integer.parseInt(attributeValue27);
                                                                            str73 = str96;
                                                                            String str97 = str72;
                                                                            String attributeValue28 = xmlPullParser.getAttributeValue(null, str97);
                                                                            int parseInt7 = attributeValue28 == null ? parseInt4 : Integer.parseInt(attributeValue28);
                                                                            str72 = str97;
                                                                            float f9 = f7;
                                                                            String str98 = "InbandEventStream";
                                                                            float j44 = j(xmlPullParser, f9);
                                                                            String str99 = str70;
                                                                            String attributeValue29 = xmlPullParser.getAttributeValue(null, str99);
                                                                            int parseInt8 = attributeValue29 == null ? parseInt5 : Integer.parseInt(attributeValue29);
                                                                            str70 = str99;
                                                                            ArrayList arrayList54 = new ArrayList();
                                                                            ArrayList arrayList55 = new ArrayList();
                                                                            ArrayList arrayList56 = new ArrayList(arrayList44);
                                                                            ArrayList arrayList57 = new ArrayList(arrayList45);
                                                                            ArrayList arrayList58 = new ArrayList();
                                                                            ArrayList arrayList59 = arrayList44;
                                                                            int i42 = parseInt8;
                                                                            String str100 = attributeValue14;
                                                                            int i43 = i35;
                                                                            int i44 = i5;
                                                                            s sVar5 = sVar3;
                                                                            long j45 = j41;
                                                                            int i45 = i34;
                                                                            long j46 = j16;
                                                                            String str101 = null;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (AbstractC0108a.m(xmlPullParser, str49)) {
                                                                                    if (i44 == 0) {
                                                                                        j46 = d(xmlPullParser, j46);
                                                                                        i44 = i6;
                                                                                    }
                                                                                    f4 = f9;
                                                                                    arrayList58.addAll(e(xmlPullParser, arrayList18, z));
                                                                                } else {
                                                                                    f4 = f9;
                                                                                    if (AbstractC0108a.m(xmlPullParser, str82)) {
                                                                                        i45 = c(xmlPullParser, str93);
                                                                                    } else {
                                                                                        String str102 = str69;
                                                                                        if (AbstractC0108a.m(xmlPullParser, str102)) {
                                                                                            str28 = str82;
                                                                                            sVar5 = o(xmlPullParser, (r) sVar5);
                                                                                            str30 = str102;
                                                                                            str31 = str78;
                                                                                            str = str49;
                                                                                            arrayList11 = arrayList45;
                                                                                            z4 = z;
                                                                                            str32 = str93;
                                                                                            arrayList7 = arrayList33;
                                                                                            arrayList5 = arrayList34;
                                                                                            str33 = str65;
                                                                                            str14 = str66;
                                                                                            str15 = str67;
                                                                                            str29 = str68;
                                                                                            str36 = str98;
                                                                                            arrayList19 = arrayList46;
                                                                                            i9 = parseInt;
                                                                                            str34 = str83;
                                                                                            str38 = str26;
                                                                                            str17 = str88;
                                                                                            i10 = i43;
                                                                                            arrayList23 = arrayList54;
                                                                                            arrayList25 = arrayList57;
                                                                                            i11 = i42;
                                                                                            arrayList12 = arrayList47;
                                                                                            arrayList21 = arrayList58;
                                                                                            arrayList22 = arrayList18;
                                                                                            str12 = str64;
                                                                                            str35 = str87;
                                                                                            sVar = sVar5;
                                                                                            j20 = j46;
                                                                                            j19 = i31;
                                                                                            j17 = j36;
                                                                                            str39 = str101;
                                                                                            str21 = str100;
                                                                                            arrayList20 = arrayList43;
                                                                                            j7 = j34;
                                                                                            j5 = j35;
                                                                                            arrayList6 = arrayList36;
                                                                                            arrayList2 = arrayList37;
                                                                                            j10 = j39;
                                                                                            arrayList13 = arrayList59;
                                                                                            j21 = j45;
                                                                                            arrayList24 = arrayList56;
                                                                                            i12 = i45;
                                                                                            if (AbstractC0108a.k(xmlPullParser, str38)) {
                                                                                                if (F.i(str91)) {
                                                                                                    if (str32 != null) {
                                                                                                        String[] W4 = J.W(str32);
                                                                                                        int length2 = W4.length;
                                                                                                        for (int i46 = i5; i46 < length2; i46++) {
                                                                                                            d4 = F.d(W4[i46]);
                                                                                                            if (d4 != null && F.i(d4)) {
                                                                                                                str40 = d4;
                                                                                                                str41 = str91;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d4 = null;
                                                                                                    str40 = d4;
                                                                                                    str41 = str91;
                                                                                                } else if (F.m(str91)) {
                                                                                                    if (str32 != null) {
                                                                                                        String[] W5 = J.W(str32);
                                                                                                        int length3 = W5.length;
                                                                                                        for (int i47 = i5; i47 < length3; i47++) {
                                                                                                            d4 = F.d(W5[i47]);
                                                                                                            if (d4 != null && F.m(d4)) {
                                                                                                                str40 = d4;
                                                                                                                str41 = str91;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    d4 = null;
                                                                                                    str40 = d4;
                                                                                                    str41 = str91;
                                                                                                } else if (F.l(str91) || F.k(str91)) {
                                                                                                    str40 = str91;
                                                                                                    str41 = str40;
                                                                                                } else {
                                                                                                    str41 = str91;
                                                                                                    if ("application/mp4".equals(str41)) {
                                                                                                        str40 = F.d(str32);
                                                                                                        if ("text/vtt".equals(str40)) {
                                                                                                            str40 = "application/x-mp4-vtt";
                                                                                                        }
                                                                                                    } else {
                                                                                                        str40 = null;
                                                                                                    }
                                                                                                }
                                                                                                if ("audio/eac3".equals(str40)) {
                                                                                                    int i48 = i5;
                                                                                                    while (i48 < arrayList25.size()) {
                                                                                                        C0396f c0396f = (C0396f) arrayList25.get(i48);
                                                                                                        int i49 = i48;
                                                                                                        String str103 = c0396f.f8371a;
                                                                                                        String str104 = c0396f.f8372b;
                                                                                                        arrayList26 = arrayList25;
                                                                                                        if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str103) && "JOC".equals(str104)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str103) && "ec+3".equals(str104))) {
                                                                                                            str40 = "audio/eac3-joc";
                                                                                                            if ("audio/eac3-joc".equals(str40)) {
                                                                                                                str43 = "ec+3";
                                                                                                                str42 = str95;
                                                                                                                if (F.j(str43, str42)) {
                                                                                                                    str40 = "video/dolby-vision";
                                                                                                                    str43 = str42 != null ? str42 : str43;
                                                                                                                }
                                                                                                                i13 = i5;
                                                                                                                int i50 = i13;
                                                                                                                while (i13 < arrayList20.size()) {
                                                                                                                    ArrayList arrayList60 = arrayList20;
                                                                                                                    int i51 = i13;
                                                                                                                    C0396f c0396f2 = (C0396f) arrayList60.get(i13);
                                                                                                                    long j47 = j19;
                                                                                                                    if (U.i.h("urn:mpeg:dash:role:2011", c0396f2.f8371a)) {
                                                                                                                        String str105 = c0396f2.f8372b;
                                                                                                                        i50 |= (str105 != null && (str105.equals("forced_subtitle") || str105.equals("forced-subtitle"))) ? 2 : i5;
                                                                                                                    }
                                                                                                                    i13 = i51 + 1;
                                                                                                                    arrayList20 = arrayList60;
                                                                                                                    j19 = j47;
                                                                                                                }
                                                                                                                long j48 = j19;
                                                                                                                arrayList27 = arrayList20;
                                                                                                                i14 = i5;
                                                                                                                int i52 = i14;
                                                                                                                while (i14 < arrayList27.size()) {
                                                                                                                    C0396f c0396f3 = (C0396f) arrayList27.get(i14);
                                                                                                                    int i53 = i14;
                                                                                                                    if (U.i.h("urn:mpeg:dash:role:2011", c0396f3.f8371a)) {
                                                                                                                        i52 |= m(c0396f3.f8372b);
                                                                                                                    }
                                                                                                                    i14 = i53 + 1;
                                                                                                                }
                                                                                                                int i54 = i52;
                                                                                                                i15 = i5;
                                                                                                                int i55 = i15;
                                                                                                                while (i15 < arrayList53.size()) {
                                                                                                                    ArrayList arrayList61 = arrayList53;
                                                                                                                    int i56 = i15;
                                                                                                                    C0396f c0396f4 = (C0396f) arrayList61.get(i15);
                                                                                                                    int i57 = i55;
                                                                                                                    String str106 = c0396f4.f8371a;
                                                                                                                    String str107 = str41;
                                                                                                                    String str108 = c0396f4.f8372b;
                                                                                                                    if (U.i.h("urn:mpeg:dash:role:2011", str106)) {
                                                                                                                        i19 = m(str108);
                                                                                                                    } else if (U.i.h("urn:tva:metadata:cs:AudioPurposeCS:2007", c0396f4.f8371a)) {
                                                                                                                        if (str108 != null) {
                                                                                                                            switch (str108.hashCode()) {
                                                                                                                                case 49:
                                                                                                                                    if (str108.equals("1")) {
                                                                                                                                        i18 = i5;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    i18 = -1;
                                                                                                                                    break;
                                                                                                                                case 50:
                                                                                                                                    if (str108.equals("2")) {
                                                                                                                                        i18 = i6;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    i18 = -1;
                                                                                                                                    break;
                                                                                                                                case 51:
                                                                                                                                    if (str108.equals("3")) {
                                                                                                                                        i18 = 2;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    i18 = -1;
                                                                                                                                    break;
                                                                                                                                case 52:
                                                                                                                                    if (str108.equals("4")) {
                                                                                                                                        i18 = 3;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    i18 = -1;
                                                                                                                                    break;
                                                                                                                                case 53:
                                                                                                                                default:
                                                                                                                                    i18 = -1;
                                                                                                                                    break;
                                                                                                                                case 54:
                                                                                                                                    if (str108.equals("6")) {
                                                                                                                                        i18 = 4;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    i18 = -1;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            switch (i18) {
                                                                                                                                case 0:
                                                                                                                                    i19 = 512;
                                                                                                                                    break;
                                                                                                                                case 1:
                                                                                                                                    i19 = 2048;
                                                                                                                                    break;
                                                                                                                                case 2:
                                                                                                                                    i19 = 4;
                                                                                                                                    break;
                                                                                                                                case 3:
                                                                                                                                    i19 = 8;
                                                                                                                                    break;
                                                                                                                                case 4:
                                                                                                                                    i19 = i6;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i19 = i5;
                                                                                                                    } else {
                                                                                                                        i55 = i57;
                                                                                                                        i15 = i56 + 1;
                                                                                                                        arrayList53 = arrayList61;
                                                                                                                        str41 = str107;
                                                                                                                    }
                                                                                                                    i55 = i57 | i19;
                                                                                                                    i15 = i56 + 1;
                                                                                                                    arrayList53 = arrayList61;
                                                                                                                    str41 = str107;
                                                                                                                }
                                                                                                                String str109 = str41;
                                                                                                                ArrayList arrayList62 = arrayList53;
                                                                                                                int n4 = i54 | i55 | n(arrayList24) | n(arrayList26);
                                                                                                                i16 = i5;
                                                                                                                while (true) {
                                                                                                                    if (i16 >= arrayList24.size()) {
                                                                                                                        C0396f c0396f5 = (C0396f) arrayList24.get(i16);
                                                                                                                        arrayList28 = arrayList24;
                                                                                                                        if ((U.i.h("http://dashif.org/thumbnail_tile", c0396f5.f8371a) || U.i.h("http://dashif.org/guidelines/thumbnail_tile", c0396f5.f8371a)) && (str44 = c0396f5.f8372b) != null) {
                                                                                                                            String str110 = J.f3263a;
                                                                                                                            String[] split = str44.split("x", -1);
                                                                                                                            if (split.length != 2) {
                                                                                                                                continue;
                                                                                                                            } else {
                                                                                                                                try {
                                                                                                                                    pair = Pair.create(Integer.valueOf(Integer.parseInt(split[i5])), Integer.valueOf(Integer.parseInt(split[i6])));
                                                                                                                                } catch (NumberFormatException unused) {
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i16++;
                                                                                                                        arrayList24 = arrayList28;
                                                                                                                    } else {
                                                                                                                        arrayList28 = arrayList24;
                                                                                                                        pair = null;
                                                                                                                    }
                                                                                                                }
                                                                                                                C0096n c0096n = new C0096n();
                                                                                                                c0096n.f2819a = attributeValue22;
                                                                                                                c0096n.f2830l = F.n(str109);
                                                                                                                c0096n.f2831m = F.n(str40);
                                                                                                                c0096n.f2828j = str43;
                                                                                                                c0096n.f2827i = i9;
                                                                                                                c0096n.f2823e = i50;
                                                                                                                c0096n.f2824f = n4;
                                                                                                                String str111 = str31;
                                                                                                                c0096n.f2822d = str111;
                                                                                                                c0096n.L = pair == null ? ((Integer) pair.first).intValue() : -1;
                                                                                                                c0096n.f2817M = pair == null ? ((Integer) pair.second).intValue() : -1;
                                                                                                                if (F.m(str40)) {
                                                                                                                    int i58 = parseInt6;
                                                                                                                    int i59 = parseInt7;
                                                                                                                    if (F.i(str40)) {
                                                                                                                        c0096n.f2810E = i12;
                                                                                                                        c0096n.f2811F = i11;
                                                                                                                    } else if (F.l(str40)) {
                                                                                                                        if ("application/cea-608".equals(str40)) {
                                                                                                                            int i60 = i5;
                                                                                                                            while (i60 < arrayList62.size()) {
                                                                                                                                C0396f c0396f6 = (C0396f) arrayList62.get(i60);
                                                                                                                                String str112 = c0396f6.f8371a;
                                                                                                                                String str113 = c0396f6.f8372b;
                                                                                                                                if ("urn:scte:dash:cc:cea-608:2015".equals(str112) && str113 != null) {
                                                                                                                                    Matcher matcher = f8366c.matcher(str113);
                                                                                                                                    if (matcher.matches()) {
                                                                                                                                        parseInt2 = Integer.parseInt(matcher.group(i6));
                                                                                                                                        c0096n.f2815J = parseInt2;
                                                                                                                                    } else {
                                                                                                                                        AbstractC0108a.s("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str113));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                i60++;
                                                                                                                                i6 = 1;
                                                                                                                            }
                                                                                                                            parseInt2 = -1;
                                                                                                                            c0096n.f2815J = parseInt2;
                                                                                                                        } else {
                                                                                                                            if ("application/cea-708".equals(str40)) {
                                                                                                                                for (int i61 = i5; i61 < arrayList62.size(); i61++) {
                                                                                                                                    C0396f c0396f7 = (C0396f) arrayList62.get(i61);
                                                                                                                                    String str114 = c0396f7.f8371a;
                                                                                                                                    String str115 = c0396f7.f8372b;
                                                                                                                                    if ("urn:scte:dash:cc:cea-708:2015".equals(str114) && str115 != null) {
                                                                                                                                        Matcher matcher2 = f8367d.matcher(str115);
                                                                                                                                        if (matcher2.matches()) {
                                                                                                                                            parseInt2 = Integer.parseInt(matcher2.group(1));
                                                                                                                                            c0096n.f2815J = parseInt2;
                                                                                                                                        } else {
                                                                                                                                            AbstractC0108a.s("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str115));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            parseInt2 = -1;
                                                                                                                            c0096n.f2815J = parseInt2;
                                                                                                                        }
                                                                                                                        if (AbstractC0108a.k(xmlPullParser, str25)) {
                                                                                                                        }
                                                                                                                    } else if (F.k(str40)) {
                                                                                                                        c0096n.f2836t = i58;
                                                                                                                        c0096n.f2837u = i59;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c0096n.f2836t = parseInt6;
                                                                                                                    c0096n.f2837u = parseInt7;
                                                                                                                    c0096n.f2839x = j44;
                                                                                                                }
                                                                                                                C0097o c0097o2 = new C0097o(c0096n);
                                                                                                                C0394d c0394d2 = new C0394d(c0097o2, arrayList21.isEmpty() ? arrayList21 : arrayList22, sVar == null ? sVar : new r(null, 1L, 0L, 0L, 0L), str39, arrayList23, arrayList55, arrayList28, arrayList26);
                                                                                                                int h2 = F.h(c0097o2.n);
                                                                                                                i17 = i10;
                                                                                                                if (i17 != -1) {
                                                                                                                    if (h2 != -1) {
                                                                                                                        AbstractC0124a.t(i17 == h2 ? 1 : i5);
                                                                                                                    }
                                                                                                                    h2 = i17;
                                                                                                                }
                                                                                                                ArrayList arrayList63 = arrayList19;
                                                                                                                arrayList63.add(c0394d2);
                                                                                                                arrayList46 = arrayList63;
                                                                                                                str11 = str111;
                                                                                                                arrayList15 = arrayList62;
                                                                                                                i8 = h2;
                                                                                                                arrayList14 = arrayList27;
                                                                                                                arrayList17 = arrayList40;
                                                                                                                arrayList16 = arrayList41;
                                                                                                                str24 = str84;
                                                                                                                j12 = j48;
                                                                                                                str25 = str33;
                                                                                                                str22 = str29;
                                                                                                                str23 = str30;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i48 = i49 + 1;
                                                                                                            arrayList25 = arrayList26;
                                                                                                        }
                                                                                                    }
                                                                                                    arrayList26 = arrayList25;
                                                                                                    str40 = "audio/eac3";
                                                                                                    if ("audio/eac3-joc".equals(str40)) {
                                                                                                    }
                                                                                                } else {
                                                                                                    arrayList26 = arrayList25;
                                                                                                }
                                                                                                str42 = str95;
                                                                                                str43 = str32;
                                                                                                if (F.j(str43, str42)) {
                                                                                                }
                                                                                                i13 = i5;
                                                                                                int i502 = i13;
                                                                                                while (i13 < arrayList20.size()) {
                                                                                                }
                                                                                                long j482 = j19;
                                                                                                arrayList27 = arrayList20;
                                                                                                i14 = i5;
                                                                                                int i522 = i14;
                                                                                                while (i14 < arrayList27.size()) {
                                                                                                }
                                                                                                int i542 = i522;
                                                                                                i15 = i5;
                                                                                                int i552 = i15;
                                                                                                while (i15 < arrayList53.size()) {
                                                                                                }
                                                                                                String str1092 = str41;
                                                                                                ArrayList arrayList622 = arrayList53;
                                                                                                int n42 = i542 | i552 | n(arrayList24) | n(arrayList26);
                                                                                                i16 = i5;
                                                                                                while (true) {
                                                                                                    if (i16 >= arrayList24.size()) {
                                                                                                    }
                                                                                                    i16++;
                                                                                                    arrayList24 = arrayList28;
                                                                                                }
                                                                                                C0096n c0096n2 = new C0096n();
                                                                                                c0096n2.f2819a = attributeValue22;
                                                                                                c0096n2.f2830l = F.n(str1092);
                                                                                                c0096n2.f2831m = F.n(str40);
                                                                                                c0096n2.f2828j = str43;
                                                                                                c0096n2.f2827i = i9;
                                                                                                c0096n2.f2823e = i502;
                                                                                                c0096n2.f2824f = n42;
                                                                                                String str1112 = str31;
                                                                                                c0096n2.f2822d = str1112;
                                                                                                c0096n2.L = pair == null ? ((Integer) pair.first).intValue() : -1;
                                                                                                c0096n2.f2817M = pair == null ? ((Integer) pair.second).intValue() : -1;
                                                                                                if (F.m(str40)) {
                                                                                                }
                                                                                                C0097o c0097o22 = new C0097o(c0096n2);
                                                                                                if (sVar == null) {
                                                                                                }
                                                                                                C0394d c0394d22 = new C0394d(c0097o22, arrayList21.isEmpty() ? arrayList21 : arrayList22, sVar == null ? sVar : new r(null, 1L, 0L, 0L, 0L), str39, arrayList23, arrayList55, arrayList28, arrayList26);
                                                                                                int h22 = F.h(c0097o22.n);
                                                                                                i17 = i10;
                                                                                                if (i17 != -1) {
                                                                                                }
                                                                                                ArrayList arrayList632 = arrayList19;
                                                                                                arrayList632.add(c0394d22);
                                                                                                arrayList46 = arrayList632;
                                                                                                str11 = str1112;
                                                                                                arrayList15 = arrayList622;
                                                                                                i8 = h22;
                                                                                                arrayList14 = arrayList27;
                                                                                                arrayList17 = arrayList40;
                                                                                                arrayList16 = arrayList41;
                                                                                                str24 = str84;
                                                                                                j12 = j482;
                                                                                                str25 = str33;
                                                                                                str22 = str29;
                                                                                                str23 = str30;
                                                                                            } else {
                                                                                                arrayList56 = arrayList24;
                                                                                                arrayList57 = arrayList25;
                                                                                                long j49 = j19;
                                                                                                i45 = i12;
                                                                                                str26 = str38;
                                                                                                j46 = j20;
                                                                                                str98 = str36;
                                                                                                arrayList54 = arrayList23;
                                                                                                str83 = str34;
                                                                                                str100 = str21;
                                                                                                arrayList45 = arrayList11;
                                                                                                j45 = j21;
                                                                                                arrayList59 = arrayList13;
                                                                                                arrayList47 = arrayList12;
                                                                                                str82 = str28;
                                                                                                str101 = str39;
                                                                                                f9 = f4;
                                                                                                str49 = str;
                                                                                                str93 = str32;
                                                                                                i43 = i10;
                                                                                                arrayList46 = arrayList19;
                                                                                                str78 = str31;
                                                                                                i42 = i11;
                                                                                                str67 = str15;
                                                                                                str66 = str14;
                                                                                                str68 = str29;
                                                                                                str69 = str30;
                                                                                                i6 = 1;
                                                                                                j39 = j10;
                                                                                                arrayList37 = arrayList2;
                                                                                                arrayList36 = arrayList6;
                                                                                                j34 = j7;
                                                                                                sVar5 = sVar;
                                                                                                i31 = j49;
                                                                                                str88 = str17;
                                                                                                j35 = j5;
                                                                                                str64 = str12;
                                                                                                arrayList43 = arrayList20;
                                                                                                arrayList18 = arrayList22;
                                                                                                z = z4;
                                                                                                str91 = str91;
                                                                                                j36 = j17;
                                                                                                arrayList33 = arrayList7;
                                                                                                parseInt = i9;
                                                                                                str65 = str33;
                                                                                                str87 = str35;
                                                                                                arrayList58 = arrayList21;
                                                                                                arrayList34 = arrayList5;
                                                                                            }
                                                                                        } else {
                                                                                            str28 = str82;
                                                                                            String str116 = str68;
                                                                                            if (AbstractC0108a.m(xmlPullParser, str116)) {
                                                                                                arrayList12 = arrayList47;
                                                                                                str = str49;
                                                                                                long d5 = d(xmlPullParser, j45);
                                                                                                str29 = str116;
                                                                                                str30 = str102;
                                                                                                str31 = str78;
                                                                                                str32 = str93;
                                                                                                long j50 = i31;
                                                                                                long j51 = j36;
                                                                                                arrayList7 = arrayList33;
                                                                                                arrayList5 = arrayList34;
                                                                                                str33 = str65;
                                                                                                str14 = str66;
                                                                                                str15 = str67;
                                                                                                arrayList19 = arrayList46;
                                                                                                i9 = parseInt;
                                                                                                str34 = str83;
                                                                                                str17 = str88;
                                                                                                str21 = str100;
                                                                                                i10 = i43;
                                                                                                i11 = i42;
                                                                                                ArrayList arrayList64 = arrayList45;
                                                                                                arrayList20 = arrayList43;
                                                                                                arrayList21 = arrayList58;
                                                                                                j7 = j34;
                                                                                                long j52 = j35;
                                                                                                arrayList6 = arrayList36;
                                                                                                arrayList2 = arrayList37;
                                                                                                j10 = j39;
                                                                                                str35 = str87;
                                                                                                arrayList13 = arrayList59;
                                                                                                s p2 = p(xmlPullParser, (o) sVar5, j51, j50, j46, d5, j52);
                                                                                                j19 = j50;
                                                                                                j17 = j51;
                                                                                                j21 = d5;
                                                                                                j20 = j46;
                                                                                                str36 = str98;
                                                                                                str38 = str26;
                                                                                                arrayList24 = arrayList56;
                                                                                                arrayList25 = arrayList57;
                                                                                                i12 = i45;
                                                                                                z4 = z;
                                                                                                arrayList11 = arrayList64;
                                                                                                j5 = j52;
                                                                                                arrayList22 = arrayList18;
                                                                                                str12 = str64;
                                                                                                sVar = p2;
                                                                                                arrayList23 = arrayList54;
                                                                                            } else {
                                                                                                str29 = str116;
                                                                                                str30 = str102;
                                                                                                str31 = str78;
                                                                                                long j53 = j46;
                                                                                                arrayList12 = arrayList47;
                                                                                                str = str49;
                                                                                                str32 = str93;
                                                                                                j19 = i31;
                                                                                                long j54 = j36;
                                                                                                arrayList7 = arrayList33;
                                                                                                arrayList5 = arrayList34;
                                                                                                String str117 = str64;
                                                                                                str33 = str65;
                                                                                                str14 = str66;
                                                                                                str15 = str67;
                                                                                                arrayList19 = arrayList46;
                                                                                                i9 = parseInt;
                                                                                                str34 = str83;
                                                                                                str17 = str88;
                                                                                                str21 = str100;
                                                                                                i10 = i43;
                                                                                                i11 = i42;
                                                                                                ArrayList arrayList65 = arrayList45;
                                                                                                arrayList20 = arrayList43;
                                                                                                arrayList21 = arrayList58;
                                                                                                j7 = j34;
                                                                                                long j55 = j35;
                                                                                                arrayList6 = arrayList36;
                                                                                                arrayList2 = arrayList37;
                                                                                                j10 = j39;
                                                                                                str35 = str87;
                                                                                                arrayList13 = arrayList59;
                                                                                                if (AbstractC0108a.m(xmlPullParser, str117)) {
                                                                                                    j5 = j55;
                                                                                                    long d6 = d(xmlPullParser, j45);
                                                                                                    arrayList22 = arrayList18;
                                                                                                    str12 = str117;
                                                                                                    z4 = z;
                                                                                                    j20 = j53;
                                                                                                    s q4 = q(xmlPullParser, (p) sVar5, arrayList65, j54, j19, j20, d6, j5);
                                                                                                    arrayList11 = arrayList65;
                                                                                                    j17 = j54;
                                                                                                    j21 = d6;
                                                                                                    str36 = str98;
                                                                                                    str38 = str26;
                                                                                                    sVar = q4;
                                                                                                    arrayList23 = arrayList54;
                                                                                                } else {
                                                                                                    ArrayList arrayList66 = arrayList18;
                                                                                                    str12 = str117;
                                                                                                    j20 = j53;
                                                                                                    arrayList11 = arrayList65;
                                                                                                    arrayList22 = arrayList66;
                                                                                                    z4 = z;
                                                                                                    j5 = j55;
                                                                                                    if (AbstractC0108a.m(xmlPullParser, str34)) {
                                                                                                        Pair f10 = f(xmlPullParser);
                                                                                                        Object obj3 = f10.first;
                                                                                                        if (obj3 != null) {
                                                                                                            str101 = (String) obj3;
                                                                                                        }
                                                                                                        Object obj4 = f10.second;
                                                                                                        if (obj4 != null) {
                                                                                                            arrayList23 = arrayList54;
                                                                                                            arrayList23.add((C0093k) obj4);
                                                                                                        } else {
                                                                                                            arrayList23 = arrayList54;
                                                                                                        }
                                                                                                        j21 = j45;
                                                                                                        j17 = j54;
                                                                                                        str36 = str98;
                                                                                                        str38 = str26;
                                                                                                        sVar = sVar5;
                                                                                                    } else {
                                                                                                        str36 = str98;
                                                                                                        arrayList23 = arrayList54;
                                                                                                        if (AbstractC0108a.m(xmlPullParser, str36)) {
                                                                                                            j21 = j45;
                                                                                                            arrayList55.add(h(xmlPullParser, str36));
                                                                                                            j17 = j54;
                                                                                                            str37 = str85;
                                                                                                            arrayList24 = arrayList56;
                                                                                                        } else {
                                                                                                            j21 = j45;
                                                                                                            ArrayList arrayList67 = arrayList55;
                                                                                                            if (AbstractC0108a.m(xmlPullParser, str35)) {
                                                                                                                arrayList55 = arrayList67;
                                                                                                                arrayList24 = arrayList56;
                                                                                                                arrayList24.add(h(xmlPullParser, str35));
                                                                                                                j17 = j54;
                                                                                                                str37 = str85;
                                                                                                            } else {
                                                                                                                arrayList55 = arrayList67;
                                                                                                                str37 = str85;
                                                                                                                arrayList24 = arrayList56;
                                                                                                                if (AbstractC0108a.m(xmlPullParser, str37)) {
                                                                                                                    j17 = j54;
                                                                                                                    arrayList25 = arrayList57;
                                                                                                                    arrayList25.add(h(xmlPullParser, str37));
                                                                                                                } else {
                                                                                                                    j17 = j54;
                                                                                                                    arrayList25 = arrayList57;
                                                                                                                    b(xmlPullParser);
                                                                                                                }
                                                                                                                str85 = str37;
                                                                                                                str38 = str26;
                                                                                                                sVar = sVar5;
                                                                                                                i12 = i45;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList25 = arrayList57;
                                                                                                        str85 = str37;
                                                                                                        str38 = str26;
                                                                                                        sVar = sVar5;
                                                                                                        i12 = i45;
                                                                                                    }
                                                                                                }
                                                                                                arrayList24 = arrayList56;
                                                                                                arrayList25 = arrayList57;
                                                                                                i12 = i45;
                                                                                            }
                                                                                            str39 = str101;
                                                                                            if (AbstractC0108a.k(xmlPullParser, str38)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str31 = str78;
                                                                                str = str49;
                                                                                arrayList11 = arrayList45;
                                                                                z4 = z;
                                                                                str32 = str93;
                                                                                arrayList7 = arrayList33;
                                                                                arrayList5 = arrayList34;
                                                                                str33 = str65;
                                                                                str14 = str66;
                                                                                str15 = str67;
                                                                                str29 = str68;
                                                                                str30 = str69;
                                                                                str36 = str98;
                                                                                arrayList19 = arrayList46;
                                                                                i9 = parseInt;
                                                                                str34 = str83;
                                                                                str17 = str88;
                                                                                i10 = i43;
                                                                                arrayList23 = arrayList54;
                                                                                arrayList25 = arrayList57;
                                                                                i11 = i42;
                                                                                str28 = str82;
                                                                                arrayList12 = arrayList47;
                                                                                arrayList21 = arrayList58;
                                                                                arrayList22 = arrayList18;
                                                                                str12 = str64;
                                                                                str35 = str87;
                                                                                str38 = str26;
                                                                                sVar = sVar5;
                                                                                j20 = j46;
                                                                                j19 = i31;
                                                                                j17 = j36;
                                                                                str39 = str101;
                                                                                str21 = str100;
                                                                                arrayList20 = arrayList43;
                                                                                j7 = j34;
                                                                                j5 = j35;
                                                                                arrayList6 = arrayList36;
                                                                                arrayList2 = arrayList37;
                                                                                j10 = j39;
                                                                                arrayList13 = arrayList59;
                                                                                j21 = j45;
                                                                                arrayList24 = arrayList56;
                                                                                i12 = i45;
                                                                                if (AbstractC0108a.k(xmlPullParser, str38)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            arrayList10 = arrayList8;
                                                                            str11 = str78;
                                                                            str = str49;
                                                                            arrayList11 = arrayList45;
                                                                            z4 = z;
                                                                            long j56 = i31;
                                                                            arrayList7 = arrayList33;
                                                                            arrayList5 = arrayList34;
                                                                            str12 = str64;
                                                                            str13 = str65;
                                                                            str14 = str66;
                                                                            str15 = str67;
                                                                            String str118 = str68;
                                                                            f4 = f7;
                                                                            str16 = str74;
                                                                            str17 = str75;
                                                                            arrayList12 = arrayList47;
                                                                            j7 = j34;
                                                                            j10 = j39;
                                                                            str18 = str79;
                                                                            str19 = str77;
                                                                            str20 = str76;
                                                                            arrayList13 = arrayList44;
                                                                            j17 = j36;
                                                                            String str119 = str69;
                                                                            str21 = attributeValue14;
                                                                            int i62 = i35;
                                                                            arrayList14 = arrayList43;
                                                                            j5 = j35;
                                                                            arrayList6 = arrayList36;
                                                                            arrayList2 = arrayList37;
                                                                            if (AbstractC0108a.m(xmlPullParser, str119)) {
                                                                                sVar3 = o(xmlPullParser, (r) sVar3);
                                                                                str23 = str119;
                                                                                arrayList15 = arrayList53;
                                                                                i8 = i62;
                                                                                arrayList17 = arrayList40;
                                                                                arrayList16 = arrayList41;
                                                                                str24 = str84;
                                                                                j12 = j56;
                                                                                str25 = str13;
                                                                                str22 = str118;
                                                                            } else {
                                                                                str22 = str118;
                                                                                if (AbstractC0108a.m(xmlPullParser, str22)) {
                                                                                    long d7 = d(xmlPullParser, j41);
                                                                                    str23 = str119;
                                                                                    arrayList15 = arrayList53;
                                                                                    i7 = i62;
                                                                                    sVar3 = p(xmlPullParser, (o) sVar3, j17, j56, j16, d7, j5);
                                                                                    j5 = j5;
                                                                                    j12 = j56;
                                                                                    j41 = d7;
                                                                                } else {
                                                                                    str23 = str119;
                                                                                    arrayList15 = arrayList53;
                                                                                    i7 = i62;
                                                                                    long j57 = j41;
                                                                                    j12 = j56;
                                                                                    if (AbstractC0108a.m(xmlPullParser, str12)) {
                                                                                        long d8 = d(xmlPullParser, j57);
                                                                                        sVar3 = q(xmlPullParser, (p) sVar3, arrayList11, j17, j12, j16, d8, j5);
                                                                                        j41 = d8;
                                                                                    } else {
                                                                                        if (AbstractC0108a.m(xmlPullParser, "InbandEventStream")) {
                                                                                            arrayList16 = arrayList41;
                                                                                            arrayList16.add(h(xmlPullParser, "InbandEventStream"));
                                                                                            j18 = j57;
                                                                                            arrayList17 = arrayList40;
                                                                                            str24 = str84;
                                                                                        } else {
                                                                                            arrayList16 = arrayList41;
                                                                                            if (AbstractC0108a.m(xmlPullParser, "Label")) {
                                                                                                str24 = str84;
                                                                                                String attributeValue30 = xmlPullParser.getAttributeValue(null, str24);
                                                                                                String str120 = "";
                                                                                                while (true) {
                                                                                                    xmlPullParser.next();
                                                                                                    j18 = j57;
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str120 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                    if (AbstractC0108a.k(xmlPullParser, "Label")) {
                                                                                                        arrayList17 = arrayList40;
                                                                                                        arrayList17.add(new C0099q(attributeValue30, str120));
                                                                                                    } else {
                                                                                                        j57 = j18;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                j18 = j57;
                                                                                                arrayList17 = arrayList40;
                                                                                                str24 = str84;
                                                                                                if (xmlPullParser.getEventType() == 2) {
                                                                                                    b(xmlPullParser);
                                                                                                }
                                                                                                j41 = j18;
                                                                                                i8 = i7;
                                                                                                str25 = str13;
                                                                                                if (AbstractC0108a.k(xmlPullParser, str25)) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        j41 = j18;
                                                                                        i8 = i7;
                                                                                        str25 = str13;
                                                                                        if (AbstractC0108a.k(xmlPullParser, str25)) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                                arrayList17 = arrayList40;
                                                                                arrayList16 = arrayList41;
                                                                                str24 = str84;
                                                                                i8 = i7;
                                                                                str25 = str13;
                                                                            }
                                                                        }
                                                                        if (AbstractC0108a.k(xmlPullParser, str25)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        arrayList10 = arrayList8;
                                                        str11 = str78;
                                                        i7 = i35;
                                                        str = str49;
                                                        arrayList11 = arrayList45;
                                                        z4 = z;
                                                        arrayList9 = arrayList39;
                                                        arrayList15 = arrayList42;
                                                        str24 = str50;
                                                        arrayList7 = arrayList33;
                                                        arrayList5 = arrayList34;
                                                        str12 = str64;
                                                        str13 = str65;
                                                        str14 = str66;
                                                        str15 = str67;
                                                        str22 = str68;
                                                        str23 = str69;
                                                        arrayList17 = arrayList40;
                                                        arrayList16 = arrayList41;
                                                        f4 = f7;
                                                        str16 = str74;
                                                        str17 = str75;
                                                        j18 = j41;
                                                        arrayList12 = arrayList47;
                                                        str18 = str79;
                                                        str19 = str77;
                                                        str20 = str76;
                                                        j17 = j36;
                                                        str21 = attributeValue14;
                                                        arrayList14 = arrayList43;
                                                        j5 = j35;
                                                        j12 = i31;
                                                        arrayList6 = arrayList36;
                                                        arrayList2 = arrayList37;
                                                        j7 = j34;
                                                        j10 = j39;
                                                        arrayList13 = arrayList44;
                                                        j41 = j18;
                                                        i8 = i7;
                                                        str25 = str13;
                                                        if (AbstractC0108a.k(xmlPullParser, str25)) {
                                                        }
                                                    }
                                                }
                                                arrayList10 = arrayList8;
                                                str11 = str78;
                                                str = str49;
                                                arrayList11 = arrayList45;
                                                z4 = z;
                                                arrayList9 = arrayList39;
                                                arrayList15 = arrayList42;
                                                arrayList7 = arrayList33;
                                                arrayList5 = arrayList34;
                                                str14 = str66;
                                                str15 = str67;
                                                str22 = str68;
                                                str23 = str69;
                                                arrayList17 = arrayList40;
                                                arrayList16 = arrayList41;
                                                f4 = f7;
                                                str16 = str74;
                                                str17 = str75;
                                                arrayList12 = arrayList47;
                                                str18 = str79;
                                                str19 = str77;
                                                str20 = str76;
                                                j17 = j36;
                                                str21 = attributeValue14;
                                                arrayList14 = arrayList43;
                                                j5 = j35;
                                                j12 = i31;
                                                arrayList6 = arrayList36;
                                                arrayList2 = arrayList37;
                                                i8 = i35;
                                                str24 = str50;
                                                j7 = j34;
                                                str12 = str64;
                                                j10 = j39;
                                                arrayList13 = arrayList44;
                                                str25 = str65;
                                                if (AbstractC0108a.k(xmlPullParser, str25)) {
                                                }
                                            }
                                        } else {
                                            arrayList4 = arrayList32;
                                            String str121 = str59;
                                            str = str49;
                                            String str122 = str60;
                                            String str123 = str61;
                                            z4 = z;
                                            str2 = str50;
                                            j5 = j35;
                                            long j58 = i31;
                                            long j59 = j36;
                                            ArrayList arrayList68 = arrayList33;
                                            arrayList5 = arrayList34;
                                            arrayList6 = arrayList35;
                                            arrayList2 = arrayList31;
                                            j7 = j34;
                                            j10 = j25;
                                            if (AbstractC0108a.m(xmlPullParser, "EventStream")) {
                                                String str124 = str62;
                                                String attributeValue31 = xmlPullParser.getAttributeValue(null, str124);
                                                String str125 = attributeValue31 == null ? "" : attributeValue31;
                                                String str126 = str123;
                                                String attributeValue32 = xmlPullParser.getAttributeValue(null, str126);
                                                String str127 = attributeValue32 == null ? "" : attributeValue32;
                                                String attributeValue33 = xmlPullParser.getAttributeValue(null, "timescale");
                                                long parseLong2 = attributeValue33 == null ? 1L : Long.parseLong(attributeValue33);
                                                String attributeValue34 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
                                                long parseLong3 = attributeValue34 == null ? 0L : Long.parseLong(attributeValue34);
                                                ArrayList arrayList69 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    if (AbstractC0108a.m(xmlPullParser, "Event")) {
                                                        str10 = str121;
                                                        String attributeValue35 = xmlPullParser.getAttributeValue(null, str10);
                                                        long parseLong4 = attributeValue35 == null ? 0L : Long.parseLong(attributeValue35);
                                                        str9 = str122;
                                                        String attributeValue36 = xmlPullParser.getAttributeValue(null, str9);
                                                        long parseLong5 = attributeValue36 == null ? -9223372036854775807L : Long.parseLong(attributeValue36);
                                                        String attributeValue37 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                        long parseLong6 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                        String str128 = J.f3263a;
                                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                                        long U4 = J.U(parseLong5, 1000L, parseLong2, roundingMode);
                                                        long U5 = J.U(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                                        arrayList7 = arrayList68;
                                                        j14 = parseLong2;
                                                        str62 = str124;
                                                        String attributeValue38 = xmlPullParser.getAttributeValue(null, "messageData");
                                                        if (attributeValue38 == null) {
                                                            attributeValue38 = null;
                                                        }
                                                        byteArrayOutputStream3.reset();
                                                        XmlSerializer newSerializer = Xml.newSerializer();
                                                        str3 = str126;
                                                        newSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                                                        xmlPullParser.nextToken();
                                                        while (!AbstractC0108a.k(xmlPullParser, "Event")) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    newSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    j15 = parseLong3;
                                                                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i63 = i5;
                                                                    while (i63 < xmlPullParser.getAttributeCount()) {
                                                                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i63), xmlPullParser.getAttributeName(i63), xmlPullParser.getAttributeValue(i63));
                                                                        i63++;
                                                                        byteArrayOutputStream3 = byteArrayOutputStream3;
                                                                    }
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 3:
                                                                    j15 = parseLong3;
                                                                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 4:
                                                                    newSerializer.text(xmlPullParser.getText());
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 5:
                                                                    newSerializer.cdsect(xmlPullParser.getText());
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 6:
                                                                    newSerializer.entityRef(xmlPullParser.getText());
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 7:
                                                                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 8:
                                                                    newSerializer.processingInstruction(xmlPullParser.getText());
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 9:
                                                                    newSerializer.comment(xmlPullParser.getText());
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                case 10:
                                                                    newSerializer.docdecl(xmlPullParser.getText());
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                                default:
                                                                    j15 = parseLong3;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            parseLong3 = j15;
                                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                                        }
                                                        j13 = parseLong3;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        newSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long valueOf = Long.valueOf(U5);
                                                        if (attributeValue38 != null) {
                                                            byteArray = attributeValue38.getBytes(StandardCharsets.UTF_8);
                                                        }
                                                        str7 = str125;
                                                        str8 = str127;
                                                        arrayList69.add(Pair.create(valueOf, new J0.a(str125, str127, U4, parseLong4, byteArray)));
                                                    } else {
                                                        arrayList7 = arrayList68;
                                                        str62 = str124;
                                                        str3 = str126;
                                                        j13 = parseLong3;
                                                        str7 = str125;
                                                        str8 = str127;
                                                        j14 = parseLong2;
                                                        str9 = str122;
                                                        str10 = str121;
                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                        b(xmlPullParser);
                                                    }
                                                    if (AbstractC0108a.k(xmlPullParser, "EventStream")) {
                                                        long[] jArr = new long[arrayList69.size()];
                                                        J0.a[] aVarArr = new J0.a[arrayList69.size()];
                                                        for (int i64 = i5; i64 < arrayList69.size(); i64++) {
                                                            Pair pair2 = (Pair) arrayList69.get(i64);
                                                            jArr[i64] = ((Long) pair2.first).longValue();
                                                            aVarArr[i64] = (J0.a) pair2.second;
                                                        }
                                                        arrayList5.add(new g(str7, str8, jArr, aVarArr));
                                                        str4 = str9;
                                                        j11 = j59;
                                                        j12 = j58;
                                                        j6 = -9223372036854775807L;
                                                        str5 = str10;
                                                    } else {
                                                        str125 = str7;
                                                        str127 = str8;
                                                        str121 = str10;
                                                        str122 = str9;
                                                        str124 = str62;
                                                        parseLong3 = j13;
                                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                                        str126 = str3;
                                                        arrayList68 = arrayList7;
                                                        parseLong2 = j14;
                                                    }
                                                }
                                            } else {
                                                arrayList7 = arrayList68;
                                                str3 = str123;
                                                str4 = str122;
                                                if (AbstractC0108a.m(xmlPullParser, "SegmentBase")) {
                                                    sVar2 = o(xmlPullParser, null);
                                                    arrayList5 = arrayList5;
                                                    str6 = str63;
                                                    j11 = j59;
                                                    j12 = j58;
                                                    j6 = -9223372036854775807L;
                                                    str5 = str121;
                                                } else if (AbstractC0108a.m(xmlPullParser, "SegmentList")) {
                                                    j6 = -9223372036854775807L;
                                                    long d9 = d(xmlPullParser, -9223372036854775807L);
                                                    arrayList5 = arrayList5;
                                                    str5 = str121;
                                                    sVar2 = p(xmlPullParser, null, j59, j58, j9, d9, j5);
                                                    j5 = j5;
                                                    j12 = j58;
                                                    j11 = j59;
                                                    j37 = d9;
                                                } else {
                                                    arrayList5 = arrayList5;
                                                    j11 = j59;
                                                    j12 = j58;
                                                    j6 = -9223372036854775807L;
                                                    str5 = str121;
                                                    if (AbstractC0108a.m(xmlPullParser, str64)) {
                                                        long d10 = d(xmlPullParser, -9223372036854775807L);
                                                        G g6 = I.f15571b;
                                                        sVar2 = q(xmlPullParser, null, a0.f15605e, j11, j12, j9, d10, j5);
                                                        j37 = d10;
                                                    } else if (AbstractC0108a.m(xmlPullParser, "AssetIdentifier")) {
                                                        h(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        b(xmlPullParser);
                                                    }
                                                }
                                            }
                                        }
                                        str6 = str63;
                                    }
                                    if (AbstractC0108a.k(xmlPullParser, str6)) {
                                        Pair create = Pair.create(new h(attributeValue11, i30, arrayList7, arrayList5), Long.valueOf(j12));
                                        h hVar = (h) create.first;
                                        if (hVar.f8379b != j6) {
                                            long longValue = ((Long) create.second).longValue();
                                            j22 = longValue == j6 ? j6 : longValue + hVar.f8379b;
                                            arrayList3 = arrayList30;
                                            arrayList3.add(hVar);
                                        } else {
                                            if (!equals) {
                                                throw T.G.b("Unable to determine start of period " + arrayList30.size(), null);
                                            }
                                            arrayList3 = arrayList30;
                                            i29 = i6;
                                            j22 = j10;
                                        }
                                        j8 = j22;
                                    } else {
                                        str63 = str6;
                                        j36 = j11;
                                        j25 = j10;
                                        j34 = j7;
                                        j38 = j9;
                                        arrayList32 = arrayList4;
                                        str60 = str4;
                                        str59 = str5;
                                        str50 = str2;
                                        str49 = str;
                                        arrayList33 = arrayList7;
                                        arrayList34 = arrayList5;
                                        i31 = j12;
                                        arrayList31 = arrayList2;
                                        arrayList35 = arrayList6;
                                        j35 = j5;
                                        z = z4;
                                        str61 = str3;
                                    }
                                }
                            } else {
                                z4 = z;
                                j5 = j35;
                                j6 = j4;
                                arrayList2 = arrayList31;
                                j7 = j34;
                                j8 = j25;
                                arrayList3 = arrayList30;
                                b(xmlPullParser);
                            }
                            j24 = j7;
                        }
                        if (!AbstractC0108a.k(xmlPullParser, "MPD")) {
                            if (i23 == j6) {
                                if (j8 != j6) {
                                    i23 = j8;
                                } else if (!equals) {
                                    throw T.G.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw T.G.b("No periods found.", null);
                            }
                            return new C0393c(P4, i23, i24, equals, i25, j5, i27, P5, iVar, c0025a, c0102u, uri2, arrayList3);
                        }
                        arrayList30 = arrayList3;
                        i26 = j5;
                        j23 = j6;
                        i21 = i5;
                        i4 = i6;
                        j25 = j8;
                        arrayList31 = arrayList2;
                        n = arrayList;
                        z = z4;
                        str48 = null;
                    }
                    z4 = z;
                    arrayList3 = arrayList30;
                }
                j6 = j4;
            }
            j5 = i26;
            if (!AbstractC0108a.k(xmlPullParser, "MPD")) {
            }
        }
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j4;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j5 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(TokenBuilder.TOKEN_DELIMITER);
            j4 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j5 = (Long.parseLong(split[1]) - j4) + 1;
            }
        } else {
            j4 = 0;
        }
        return new j(j4, j5, attributeValue);
    }

    public static int m(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int n(ArrayList arrayList) {
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (U.i.h("http://dashif.org/guidelines/trickmode", ((C0396f) arrayList.get(i5)).f8371a)) {
                i4 = 16384;
            }
        }
        return i4;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) {
        long j4 = rVar != null ? rVar.f8414b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j4 = Long.parseLong(attributeValue);
        }
        long j5 = j4;
        long j6 = rVar != null ? rVar.f8415c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j6 = Long.parseLong(attributeValue2);
        }
        long j7 = j6;
        long j8 = rVar != null ? rVar.f8411d : 0L;
        long j9 = rVar != null ? rVar.f8412e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split(TokenBuilder.TOKEN_DELIMITER);
            j8 = Long.parseLong(split[0]);
            j9 = (Long.parseLong(split[1]) - j8) + 1;
        }
        long j10 = j9;
        long j11 = j8;
        j jVar = rVar != null ? rVar.f8413a : null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC0108a.m(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (AbstractC0108a.k(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j5, j7, j11, j10);
            }
            jVar = jVar2;
        }
    }

    public static o p(XmlPullParser xmlPullParser, o oVar, long j4, long j5, long j6, long j7, long j8) {
        long j9 = oVar != null ? oVar.f8414b : 1L;
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j9 = Long.parseLong(attributeValue);
        }
        long j10 = j9;
        long j11 = oVar != null ? oVar.f8415c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j11 = Long.parseLong(attributeValue2);
        }
        long j12 = j11;
        long j13 = oVar != null ? oVar.f8400e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j13 = Long.parseLong(attributeValue3);
        }
        long j14 = j13;
        long j15 = oVar != null ? oVar.f8399d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j15 = Long.parseLong(attributeValue4);
        }
        long j16 = j15;
        long j17 = j7 == -9223372036854775807L ? j6 : j7;
        long j18 = j17 == Long.MAX_VALUE ? -9223372036854775807L : j17;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC0108a.m(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC0108a.m(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j10, j5);
            } else if (AbstractC0108a.m(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0108a.k(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f8413a;
            }
            if (list2 == null) {
                list2 = oVar.f8401f;
            }
            if (list == null) {
                list = oVar.f8405j;
            }
        }
        return new o(jVar, j10, j12, j16, j14, list2, j18, list, J.M(j8), J.M(j4));
    }

    public static p q(XmlPullParser xmlPullParser, p pVar, List list, long j4, long j5, long j6, long j7, long j8) {
        long j9;
        long j10 = pVar != null ? pVar.f8414b : 1L;
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = pVar != null ? pVar.f8415c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = pVar != null ? pVar.f8400e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j14 = Long.parseLong(attributeValue3);
        }
        long j15 = j14;
        long j16 = pVar != null ? pVar.f8399d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j16 = Long.parseLong(attributeValue4);
        }
        long j17 = j16;
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                j9 = -1;
                break;
            }
            C0396f c0396f = (C0396f) list.get(i4);
            if (U.i.h("http://dashif.org/guidelines/last-segment-number", c0396f.f8371a)) {
                j9 = Long.parseLong(c0396f.f8372b);
                break;
            }
            i4++;
        }
        long j18 = j9;
        long j19 = j7 == -9223372036854775807L ? j6 : j7;
        long j20 = j19 == Long.MAX_VALUE ? -9223372036854775807L : j19;
        B1.j s4 = s(xmlPullParser, "media", pVar != null ? pVar.f8407k : null);
        B1.j s5 = s(xmlPullParser, "initialization", pVar != null ? pVar.f8406j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC0108a.m(xmlPullParser, "Initialization")) {
                jVar = l(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC0108a.m(xmlPullParser, "SegmentTimeline")) {
                list2 = r(xmlPullParser, j11, j5);
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0108a.k(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f8413a;
            }
            if (list2 == null) {
                list2 = pVar.f8401f;
            }
        }
        return new p(jVar, j11, j13, j17, j18, j15, list2, j20, s5, s4, J.M(j8), J.M(j4));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j4, long j5) {
        long j6;
        ArrayList arrayList = new ArrayList();
        long j7 = 0;
        long j8 = -9223372036854775807L;
        boolean z = false;
        int i4 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC0108a.m(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i5 = i4;
                    j6 = parseLong;
                    j7 = a(arrayList, j7, j8, i5, j6);
                } else {
                    j6 = parseLong;
                }
                if (j6 != -9223372036854775807L) {
                    j7 = j6;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j8 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i4 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0108a.k(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = J.f3263a;
            a(arrayList, j7, j8, i4, J.U(j5, j4, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ff. Please report as an issue. */
    public static B1.j s(XmlPullParser xmlPullParser, String str, B1.j jVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return jVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i4 = 0;
        while (i4 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i4);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i4));
                i4 = attributeValue.length();
            } else if (indexOf != i4) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i4, indexOf));
                i4 = indexOf;
            } else if (attributeValue.startsWith("$$", i4)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i4 += 2;
            } else {
                arrayList3.add("");
                int i5 = i4 + 1;
                int indexOf2 = attributeValue.indexOf("$", i5);
                String substring = attributeValue.substring(i5, indexOf2);
                if (substring.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    switch (substring) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, str2);
                }
                arrayList.add("");
                i4 = indexOf2 + 1;
            }
        }
        return new B1.j(arrayList, arrayList2, arrayList3, 16);
    }

    @Override // u0.p
    public final Object u(Uri uri, Y.j jVar) {
        try {
            XmlPullParser newPullParser = this.f8370a.newPullParser();
            newPullParser.setInput(jVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return k(newPullParser, uri);
            }
            throw T.G.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e4) {
            if (e4.getDetail() instanceof IOException) {
                throw ((IOException) e4.getDetail());
            }
            throw T.G.b(null, e4);
        }
    }
}
