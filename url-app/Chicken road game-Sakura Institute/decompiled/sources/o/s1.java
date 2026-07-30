package o;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s1 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6735g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f6736h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6737i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6738j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(float f9, z0.h hVar, z0.m mVar) {
        super(1);
        this.f6736h = f9;
        this.f6737i = hVar;
        this.f6738j = mVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f6735g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long longValue = ((Number) obj).longValue();
                t1 t1Var = (t1) this.f6737i;
                if (t1Var.f6749b == Long.MIN_VALUE) {
                    t1Var.f6749b = longValue;
                }
                float f9 = t1Var.f6752e;
                l.m mVar = new l.m(f9);
                float f10 = this.f6736h;
                l.m mVar2 = t1.f6747f;
                long b9 = f10 == 0.0f ? t1Var.f6748a.b(new l.m(f9), mVar2, t1Var.f6750c) : t6.a.P((longValue - t1Var.f6749b) / f10);
                float f11 = ((l.m) t1Var.f6748a.e(b9, mVar, mVar2, t1Var.f6750c)).f5569a;
                t1Var.f6750c = (l.m) t1Var.f6748a.f(b9, mVar, mVar2, t1Var.f6750c);
                t1Var.f6749b = longValue;
                float f12 = t1Var.f6752e - f11;
                t1Var.f6752e = f11;
                ((q6.c) this.f6738j).f(Float.valueOf(f12));
                return d6.z.f2639a;
            default:
                r1.f0 f0Var = (r1.f0) obj;
                f0Var.b();
                float f13 = this.f6736h;
                z0.h hVar = (z0.h) this.f6737i;
                z0.m mVar3 = (z0.m) this.f6738j;
                b1.c cVar = f0Var.f7767f;
                b1.b bVar = cVar.f1234g;
                long p6 = bVar.p();
                bVar.k().o();
                try {
                    b6.c cVar2 = (b6.c) bVar.f1230g;
                    cVar2.B(f13, 0.0f);
                    z0.r k8 = ((b1.b) cVar2.f1394g).k();
                    k8.k(y0.c.d(0L), y0.c.e(0L));
                    k8.l();
                    k8.k(-y0.c.d(0L), -y0.c.e(0L));
                    cVar.e(hVar, mVar3);
                    a0.m.s(bVar, p6);
                    return d6.z.f2639a;
                } catch (Throwable th) {
                    a0.m.s(bVar, p6);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, float f9, q6.c cVar) {
        super(1);
        this.f6737i = t1Var;
        this.f6736h = f9;
        this.f6738j = cVar;
    }
}
