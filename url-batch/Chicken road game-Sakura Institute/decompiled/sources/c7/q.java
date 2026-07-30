package c7;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1730f;

    public /* synthetic */ q(int i7) {
        this.f1730f = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f1730f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((h6.i) obj).z((h6.g) obj2);
            case 2:
                return ((h6.i) obj).z((h6.g) obj2);
            case 3:
                ((Integer) obj2).getClass();
                t6.a.a(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case 4:
                ((Integer) obj2).getClass();
                a.a.a(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case 5:
                ((Integer) obj2).getClass();
                a8.m.b(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case 6:
                ((Integer) obj2).getClass();
                j1.c.H(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                r4.a.g(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case 8:
                ((Integer) obj2).getClass();
                t6.a.g(g0.d.T(1), (g0.p) obj);
                return d6.z.f2639a;
            case q.c.f7259c /* 9 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case q.c.f7261e /* 10 */:
                h6.g gVar = (h6.g) obj2;
                if (!(gVar instanceof o1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 11:
                o1 o1Var = (o1) obj;
                h6.g gVar2 = (h6.g) obj2;
                if (o1Var != null) {
                    return o1Var;
                }
                if (gVar2 instanceof o1) {
                    return (o1) gVar2;
                }
                return null;
            default:
                return (h7.v) obj;
        }
    }

    public /* synthetic */ q(int i7, int i8) {
        this.f1730f = i8;
    }
}
