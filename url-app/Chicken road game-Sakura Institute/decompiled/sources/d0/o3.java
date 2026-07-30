package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class o3 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.n2 f2267a = new g0.n2(r0.f2352p);

    public static final z0.p0 a(int i7, g0.p pVar) {
        n3 n3Var = (n3) pVar.k(f2267a);
        switch (l.h.d(i7)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return n3Var.f2231e;
            case 1:
                return b(n3Var.f2231e);
            case 2:
                return n3Var.f2227a;
            case 3:
                return b(n3Var.f2227a);
            case 4:
                return v.e.f9097a;
            case 5:
                return n3Var.f2230d;
            case 6:
                v.d dVar = n3Var.f2230d;
                float f9 = (float) 0.0d;
                return v.d.a(dVar, new v.b(f9), null, new v.b(f9), 6);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return b(n3Var.f2230d);
            case 8:
                return n3Var.f2229c;
            case q.c.f7259c /* 9 */:
                return z0.l0.f10006a;
            case q.c.f7261e /* 10 */:
                return n3Var.f2228b;
            default:
                throw new b4.c();
        }
    }

    public static final v.d b(v.d dVar) {
        float f9 = (float) 0.0d;
        return v.d.a(dVar, null, new v.b(f9), new v.b(f9), 3);
    }
}
