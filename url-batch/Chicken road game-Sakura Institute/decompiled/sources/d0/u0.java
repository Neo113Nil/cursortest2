package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 extends r6.l implements q6.e {

    /* renamed from: h, reason: collision with root package name */
    public static final u0 f2445h;

    /* renamed from: i, reason: collision with root package name */
    public static final u0 f2446i;

    /* renamed from: j, reason: collision with root package name */
    public static final u0 f2447j;

    /* renamed from: k, reason: collision with root package name */
    public static final u0 f2448k;

    /* renamed from: l, reason: collision with root package name */
    public static final u0 f2449l;

    /* renamed from: m, reason: collision with root package name */
    public static final u0 f2450m;

    /* renamed from: n, reason: collision with root package name */
    public static final u0 f2451n;

    /* renamed from: o, reason: collision with root package name */
    public static final u0 f2452o;

    /* renamed from: p, reason: collision with root package name */
    public static final u0 f2453p;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2454g;

    static {
        int i7 = 2;
        f2445h = new u0(i7, 0);
        f2446i = new u0(i7, 1);
        f2447j = new u0(i7, 2);
        f2448k = new u0(i7, 3);
        f2449l = new u0(i7, 4);
        f2450m = new u0(i7, 5);
        f2451n = new u0(i7, 6);
        f2452o = new u0(i7, 7);
        f2453p = new u0(i7, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i7, int i8) {
        super(i7);
        this.f2454g = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2454g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                }
                return d6.z.f2639a;
            case 1:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                }
                return d6.z.f2639a;
            case 2:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar3.x()) {
                    pVar3.L();
                }
                return d6.z.f2639a;
            case 3:
                g0.p pVar4 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar4.x()) {
                    pVar4.L();
                }
                return d6.z.f2639a;
            case 4:
                g0.p pVar5 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar5.x()) {
                    pVar5.L();
                }
                return d6.z.f2639a;
            case 5:
                return Integer.valueOf(((p1.e0) obj).c(((Number) obj2).intValue()));
            case 6:
                return Integer.valueOf(((p1.e0) obj).d0(((Number) obj2).intValue()));
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(((p1.e0) obj).e0(((Number) obj2).intValue()));
            default:
                return Integer.valueOf(((p1.e0) obj).a0(((Number) obj2).intValue()));
        }
    }
}
