package r0;

import T.C0097o;
import Y.z;
import a.AbstractC0124a;
import d2.C0389g;
import i2.AbstractC0457a;

/* loaded from: classes.dex */
public final class l extends AbstractC1395f {

    /* renamed from: j, reason: collision with root package name */
    public final C1394e f15179j;

    /* renamed from: k, reason: collision with root package name */
    public C0389g f15180k;

    /* renamed from: l, reason: collision with root package name */
    public long f15181l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f15182m;

    public l(Y.h hVar, Y.k kVar, C0097o c0097o, int i4, Object obj, C1394e c1394e) {
        super(hVar, kVar, 2, c0097o, i4, obj, -9223372036854775807L, -9223372036854775807L);
        this.f15179j = c1394e;
    }

    @Override // u0.k
    public final void c() {
        if (this.f15181l == 0) {
            this.f15179j.b(this.f15180k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            Y.k a3 = this.f15139b.a(this.f15181l);
            z zVar = this.f15146i;
            y0.k kVar = new y0.k(zVar, a3.f3705e, zVar.b(a3));
            while (!this.f15182m) {
                try {
                    int c4 = this.f15179j.f15128a.c(kVar, C1394e.f15127k);
                    boolean z = false;
                    AbstractC0124a.t(c4 != 1);
                    if (c4 == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.f15181l = kVar.f16169d - this.f15139b.f3705e;
                    this.f15179j.a();
                }
            }
        } finally {
            AbstractC0457a.f(this.f15146i);
        }
    }

    @Override // u0.k
    public final void d() {
        this.f15182m = true;
    }
}
