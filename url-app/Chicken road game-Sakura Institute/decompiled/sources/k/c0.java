package k;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5184g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f5185h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(p1.n0 n0Var, int i7) {
        super(1);
        this.f5184g = i7;
        this.f5185h = n0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5184g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1.m0.d((p1.m0) obj, this.f5185h, 0, 0);
                break;
            case 1:
                p1.m0.d((p1.m0) obj, this.f5185h, 0, 0);
                break;
            case 2:
                p1.m0.g((p1.m0) obj, this.f5185h, 0, 0);
                break;
            case 3:
                p1.m0.f((p1.m0) obj, this.f5185h, 0, 0);
                break;
            case 4:
                p1.m0.f((p1.m0) obj, this.f5185h, 0, 0);
                break;
            case 5:
                p1.m0 m0Var = (p1.m0) obj;
                m2.k b9 = m0Var.b();
                m2.k kVar = m2.k.f6322f;
                p1.n0 n0Var = this.f5185h;
                if (b9 == kVar || m0Var.c() == 0) {
                    p1.m0.a(m0Var, n0Var);
                    n0Var.j0(m2.h.c(0L, n0Var.f7067j), 0.0f, null);
                } else {
                    int i7 = (int) 0;
                    long c4 = a8.m.c((m0Var.c() - n0Var.f7063f) - i7, i7);
                    p1.m0.a(m0Var, n0Var);
                    n0Var.j0(m2.h.c(c4, n0Var.f7067j), 0.0f, null);
                }
                break;
            case 6:
                p1.m0.f((p1.m0) obj, this.f5185h, 0, 0);
                break;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                p1.m0.f((p1.m0) obj, this.f5185h, 0, 0);
                break;
            case 8:
                p1.m0.f((p1.m0) obj, this.f5185h, 0, 0);
                break;
            case q.c.f7259c /* 9 */:
                p1.m0.f((p1.m0) obj, this.f5185h, 0, 0);
                break;
            default:
                p1.m0.d((p1.m0) obj, this.f5185h, 0, 0);
                break;
        }
        return d6.z.f2639a;
    }
}
