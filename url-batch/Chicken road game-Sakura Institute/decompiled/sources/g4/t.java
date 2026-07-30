package g4;

import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.x3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public static final t f4379g = new t(0);

    /* renamed from: h, reason: collision with root package name */
    public static final t f4380h = new t(1);

    /* renamed from: i, reason: collision with root package name */
    public static final t f4381i = new t(2);

    /* renamed from: j, reason: collision with root package name */
    public static final t f4382j = new t(3);

    /* renamed from: k, reason: collision with root package name */
    public static final t f4383k = new t(4);

    /* renamed from: l, reason: collision with root package name */
    public static final t f4384l = new t(5);

    /* renamed from: m, reason: collision with root package name */
    public static final t f4385m = new t(6);

    /* renamed from: n, reason: collision with root package name */
    public static final t f4386n = new t(7);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4387f;

    public /* synthetic */ t(int i7) {
        this.f4387f = i7;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f4387f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj2;
                int intValue = ((Number) obj3).intValue();
                r6.k.f((q.n0) obj, "$this$TextButton");
                if ((intValue & 17) == 16 && pVar.x()) {
                    pVar.L();
                } else {
                    x3.b(u3.q.j(R.string.action_clear, pVar), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar, 0, 0, 131070);
                }
                break;
            case 1:
                g0.p pVar2 = (g0.p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                r6.k.f((q.n0) obj, "$this$TextButton");
                if ((intValue2 & 17) == 16 && pVar2.x()) {
                    pVar2.L();
                } else {
                    x3.b(u3.q.j(R.string.action_cancel, pVar2), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar2, 0, 0, 131070);
                }
                break;
            case 2:
                g0.p pVar3 = (g0.p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                r6.k.f((q.n0) obj, "$this$TextButton");
                if ((intValue3 & 17) == 16 && pVar3.x()) {
                    pVar3.L();
                } else {
                    x3.b(u3.q.j(R.string.action_save, pVar3), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar3, 0, 0, 131070);
                }
                break;
            case 3:
                g0.p pVar4 = (g0.p) obj2;
                int intValue4 = ((Number) obj3).intValue();
                r6.k.f((q.n0) obj, "$this$TextButton");
                if ((intValue4 & 17) == 16 && pVar4.x()) {
                    pVar4.L();
                } else {
                    x3.b(u3.q.j(R.string.action_cancel, pVar4), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar4, 0, 0, 131070);
                }
                break;
            case 4:
                g0.p pVar5 = (g0.p) obj2;
                int intValue5 = ((Number) obj3).intValue();
                r6.k.f((q.n0) obj, "$this$TextButton");
                if ((intValue5 & 17) == 16 && pVar5.x()) {
                    pVar5.L();
                } else {
                    x3.b(u3.q.j(R.string.grocery_build, pVar5), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar5, 0, 0, 131070);
                }
                break;
            case 5:
                g0.p pVar6 = (g0.p) obj2;
                int intValue6 = ((Number) obj3).intValue();
                r6.k.f((q.n0) obj, "$this$TextButton");
                if ((intValue6 & 17) == 16 && pVar6.x()) {
                    pVar6.L();
                } else {
                    x3.b(u3.q.j(R.string.grocery_clear_done, pVar6), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar6, 0, 0, 131070);
                }
                break;
            case 6:
                g0.p pVar7 = (g0.p) obj2;
                int intValue7 = ((Number) obj3).intValue();
                r6.k.f((q.n0) obj, "$this$TextButton");
                if ((intValue7 & 17) == 16 && pVar7.x()) {
                    pVar7.L();
                } else {
                    x3.b(u3.q.j(R.string.action_add, pVar7), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar7, 0, 0, 131070);
                }
                break;
            default:
                g0.p pVar8 = (g0.p) obj2;
                int intValue8 = ((Number) obj3).intValue();
                r6.k.f((q.n0) obj, "$this$TextButton");
                if ((intValue8 & 17) == 16 && pVar8.x()) {
                    pVar8.L();
                } else {
                    x3.b(u3.q.j(R.string.action_cancel, pVar8), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar8, 0, 0, 131070);
                }
                break;
        }
        return d6.z.f2639a;
    }
}
