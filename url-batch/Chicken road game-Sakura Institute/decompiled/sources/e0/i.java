package e0;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import g0.d2;
import g0.e1;
import g0.g1;
import g0.z0;
import l.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2688g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f2689h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2690i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(float f9, z0 z0Var) {
        super(1);
        this.f2689h = f9;
        this.f2690i = z0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f2688g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long j8 = ((y0.f) obj).f9792a;
                float d8 = y0.f.d(j8);
                float f9 = this.f2689h;
                float f10 = d8 * f9;
                float b9 = y0.f.b(j8) * f9;
                z0 z0Var = (z0) this.f2690i;
                if (y0.f.d(((y0.f) z0Var.getValue()).f9792a) != f10 || y0.f.b(((y0.f) z0Var.getValue()).f9792a) != b9) {
                    z0Var.setValue(new y0.f(v0.d.a(f10, b9)));
                }
                break;
            default:
                long longValue = ((Number) obj).longValue();
                p1 p1Var = (p1) this.f2690i;
                boolean g9 = p1Var.g();
                e1 e1Var = p1Var.f5616g;
                if (!g9) {
                    if (((d2) q0.n.t(e1Var.f3719g, e1Var)).f3715c == Long.MIN_VALUE) {
                        e1Var.e(longValue);
                        ((g1) p1Var.f5610a.f5679a).setValue(Boolean.TRUE);
                    }
                    long j9 = longValue - ((d2) q0.n.t(e1Var.f3719g, e1Var)).f3715c;
                    float f11 = this.f2689h;
                    if (f11 != 0.0f) {
                        j9 = t6.a.P(j9 / f11);
                    }
                    p1Var.o(j9);
                    p1Var.h(j9, f11 == 0.0f);
                }
                break;
        }
        return z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p1 p1Var, float f9) {
        super(1);
        this.f2690i = p1Var;
        this.f2689h = f9;
    }
}
