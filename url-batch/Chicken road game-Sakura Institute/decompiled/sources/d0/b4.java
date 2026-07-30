package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.n2 f1865a = new g0.n2(r0.f2355s);

    public static final a2.k0 a(int i7, g0.p pVar) {
        a4 a4Var = (a4) pVar.k(f1865a);
        switch (l.h.d(i7)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return a4Var.f1840j;
            case 1:
                return a4Var.f1841k;
            case 2:
                return a4Var.f1842l;
            case 3:
                return a4Var.f1831a;
            case 4:
                return a4Var.f1832b;
            case 5:
                return a4Var.f1833c;
            case 6:
                return a4Var.f1834d;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return a4Var.f1835e;
            case 8:
                return a4Var.f1836f;
            case q.c.f7259c /* 9 */:
                return a4Var.f1843m;
            case q.c.f7261e /* 10 */:
                return a4Var.f1844n;
            case 11:
                return a4Var.f1845o;
            case 12:
                return a4Var.f1837g;
            case 13:
                return a4Var.f1838h;
            case 14:
                return a4Var.f1839i;
            default:
                throw new b4.c();
        }
    }
}
