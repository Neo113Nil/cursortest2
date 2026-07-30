package f1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0 f3128h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i7) {
        super(1);
        this.f3127g = i7;
        this.f3128h = f0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [q6.a, r6.l] */
    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f3127g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f0 f0Var = this.f3128h;
                f0Var.f3143d = true;
                f0Var.f3145f.a();
                return d6.z.f2639a;
            default:
                b1.e eVar = (b1.e) obj;
                f0 f0Var2 = this.f3128h;
                c cVar = f0Var2.f3141b;
                float f9 = f0Var2.f3150k;
                float f10 = f0Var2.f3151l;
                b1.b B = eVar.B();
                long p6 = B.p();
                B.k().o();
                try {
                    ((b6.c) B.f1230g).y(f9, f10, 0L);
                    cVar.a(eVar);
                    a0.m.s(B, p6);
                    return d6.z.f2639a;
                } catch (Throwable th) {
                    a0.m.s(B, p6);
                    throw th;
                }
        }
    }
}
