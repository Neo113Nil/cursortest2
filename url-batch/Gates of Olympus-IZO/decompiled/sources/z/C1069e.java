package z;

import B0.C;
import B0.C0004a;
import B0.n;
import I2.l;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069e {

    /* renamed from: a, reason: collision with root package name */
    public String f8891a;

    /* renamed from: b, reason: collision with root package name */
    public C f8892b;

    /* renamed from: c, reason: collision with root package name */
    public F0.e f8893c;

    /* renamed from: d, reason: collision with root package name */
    public int f8894d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8895e;

    /* renamed from: f, reason: collision with root package name */
    public int f8896f;

    /* renamed from: g, reason: collision with root package name */
    public int f8897g;

    /* renamed from: i, reason: collision with root package name */
    public M0.b f8899i;

    /* renamed from: j, reason: collision with root package name */
    public C0004a f8900j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8901k;

    /* renamed from: m, reason: collision with root package name */
    public C1066b f8903m;

    /* renamed from: n, reason: collision with root package name */
    public n f8904n;

    /* renamed from: o, reason: collision with root package name */
    public M0.j f8905o;

    /* renamed from: h, reason: collision with root package name */
    public long f8898h = AbstractC1065a.f8865a;

    /* renamed from: l, reason: collision with root package name */
    public long f8902l = l.e(0, 0);
    public long p = l.s(0, 0, 0, 0);

    public C1069e(String str, C c3, F0.e eVar, int i3, boolean z3, int i4, int i5) {
        this.f8891a = str;
        this.f8892b = c3;
        this.f8893c = eVar;
        this.f8894d = i3;
        this.f8895e = z3;
        this.f8896f = i4;
        this.f8897g = i5;
    }

    public final void a(M0.b bVar) {
        long j3;
        M0.b bVar2 = this.f8899i;
        if (bVar != null) {
            int i3 = AbstractC1065a.f8866b;
            j3 = AbstractC1065a.a(bVar.a(), bVar.p());
        } else {
            j3 = AbstractC1065a.f8865a;
        }
        if (bVar2 == null) {
            this.f8899i = bVar;
            this.f8898h = j3;
            return;
        }
        if (bVar == null || this.f8898h != j3) {
            this.f8899i = bVar;
            this.f8898h = j3;
            this.f8900j = null;
            this.f8904n = null;
            this.f8905o = null;
            this.p = l.s(0, 0, 0, 0);
            this.f8902l = l.e(0, 0);
            this.f8901k = false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f8900j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j3 = this.f8898h;
        int i3 = AbstractC1065a.f8866b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j3 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j3 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
