package b1;

import E.AbstractC0005f;
import E.r;
import G3.u;
import U.i;
import V0.k;
import V0.l;
import W.AbstractC0108a;
import W.AbstractC0111d;
import W.InterfaceC0113f;
import W.J;
import a.AbstractC0124a;
import android.text.Layout;
import android.text.TextUtils;
import io.appmetrica.analytics.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v2.M;
import v2.N;
import v2.h0;
import v2.j0;
import v2.n0;
import x.AbstractC1514c;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260e implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f5345b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f5346c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f5347d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f5348e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f5349f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f5350g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f5351h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    public static final C0259d f5352i = new C0259d(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f5353a;

    public C0260e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f5353a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    public static C0262g d(C0262g c0262g) {
        return c0262g == null ? new C0262g() : c0262g;
    }

    public static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int f(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f5351h.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC0108a.s("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            AbstractC0124a.e(parseInt, parseInt2, "Invalid cell resolution %s %s", z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            AbstractC0108a.s("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void g(String str, C0262g c0262g) {
        Matcher matcher;
        String group;
        String str2 = J.f3263a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f5347d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new V0.f(AbstractC0005f.o(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
            }
            matcher = pattern.matcher(split[1]);
            AbstractC0108a.s("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new V0.f(AbstractC1514c.a("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                c0262g.f5373j = 3;
                break;
            case "em":
                c0262g.f5373j = 2;
                break;
            case "px":
                c0262g.f5373j = 1;
                break;
            default:
                throw new V0.f(AbstractC1514c.a("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        c0262g.f5374k = Float.parseFloat(group2);
    }

    public static C0259d h(XmlPullParser xmlPullParser) {
        float f4;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = J.f3263a;
            AbstractC0124a.g("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f4 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f4 = 1.0f;
        }
        C0259d c0259d = f5352i;
        int i4 = c0259d.f5343b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i4 = Integer.parseInt(attributeValue3);
        }
        int i5 = c0259d.f5344c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i5 = Integer.parseInt(attributeValue4);
        }
        return new C0259d(parseInt * f4, i4, i5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(XmlPullParser xmlPullParser, HashMap hashMap, int i4, r rVar, HashMap hashMap2, HashMap hashMap3) {
        String h2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i5;
        String h4;
        int i6;
        C0261f c0261f;
        char c4;
        float parseFloat;
        float parseFloat2;
        String h5;
        C0262g c0262g;
        String h6;
        C0262g c0262g2;
        String[] split;
        do {
            xmlPullParser.next();
            if (AbstractC0108a.m(xmlPullParser, "style")) {
                String h7 = AbstractC0108a.h(xmlPullParser, "style");
                C0262g k4 = k(xmlPullParser, new C0262g());
                if (h7 != null) {
                    String trim = h7.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = J.f3263a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        k4.a((C0262g) hashMap.get(str2));
                    }
                }
                String str3 = k4.f5375l;
                if (str3 != null) {
                    hashMap.put(str3, k4);
                }
            } else if (AbstractC0108a.m(xmlPullParser, "region")) {
                String h8 = AbstractC0108a.h(xmlPullParser, "id");
                if (h8 != null) {
                    String h9 = AbstractC0108a.h(xmlPullParser, "origin");
                    if (h9 == null && (h6 = AbstractC0108a.h(xmlPullParser, "style")) != null && (c0262g2 = (C0262g) hashMap.get(h6)) != null) {
                        h9 = c0262g2.f5381t;
                    }
                    int i7 = 2;
                    Pattern pattern = f5350g;
                    Pattern pattern2 = f5349f;
                    if (h9 != null) {
                        Matcher matcher = pattern2.matcher(h9);
                        Matcher matcher2 = pattern.matcher(h9);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f6 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f5 = Float.parseFloat(group2) / 100.0f;
                                f4 = 100.0f;
                            } catch (NumberFormatException unused) {
                                AbstractC0108a.s("TtmlParser", "Ignoring region with malformed origin: ".concat(h9));
                            }
                        } else if (!matcher2.matches()) {
                            AbstractC0108a.s("TtmlParser", "Ignoring region with unsupported origin: ".concat(h9));
                        } else if (rVar == null) {
                            AbstractC0108a.s("TtmlParser", "Ignoring region with missing tts:extent: ".concat(h9));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                f4 = 100.0f;
                                float f10 = parseInt / rVar.f437b;
                                float parseInt2 = Integer.parseInt(group4) / rVar.f438c;
                                f6 = f10;
                                f5 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                AbstractC0108a.s("TtmlParser", "Ignoring region with malformed origin: ".concat(h9));
                            }
                        }
                    } else {
                        f4 = 100.0f;
                        f5 = 0.0f;
                        f6 = 0.0f;
                    }
                    String h10 = AbstractC0108a.h(xmlPullParser, "extent");
                    if (h10 == null && (h5 = AbstractC0108a.h(xmlPullParser, "style")) != null && (c0262g = (C0262g) hashMap.get(h5)) != null) {
                        h10 = c0262g.f5382u;
                    }
                    if (h10 != null) {
                        Matcher matcher3 = pattern2.matcher(h10);
                        Matcher matcher4 = pattern.matcher(h10);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / f4;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / f4;
                            } catch (NumberFormatException unused3) {
                                AbstractC0005f.y("Ignoring region with malformed extent: ", h9, "TtmlParser");
                            }
                        } else if (!matcher4.matches()) {
                            AbstractC0005f.y("Ignoring region with unsupported extent: ", h9, "TtmlParser");
                        } else if (rVar == null) {
                            AbstractC0005f.y("Ignoring region with missing tts:extent: ", h9, "TtmlParser");
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt3 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f11 = parseInt3 / rVar.f437b;
                            parseFloat2 = Integer.parseInt(group8) / rVar.f438c;
                            parseFloat = f11;
                        }
                        f7 = parseFloat;
                        f8 = parseFloat2;
                    } else {
                        f7 = 1.0f;
                        f8 = 1.0f;
                    }
                    String h11 = AbstractC0108a.h(xmlPullParser, "displayAlign");
                    if (h11 != null) {
                        String D3 = i.D(h11);
                        D3.getClass();
                        if (D3.equals("center")) {
                            f9 = f5 + (f8 / 2.0f);
                            i5 = 1;
                        } else if (D3.equals("after")) {
                            f9 = f5 + f8;
                            i5 = 2;
                        }
                        float f12 = 1.0f / i4;
                        h4 = AbstractC0108a.h(xmlPullParser, "writingMode");
                        if (h4 != null) {
                            String D4 = i.D(h4);
                            D4.getClass();
                            switch (D4.hashCode()) {
                                case 3694:
                                    if (D4.equals("tb")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 3553396:
                                    if (D4.equals("tblr")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 3553576:
                                    if (D4.equals("tbrl")) {
                                        c4 = 2;
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
                                case 1:
                                    i6 = i7;
                                    break;
                                case 2:
                                    i6 = 1;
                                    break;
                            }
                            c0261f = new C0261f(h8, f6, f9, 0, i5, f7, f8, 1, f12, i6);
                            if (c0261f != null) {
                                hashMap2.put(c0261f.f5354a, c0261f);
                            }
                        }
                        i7 = Integer.MIN_VALUE;
                        i6 = i7;
                        c0261f = new C0261f(h8, f6, f9, 0, i5, f7, f8, 1, f12, i6);
                        if (c0261f != null) {
                        }
                    }
                    f9 = f5;
                    i5 = 0;
                    float f122 = 1.0f / i4;
                    h4 = AbstractC0108a.h(xmlPullParser, "writingMode");
                    if (h4 != null) {
                    }
                    i7 = Integer.MIN_VALUE;
                    i6 = i7;
                    c0261f = new C0261f(h8, f6, f9, 0, i5, f7, f8, 1, f122, i6);
                    if (c0261f != null) {
                    }
                }
                c0261f = null;
                if (c0261f != null) {
                }
            } else if (AbstractC0108a.m(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (AbstractC0108a.m(xmlPullParser, "image") && (h2 = AbstractC0108a.h(xmlPullParser, "id")) != null) {
                        hashMap3.put(h2, xmlPullParser.nextText());
                    }
                } while (!AbstractC0108a.k(xmlPullParser, "metadata"));
            }
        } while (!AbstractC0108a.k(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C0258c j(XmlPullParser xmlPullParser, C0258c c0258c, HashMap hashMap, C0259d c0259d) {
        long j4;
        char c4;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        C0262g k4 = k(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j5 = -9223372036854775807L;
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = xmlPullParser.getAttributeName(i4);
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c4 = 5;
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j7 = l(attributeValue, c0259d);
                    break;
                case 2:
                    j6 = l(attributeValue, c0259d);
                    break;
                case 3:
                    j5 = l(attributeValue, c0259d);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = J.f3263a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
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
        if (c0258c != null) {
            long j8 = c0258c.f5332d;
            if (j8 != -9223372036854775807L) {
                if (j5 != -9223372036854775807L) {
                    j5 += j8;
                }
                if (j6 != -9223372036854775807L) {
                    j6 += j8;
                }
            }
        }
        if (j6 == -9223372036854775807L) {
            if (j7 != -9223372036854775807L) {
                j6 = j5 + j7;
            } else if (c0258c != null) {
                long j9 = c0258c.f5333e;
                if (j9 != -9223372036854775807L) {
                    j4 = j9;
                    return new C0258c(xmlPullParser.getName(), null, j5, j4, k4, strArr, str2, str, c0258c);
                }
            }
        }
        j4 = j6;
        return new C0258c(xmlPullParser.getName(), null, j5, j4, k4, strArr, str2, str, c0258c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025d  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0262g k(XmlPullParser xmlPullParser, C0262g c0262g) {
        char c4;
        ?? r9;
        boolean z;
        char c5;
        char c6;
        j0 l4;
        int i4;
        int hashCode;
        char c7;
        C0257b c0257b;
        int i5;
        char c8;
        int attributeCount = xmlPullParser.getAttributeCount();
        C0262g c0262g2 = c0262g;
        for (int i6 = 0; i6 < attributeCount; i6++) {
            String attributeValue = xmlPullParser.getAttributeValue(i6);
            String attributeName = xmlPullParser.getAttributeName(i6);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c4) {
                case 0:
                    c0262g2 = d(c0262g2);
                    c0262g2.f5372i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    c0262g2 = d(c0262g2);
                    c0262g2.f5382u = attributeValue;
                    break;
                case 2:
                    c0262g2 = d(c0262g2);
                    c0262g2.f5364a = attributeValue;
                    break;
                case 3:
                    c0262g2 = d(c0262g2);
                    String D3 = i.D(attributeValue);
                    D3.getClass();
                    switch (D3.hashCode()) {
                        case -1364013995:
                            if (D3.equals("center")) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (D3.equals("end")) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (D3.equals("left")) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (D3.equals("right")) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (D3.equals("start")) {
                                r9 = 4;
                                break;
                            }
                            r9 = -1;
                            break;
                        default:
                            r9 = -1;
                            break;
                    }
                    switch (r9) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c0262g2.o = alignment;
                    break;
                case 4:
                    c0262g2 = d(c0262g2);
                    c0262g2.f5381t = attributeValue;
                    break;
                case 5:
                    String D4 = i.D(attributeValue);
                    D4.getClass();
                    switch (D4.hashCode()) {
                        case -1461280213:
                            if (D4.equals("nounderline")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -1026963764:
                            if (D4.equals("underline")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 913457136:
                            if (D4.equals("nolinethrough")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1679736913:
                            if (D4.equals("linethrough")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            c0262g2 = d(c0262g2);
                            c0262g2.f5370g = 0;
                            break;
                        case true:
                            c0262g2 = d(c0262g2);
                            c0262g2.f5370g = 1;
                            break;
                        case true:
                            c0262g2 = d(c0262g2);
                            c0262g2.f5369f = 0;
                            break;
                        case true:
                            c0262g2 = d(c0262g2);
                            c0262g2.f5369f = 1;
                            break;
                    }
                case 6:
                    c0262g2 = d(c0262g2);
                    c0262g2.f5371h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        c0262g2 = d(c0262g2);
                        c0262g2.f5375l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String D5 = i.D(attributeValue);
                    D5.getClass();
                    switch (D5.hashCode()) {
                        case -618561360:
                            if (D5.equals("baseContainer")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -410956671:
                            if (D5.equals("container")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -250518009:
                            if (D5.equals("delimiter")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -136074796:
                            if (D5.equals("textContainer")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 3016401:
                            if (D5.equals("base")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 3556653:
                            if (D5.equals("text")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case 0:
                        case 4:
                            c0262g2 = d(c0262g2);
                            c0262g2.f5376m = 2;
                            break;
                        case 1:
                            c0262g2 = d(c0262g2);
                            c0262g2.f5376m = 1;
                            break;
                        case 2:
                            c0262g2 = d(c0262g2);
                            c0262g2.f5376m = 4;
                            break;
                        case 3:
                        case 5:
                            c0262g2 = d(c0262g2);
                            c0262g2.f5376m = 3;
                            break;
                    }
                case '\t':
                    c0262g2 = d(c0262g2);
                    try {
                        c0262g2.f5365b = AbstractC0111d.a(attributeValue, false);
                        c0262g2.f5366c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        AbstractC0005f.y("Failed parsing color value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\n':
                    C0262g d4 = d(c0262g2);
                    Matcher matcher = f5348e.matcher(attributeValue);
                    float f4 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f4 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e4) {
                            AbstractC0108a.t("TtmlParser", "Failed to parse shear: " + attributeValue, e4);
                        }
                    } else {
                        AbstractC0005f.y("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    d4.f5380s = f4;
                    c0262g2 = d4;
                    break;
                case 11:
                    String D6 = i.D(attributeValue);
                    D6.getClass();
                    if (D6.equals("all")) {
                        c0262g2 = d(c0262g2);
                        c0262g2.f5378q = 1;
                        break;
                    } else if (D6.equals("none")) {
                        c0262g2 = d(c0262g2);
                        c0262g2.f5378q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        c0262g2 = d(c0262g2);
                        g(attributeValue, c0262g2);
                        break;
                    } catch (V0.f unused2) {
                        AbstractC0005f.y("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case '\r':
                    c0262g2 = d(c0262g2);
                    Pattern pattern = C0257b.f5321d;
                    if (attributeValue != null) {
                        String D7 = i.D(attributeValue.trim());
                        if (!D7.isEmpty()) {
                            String[] split = TextUtils.split(D7, C0257b.f5321d);
                            int length = split.length;
                            M j4 = length != 0 ? length != 1 ? M.j(split.length, (Object[]) split.clone()) : new n0(split[0]) : h0.f15638j;
                            String str = (String) v2.r.i(v2.r.l(C0257b.f5325h, j4), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 == -1392885889) {
                                if (str.equals("before")) {
                                    c6 = 2;
                                    if (c6 == 0) {
                                    }
                                    l4 = v2.r.l(C0257b.f5322e, j4);
                                    if (l4.isEmpty()) {
                                    }
                                }
                                c6 = 65535;
                                if (c6 == 0) {
                                }
                                l4 = v2.r.l(C0257b.f5322e, j4);
                                if (l4.isEmpty()) {
                                }
                            } else if (hashCode2 != -1106037339) {
                                if (hashCode2 == 92734940 && str.equals("after")) {
                                    c6 = 0;
                                    int i7 = c6 == 0 ? c6 != 1 ? 1 : -2 : 2;
                                    l4 = v2.r.l(C0257b.f5322e, j4);
                                    if (l4.isEmpty()) {
                                        String str2 = (String) new N(l4).next();
                                        int hashCode3 = str2.hashCode();
                                        if (hashCode3 == 3005871) {
                                            str2.equals("auto");
                                        } else if (hashCode3 == 3387192 && str2.equals("none")) {
                                            i5 = 0;
                                            c0257b = new C0257b(i5, 0, i7);
                                        }
                                        i5 = -1;
                                        c0257b = new C0257b(i5, 0, i7);
                                    } else {
                                        j0 l5 = v2.r.l(C0257b.f5324g, j4);
                                        j0 l6 = v2.r.l(C0257b.f5323f, j4);
                                        if (l5.isEmpty() && l6.isEmpty()) {
                                            c0257b = new C0257b(-1, 0, i7);
                                        } else {
                                            String str3 = (String) v2.r.i(l5, "filled");
                                            int hashCode4 = str3.hashCode();
                                            if (hashCode4 == -1274499742) {
                                                str3.equals("filled");
                                            } else if (hashCode4 == 3417674 && str3.equals("open")) {
                                                i4 = 2;
                                                String str4 = (String) v2.r.i(l6, "circle");
                                                hashCode = str4.hashCode();
                                                if (hashCode != -1360216880) {
                                                    if (str4.equals("circle")) {
                                                        c7 = 2;
                                                        c0257b = new C0257b(c7 == 0 ? c7 != 1 ? 1 : 3 : 2, i4, i7);
                                                    }
                                                    c7 = 65535;
                                                    c0257b = new C0257b(c7 == 0 ? c7 != 1 ? 1 : 3 : 2, i4, i7);
                                                } else if (hashCode != -905816648) {
                                                    if (hashCode == 99657 && str4.equals("dot")) {
                                                        c7 = 0;
                                                        c0257b = new C0257b(c7 == 0 ? c7 != 1 ? 1 : 3 : 2, i4, i7);
                                                    }
                                                    c7 = 65535;
                                                    c0257b = new C0257b(c7 == 0 ? c7 != 1 ? 1 : 3 : 2, i4, i7);
                                                } else {
                                                    if (str4.equals("sesame")) {
                                                        c7 = 1;
                                                        c0257b = new C0257b(c7 == 0 ? c7 != 1 ? 1 : 3 : 2, i4, i7);
                                                    }
                                                    c7 = 65535;
                                                    c0257b = new C0257b(c7 == 0 ? c7 != 1 ? 1 : 3 : 2, i4, i7);
                                                }
                                            }
                                            i4 = 1;
                                            String str42 = (String) v2.r.i(l6, "circle");
                                            hashCode = str42.hashCode();
                                            if (hashCode != -1360216880) {
                                            }
                                        }
                                    }
                                }
                                c6 = 65535;
                                if (c6 == 0) {
                                }
                                l4 = v2.r.l(C0257b.f5322e, j4);
                                if (l4.isEmpty()) {
                                }
                            } else {
                                if (str.equals("outside")) {
                                    c6 = 1;
                                    if (c6 == 0) {
                                    }
                                    l4 = v2.r.l(C0257b.f5322e, j4);
                                    if (l4.isEmpty()) {
                                    }
                                }
                                c6 = 65535;
                                if (c6 == 0) {
                                }
                                l4 = v2.r.l(C0257b.f5322e, j4);
                                if (l4.isEmpty()) {
                                }
                            }
                            c0262g2.f5379r = c0257b;
                            break;
                        }
                    }
                    c0257b = null;
                    c0262g2.f5379r = c0257b;
                    break;
                case 14:
                    String D8 = i.D(attributeValue);
                    D8.getClass();
                    if (D8.equals("before")) {
                        c0262g2 = d(c0262g2);
                        c0262g2.n = 1;
                        break;
                    } else if (D8.equals("after")) {
                        c0262g2 = d(c0262g2);
                        c0262g2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    c0262g2 = d(c0262g2);
                    try {
                        c0262g2.f5367d = AbstractC0111d.a(attributeValue, false);
                        c0262g2.f5368e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        AbstractC0005f.y("Failed parsing background value: ", attributeValue, "TtmlParser");
                        break;
                    }
                case 16:
                    c0262g2 = d(c0262g2);
                    String D9 = i.D(attributeValue);
                    D9.getClass();
                    switch (D9.hashCode()) {
                        case -1364013995:
                            if (D9.equals("center")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 100571:
                            if (D9.equals("end")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3317767:
                            if (D9.equals("left")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 108511772:
                            if (D9.equals("right")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 109757538:
                            if (D9.equals("start")) {
                                c8 = 4;
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
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c0262g2.f5377p = alignment;
                    break;
            }
        }
        return c0262g2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long l(String str, C0259d c0259d) {
        double d4;
        double d5;
        Matcher matcher = f5345b.matcher(str);
        char c4 = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / c0259d.f5342a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / c0259d.f5343b) / c0259d.f5342a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f5346c.matcher(str);
        if (!matcher2.matches()) {
            throw new V0.f(AbstractC0005f.n("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case BuildConfig.API_LEVEL /* 116 */:
                if (group4.equals("t")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 3494:
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                d4 = c0259d.f5342a;
                parseDouble /= d4;
                break;
            case 1:
                d5 = 3600.0d;
                break;
            case 2:
                d5 = 60.0d;
                break;
            case 3:
                d4 = c0259d.f5344c;
                parseDouble /= d4;
                break;
            case 4:
                d4 = 1000.0d;
                parseDouble /= d4;
                break;
        }
        parseDouble *= d5;
        return (long) (parseDouble * 1000000.0d);
    }

    public static r m(XmlPullParser xmlPullParser) {
        String h2 = AbstractC0108a.h(xmlPullParser, "extent");
        if (h2 == null) {
            return null;
        }
        Matcher matcher = f5350g.matcher(h2);
        if (!matcher.matches()) {
            AbstractC0108a.s("TtmlParser", "Ignoring non-pixel tts extent: ".concat(h2));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new r(parseInt, Integer.parseInt(group2), 3);
        } catch (NumberFormatException unused) {
            AbstractC0108a.s("TtmlParser", "Ignoring malformed tts extent: ".concat(h2));
            return null;
        }
    }

    @Override // V0.l
    public final V0.d a(byte[] bArr, int i4, int i5) {
        try {
            XmlPullParser newPullParser = this.f5353a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C0261f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            r rVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i4, i5), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C0259d c0259d = f5352i;
            int i6 = 0;
            int i7 = 15;
            u uVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C0258c c0258c = (C0258c) arrayDeque.peek();
                if (i6 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c0259d = h(newPullParser);
                            i7 = f(newPullParser);
                            rVar = m(newPullParser);
                        }
                        C0259d c0259d2 = c0259d;
                        r rVar2 = rVar;
                        int i8 = i7;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                i(newPullParser, hashMap, i8, rVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    C0258c j4 = j(newPullParser, c0258c, hashMap2, c0259d2);
                                    arrayDeque.push(j4);
                                    if (c0258c != null) {
                                        if (c0258c.f5341m == null) {
                                            c0258c.f5341m = new ArrayList();
                                        }
                                        c0258c.f5341m.add(j4);
                                    }
                                } catch (V0.f e4) {
                                    AbstractC0108a.t("TtmlParser", "Suppressing parser error", e4);
                                }
                            }
                            i7 = i8;
                            rVar = rVar2;
                            c0259d = c0259d2;
                        } else {
                            AbstractC0108a.j("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i6++;
                        i7 = i8;
                        rVar = rVar2;
                        c0259d = c0259d2;
                    } else if (eventType == 4) {
                        c0258c.getClass();
                        C0258c a3 = C0258c.a(newPullParser.getText());
                        if (c0258c.f5341m == null) {
                            c0258c.f5341m = new ArrayList();
                        }
                        c0258c.f5341m.add(a3);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            C0258c c0258c2 = (C0258c) arrayDeque.peek();
                            c0258c2.getClass();
                            uVar = new u(c0258c2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i6++;
                } else if (eventType == 3) {
                    i6--;
                }
                newPullParser.next();
            }
            uVar.getClass();
            return uVar;
        } catch (IOException e5) {
            throw new IllegalStateException("Unexpected error when reading input.", e5);
        } catch (XmlPullParserException e6) {
            throw new IllegalStateException("Unable to decode source", e6);
        }
    }

    @Override // V0.l
    public final void b(byte[] bArr, int i4, int i5, k kVar, InterfaceC0113f interfaceC0113f) {
        i.C(a(bArr, i4, i5), kVar, interfaceC0113f);
    }

    @Override // V0.l
    public final int c() {
        return 1;
    }
}
