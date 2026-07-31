package b2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import b2.a;
import e1.l;
import e1.p;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import n2.j0;
import o2.m0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r0.n2;
import r0.s1;
import v0.m;

/* loaded from: classes.dex */
public class b implements j0.a<b2.a> {

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f1656a;

    private static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f1657a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1658b;

        /* renamed from: c, reason: collision with root package name */
        private final a f1659c;

        /* renamed from: d, reason: collision with root package name */
        private final List<Pair<String, Object>> f1660d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f1659c = aVar;
            this.f1657a = str;
            this.f1658b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        protected void a(Object obj) {
        }

        protected abstract Object b();

        protected final Object c(String str) {
            for (int i7 = 0; i7 < this.f1660d.size(); i7++) {
                Pair<String, Object> pair = this.f1660d.get(i7);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f1659c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z6 = false;
            int i7 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f1658b.equals(name)) {
                        n(xmlPullParser);
                        z6 = true;
                    } else if (z6) {
                        if (i7 > 0) {
                            i7++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e7 = e(this, name, this.f1657a);
                            if (e7 == null) {
                                i7 = 1;
                            } else {
                                a(e7.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z6 && i7 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z6) {
                    continue;
                } else if (i7 > 0) {
                    i7--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z6) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z6;
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i7) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i7;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e7) {
                throw n2.c(null, e7);
            }
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j7) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j7;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e7) {
                throw n2.c(null, e7);
            }
        }

        protected final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0038b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e7) {
                throw n2.c(null, e7);
            }
        }

        protected final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0038b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e7) {
                throw n2.c(null, e7);
            }
        }

        protected final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0038b(str);
        }

        protected abstract void n(XmlPullParser xmlPullParser);

        protected void o(XmlPullParser xmlPullParser) {
        }

        protected final void p(String str, Object obj) {
            this.f1660d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: b2.b$b, reason: collision with other inner class name */
    public static class C0038b extends n2 {
        public C0038b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    private static class c extends a {

        /* renamed from: e, reason: collision with root package name */
        private boolean f1661e;

        /* renamed from: f, reason: collision with root package name */
        private UUID f1662f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f1663g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i7 = 0; i7 < bArr.length; i7 += 2) {
                sb.append((char) bArr[i7]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i7, int i8) {
            byte b7 = bArr[i7];
            bArr[i7] = bArr[i8];
            bArr[i8] = b7;
        }

        @Override // b2.b.a
        public Object b() {
            UUID uuid = this.f1662f;
            return new a.C0037a(uuid, l.a(uuid, this.f1663g), q(this.f1663g));
        }

        @Override // b2.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // b2.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f1661e = false;
            }
        }

        @Override // b2.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f1661e = true;
                this.f1662f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // b2.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f1661e) {
                this.f1663g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    private static class d extends a {

        /* renamed from: e, reason: collision with root package name */
        private s1 f1664e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] J = m0.J(str);
                byte[][] i7 = o2.e.i(J);
                if (i7 == null) {
                    arrayList.add(J);
                } else {
                    Collections.addAll(arrayList, i7);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // b2.b.a
        public Object b() {
            return this.f1664e;
        }

        @Override // b2.b.a
        public void n(XmlPullParser xmlPullParser) {
            s1.b bVar = new s1.b();
            String r7 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.K("video/mp4").j0(k(xmlPullParser, "MaxWidth")).Q(k(xmlPullParser, "MaxHeight")).T(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r7 == null) {
                    r7 = "audio/mp4a-latm";
                }
                int k7 = k(xmlPullParser, "Channels");
                int k8 = k(xmlPullParser, "SamplingRate");
                List<byte[]> q7 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q7.isEmpty() && "audio/mp4a-latm".equals(r7)) {
                    q7 = Collections.singletonList(t0.a.a(k8, k7));
                }
                bVar.K("audio/mp4").H(k7).f0(k8).T(q7);
            } else if (intValue == 3) {
                int i7 = 0;
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i7 = 64;
                    } else if (str.equals("DESC")) {
                        i7 = 1024;
                    }
                }
                bVar.K("application/mp4").c0(i7);
            } else {
                bVar.K("application/mp4");
            }
            this.f1664e = bVar.S(xmlPullParser.getAttributeValue(null, "Index")).U((String) c("Name")).e0(r7).G(k(xmlPullParser, "Bitrate")).V((String) c("Language")).E();
        }
    }

    private static class e extends a {

        /* renamed from: e, reason: collision with root package name */
        private final List<a.b> f1665e;

        /* renamed from: f, reason: collision with root package name */
        private int f1666f;

        /* renamed from: g, reason: collision with root package name */
        private int f1667g;

        /* renamed from: h, reason: collision with root package name */
        private long f1668h;

        /* renamed from: i, reason: collision with root package name */
        private long f1669i;

        /* renamed from: j, reason: collision with root package name */
        private long f1670j;

        /* renamed from: k, reason: collision with root package name */
        private int f1671k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f1672l;

        /* renamed from: m, reason: collision with root package name */
        private a.C0037a f1673m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f1671k = -1;
            this.f1673m = null;
            this.f1665e = new LinkedList();
        }

        @Override // b2.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f1665e.add((a.b) obj);
            } else if (obj instanceof a.C0037a) {
                o2.a.f(this.f1673m == null);
                this.f1673m = (a.C0037a) obj;
            }
        }

        @Override // b2.b.a
        public Object b() {
            int size = this.f1665e.size();
            a.b[] bVarArr = new a.b[size];
            this.f1665e.toArray(bVarArr);
            if (this.f1673m != null) {
                a.C0037a c0037a = this.f1673m;
                m mVar = new m(new m.b(c0037a.f1637a, "video/mp4", c0037a.f1638b));
                for (int i7 = 0; i7 < size; i7++) {
                    a.b bVar = bVarArr[i7];
                    int i8 = bVar.f1640a;
                    if (i8 == 2 || i8 == 1) {
                        s1[] s1VarArr = bVar.f1649j;
                        for (int i9 = 0; i9 < s1VarArr.length; i9++) {
                            s1VarArr[i9] = s1VarArr[i9].b().M(mVar).E();
                        }
                    }
                }
            }
            return new b2.a(this.f1666f, this.f1667g, this.f1668h, this.f1669i, this.f1670j, this.f1671k, this.f1672l, this.f1673m, bVarArr);
        }

        @Override // b2.b.a
        public void n(XmlPullParser xmlPullParser) {
            this.f1666f = k(xmlPullParser, "MajorVersion");
            this.f1667g = k(xmlPullParser, "MinorVersion");
            this.f1668h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f1669i = l(xmlPullParser, "Duration");
            this.f1670j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f1671k = i(xmlPullParser, "LookaheadCount", -1);
            this.f1672l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f1668h));
        }
    }

    private static class f extends a {

        /* renamed from: e, reason: collision with root package name */
        private final String f1674e;

        /* renamed from: f, reason: collision with root package name */
        private final List<s1> f1675f;

        /* renamed from: g, reason: collision with root package name */
        private int f1676g;

        /* renamed from: h, reason: collision with root package name */
        private String f1677h;

        /* renamed from: i, reason: collision with root package name */
        private long f1678i;

        /* renamed from: j, reason: collision with root package name */
        private String f1679j;

        /* renamed from: k, reason: collision with root package name */
        private String f1680k;

        /* renamed from: l, reason: collision with root package name */
        private int f1681l;

        /* renamed from: m, reason: collision with root package name */
        private int f1682m;

        /* renamed from: n, reason: collision with root package name */
        private int f1683n;

        /* renamed from: o, reason: collision with root package name */
        private int f1684o;

        /* renamed from: p, reason: collision with root package name */
        private String f1685p;

        /* renamed from: q, reason: collision with root package name */
        private ArrayList<Long> f1686q;

        /* renamed from: r, reason: collision with root package name */
        private long f1687r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f1674e = str;
            this.f1675f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) {
            int s7 = s(xmlPullParser);
            this.f1676g = s7;
            p("Type", Integer.valueOf(s7));
            this.f1677h = this.f1676g == 3 ? m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            p("Subtype", this.f1677h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f1679j = attributeValue;
            p("Name", attributeValue);
            this.f1680k = m(xmlPullParser, "Url");
            this.f1681l = i(xmlPullParser, "MaxWidth", -1);
            this.f1682m = i(xmlPullParser, "MaxHeight", -1);
            this.f1683n = i(xmlPullParser, "DisplayWidth", -1);
            this.f1684o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f1685p = attributeValue2;
            p("Language", attributeValue2);
            long i7 = i(xmlPullParser, "TimeScale", -1);
            this.f1678i = i7;
            if (i7 == -1) {
                this.f1678i = ((Long) c("TimeScale")).longValue();
            }
            this.f1686q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) {
            int size = this.f1686q.size();
            long j7 = j(xmlPullParser, "t", -9223372036854775807L);
            int i7 = 1;
            if (j7 == -9223372036854775807L) {
                if (size == 0) {
                    j7 = 0;
                } else {
                    if (this.f1687r == -1) {
                        throw n2.c("Unable to infer start time", null);
                    }
                    j7 = this.f1686q.get(size - 1).longValue() + this.f1687r;
                }
            }
            this.f1686q.add(Long.valueOf(j7));
            this.f1687r = j(xmlPullParser, "d", -9223372036854775807L);
            long j8 = j(xmlPullParser, "r", 1L);
            if (j8 > 1 && this.f1687r == -9223372036854775807L) {
                throw n2.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j9 = i7;
                if (j9 >= j8) {
                    return;
                }
                this.f1686q.add(Long.valueOf((this.f1687r * j9) + j7));
                i7++;
            }
        }

        private int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C0038b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw n2.c("Invalid key value[" + attributeValue + "]", null);
        }

        @Override // b2.b.a
        public void a(Object obj) {
            if (obj instanceof s1) {
                this.f1675f.add((s1) obj);
            }
        }

        @Override // b2.b.a
        public Object b() {
            s1[] s1VarArr = new s1[this.f1675f.size()];
            this.f1675f.toArray(s1VarArr);
            return new a.b(this.f1674e, this.f1680k, this.f1676g, this.f1677h, this.f1678i, this.f1679j, this.f1681l, this.f1682m, this.f1683n, this.f1684o, this.f1685p, s1VarArr, this.f1686q, this.f1687r);
        }

        @Override // b2.b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // b2.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public b() {
        try {
            this.f1656a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    @Override // n2.j0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b2.a a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f1656a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (b2.a) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e7) {
            throw n2.c(null, e7);
        }
    }
}
