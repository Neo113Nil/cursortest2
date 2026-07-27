package z;

import A0.C0031b;
import A0.L;
import A0.t;
import a.AbstractC0345a;
import kotlin.jvm.internal.Intrinsics;
import m3.u;
import u3.l;
import w.M;
import z2.C1405I;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1350e {

    /* renamed from: a, reason: collision with root package name */
    public String f11722a;

    /* renamed from: b, reason: collision with root package name */
    public L f11723b;

    /* renamed from: c, reason: collision with root package name */
    public F0.d f11724c;

    /* renamed from: d, reason: collision with root package name */
    public int f11725d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11726e;

    /* renamed from: f, reason: collision with root package name */
    public int f11727f;

    /* renamed from: g, reason: collision with root package name */
    public int f11728g;

    /* renamed from: i, reason: collision with root package name */
    public M0.b f11730i;

    /* renamed from: j, reason: collision with root package name */
    public C0031b f11731j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11732k;

    /* renamed from: m, reason: collision with root package name */
    public C1347b f11734m;

    /* renamed from: n, reason: collision with root package name */
    public t f11735n;

    /* renamed from: o, reason: collision with root package name */
    public M0.k f11736o;

    /* renamed from: h, reason: collision with root package name */
    public long f11729h = AbstractC1346a.f11694a;

    /* renamed from: l, reason: collision with root package name */
    public long f11733l = u3.d.c(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f11737p = u3.d.t(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f11738q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f11739r = -1;

    public C1350e(String str, L l4, F0.d dVar, int i2, boolean z4, int i4, int i5) {
        this.f11722a = str;
        this.f11723b = l4;
        this.f11724c = dVar;
        this.f11725d = i2;
        this.f11726e = z4;
        this.f11727f = i4;
        this.f11728g = i5;
    }

    public final int a(int i2, M0.k kVar) {
        int i4 = this.f11738q;
        int i5 = this.f11739r;
        if (i2 == i4 && i4 != -1) {
            return i5;
        }
        int k4 = M.k(b(u3.d.a(0, i2, 0, Integer.MAX_VALUE), kVar).b());
        this.f11738q = i2;
        this.f11739r = k4;
        return k4;
    }

    public final C0031b b(long j4, M0.k kVar) {
        int i2;
        t d4 = d(kVar);
        long g4 = u.g(j4, this.f11726e, this.f11725d, d4.c());
        boolean z4 = this.f11726e;
        int i4 = this.f11725d;
        int i5 = this.f11727f;
        if (z4 || !l.b0(i4, 2)) {
            if (i5 < 1) {
                i5 = 1;
            }
            i2 = i5;
        } else {
            i2 = 1;
        }
        return new C0031b((I0.c) d4, i2, l.b0(this.f11725d, 2), g4);
    }

    public final void c(M0.b bVar) {
        long j4;
        M0.b bVar2 = this.f11730i;
        if (bVar != null) {
            int i2 = AbstractC1346a.f11695b;
            j4 = AbstractC1346a.a(bVar.e(), bVar.q());
        } else {
            j4 = AbstractC1346a.f11694a;
        }
        if (bVar2 == null) {
            this.f11730i = bVar;
            this.f11729h = j4;
            return;
        }
        if (bVar == null || this.f11729h != j4) {
            this.f11730i = bVar;
            this.f11729h = j4;
            this.f11731j = null;
            this.f11735n = null;
            this.f11736o = null;
            this.f11738q = -1;
            this.f11739r = -1;
            this.f11737p = u3.d.t(0, 0, 0, 0);
            this.f11733l = u3.d.c(0, 0);
            this.f11732k = false;
        }
    }

    public final t d(M0.k kVar) {
        t tVar = this.f11735n;
        if (tVar == null || kVar != this.f11736o || tVar.b()) {
            this.f11736o = kVar;
            String str = this.f11722a;
            L E3 = AbstractC0345a.E(this.f11723b, kVar);
            M0.b bVar = this.f11730i;
            Intrinsics.c(bVar);
            F0.d dVar = this.f11724c;
            C1405I c1405i = C1405I.f11931d;
            tVar = new I0.c(str, E3, c1405i, c1405i, dVar, bVar);
        }
        this.f11735n = tVar;
        return tVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f11731j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j4 = this.f11729h;
        int i2 = AbstractC1346a.f11695b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j4 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j4 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
