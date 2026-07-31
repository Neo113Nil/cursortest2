package x1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import c4.w0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.q;
import m4.w;
import n2.j0;
import o2.k0;
import o2.m0;
import o2.n0;
import o2.r;
import o2.v;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import r0.n2;
import r0.s1;
import v0.m;
import x1.k;

/* loaded from: classes.dex */
public class d extends DefaultHandler implements j0.a<c> {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f23104b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f23105c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f23106d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f23107e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f23108a;

    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final s1 f23109a;

        /* renamed from: b, reason: collision with root package name */
        public final q<b> f23110b;

        /* renamed from: c, reason: collision with root package name */
        public final k f23111c;

        /* renamed from: d, reason: collision with root package name */
        public final String f23112d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList<m.b> f23113e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList<e> f23114f;

        /* renamed from: g, reason: collision with root package name */
        public final long f23115g;

        /* renamed from: h, reason: collision with root package name */
        public final List<e> f23116h;

        /* renamed from: i, reason: collision with root package name */
        public final List<e> f23117i;

        public a(s1 s1Var, List<b> list, k kVar, String str, ArrayList<m.b> arrayList, ArrayList<e> arrayList2, List<e> list2, List<e> list3, long j7) {
            this.f23109a = s1Var;
            this.f23110b = q.t(list);
            this.f23111c = kVar;
            this.f23112d = str;
            this.f23113e = arrayList;
            this.f23114f = arrayList2;
            this.f23116h = list2;
            this.f23117i = list3;
            this.f23115g = j7;
        }
    }

    public d() {
        try {
            this.f23108a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    protected static int D(List<e> list) {
        String str;
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = list.get(i7);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f23118a) && (str = eVar.f23119b) != null) {
                Matcher matcher = f23105c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                r.i("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f23119b);
            }
        }
        return -1;
    }

    protected static int E(List<e> list) {
        String str;
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = list.get(i7);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f23118a) && (str = eVar.f23119b) != null) {
                Matcher matcher = f23106d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                r.i("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f23119b);
            }
        }
        return -1;
    }

    protected static long H(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j7 : m0.I0(attributeValue);
    }

    protected static e I(XmlPullParser xmlPullParser, String str) {
        String r02 = r0(xmlPullParser, "schemeIdUri", "");
        String r03 = r0(xmlPullParser, "value", null);
        String r04 = r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!n0.d(xmlPullParser, str));
        return new e(r02, r03, r04);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected static int J(XmlPullParser xmlPullParser) {
        char c7;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String e7 = l4.b.e(attributeValue);
        e7.hashCode();
        switch (e7.hashCode()) {
            case 1596796:
                if (e7.equals("4000")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 2937391:
                if (e7.equals("a000")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 3094035:
                if (e7.equals("f801")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 3133436:
                if (e7.equals("fa01")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
        }
        return -1;
    }

    protected static int K(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U <= 0 || U >= 33) {
            return -1;
        }
        return U;
    }

    protected static int L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    protected static long M(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j7 : m0.J0(attributeValue);
    }

    protected static String N(List<e> list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = list.get(i7);
            String str = eVar.f23118a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f23119b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f23119b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float R(XmlPullParser xmlPullParser, String str, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f7 : Float.parseFloat(attributeValue);
    }

    protected static float S(XmlPullParser xmlPullParser, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f7;
        }
        Matcher matcher = f23104b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f7;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        float f8 = parseInt;
        return !TextUtils.isEmpty(matcher.group(2)) ? f8 / Integer.parseInt(r2) : f8;
    }

    protected static int U(XmlPullParser xmlPullParser, String str, int i7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i7 : Integer.parseInt(attributeValue);
    }

    protected static long W(List<e> list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = list.get(i7);
            if (l4.b.a("http://dashif.org/guidelines/last-segment-number", eVar.f23118a)) {
                return Long.parseLong(eVar.f23119b);
            }
        }
        return -1L;
    }

    protected static long X(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j7 : Long.parseLong(attributeValue);
    }

    protected static int Z(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U < 0) {
            return -1;
        }
        int[] iArr = f23107e;
        if (U < iArr.length) {
            return iArr[U];
        }
        return -1;
    }

    private long b(List<k.d> list, long j7, long j8, int i7, long j9) {
        int m7 = i7 >= 0 ? i7 + 1 : (int) m0.m(j9 - j7, j8);
        for (int i8 = 0; i8 < m7; i8++) {
            list.add(m(j7, j8));
            j7 += j8;
        }
        return j7;
    }

    private static int p(int i7, int i8) {
        if (i7 == -1) {
            return i8;
        }
        if (i8 == -1) {
            return i7;
        }
        o2.a.f(i7 == i8);
        return i7;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        o2.a.f(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<m.b> arrayList) {
        String str;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                str = null;
                break;
            }
            m.b bVar = arrayList.get(i7);
            if (r0.j.f20685c.equals(bVar.f22686g) && (str = bVar.f22687h) != null) {
                arrayList.remove(i7);
                break;
            }
            i7++;
        }
        if (str == null) {
            return;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            m.b bVar2 = arrayList.get(i8);
            if (r0.j.f20684b.equals(bVar2.f22686g) && bVar2.f22687h == null) {
                arrayList.set(i8, new m.b(r0.j.f20685c, str, bVar2.f22688i, bVar2.f22689j));
            }
        }
    }

    protected static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static void s(ArrayList<m.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m.b bVar = arrayList.get(size);
            if (!bVar.g()) {
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i7).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i7++;
                }
            }
        }
    }

    protected static String s0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser, str));
        return str2;
    }

    private static long t(long j7, long j8) {
        if (j8 != -9223372036854775807L) {
            j7 = j8;
        }
        if (j7 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j7;
    }

    private static String u(String str, String str2) {
        if (v.o(str)) {
            return v.c(str2);
        }
        if (v.s(str)) {
            return v.n(str2);
        }
        if (v.r(str) || v.p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String g7 = v.g(str2);
        return "text/vtt".equals(g7) ? "application/x-mp4-vtt" : g7;
    }

    private boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (n0.e(xmlPullParser)) {
            int i7 = 1;
            while (i7 != 0) {
                xmlPullParser.next();
                if (n0.e(xmlPullParser)) {
                    i7++;
                } else if (n0.c(xmlPullParser)) {
                    i7--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int A(XmlPullParser xmlPullParser) {
        char c7;
        String r02 = r0(xmlPullParser, "schemeIdUri", null);
        r02.hashCode();
        int i7 = -1;
        switch (r02.hashCode()) {
            case -2128649360:
                if (r02.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -1352850286:
                if (r02.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -1138141449:
                if (r02.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -986633423:
                if (r02.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -79006963:
                if (r02.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 312179081:
                if (r02.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case 2036691300:
                if (r02.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c7 = 6;
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
            case 4:
                i7 = K(xmlPullParser);
                break;
            case 1:
                i7 = U(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                i7 = J(xmlPullParser);
                break;
            case 3:
                i7 = Z(xmlPullParser);
                break;
            case 5:
                i7 = L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!n0.d(xmlPullParser, "AudioChannelConfiguration"));
        return i7;
    }

    protected long B(XmlPullParser xmlPullParser, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j7;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected List<b> C(XmlPullParser xmlPullParser, List<b> list, boolean z6) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z6 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String s02 = s0(xmlPullParser, "BaseURL");
        if (k0.b(s02)) {
            if (attributeValue3 == null) {
                attributeValue3 = s02;
            }
            return w.j(new b(s02, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            b bVar = list.get(i7);
            String d7 = k0.d(bVar.f23087a, s02);
            String str = attributeValue3 == null ? d7 : attributeValue3;
            if (z6) {
                parseInt = bVar.f23089c;
                parseInt2 = bVar.f23090d;
                str = bVar.f23088b;
            }
            arrayList.add(new b(d7, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Pair<String, m.b> F(XmlPullParser xmlPullParser) {
        String str;
        ?? r32;
        String str2;
        String str3;
        ?? r42;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String e7 = l4.b.e(attributeValue);
            e7.hashCode();
            switch (e7) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    r32 = r0.j.f20685c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r42 = str2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    r32 = r0.j.f20687e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r42 = str2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    r32 = r0.j.f20686d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r42 = str2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    str = xmlPullParser.getAttributeValue(null, "value");
                    String b7 = n0.b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(b7) && !"00000000-0000-0000-0000-000000000000".equals(b7)) {
                        String[] split = b7.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i7 = 0; i7 < split.length; i7++) {
                            uuidArr[i7] = UUID.fromString(split[i7]);
                        }
                        r32 = r0.j.f20684b;
                        str3 = null;
                        r42 = e1.l.b(r32, uuidArr, null);
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
                if (!n0.f(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r42 = r42;
                } else if (!n0.f(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r42 = r42;
                } else if (r42 == 0 && n0.g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                    byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                    UUID f7 = e1.l.f(decode);
                    if (f7 == null) {
                        r.i("MpdParser", "Skipping malformed cenc:pssh data");
                        r32 = f7;
                        r42 = 0;
                    } else {
                        r42 = decode;
                        r32 = f7;
                    }
                } else {
                    if (r42 == 0) {
                        ?? r62 = r0.j.f20687e;
                        if (r62.equals(r32) && n0.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r42 = e1.l.a(r62, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    w(xmlPullParser);
                    r42 = r42;
                }
            } while (!n0.d(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r32 != null ? new m.b(r32, str3, "video/mp4", r42) : null);
        }
        str = null;
        r32 = null;
        str2 = r32;
        str3 = str2;
        r42 = str2;
        do {
            xmlPullParser.next();
            if (!n0.f(xmlPullParser, "clearkey:Laurl")) {
            }
            if (!n0.f(xmlPullParser, "ms:laurl")) {
            }
        } while (!n0.d(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r32 != null ? new m.b(r32, str3, "video/mp4", r42) : null);
    }

    protected int G(XmlPullParser xmlPullParser) {
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
        return "text".equals(attributeValue) ? 3 : -1;
    }

    protected Pair<Long, l1.a> O(XmlPullParser xmlPullParser, String str, String str2, long j7, ByteArrayOutputStream byteArrayOutputStream) {
        long X = X(xmlPullParser, "id", 0L);
        long X2 = X(xmlPullParser, "duration", -9223372036854775807L);
        long X3 = X(xmlPullParser, "presentationTime", 0L);
        long N0 = m0.N0(X2, 1000L, j7);
        long N02 = m0.N0(X3, 1000000L, j7);
        String r02 = r0(xmlPullParser, "messageData", null);
        byte[] P = P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(N02);
        if (r02 != null) {
            P = m0.m0(r02);
        }
        return Pair.create(valueOf, d(str, str2, X, N0, P));
    }

    protected byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, l4.d.f18614c.name());
        while (true) {
            xmlPullParser.nextToken();
            if (n0.d(xmlPullParser, "Event")) {
                newSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i7 = 0; i7 < xmlPullParser.getAttributeCount(); i7++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i7), xmlPullParser.getAttributeName(i7), xmlPullParser.getAttributeValue(i7));
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
                case w0.f2149o /* 7 */:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case w0.f2150p /* 8 */:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    protected f Q(XmlPullParser xmlPullParser) {
        String r02 = r0(xmlPullParser, "schemeIdUri", "");
        String r03 = r0(xmlPullParser, "value", "");
        long X = X(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "Event")) {
                arrayList.add(O(xmlPullParser, r02, r03, X, byteArrayOutputStream));
            } else {
                w(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        l1.a[] aVarArr = new l1.a[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Pair pair = (Pair) arrayList.get(i7);
            jArr[i7] = ((Long) pair.first).longValue();
            aVarArr[i7] = (l1.a) pair.second;
        }
        return e(r02, r03, X, jArr, aVarArr);
    }

    protected i T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    protected String V(XmlPullParser xmlPullParser) {
        return s0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e6 A[LOOP:0: B:18:0x00a4->B:26:0x01e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected c Y(XmlPullParser xmlPullParser, Uri uri) {
        long j7;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j8;
        Throwable th;
        ArrayList arrayList3;
        long j9;
        boolean z6;
        long j10;
        d dVar = this;
        boolean v6 = dVar.v(dVar.b0(xmlPullParser, "profiles", new String[0]));
        long j11 = -9223372036854775807L;
        long H = H(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long M = M(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long M2 = M(xmlPullParser, "minBufferTime", -9223372036854775807L);
        Throwable th2 = null;
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long M3 = equals ? M(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long M4 = equals ? M(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long M5 = equals ? M(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long H2 = H(xmlPullParser, "publishTime", -9223372036854775807L);
        long j12 = equals ? 0L : -9223372036854775807L;
        ArrayList j13 = w.j(new b(uri.toString(), uri.toString(), v6 ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long j14 = equals ? -9223372036854775807L : 0L;
        h hVar = null;
        o oVar = null;
        Uri uri2 = null;
        l lVar = null;
        boolean z7 = false;
        boolean z8 = false;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "BaseURL")) {
                if (!z7) {
                    j12 = dVar.B(xmlPullParser, j12);
                    z7 = true;
                }
                arrayList5.addAll(dVar.C(xmlPullParser, j13, v6));
            } else if (n0.f(xmlPullParser, "ProgramInformation")) {
                hVar = c0(xmlPullParser);
            } else if (n0.f(xmlPullParser, "UTCTiming")) {
                oVar = v0(xmlPullParser);
            } else if (n0.f(xmlPullParser, "Location")) {
                uri2 = k0.e(uri.toString(), xmlPullParser.nextText());
            } else if (n0.f(xmlPullParser, "ServiceDescription")) {
                lVar = q0(xmlPullParser);
            } else {
                if (!n0.f(xmlPullParser, "Period") || z8) {
                    j7 = j12;
                    arrayList = arrayList5;
                    arrayList2 = j13;
                    j8 = j11;
                    th = th2;
                    arrayList3 = arrayList4;
                    w(xmlPullParser);
                } else {
                    j7 = j12;
                    ArrayList arrayList6 = arrayList4;
                    arrayList = arrayList5;
                    arrayList2 = j13;
                    j8 = j11;
                    th = th2;
                    Pair<g, Long> a02 = a0(xmlPullParser, !arrayList5.isEmpty() ? arrayList5 : j13, j14, j7, H, M4, v6);
                    g gVar = (g) a02.first;
                    if (gVar.f23127b != j8) {
                        long longValue = ((Long) a02.second).longValue();
                        if (longValue == j8) {
                            arrayList3 = arrayList6;
                            j9 = j8;
                        } else {
                            j9 = gVar.f23127b + longValue;
                            arrayList3 = arrayList6;
                        }
                        arrayList3.add(gVar);
                        j14 = j9;
                        z6 = z8;
                    } else {
                        if (!equals) {
                            throw n2.c("Unable to determine start of period " + arrayList6.size(), th);
                        }
                        arrayList3 = arrayList6;
                        z6 = true;
                    }
                    z8 = z6;
                }
                j12 = j7;
                if (n0.d(xmlPullParser, "MPD")) {
                    arrayList4 = arrayList3;
                    th2 = th;
                    arrayList5 = arrayList;
                    j13 = arrayList2;
                    j11 = j8;
                    dVar = this;
                } else {
                    if (M == j8) {
                        if (j14 != j8) {
                            j10 = j14;
                            if (arrayList3.isEmpty()) {
                                return g(H, j10, M2, equals, M3, M4, M5, H2, hVar, oVar, lVar, uri2, arrayList3);
                            }
                            throw n2.c("No periods found.", th);
                        }
                        if (!equals) {
                            throw n2.c("Unable to determine duration of static manifest.", th);
                        }
                    }
                    j10 = M;
                    if (arrayList3.isEmpty()) {
                    }
                }
            }
            arrayList = arrayList5;
            arrayList2 = j13;
            j8 = j11;
            th = th2;
            arrayList3 = arrayList4;
            if (n0.d(xmlPullParser, "MPD")) {
            }
        }
    }

    protected Pair<g, Long> a0(XmlPullParser xmlPullParser, List<b> list, long j7, long j8, long j9, long j10, boolean z6) {
        long j11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j12;
        k l02;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long M = M(xmlPullParser2, "start", j7);
        long j13 = -9223372036854775807L;
        long j14 = j9 != -9223372036854775807L ? j9 + M : -9223372036854775807L;
        long M2 = M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j15 = j8;
        long j16 = -9223372036854775807L;
        k kVar = null;
        e eVar = null;
        boolean z7 = false;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser2, "BaseURL")) {
                if (!z7) {
                    j15 = dVar.B(xmlPullParser2, j15);
                    z7 = true;
                }
                arrayList6.addAll(dVar.C(xmlPullParser2, list, z6));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j12 = j13;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (n0.f(xmlPullParser2, "AdaptationSet")) {
                    j11 = j15;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, kVar, M2, j15, j16, j14, j10, z6));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j11 = j15;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (n0.f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else {
                        arrayList3 = arrayList7;
                        if (n0.f(xmlPullParser2, "SegmentBase")) {
                            kVar = j0(xmlPullParser2, null);
                            obj = null;
                            j15 = j11;
                            j12 = -9223372036854775807L;
                        } else {
                            if (n0.f(xmlPullParser2, "SegmentList")) {
                                long B = B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                l02 = k0(xmlPullParser, null, j14, M2, j11, B, j10);
                                j16 = B;
                                j15 = j11;
                                j12 = -9223372036854775807L;
                            } else {
                                obj = null;
                                if (n0.f(xmlPullParser2, "SegmentTemplate")) {
                                    long B2 = B(xmlPullParser2, -9223372036854775807L);
                                    j12 = -9223372036854775807L;
                                    l02 = l0(xmlPullParser, null, q.x(), j14, M2, j11, B2, j10);
                                    j16 = B2;
                                    j15 = j11;
                                } else {
                                    j12 = -9223372036854775807L;
                                    if (n0.f(xmlPullParser2, "AssetIdentifier")) {
                                        eVar = I(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        w(xmlPullParser);
                                    }
                                    j15 = j11;
                                }
                            }
                            kVar = l02;
                        }
                    }
                }
                obj = null;
                j12 = -9223372036854775807L;
                j15 = j11;
            }
            if (n0.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, M, arrayList2, arrayList3, eVar), Long.valueOf(M2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j13 = j12;
            dVar = this;
        }
    }

    protected String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected x1.a c(int i7, int i8, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new x1.a(i7, i8, list, list2, list3, list4);
    }

    protected h c0(XmlPullParser xmlPullParser) {
        String str = null;
        String r02 = r0(xmlPullParser, "moreInformationURL", null);
        String r03 = r0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (n0.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (n0.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str4 = str3;
            if (n0.d(xmlPullParser, "ProgramInformation")) {
                return new h(str, str2, str4, r02, r03);
            }
            str3 = str4;
        }
    }

    protected l1.a d(String str, String str2, long j7, long j8, byte[] bArr) {
        return new l1.a(str, str2, j8, j7, bArr);
    }

    protected i d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j7;
        long j8;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j7 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j8 = (Long.parseLong(split[1]) - j7) + 1;
                return i(attributeValue, j7, j8);
            }
        } else {
            j7 = 0;
        }
        j8 = -1;
        return i(attributeValue, j7, j8);
    }

    protected f e(String str, String str2, long j7, long[] jArr, l1.a[] aVarArr) {
        return new f(str, str2, j7, jArr, aVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ee A[LOOP:0: B:2:0x006a->B:11:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0198 A[EDGE_INSN: B:12:0x0198->B:13:0x0198 BREAK  A[LOOP:0: B:2:0x006a->B:11:0x01ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected a e0(XmlPullParser xmlPullParser, List<b> list, String str, String str2, int i7, int i8, float f7, int i9, int i10, String str3, List<e> list2, List<e> list3, List<e> list4, List<e> list5, k kVar, long j7, long j8, long j9, long j10, long j11, boolean z6) {
        long j12;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i11;
        long B;
        ArrayList arrayList7;
        k kVar2;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        d dVar = this;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int U = U(xmlPullParser, "bandwidth", -1);
        String r02 = r0(xmlPullParser, "mimeType", str);
        String r03 = r0(xmlPullParser, "codecs", str2);
        int U2 = U(xmlPullParser, "width", i7);
        int U3 = U(xmlPullParser, "height", i8);
        float S = S(xmlPullParser, f7);
        int U4 = U(xmlPullParser, "audioSamplingRate", i10);
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList(list4);
        ArrayList arrayList15 = new ArrayList(list5);
        ArrayList arrayList16 = new ArrayList();
        int i12 = i9;
        long j13 = j9;
        long j14 = j10;
        String str4 = null;
        boolean z7 = false;
        k kVar3 = kVar;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "BaseURL")) {
                if (!z7) {
                    j13 = dVar.B(xmlPullParser, j13);
                    z7 = true;
                }
                arrayList16.addAll(dVar.C(xmlPullParser, list, z6));
            } else if (n0.f(xmlPullParser, "AudioChannelConfiguration")) {
                kVar2 = kVar3;
                arrayList10 = arrayList16;
                arrayList4 = arrayList12;
                i11 = A(xmlPullParser);
                arrayList5 = arrayList13;
                arrayList6 = arrayList15;
                arrayList11 = arrayList10;
                if (n0.d(xmlPullParser, "Representation")) {
                    break;
                }
                arrayList15 = arrayList6;
                arrayList13 = arrayList5;
                arrayList12 = arrayList4;
                kVar3 = kVar2;
                dVar = this;
                i12 = i11;
                arrayList16 = arrayList11;
            } else if (n0.f(xmlPullParser, "SegmentBase")) {
                kVar3 = dVar.j0(xmlPullParser, (k.e) kVar3);
            } else {
                if (n0.f(xmlPullParser, "SegmentList")) {
                    B = dVar.B(xmlPullParser, j14);
                    j12 = j13;
                    arrayList9 = arrayList16;
                    arrayList = arrayList15;
                    arrayList2 = arrayList13;
                    arrayList3 = arrayList14;
                    kVar3 = k0(xmlPullParser, (k.b) kVar3, j7, j8, j12, B, j11);
                    arrayList4 = arrayList12;
                } else {
                    j12 = j13;
                    ArrayList arrayList17 = arrayList16;
                    arrayList = arrayList15;
                    arrayList2 = arrayList13;
                    arrayList3 = arrayList14;
                    if (n0.f(xmlPullParser, "SegmentTemplate")) {
                        B = dVar.B(xmlPullParser, j14);
                        arrayList4 = arrayList12;
                        kVar3 = l0(xmlPullParser, (k.c) kVar3, list5, j7, j8, j12, B, j11);
                        arrayList9 = arrayList17;
                    } else {
                        arrayList4 = arrayList12;
                        if (n0.f(xmlPullParser, "ContentProtection")) {
                            Pair<String, m.b> F = F(xmlPullParser);
                            Object obj = F.first;
                            if (obj != null) {
                                str4 = (String) obj;
                            }
                            Object obj2 = F.second;
                            if (obj2 != null) {
                                arrayList4.add((m.b) obj2);
                            }
                            i11 = i12;
                            arrayList8 = arrayList17;
                            j13 = j12;
                            arrayList6 = arrayList;
                            arrayList5 = arrayList2;
                            arrayList14 = arrayList3;
                            arrayList7 = arrayList8;
                            kVar2 = kVar3;
                            arrayList11 = arrayList7;
                            if (n0.d(xmlPullParser, "Representation")) {
                            }
                        } else {
                            if (n0.f(xmlPullParser, "InbandEventStream")) {
                                arrayList5 = arrayList2;
                                arrayList5.add(I(xmlPullParser, "InbandEventStream"));
                                arrayList6 = arrayList;
                                arrayList14 = arrayList3;
                            } else {
                                arrayList5 = arrayList2;
                                if (n0.f(xmlPullParser, "EssentialProperty")) {
                                    arrayList14 = arrayList3;
                                    arrayList14.add(I(xmlPullParser, "EssentialProperty"));
                                    arrayList6 = arrayList;
                                } else {
                                    arrayList14 = arrayList3;
                                    if (n0.f(xmlPullParser, "SupplementalProperty")) {
                                        arrayList6 = arrayList;
                                        arrayList6.add(I(xmlPullParser, "SupplementalProperty"));
                                    } else {
                                        arrayList6 = arrayList;
                                        w(xmlPullParser);
                                    }
                                }
                            }
                            i11 = i12;
                            j13 = j12;
                            arrayList7 = arrayList17;
                            kVar2 = kVar3;
                            arrayList11 = arrayList7;
                            if (n0.d(xmlPullParser, "Representation")) {
                            }
                        }
                    }
                }
                i11 = i12;
                j14 = B;
                arrayList8 = arrayList9;
                j13 = j12;
                arrayList6 = arrayList;
                arrayList5 = arrayList2;
                arrayList14 = arrayList3;
                arrayList7 = arrayList8;
                kVar2 = kVar3;
                arrayList11 = arrayList7;
                if (n0.d(xmlPullParser, "Representation")) {
                }
            }
            arrayList10 = arrayList16;
            arrayList4 = arrayList12;
            i11 = i12;
            kVar2 = kVar3;
            arrayList5 = arrayList13;
            arrayList6 = arrayList15;
            arrayList11 = arrayList10;
            if (n0.d(xmlPullParser, "Representation")) {
            }
        }
        ArrayList arrayList18 = arrayList6;
        ArrayList arrayList19 = arrayList14;
        ArrayList arrayList20 = arrayList5;
        s1 f8 = f(attributeValue, r02, U2, U3, S, i11, U4, U, str3, list2, list3, r03, arrayList19, arrayList18);
        if (kVar2 == null) {
            kVar2 = new k.e();
        }
        boolean isEmpty = arrayList11.isEmpty();
        List<b> list6 = arrayList11;
        if (isEmpty) {
            list6 = list;
        }
        return new a(f8, list6, kVar2, str4, arrayList4, arrayList20, arrayList19, arrayList18, -1L);
    }

    protected s1 f(String str, String str2, int i7, int i8, float f7, int i9, int i10, int i11, String str3, List<e> list, List<e> list2, String str4, List<e> list3, List<e> list4) {
        String str5 = str4;
        String u6 = u(str2, str5);
        if ("audio/eac3".equals(u6)) {
            u6 = N(list4);
            if ("audio/eac3-joc".equals(u6)) {
                str5 = "ec+3";
            }
        }
        int p02 = p0(list);
        s1.b V = new s1.b().S(str).K(str2).e0(u6).I(str5).Z(i11).g0(p02).c0(i0(list) | f0(list2) | h0(list3) | h0(list4)).V(str3);
        if (v.s(u6)) {
            V.j0(i7).Q(i8).P(f7);
        } else if (v.o(u6)) {
            V.H(i9).f0(i10);
        } else if (v.r(u6)) {
            int i12 = -1;
            if ("application/cea-608".equals(u6)) {
                i12 = D(list2);
            } else if ("application/cea-708".equals(u6)) {
                i12 = E(list2);
            }
            V.F(i12);
        } else if (v.p(u6)) {
            V.j0(i7).Q(i8);
        }
        return V.E();
    }

    protected int f0(List<e> list) {
        int t02;
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            e eVar = list.get(i8);
            if (l4.b.a("urn:mpeg:dash:role:2011", eVar.f23118a)) {
                t02 = g0(eVar.f23119b);
            } else if (l4.b.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f23118a)) {
                t02 = t0(eVar.f23119b);
            }
            i7 |= t02;
        }
        return i7;
    }

    protected c g(long j7, long j8, long j9, boolean z6, long j10, long j11, long j12, long j13, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        return new c(j7, j8, j9, z6, j10, j11, j12, j13, hVar, oVar, lVar, uri, list);
    }

    protected int g0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected g h(String str, long j7, List<x1.a> list, List<f> list2, e eVar) {
        return new g(str, j7, list, list2, eVar);
    }

    protected int h0(List<e> list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (l4.b.a("http://dashif.org/guidelines/trickmode", list.get(i8).f23118a)) {
                i7 |= 16384;
            }
        }
        return i7;
    }

    protected i i(String str, long j7, long j8) {
        return new i(str, j7, j8);
    }

    protected int i0(List<e> list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            e eVar = list.get(i8);
            if (l4.b.a("urn:mpeg:dash:role:2011", eVar.f23118a)) {
                i7 |= g0(eVar.f23119b);
            }
        }
        return i7;
    }

    protected j j(a aVar, String str, String str2, ArrayList<m.b> arrayList, ArrayList<e> arrayList2) {
        s1.b b7 = aVar.f23109a.b();
        if (str != null) {
            b7.U(str);
        }
        String str3 = aVar.f23112d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<m.b> arrayList3 = aVar.f23113e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            b7.M(new v0.m(str2, arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f23114f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f23115g, b7.E(), aVar.f23110b, aVar.f23111c, arrayList4, aVar.f23116h, aVar.f23117i, null);
    }

    protected k.e j0(XmlPullParser xmlPullParser, k.e eVar) {
        long j7;
        long j8;
        long X = X(xmlPullParser, "timescale", eVar != null ? eVar.f23155b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f23156c : 0L);
        long j9 = eVar != null ? eVar.f23169d : 0L;
        long j10 = eVar != null ? eVar.f23170e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j7 = (Long.parseLong(split[1]) - parseLong) + 1;
            j8 = parseLong;
        } else {
            j7 = j10;
            j8 = j9;
        }
        i iVar = eVar != null ? eVar.f23154a : null;
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser, "SegmentBase"));
        return n(iVar, X, X2, j8, j7);
    }

    protected k.b k(i iVar, long j7, long j8, long j9, long j10, List<k.d> list, long j11, List<i> list2, long j12, long j13) {
        return new k.b(iVar, j7, j8, j9, j10, list, j11, list2, m0.B0(j12), m0.B0(j13));
    }

    protected k.b k0(XmlPullParser xmlPullParser, k.b bVar, long j7, long j8, long j9, long j10, long j11) {
        long X = X(xmlPullParser, "timescale", bVar != null ? bVar.f23155b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f23156c : 0L);
        long X3 = X(xmlPullParser, "duration", bVar != null ? bVar.f23158e : -9223372036854775807L);
        long X4 = X(xmlPullParser, "startNumber", bVar != null ? bVar.f23157d : 1L);
        long t6 = t(j9, j10);
        List<k.d> list = null;
        List<i> list2 = null;
        i iVar = null;
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (n0.f(xmlPullParser, "SegmentTimeline")) {
                list = m0(xmlPullParser, X, j8);
            } else if (n0.f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(n0(xmlPullParser));
            } else {
                w(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVar == null) {
                iVar = bVar.f23154a;
            }
            if (list == null) {
                list = bVar.f23159f;
            }
            if (list2 == null) {
                list2 = bVar.f23163j;
            }
        }
        return k(iVar, X, X2, X4, X3, list, t6, list2, j11, j7);
    }

    protected k.c l(i iVar, long j7, long j8, long j9, long j10, long j11, List<k.d> list, long j12, n nVar, n nVar2, long j13, long j14) {
        return new k.c(iVar, j7, j8, j9, j10, j11, list, j12, nVar, nVar2, m0.B0(j13), m0.B0(j14));
    }

    protected k.c l0(XmlPullParser xmlPullParser, k.c cVar, List<e> list, long j7, long j8, long j9, long j10, long j11) {
        long X = X(xmlPullParser, "timescale", cVar != null ? cVar.f23155b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f23156c : 0L);
        long X3 = X(xmlPullParser, "duration", cVar != null ? cVar.f23158e : -9223372036854775807L);
        long X4 = X(xmlPullParser, "startNumber", cVar != null ? cVar.f23157d : 1L);
        long W = W(list);
        long t6 = t(j9, j10);
        List<k.d> list2 = null;
        n u02 = u0(xmlPullParser, "media", cVar != null ? cVar.f23165k : null);
        n u03 = u0(xmlPullParser, "initialization", cVar != null ? cVar.f23164j : null);
        i iVar = null;
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (n0.f(xmlPullParser, "SegmentTimeline")) {
                list2 = m0(xmlPullParser, X, j8);
            } else {
                w(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVar == null) {
                iVar = cVar.f23154a;
            }
            if (list2 == null) {
                list2 = cVar.f23159f;
            }
        }
        return l(iVar, X, X2, X4, W, X3, list2, t6, u03, u02, j11, j7);
    }

    protected k.d m(long j7, long j8) {
        return new k.d(j7, j8);
    }

    protected List<k.d> m0(XmlPullParser xmlPullParser, long j7, long j8) {
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        long j10 = -9223372036854775807L;
        boolean z6 = false;
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "S")) {
                long X = X(xmlPullParser, "t", -9223372036854775807L);
                if (z6) {
                    j9 = b(arrayList, j9, j10, i7, X);
                }
                if (X == -9223372036854775807L) {
                    X = j9;
                }
                j10 = X(xmlPullParser, "d", -9223372036854775807L);
                i7 = U(xmlPullParser, "r", 0);
                j9 = X;
                z6 = true;
            } else {
                w(xmlPullParser);
            }
        } while (!n0.d(xmlPullParser, "SegmentTimeline"));
        if (z6) {
            b(arrayList, j9, j10, i7, m0.N0(j8, j7, 1000L));
        }
        return arrayList;
    }

    protected k.e n(i iVar, long j7, long j8, long j9, long j10) {
        return new k.e(iVar, j7, j8, j9, j10);
    }

    protected i n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    protected o o(String str, String str2) {
        return new o(str, str2);
    }

    protected int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int p0(List<e> list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            e eVar = list.get(i8);
            if (l4.b.a("urn:mpeg:dash:role:2011", eVar.f23118a)) {
                i7 |= o0(eVar.f23119b);
            }
        }
        return i7;
    }

    protected l q0(XmlPullParser xmlPullParser) {
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        float f7 = -3.4028235E38f;
        float f8 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "Latency")) {
                j7 = X(xmlPullParser, "target", -9223372036854775807L);
                j8 = X(xmlPullParser, "min", -9223372036854775807L);
                j9 = X(xmlPullParser, "max", -9223372036854775807L);
            } else if (n0.f(xmlPullParser, "PlaybackRate")) {
                f7 = R(xmlPullParser, "min", -3.4028235E38f);
                f8 = R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j10 = j7;
            long j11 = j8;
            long j12 = j9;
            float f9 = f7;
            float f10 = f8;
            if (n0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j10, j11, j12, f9, f10);
            }
            j7 = j10;
            j8 = j11;
            j9 = j12;
            f7 = f9;
            f8 = f10;
        }
    }

    protected int t0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected n u0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    protected o v0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // n2.j0.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f23108a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return Y(newPullParser, uri);
            }
            throw n2.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            throw n2.c(null, e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x030d A[LOOP:0: B:2:0x007c->B:10:0x030d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02ce A[EDGE_INSN: B:11:0x02ce->B:12:0x02ce BREAK  A[LOOP:0: B:2:0x007c->B:10:0x030d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected x1.a y(XmlPullParser xmlPullParser, List<b> list, k kVar, long j7, long j8, long j9, long j10, long j11, boolean z6) {
        long j12;
        ArrayList<e> arrayList;
        Object obj;
        long j13;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList<m.b> arrayList7;
        String str;
        String str2;
        ArrayList arrayList8;
        int i7;
        ArrayList<e> arrayList9;
        long B;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int U = U(xmlPullParser2, "id", -1);
        int G = G(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int U2 = U(xmlPullParser2, "width", -1);
        int U3 = U(xmlPullParser2, "height", -1);
        float S = S(xmlPullParser2, -1.0f);
        int U4 = U(xmlPullParser2, "audioSamplingRate", -1);
        String str3 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList<m.b> arrayList10 = new ArrayList<>();
        ArrayList<e> arrayList11 = new ArrayList<>();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        k kVar2 = kVar;
        int i8 = G;
        String str4 = attributeValue3;
        String str5 = attributeValue4;
        String str6 = null;
        int i9 = -1;
        boolean z7 = false;
        long j14 = j8;
        long j15 = j9;
        while (true) {
            xmlPullParser.next();
            if (n0.f(xmlPullParser2, "BaseURL")) {
                if (!z7) {
                    j14 = dVar.B(xmlPullParser2, j14);
                    z7 = true;
                }
                j12 = j15;
                arrayList = arrayList11;
                arrayList17.addAll(dVar.C(xmlPullParser2, list, z6));
            } else {
                j12 = j15;
                arrayList = arrayList11;
                if (n0.f(xmlPullParser2, "ContentProtection")) {
                    Pair<String, m.b> F = F(xmlPullParser);
                    Object obj2 = F.first;
                    if (obj2 != null) {
                        str6 = (String) obj2;
                    }
                    Object obj3 = F.second;
                    if (obj3 != null) {
                        arrayList10.add((m.b) obj3);
                    }
                } else {
                    if (n0.f(xmlPullParser2, "ContentComponent")) {
                        String q7 = q(str4, xmlPullParser2.getAttributeValue(null, str3));
                        int p7 = p(i8, G(xmlPullParser));
                        str2 = q7;
                        obj = null;
                        j13 = j14;
                        arrayList2 = arrayList17;
                        arrayList8 = arrayList16;
                        arrayList3 = arrayList15;
                        arrayList4 = arrayList14;
                        arrayList5 = arrayList13;
                        arrayList6 = arrayList12;
                        arrayList7 = arrayList10;
                        str = str3;
                        i7 = p7;
                        arrayList9 = arrayList;
                    } else {
                        int i10 = i8;
                        String str7 = str4;
                        if (n0.f(xmlPullParser2, "Role")) {
                            arrayList13.add(I(xmlPullParser2, "Role"));
                        } else if (n0.f(xmlPullParser2, "AudioChannelConfiguration")) {
                            i9 = A(xmlPullParser);
                        } else if (n0.f(xmlPullParser2, "Accessibility")) {
                            arrayList12.add(I(xmlPullParser2, "Accessibility"));
                        } else if (n0.f(xmlPullParser2, "EssentialProperty")) {
                            arrayList14.add(I(xmlPullParser2, "EssentialProperty"));
                        } else if (n0.f(xmlPullParser2, "SupplementalProperty")) {
                            arrayList15.add(I(xmlPullParser2, "SupplementalProperty"));
                        } else if (n0.f(xmlPullParser2, "Representation")) {
                            j13 = j14;
                            arrayList2 = arrayList17;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList14;
                            arrayList5 = arrayList13;
                            arrayList6 = arrayList12;
                            arrayList7 = arrayList10;
                            str = str3;
                            obj = null;
                            str2 = str7;
                            a e02 = e0(xmlPullParser, !arrayList17.isEmpty() ? arrayList17 : list, attributeValue, attributeValue2, U2, U3, S, i9, U4, str7, arrayList5, arrayList6, arrayList4, arrayList3, kVar2, j10, j7, j13, j12, j11, z6);
                            int p8 = p(i10, v.k(e02.f23109a.f20956q));
                            arrayList8 = arrayList16;
                            arrayList8.add(e02);
                            xmlPullParser2 = xmlPullParser;
                            i7 = p8;
                            arrayList9 = arrayList;
                        } else {
                            obj = null;
                            j13 = j14;
                            arrayList2 = arrayList17;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList14;
                            arrayList5 = arrayList13;
                            arrayList6 = arrayList12;
                            arrayList7 = arrayList10;
                            str = str3;
                            str2 = str7;
                            arrayList8 = arrayList16;
                            if (n0.f(xmlPullParser, "SegmentBase")) {
                                kVar2 = j0(xmlPullParser, (k.e) kVar2);
                                i7 = i10;
                                arrayList9 = arrayList;
                                j15 = j12;
                                xmlPullParser2 = xmlPullParser;
                            } else {
                                if (n0.f(xmlPullParser, "SegmentList")) {
                                    B = B(xmlPullParser, j12);
                                    i7 = i10;
                                    kVar2 = k0(xmlPullParser, (k.b) kVar2, j10, j7, j13, B, j11);
                                    xmlPullParser2 = xmlPullParser;
                                } else {
                                    j15 = j12;
                                    i7 = i10;
                                    if (n0.f(xmlPullParser, "SegmentTemplate")) {
                                        B = B(xmlPullParser, j15);
                                        xmlPullParser2 = xmlPullParser;
                                        kVar2 = l0(xmlPullParser, (k.c) kVar2, arrayList3, j10, j7, j13, B, j11);
                                    } else {
                                        xmlPullParser2 = xmlPullParser;
                                        if (n0.f(xmlPullParser2, "InbandEventStream")) {
                                            arrayList9 = arrayList;
                                            arrayList9.add(I(xmlPullParser2, "InbandEventStream"));
                                        } else {
                                            arrayList9 = arrayList;
                                            if (n0.f(xmlPullParser2, "Label")) {
                                                str5 = V(xmlPullParser);
                                            } else if (n0.e(xmlPullParser)) {
                                                z(xmlPullParser);
                                            }
                                        }
                                    }
                                }
                                j15 = B;
                                arrayList9 = arrayList;
                            }
                            if (!n0.d(xmlPullParser2, "AdaptationSet")) {
                                break;
                            }
                            arrayList11 = arrayList9;
                            arrayList16 = arrayList8;
                            arrayList17 = arrayList2;
                            arrayList15 = arrayList3;
                            j14 = j13;
                            arrayList14 = arrayList4;
                            arrayList13 = arrayList5;
                            arrayList12 = arrayList6;
                            arrayList10 = arrayList7;
                            str3 = str;
                            i8 = i7;
                            str4 = str2;
                            dVar = this;
                        }
                        obj = null;
                        j13 = j14;
                        arrayList2 = arrayList17;
                        arrayList3 = arrayList15;
                        arrayList4 = arrayList14;
                        arrayList5 = arrayList13;
                        arrayList6 = arrayList12;
                        arrayList7 = arrayList10;
                        str = str3;
                        i7 = i10;
                        str2 = str7;
                        arrayList9 = arrayList;
                        j15 = j12;
                        arrayList8 = arrayList16;
                        if (!n0.d(xmlPullParser2, "AdaptationSet")) {
                        }
                    }
                    j15 = j12;
                    if (!n0.d(xmlPullParser2, "AdaptationSet")) {
                    }
                }
            }
            j15 = j12;
            j13 = j14;
            arrayList8 = arrayList16;
            arrayList4 = arrayList14;
            arrayList5 = arrayList13;
            arrayList6 = arrayList12;
            arrayList7 = arrayList10;
            str = str3;
            arrayList9 = arrayList;
            i7 = i8;
            str2 = str4;
            obj = null;
            arrayList2 = arrayList17;
            arrayList3 = arrayList15;
            if (!n0.d(xmlPullParser2, "AdaptationSet")) {
            }
        }
        ArrayList arrayList18 = new ArrayList(arrayList8.size());
        for (int i11 = 0; i11 < arrayList8.size(); i11++) {
            arrayList18.add(j((a) arrayList8.get(i11), str5, str6, arrayList7, arrayList9));
        }
        return c(U, i7, arrayList18, arrayList6, arrayList4, arrayList3);
    }

    protected void z(XmlPullParser xmlPullParser) {
        w(xmlPullParser);
    }
}
