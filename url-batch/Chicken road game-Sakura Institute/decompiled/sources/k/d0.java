package k;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5191g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5192h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5193i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5194j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5195k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, long j8, long j9, Object obj2, int i7) {
        super(1);
        this.f5191g = i7;
        this.f5194j = obj;
        this.f5192h = j8;
        this.f5193i = j9;
        this.f5195k = obj2;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5191g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1.m0 m0Var = (p1.m0) obj;
                p1.n0 n0Var = (p1.n0) this.f5194j;
                long j8 = this.f5192h;
                long j9 = this.f5193i;
                c.h hVar = (c.h) this.f5195k;
                m0Var.getClass();
                long c4 = a8.m.c(((int) (j8 >> 32)) + ((int) (j9 >> 32)), ((int) (j8 & 4294967295L)) + ((int) (j9 & 4294967295L)));
                p1.m0.a(m0Var, n0Var);
                n0Var.j0(m2.h.c(c4, n0Var.f7067j), 0.0f, hVar);
                break;
            default:
                r1.f0 f0Var = (r1.f0) obj;
                f0Var.b();
                z0.p pVar = (z0.p) this.f5194j;
                b1.f fVar = (b1.f) this.f5195k;
                long j10 = (104 & 2) != 0 ? 0L : this.f5192h;
                long n02 = (104 & 4) != 0 ? b1.e.n0(f0Var.f7767f.d(), j10) : this.f5193i;
                float f9 = (104 & 8) != 0 ? 1.0f : 0.0f;
                if ((104 & 16) != 0) {
                    fVar = b1.h.f1238a;
                }
                b1.c cVar = f0Var.f7767f;
                cVar.f1233f.f1227c.g(y0.c.d(j10), y0.c.e(j10), y0.f.d(n02) + y0.c.d(j10), y0.f.b(n02) + y0.c.e(j10), cVar.c(pVar, fVar, f9, null, 3, 1));
                break;
        }
        return d6.z.f2639a;
    }
}
