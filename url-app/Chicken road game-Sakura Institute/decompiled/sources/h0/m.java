package h0;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.a2;
import g0.p1;
import g0.v1;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final m f4623d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f4624e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f4625f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f4626g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4627c;

    static {
        int i7 = 1;
        f4623d = new m(i7, 2, 0);
        int i8 = 1;
        f4624e = new m(i8, i8, 1);
        f4625f = new m(i7, 2, 2);
        int i9 = 1;
        f4626g = new m(i9, i9, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, int i8, int i9) {
        super(i7, i8);
        this.f4627c = i9;
    }

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        int i7;
        int i8;
        switch (this.f4627c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object a3 = ((q6.a) pVar.e(0)).a();
                g0.c cVar = (g0.c) pVar.e(1);
                pVar.d(0);
                cVar.getClass();
                a2Var.L(a2Var.c(cVar), a3);
                bVar.getClass();
                bVar.h(a3);
                break;
            case 1:
                g0.c cVar2 = (g0.c) pVar.e(0);
                int d8 = pVar.d(0);
                bVar.F();
                cVar2.getClass();
                Object w4 = a2Var.w(a2Var.c(cVar2));
                bVar.getClass();
                ((r1.d0) bVar.f1232i).x(d8, (r1.d0) w4);
                break;
            case 2:
                Object e9 = pVar.e(0);
                g0.c cVar3 = (g0.c) pVar.e(1);
                int d9 = pVar.d(0);
                if (e9 instanceof v1) {
                    ((ArrayList) tVar.f3892c).add(((v1) e9).f3952a);
                }
                int c4 = a2Var.c(cVar3);
                int g9 = a2Var.g(a2Var.F(c4, d9));
                Object[] objArr = a2Var.f3666c;
                Object obj = objArr[g9];
                objArr[g9] = e9;
                if (!(obj instanceof v1)) {
                    if (obj instanceof p1) {
                        ((p1) obj).d();
                        break;
                    }
                } else {
                    int o2 = a2Var.o() - a2Var.F(c4, d9);
                    v1 v1Var = (v1) obj;
                    g0.c cVar4 = v1Var.f3953b;
                    if (cVar4 == null || !cVar4.a()) {
                        i7 = -1;
                        i8 = -1;
                    } else {
                        i7 = a2Var.c(cVar4);
                        i8 = a2Var.o() - a2Var.f(a2Var.f3665b, a2Var.p(a2Var.q(i7) + i7));
                    }
                    tVar.h(v1Var.f3952a, o2, i7, i8);
                    break;
                }
                break;
            default:
                Object e10 = pVar.e(0);
                int d10 = pVar.d(0);
                if (e10 instanceof v1) {
                    ((ArrayList) tVar.f3892c).add(((v1) e10).f3952a);
                }
                int g10 = a2Var.g(a2Var.F(a2Var.f3683t, d10));
                Object[] objArr2 = a2Var.f3666c;
                Object obj2 = objArr2[g10];
                objArr2[g10] = e10;
                if (!(obj2 instanceof v1)) {
                    if (obj2 instanceof p1) {
                        ((p1) obj2).d();
                        break;
                    }
                } else {
                    tVar.h(((v1) obj2).f3952a, a2Var.o() - a2Var.F(a2Var.f3683t, d10), -1, -1);
                    break;
                }
                break;
        }
    }

    @Override // h0.c0
    public final String b(int i7) {
        switch (this.f4627c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i7 != 0) {
                    break;
                }
                break;
            case 1:
                if (i7 != 0) {
                    break;
                }
                break;
            case 2:
                if (i7 != 0) {
                    break;
                }
                break;
            default:
                if (i7 != 0) {
                    break;
                }
                break;
        }
        return super.b(i7);
    }

    @Override // h0.c0
    public final String c(int i7) {
        switch (this.f4627c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i7 != 0) {
                    if (i7 != 1) {
                        break;
                    }
                }
                break;
            case 1:
                if (i7 != 0) {
                    break;
                }
                break;
            case 2:
                if (i7 != 0) {
                    if (i7 != 1) {
                        break;
                    }
                }
                break;
            default:
                if (i7 != 0) {
                    break;
                }
                break;
        }
        return super.c(i7);
    }
}
