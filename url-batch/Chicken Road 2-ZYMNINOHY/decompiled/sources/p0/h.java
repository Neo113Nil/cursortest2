package p0;

import T.C0097o;
import T.G;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: e, reason: collision with root package name */
    public final String f14713e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f14714f;

    /* renamed from: g, reason: collision with root package name */
    public int f14715g;

    /* renamed from: h, reason: collision with root package name */
    public String f14716h;

    /* renamed from: i, reason: collision with root package name */
    public long f14717i;

    /* renamed from: j, reason: collision with root package name */
    public String f14718j;

    /* renamed from: k, reason: collision with root package name */
    public String f14719k;

    /* renamed from: l, reason: collision with root package name */
    public int f14720l;

    /* renamed from: m, reason: collision with root package name */
    public int f14721m;
    public int n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public String f14722p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f14723q;

    /* renamed from: r, reason: collision with root package name */
    public long f14724r;

    public h(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f14713e = str;
        this.f14714f = new LinkedList();
    }

    @Override // p0.d
    public final void a(Object obj) {
        if (obj instanceof C0097o) {
            this.f14714f.add((C0097o) obj);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 p0.b, still in use, count: 2, list:
          (r3v0 p0.b) from 0x0082: MOVE (r26v0 p0.b) = (r3v0 p0.b) (LINE:131)
          (r3v0 p0.b) from 0x004e: MOVE (r26v4 p0.b) = (r3v0 p0.b) (LINE:79)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p0.d
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.h.b():java.lang.Object");
    }

    @Override // p0.d
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // p0.d
    public final void j(XmlPullParser xmlPullParser) {
        int i4 = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new E0.d("Type", 1);
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i4 = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw G.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i4 = 3;
                }
            }
            this.f14715g = i4;
            l(Integer.valueOf(i4), "Type");
            if (this.f14715g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new E0.d("Subtype", 1);
                }
                this.f14716h = attributeValue2;
            } else {
                this.f14716h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.f14716h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f14718j = attributeValue3;
            l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new E0.d("Url", 1);
            }
            this.f14719k = attributeValue4;
            this.f14720l = d.g(xmlPullParser, "MaxWidth");
            this.f14721m = d.g(xmlPullParser, "MaxHeight");
            this.n = d.g(xmlPullParser, "DisplayWidth");
            this.o = d.g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f14722p = attributeValue5;
            l(attributeValue5, "Language");
            long g4 = d.g(xmlPullParser, "TimeScale");
            this.f14717i = g4;
            if (g4 == -1) {
                this.f14717i = ((Long) c("TimeScale")).longValue();
            }
            this.f14723q = new ArrayList();
            return;
        }
        int size = this.f14723q.size();
        long h2 = d.h(xmlPullParser, "t", -9223372036854775807L);
        if (h2 == -9223372036854775807L) {
            if (size == 0) {
                h2 = 0;
            } else {
                if (this.f14724r == -1) {
                    throw G.b("Unable to infer start time", null);
                }
                h2 = this.f14724r + ((Long) this.f14723q.get(size - 1)).longValue();
            }
        }
        this.f14723q.add(Long.valueOf(h2));
        this.f14724r = d.h(xmlPullParser, "d", -9223372036854775807L);
        long h4 = d.h(xmlPullParser, "r", 1L);
        if (h4 > 1 && this.f14724r == -9223372036854775807L) {
            throw G.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j4 = i4;
            if (j4 >= h4) {
                return;
            }
            this.f14723q.add(Long.valueOf((this.f14724r * j4) + h2));
            i4++;
        }
    }
}
