package d0;

import T.C0097o;
import W.J;
import q0.b0;

/* loaded from: classes.dex */
public final class m implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0097o f8182a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f8184c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8185d;

    /* renamed from: e, reason: collision with root package name */
    public e0.g f8186e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8187f;

    /* renamed from: g, reason: collision with root package name */
    public int f8188g;

    /* renamed from: b, reason: collision with root package name */
    public final l2.e f8183b = new l2.e(8);

    /* renamed from: h, reason: collision with root package name */
    public long f8189h = -9223372036854775807L;

    public m(e0.g gVar, C0097o c0097o, boolean z) {
        this.f8182a = c0097o;
        this.f8186e = gVar;
        this.f8184c = gVar.f8375b;
        b(gVar, z);
    }

    public final void b(e0.g gVar, boolean z) {
        int i4 = this.f8188g;
        long j4 = -9223372036854775807L;
        long j5 = i4 == 0 ? -9223372036854775807L : this.f8184c[i4 - 1];
        this.f8185d = z;
        this.f8186e = gVar;
        long[] jArr = gVar.f8375b;
        this.f8184c = jArr;
        long j6 = this.f8189h;
        if (j6 == -9223372036854775807L) {
            if (j5 != -9223372036854775807L) {
                this.f8188g = J.b(jArr, j5, false);
            }
        } else {
            int b4 = J.b(jArr, j6, true);
            this.f8188g = b4;
            if (this.f8185d && b4 == this.f8184c.length) {
                j4 = j6;
            }
            this.f8189h = j4;
        }
    }

    @Override // q0.b0
    public final boolean isReady() {
        return true;
    }

    @Override // q0.b0
    public final int k(long j4) {
        int max = Math.max(this.f8188g, J.b(this.f8184c, j4, true));
        int i4 = max - this.f8188g;
        this.f8188g = max;
        return i4;
    }

    @Override // q0.b0
    public final int n(l2.e eVar, Z.f fVar, int i4) {
        int i5 = this.f8188g;
        boolean z = i5 == this.f8184c.length;
        if (z && !this.f8185d) {
            fVar.f3496b = 4;
            return -4;
        }
        if ((i4 & 2) != 0 || !this.f8187f) {
            eVar.f14271c = this.f8182a;
            this.f8187f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i4 & 1) == 0) {
            this.f8188g = i5 + 1;
        }
        if ((i4 & 4) == 0) {
            byte[] o = this.f8183b.o(this.f8186e.f8374a[i5]);
            fVar.j(o.length);
            fVar.f3781e.put(o);
        }
        fVar.f3783g = this.f8184c[i5];
        fVar.f3496b = 1;
        return -4;
    }

    @Override // q0.b0
    public final void a() {
    }
}
