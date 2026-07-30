package l;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f5623h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(x0 x0Var, int i7) {
        super(1);
        this.f5622g = i7;
        this.f5623h = x0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5622g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long longValue = ((Number) obj).longValue();
                x0 x0Var = this.f5623h;
                long j8 = longValue - x0Var.f5716l;
                x0Var.f5716l = longValue;
                long P = t6.a.P(j8 / x0Var.f5720p);
                i.v vVar = x0Var.f5717m;
                int i7 = vVar.f4805b;
                if (i7 != 0) {
                    Object[] objArr = vVar.f4804a;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        p0 p0Var = (p0) objArr[i9];
                        x0.g(x0Var, p0Var, P);
                        p0Var.f5604c = true;
                    }
                    p1 p1Var = x0Var.f5709e;
                    if (p1Var != null) {
                        p1Var.p();
                    }
                    int i10 = vVar.f4805b;
                    Object[] objArr2 = vVar.f4804a;
                    w6.d o2 = v1.g.o(0, i10);
                    int i11 = o2.f9521f;
                    int i12 = o2.f9522g;
                    if (i11 <= i12) {
                        while (true) {
                            objArr2[i11 - i8] = objArr2[i11];
                            if (((p0) objArr2[i11]).f5604c) {
                                i8++;
                            }
                            if (i11 != i12) {
                                i11++;
                            }
                        }
                    }
                    e6.k.c0(i10 - i8, i10, null, objArr2);
                    vVar.f4805b -= i8;
                }
                p0 p0Var2 = x0Var.f5718n;
                if (p0Var2 != null) {
                    p0Var2.f5608g = x0Var.f5710f;
                    x0.g(x0Var, p0Var2, P);
                    x0Var.o(p0Var2.f5605d);
                    if (p0Var2.f5605d == 1.0f) {
                        x0Var.f5718n = null;
                    }
                    x0Var.n();
                }
                break;
            default:
                this.f5623h.f5716l = ((Number) obj).longValue();
                break;
        }
        return d6.z.f2639a;
    }
}
