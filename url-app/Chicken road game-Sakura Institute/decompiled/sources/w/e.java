package w;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final e f9209h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f9210i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f9211j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f9212k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f9213l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f9214m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f9215n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f9216o;

    /* renamed from: p, reason: collision with root package name */
    public static final e f9217p;

    /* renamed from: q, reason: collision with root package name */
    public static final e f9218q;

    /* renamed from: r, reason: collision with root package name */
    public static final e f9219r;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9220g;

    static {
        int i7 = 1;
        f9209h = new e(i7, 0);
        f9210i = new e(i7, 1);
        f9211j = new e(i7, 2);
        f9212k = new e(i7, 3);
        f9213l = new e(i7, 4);
        f9214m = new e(i7, 5);
        f9215n = new e(i7, 6);
        f9216o = new e(i7, 7);
        f9217p = new e(i7, 8);
        f9218q = new e(i7, 9);
        f9219r = new e(i7, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i8) {
        super(i7);
        this.f9220g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f9220g;
        d6.z zVar = d6.z.f2639a;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return zVar;
            case 1:
                return zVar;
            case 2:
                return zVar;
            case 3:
                return zVar;
            case 4:
                a0.t0 t0Var = (a0.t0) obj;
                long j8 = t0Var.f151f;
                int i8 = a2.j0.f407c;
                return new g2.g(((int) (j8 & 4294967295L)) - g0.p(t0Var.f152g.f373f, (int) (j8 & 4294967295L)), 0);
            case 5:
                a0.t0 t0Var2 = (a0.t0) obj;
                String str = t0Var2.f152g.f373f;
                long j9 = t0Var2.f151f;
                int i9 = a2.j0.f407c;
                int m8 = g0.m(str, (int) (j9 & 4294967295L));
                if (m8 != -1) {
                    return new g2.g(0, m8 - ((int) (4294967295L & t0Var2.f151f)));
                }
                return null;
            case 6:
                a0.t0 t0Var3 = (a0.t0) obj;
                Integer d8 = t0Var3.d();
                if (d8 == null) {
                    return null;
                }
                int intValue = d8.intValue();
                long j10 = t0Var3.f151f;
                int i10 = a2.j0.f407c;
                return new g2.g(((int) (4294967295L & j10)) - intValue, 0);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                a0.t0 t0Var4 = (a0.t0) obj;
                Integer c4 = t0Var4.c();
                if (c4 == null) {
                    return null;
                }
                int intValue2 = c4.intValue();
                long j11 = t0Var4.f151f;
                int i11 = a2.j0.f407c;
                return new g2.g(0, intValue2 - ((int) (4294967295L & j11)));
            case 8:
                a0.t0 t0Var5 = (a0.t0) obj;
                g2.q qVar = t0Var5.f149d;
                a2.h0 h0Var = t0Var5.f148c;
                Integer valueOf = h0Var != null ? Integer.valueOf(qVar.a(h0Var.h(h0Var.e(qVar.b(a2.j0.e(t0Var5.f151f)))))) : null;
                if (valueOf == null) {
                    return null;
                }
                int intValue3 = valueOf.intValue();
                long j12 = t0Var5.f151f;
                int i12 = a2.j0.f407c;
                return new g2.g(((int) (4294967295L & j12)) - intValue3, 0);
            case q.c.f7259c /* 9 */:
                a0.t0 t0Var6 = (a0.t0) obj;
                Integer b9 = t0Var6.b();
                if (b9 == null) {
                    return null;
                }
                int intValue4 = b9.intValue();
                long j13 = t0Var6.f151f;
                int i13 = a2.j0.f407c;
                return new g2.g(0, intValue4 - ((int) (4294967295L & j13)));
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                r6.k.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                o.j0 j0Var = ((Boolean) obj2).booleanValue() ? o.j0.f6657f : o.j0.f6658g;
                Object obj3 = list.get(0);
                r6.k.d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new x0(j0Var, ((Float) obj3).floatValue());
        }
    }
}
