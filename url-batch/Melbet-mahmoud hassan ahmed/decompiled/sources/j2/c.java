package j2;

import android.text.Layout;
import c2.j;
import c4.w0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.m0;
import o2.n0;
import o2.r;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class c extends c2.g {

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f18092p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f18093q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f18094r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s, reason: collision with root package name */
    static final Pattern f18095s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    static final Pattern f18096t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f18097u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f18098v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w, reason: collision with root package name */
    private static final b f18099w = new b(30.0f, 1, 1);

    /* renamed from: x, reason: collision with root package name */
    private static final a f18100x = new a(32, 15);

    /* renamed from: o, reason: collision with root package name */
    private final XmlPullParserFactory f18101o;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int f18102a;

        /* renamed from: b, reason: collision with root package name */
        final int f18103b;

        a(int i7, int i8) {
            this.f18102a = i7;
            this.f18103b = i8;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final float f18104a;

        /* renamed from: b, reason: collision with root package name */
        final int f18105b;

        /* renamed from: c, reason: collision with root package name */
        final int f18106c;

        b(float f7, int i7, int i8) {
            this.f18104a = f7;
            this.f18105b = i7;
            this.f18106c = i8;
        }
    }

    /* renamed from: j2.c$c, reason: collision with other inner class name */
    private static final class C0083c {

        /* renamed from: a, reason: collision with root package name */
        final int f18107a;

        /* renamed from: b, reason: collision with root package name */
        final int f18108b;

        C0083c(int i7, int i8) {
            this.f18107a = i7;
            this.f18108b = i8;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f18101o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    private static g C(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean D(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment E(String str) {
        String e7 = l4.b.e(str);
        e7.hashCode();
        switch (e7) {
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

    private static a F(XmlPullParser xmlPullParser, a aVar) {
        StringBuilder sb;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f18098v.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int parseInt = Integer.parseInt((String) o2.a.e(matcher.group(1)));
                int parseInt2 = Integer.parseInt((String) o2.a.e(matcher.group(2)));
                if (parseInt != 0 && parseInt2 != 0) {
                    return new a(parseInt, parseInt2);
                }
                throw new j("Invalid cell resolution " + parseInt + " " + parseInt2);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        } else {
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        r.i("TtmlDecoder", sb.toString());
        return aVar;
    }

    private static void G(String str, g gVar) {
        Matcher matcher;
        String str2;
        String[] Q0 = m0.Q0(str, "\\s+");
        if (Q0.length == 1) {
            matcher = f18094r.matcher(str);
        } else {
            if (Q0.length != 2) {
                throw new j("Invalid number of entries for fontSize: " + Q0.length + ".");
            }
            matcher = f18094r.matcher(Q0[1]);
            r.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new j("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) o2.a.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                gVar.z(3);
                break;
            case "em":
                gVar.z(2);
                break;
            case "px":
                gVar.z(1);
                break;
            default:
                throw new j("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) o2.a.e(matcher.group(1))));
    }

    private static b H(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f7 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (m0.Q0(attributeValue2, " ").length != 2) {
                throw new j("frameRateMultiplier doesn't have 2 parts");
            }
            f7 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        b bVar = f18099w;
        int i7 = bVar.f18105b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i7 = Integer.parseInt(attributeValue3);
        }
        int i8 = bVar.f18106c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i8 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f7, i7, i8);
    }

    private static Map<String, g> I(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0083c c0083c, Map<String, e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "style")) {
                String a7 = n0.a(xmlPullParser, "style");
                g N = N(xmlPullParser, new g());
                if (a7 != null) {
                    for (String str : O(a7)) {
                        N.a(map.get(str));
                    }
                }
                String g7 = N.g();
                if (g7 != null) {
                    map.put(g7, N);
                }
            } else if (n0.f(xmlPullParser, "region")) {
                e L = L(xmlPullParser, aVar, c0083c);
                if (L != null) {
                    map2.put(L.f18122a, L);
                }
            } else if (n0.f(xmlPullParser, "metadata")) {
                J(xmlPullParser, map3);
            }
        } while (!n0.d(xmlPullParser, "head"));
        return map;
    }

    private static void J(XmlPullParser xmlPullParser, Map<String, String> map) {
        String a7;
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "image") && (a7 = n0.a(xmlPullParser, "id")) != null) {
                map.put(a7, xmlPullParser.nextText());
            }
        } while (!n0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static d K(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) {
        long j7;
        long j8;
        char c7;
        int attributeCount = xmlPullParser.getAttributeCount();
        g N = N(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j9 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        String[] strArr = null;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j11 = P(attributeValue, bVar);
                    break;
                case 2:
                    j10 = P(attributeValue, bVar);
                    break;
                case 3:
                    j9 = P(attributeValue, bVar);
                    break;
                case 4:
                    String[] O = O(attributeValue);
                    if (O.length > 0) {
                        strArr = O;
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
        if (dVar != null) {
            long j12 = dVar.f18112d;
            j7 = -9223372036854775807L;
            if (j12 != -9223372036854775807L) {
                if (j9 != -9223372036854775807L) {
                    j9 += j12;
                }
                if (j10 != -9223372036854775807L) {
                    j10 += j12;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        long j13 = j9;
        if (j10 == j7) {
            if (j11 != j7) {
                j8 = j13 + j11;
            } else if (dVar != null) {
                long j14 = dVar.f18113e;
                if (j14 != j7) {
                    j8 = j14;
                }
            }
            return d.c(xmlPullParser.getName(), j13, j8, N, strArr, str2, str, dVar);
        }
        j8 = j10;
        return d.c(xmlPullParser.getName(), j13, j8, N, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0184, code lost:
    
        if (r0.equals("tb") == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static e L(XmlPullParser xmlPullParser, a aVar, C0083c c0083c) {
        String str;
        StringBuilder sb;
        float parseFloat;
        float f7;
        String str2;
        float parseFloat2;
        float parseFloat3;
        float f8;
        int i7;
        String a7;
        int i8;
        String a8 = n0.a(xmlPullParser, "id");
        if (a8 == null) {
            return null;
        }
        String a9 = n0.a(xmlPullParser, "origin");
        if (a9 != null) {
            Pattern pattern = f18096t;
            Matcher matcher = pattern.matcher(a9);
            Pattern pattern2 = f18097u;
            Matcher matcher2 = pattern2.matcher(a9);
            String str3 = "Ignoring region with malformed origin: ";
            if (matcher.matches()) {
                try {
                    float parseFloat4 = Float.parseFloat((String) o2.a.e(matcher.group(1))) / 100.0f;
                    parseFloat = Float.parseFloat((String) o2.a.e(matcher.group(2))) / 100.0f;
                    f7 = parseFloat4;
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(a9);
                    str = sb.toString();
                    r.i("TtmlDecoder", str);
                    return null;
                }
            } else if (!matcher2.matches()) {
                sb = new StringBuilder();
                str2 = "Ignoring region with unsupported origin: ";
                sb.append(str2);
                sb.append(a9);
                str = sb.toString();
            } else if (c0083c == null) {
                sb = new StringBuilder();
                sb.append("Ignoring region with missing tts:extent: ");
                sb.append(a9);
                str = sb.toString();
            } else {
                try {
                    int parseInt = Integer.parseInt((String) o2.a.e(matcher2.group(1)));
                    f7 = parseInt / c0083c.f18107a;
                    parseFloat = Integer.parseInt((String) o2.a.e(matcher2.group(2))) / c0083c.f18108b;
                } catch (NumberFormatException unused2) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(a9);
                    str = sb.toString();
                    r.i("TtmlDecoder", str);
                    return null;
                }
            }
            String a10 = n0.a(xmlPullParser, "extent");
            if (a10 != null) {
                Matcher matcher3 = pattern.matcher(a10);
                Matcher matcher4 = pattern2.matcher(a10);
                str3 = "Ignoring region with malformed extent: ";
                if (matcher3.matches()) {
                    try {
                        parseFloat2 = Float.parseFloat((String) o2.a.e(matcher3.group(1))) / 100.0f;
                        parseFloat3 = Float.parseFloat((String) o2.a.e(matcher3.group(2))) / 100.0f;
                    } catch (NumberFormatException unused3) {
                        sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(a9);
                        str = sb.toString();
                        r.i("TtmlDecoder", str);
                        return null;
                    }
                } else if (!matcher4.matches()) {
                    sb = new StringBuilder();
                    str2 = "Ignoring region with unsupported extent: ";
                    sb.append(str2);
                    sb.append(a9);
                    str = sb.toString();
                } else if (c0083c == null) {
                    sb = new StringBuilder();
                    sb.append("Ignoring region with missing tts:extent: ");
                    sb.append(a9);
                    str = sb.toString();
                } else {
                    try {
                        int parseInt2 = Integer.parseInt((String) o2.a.e(matcher4.group(1)));
                        parseFloat2 = parseInt2 / c0083c.f18107a;
                        parseFloat3 = Integer.parseInt((String) o2.a.e(matcher4.group(2))) / c0083c.f18108b;
                    } catch (NumberFormatException unused4) {
                        sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(a9);
                        str = sb.toString();
                        r.i("TtmlDecoder", str);
                        return null;
                    }
                }
                String a11 = n0.a(xmlPullParser, "displayAlign");
                char c7 = 0;
                if (a11 != null) {
                    String e7 = l4.b.e(a11);
                    e7.hashCode();
                    if (e7.equals("center")) {
                        f8 = parseFloat + (parseFloat3 / 2.0f);
                        i7 = 1;
                    } else if (e7.equals("after")) {
                        f8 = parseFloat + parseFloat3;
                        i7 = 2;
                    }
                    float f9 = 1.0f / aVar.f18103b;
                    a7 = n0.a(xmlPullParser, "writingMode");
                    if (a7 != null) {
                        String e8 = l4.b.e(a7);
                        e8.hashCode();
                        switch (e8.hashCode()) {
                            case 3694:
                                break;
                            case 3553396:
                                if (e8.equals("tblr")) {
                                    c7 = 1;
                                    break;
                                }
                                c7 = 65535;
                                break;
                            case 3553576:
                                if (e8.equals("tbrl")) {
                                    c7 = 2;
                                    break;
                                }
                                c7 = 65535;
                                break;
                            default:
                                c7 = 65535;
                                break;
                        }
                        switch (c7) {
                            case 0:
                            case 1:
                                i8 = 2;
                                break;
                            case 2:
                                i8 = 1;
                                break;
                        }
                        return new e(a8, f7, f8, 0, i7, parseFloat2, parseFloat3, 1, f9, i8);
                    }
                    i8 = Integer.MIN_VALUE;
                    return new e(a8, f7, f8, 0, i7, parseFloat2, parseFloat3, 1, f9, i8);
                }
                f8 = parseFloat;
                i7 = 0;
                float f92 = 1.0f / aVar.f18103b;
                a7 = n0.a(xmlPullParser, "writingMode");
                if (a7 != null) {
                }
                i8 = Integer.MIN_VALUE;
                return new e(a8, f7, f8, 0, i7, parseFloat2, parseFloat3, 1, f92, i8);
            }
            str = "Ignoring region without an extent";
        } else {
            str = "Ignoring region without an origin";
        }
        r.i("TtmlDecoder", str);
        return null;
    }

    private static float M(String str) {
        Matcher matcher = f18095s.matcher(str);
        if (!matcher.matches()) {
            r.i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) o2.a.e(matcher.group(1)))));
        } catch (NumberFormatException e7) {
            r.j("TtmlDecoder", "Failed to parse shear: " + str, e7);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c4, code lost:
    
        if (r3.equals("text") == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static g N(XmlPullParser xmlPullParser, g gVar) {
        char c7;
        StringBuilder sb;
        String str;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            String attributeName = xmlPullParser.getAttributeName(i7);
            attributeName.hashCode();
            char c8 = 5;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c7 = '\f';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c7 = '\r';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c7 = 14;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    gVar = C(gVar).B("italic".equalsIgnoreCase(attributeValue));
                    continue;
                case 1:
                    gVar = C(gVar).x(attributeValue);
                    continue;
                case 2:
                    gVar = C(gVar).H(E(attributeValue));
                    continue;
                case 3:
                    String e7 = l4.b.e(attributeValue);
                    e7.hashCode();
                    switch (e7) {
                        case "nounderline":
                            gVar = C(gVar).K(false);
                            break;
                        case "underline":
                            gVar = C(gVar).K(true);
                            break;
                        case "nolinethrough":
                            gVar = C(gVar).C(false);
                            break;
                        case "linethrough":
                            gVar = C(gVar).C(true);
                            continue;
                    }
                case 4:
                    gVar = C(gVar).v("bold".equalsIgnoreCase(attributeValue));
                    continue;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar = C(gVar).A(attributeValue);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    String e8 = l4.b.e(attributeValue);
                    e8.hashCode();
                    switch (e8.hashCode()) {
                        case -618561360:
                            if (e8.equals("baseContainer")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -410956671:
                            if (e8.equals("container")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -250518009:
                            if (e8.equals("delimiter")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -136074796:
                            if (e8.equals("textContainer")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3016401:
                            if (e8.equals("base")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 3556653:
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                        case 4:
                            gVar = C(gVar).F(2);
                            break;
                        case 1:
                            gVar = C(gVar).F(1);
                            break;
                        case 2:
                            gVar = C(gVar).F(4);
                            break;
                        case 3:
                        case 5:
                            gVar = C(gVar).F(3);
                            continue;
                    }
                case w0.f2149o /* 7 */:
                    gVar = C(gVar);
                    try {
                        gVar.w(o2.f.c(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        sb = new StringBuilder();
                        str = "Failed parsing color value: ";
                        break;
                    }
                case w0.f2150p /* 8 */:
                    gVar = C(gVar).G(M(attributeValue));
                    continue;
                case '\t':
                    String e9 = l4.b.e(attributeValue);
                    e9.hashCode();
                    if (e9.equals("all")) {
                        gVar = C(gVar).I(true);
                        break;
                    } else if (!e9.equals("none")) {
                        break;
                    } else {
                        gVar = C(gVar).I(false);
                        continue;
                    }
                case '\n':
                    try {
                        gVar = C(gVar);
                        G(attributeValue, gVar);
                        continue;
                    } catch (j unused2) {
                        sb = new StringBuilder();
                        str = "Failed parsing fontSize value: ";
                        break;
                    }
                case 11:
                    gVar = C(gVar).J(j2.b.a(attributeValue));
                    continue;
                case '\f':
                    String e10 = l4.b.e(attributeValue);
                    e10.hashCode();
                    if (e10.equals("before")) {
                        gVar = C(gVar).E(1);
                        break;
                    } else if (!e10.equals("after")) {
                        break;
                    } else {
                        gVar = C(gVar).E(2);
                        continue;
                    }
                case '\r':
                    gVar = C(gVar);
                    try {
                        gVar.u(o2.f.c(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused3) {
                        sb = new StringBuilder();
                        str = "Failed parsing background value: ";
                        break;
                    }
                case 14:
                    gVar = C(gVar).D(E(attributeValue));
                    continue;
            }
            sb.append(str);
            sb.append(attributeValue);
            r.i("TtmlDecoder", sb.toString());
        }
        return gVar;
    }

    private static String[] O(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : m0.Q0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00ff. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long P(String str, b bVar) {
        double d7;
        double d8;
        Matcher matcher = f18092p.matcher(str);
        char c7 = 4;
        if (matcher.matches()) {
            double parseLong = Long.parseLong((String) o2.a.e(matcher.group(1))) * 3600;
            double parseLong2 = Long.parseLong((String) o2.a.e(matcher.group(2))) * 60;
            Double.isNaN(parseLong);
            Double.isNaN(parseLong2);
            double parseLong3 = Long.parseLong((String) o2.a.e(matcher.group(3)));
            Double.isNaN(parseLong3);
            double d9 = parseLong + parseLong2 + parseLong3;
            String group = matcher.group(4);
            double d10 = 0.0d;
            double parseDouble = d9 + (group != null ? Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / bVar.f18104a : 0.0d);
            String group2 = matcher.group(6);
            if (group2 != null) {
                double parseLong4 = Long.parseLong(group2);
                double d11 = bVar.f18105b;
                Double.isNaN(parseLong4);
                Double.isNaN(d11);
                double d12 = bVar.f18104a;
                Double.isNaN(d12);
                d10 = (parseLong4 / d11) / d12;
            }
            return (long) ((parseDouble + d10) * 1000000.0d);
        }
        Matcher matcher2 = f18093q.matcher(str);
        if (!matcher2.matches()) {
            throw new j("Malformed time expression: " + str);
        }
        double parseDouble2 = Double.parseDouble((String) o2.a.e(matcher2.group(1)));
        String str2 = (String) o2.a.e(matcher2.group(2));
        str2.hashCode();
        switch (str2.hashCode()) {
            case 102:
                if (str2.equals("f")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 104:
                if (str2.equals("h")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 109:
                if (str2.equals("m")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 116:
                if (str2.equals("t")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 3494:
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
                d7 = bVar.f18104a;
                Double.isNaN(d7);
                parseDouble2 /= d7;
                break;
            case 1:
                d8 = 3600.0d;
                parseDouble2 *= d8;
                break;
            case 2:
                d8 = 60.0d;
                parseDouble2 *= d8;
                break;
            case 3:
                d7 = bVar.f18106c;
                Double.isNaN(d7);
                parseDouble2 /= d7;
                break;
            case 4:
                d7 = 1000.0d;
                parseDouble2 /= d7;
                break;
        }
        return (long) (parseDouble2 * 1000000.0d);
    }

    private static C0083c Q(XmlPullParser xmlPullParser) {
        StringBuilder sb;
        String str;
        String a7 = n0.a(xmlPullParser, "extent");
        if (a7 == null) {
            return null;
        }
        Matcher matcher = f18097u.matcher(a7);
        if (matcher.matches()) {
            try {
                return new C0083c(Integer.parseInt((String) o2.a.e(matcher.group(1))), Integer.parseInt((String) o2.a.e(matcher.group(2))));
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb.append(str);
        sb.append(a7);
        r.i("TtmlDecoder", sb.toString());
        return null;
    }

    @Override // c2.g
    protected c2.h A(byte[] bArr, int i7, boolean z6) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f18101o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e(""));
            C0083c c0083c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i7), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f18099w;
            a aVar = f18100x;
            h hVar = null;
            int i8 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i8 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = H(newPullParser);
                            aVar = F(newPullParser, f18100x);
                            c0083c = Q(newPullParser);
                        }
                        C0083c c0083c2 = c0083c;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (D(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                I(newPullParser, hashMap, aVar2, c0083c2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    d K = K(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(K);
                                    if (dVar != null) {
                                        dVar.a(K);
                                    }
                                } catch (j e7) {
                                    r.j("TtmlDecoder", "Suppressing parser error", e7);
                                    i8++;
                                }
                            }
                            bVar2 = bVar;
                        } else {
                            r.f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i8++;
                            bVar2 = bVar3;
                        }
                        c0083c = c0083c2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((d) o2.a.e(dVar)).a(d.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((d) o2.a.e((d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i8++;
                } else if (eventType == 3) {
                    i8--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new j("No TTML subtitles found");
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new j("Unable to decode source", e9);
        }
    }
}
