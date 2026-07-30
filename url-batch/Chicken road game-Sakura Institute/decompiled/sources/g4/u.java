package g4;

import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.q1;
import d0.x3;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public static final u f4394g = new u(0);

    /* renamed from: h, reason: collision with root package name */
    public static final u f4395h = new u(1);

    /* renamed from: i, reason: collision with root package name */
    public static final u f4396i = new u(2);

    /* renamed from: j, reason: collision with root package name */
    public static final u f4397j = new u(3);

    /* renamed from: k, reason: collision with root package name */
    public static final u f4398k = new u(4);

    /* renamed from: l, reason: collision with root package name */
    public static final u f4399l = new u(5);

    /* renamed from: m, reason: collision with root package name */
    public static final u f4400m = new u(6);

    /* renamed from: n, reason: collision with root package name */
    public static final u f4401n = new u(7);

    /* renamed from: o, reason: collision with root package name */
    public static final u f4402o = new u(8);

    /* renamed from: p, reason: collision with root package name */
    public static final u f4403p = new u(9);

    /* renamed from: q, reason: collision with root package name */
    public static final u f4404q = new u(10);

    /* renamed from: r, reason: collision with root package name */
    public static final u f4405r = new u(11);

    /* renamed from: s, reason: collision with root package name */
    public static final u f4406s = new u(12);

    /* renamed from: t, reason: collision with root package name */
    public static final u f4407t = new u(13);

    /* renamed from: u, reason: collision with root package name */
    public static final u f4408u = new u(14);

    /* renamed from: v, reason: collision with root package name */
    public static final u f4409v = new u(15);

    /* renamed from: w, reason: collision with root package name */
    public static final u f4410w = new u(16);

    /* renamed from: x, reason: collision with root package name */
    public static final u f4411x = new u(17);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4412f;

    public /* synthetic */ u(int i7) {
        this.f4412f = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7 = this.f4412f;
        d6.z zVar = d6.z.f2639a;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar.x()) {
                    x3.b("Choose a meal", null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar, 6, 0, 131070);
                    break;
                } else {
                    pVar.L();
                    break;
                }
            case 1:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar2.x()) {
                    x3.b("Name", null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar2, 6, 0, 131070);
                    break;
                } else {
                    pVar2.L();
                    break;
                }
            case 2:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar3.x()) {
                    x3.b("Category", null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar3, 6, 0, 131070);
                    break;
                } else {
                    pVar3.L();
                    break;
                }
            case 3:
                g0.p pVar4 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar4.x()) {
                    x3.b("Ingredients (comma-separated)", null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar4, 6, 0, 131070);
                    break;
                } else {
                    pVar4.L();
                    break;
                }
            case 4:
                g0.p pVar5 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar5.x()) {
                    x3.b("Notes", null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar5, 6, 0, 131070);
                    break;
                } else {
                    pVar5.L();
                    break;
                }
            case 5:
                g0.p pVar6 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar6.x()) {
                    x3.b(u3.q.j(R.string.title_grocery, pVar6), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar6, 0, 0, 131070);
                    break;
                } else {
                    pVar6.L();
                    break;
                }
            case 6:
                g0.p pVar7 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar7.x()) {
                    q1.b(r4.a.C(), u3.q.j(R.string.action_add, pVar7), null, 0L, pVar7, 0);
                    break;
                } else {
                    pVar7.L();
                    break;
                }
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                g0.p pVar8 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar8.x()) {
                    f1.f fVar = a.a.f0a;
                    if (fVar == null) {
                        f1.e eVar = new f1.e("Outlined.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = f1.i0.f3188a;
                        z0.r0 r0Var = new z0.r0(z0.u.f10052b);
                        f1.g gVar = new f1.g(0);
                        gVar.n(19.0f, 6.41f);
                        gVar.k(17.59f, 5.0f);
                        gVar.k(12.0f, 10.59f);
                        gVar.k(6.41f, 5.0f);
                        gVar.k(5.0f, 6.41f);
                        gVar.k(10.59f, 12.0f);
                        gVar.k(5.0f, 17.59f);
                        gVar.k(6.41f, 19.0f);
                        gVar.k(12.0f, 13.41f);
                        gVar.k(17.59f, 19.0f);
                        gVar.k(19.0f, 17.59f);
                        gVar.k(13.41f, 12.0f);
                        gVar.k(19.0f, 6.41f);
                        gVar.e();
                        f1.e.a(eVar, gVar.f3153f, r0Var);
                        fVar = eVar.b();
                        a.a.f0a = fVar;
                    }
                    q1.b(fVar, u3.q.j(R.string.action_delete, pVar8), null, 0L, pVar8, 0);
                    break;
                } else {
                    pVar8.L();
                    break;
                }
                break;
            case 8:
                g0.p pVar9 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar9.x()) {
                    x3.b("Add item", null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar9, 6, 0, 131070);
                    break;
                } else {
                    pVar9.L();
                    break;
                }
                break;
            case q.c.f7259c /* 9 */:
                g0.p pVar10 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar10.x()) {
                    x3.b("Item", null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar10, 6, 0, 131070);
                    break;
                } else {
                    pVar10.L();
                    break;
                }
                break;
            case q.c.f7261e /* 10 */:
                g0.p pVar11 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar11.x()) {
                    x3.b(u3.q.j(R.string.title_meals, pVar11), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar11, 0, 0, 131070);
                    break;
                } else {
                    pVar11.L();
                    break;
                }
            case 11:
                g0.p pVar12 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar12.x()) {
                    d0.v.a(x.f4435a, null, null, null, 0.0f, null, null, pVar12, 6, 254);
                    break;
                } else {
                    pVar12.L();
                    break;
                }
            case 12:
                g0.p pVar13 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar13.x()) {
                    q1.b(r4.a.C(), u3.q.j(R.string.action_add, pVar13), null, 0L, pVar13, 0);
                    break;
                } else {
                    pVar13.L();
                    break;
                }
            case 13:
                g0.p pVar14 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar14.x()) {
                    f1.f fVar2 = a8.d.f547i;
                    if (fVar2 == null) {
                        f1.e eVar2 = new f1.e("Outlined.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i9 = f1.i0.f3188a;
                        z0.r0 r0Var2 = new z0.r0(z0.u.f10052b);
                        f1.g gVar2 = new f1.g(0);
                        gVar2.n(16.0f, 9.0f);
                        gVar2.s(10.0f);
                        gVar2.i(8.0f);
                        gVar2.r(9.0f);
                        gVar2.j(8.0f);
                        f1.w wVar = new f1.w(-1.5f, -6.0f);
                        ArrayList arrayList = gVar2.f3153f;
                        arrayList.add(wVar);
                        gVar2.j(-5.0f);
                        gVar2.m(-1.0f, 1.0f);
                        gVar2.i(5.0f);
                        gVar2.s(2.0f);
                        gVar2.j(14.0f);
                        gVar2.r(4.0f);
                        gVar2.j(-3.5f);
                        gVar2.m(-1.0f, -1.0f);
                        gVar2.e();
                        gVar2.n(18.0f, 7.0f);
                        gVar2.i(6.0f);
                        gVar2.s(12.0f);
                        gVar2.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar2.j(8.0f);
                        gVar2.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar2.r(7.0f);
                        gVar2.e();
                        f1.e.a(eVar2, arrayList, r0Var2);
                        fVar2 = eVar2.b();
                        a8.d.f547i = fVar2;
                    }
                    q1.b(fVar2, u3.q.j(R.string.action_delete, pVar14), null, 0L, pVar14, 0);
                    break;
                } else {
                    pVar14.L();
                    break;
                }
                break;
            case 14:
                g0.p pVar15 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar15.x()) {
                    x3.b(u3.q.j(R.string.title_overview, pVar15), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar15, 0, 0, 131070);
                    break;
                } else {
                    pVar15.L();
                    break;
                }
            case q.c.f7263g /* 15 */:
                g0.p pVar16 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar16.x()) {
                    d0.v.a(y.f4443a, null, null, null, 0.0f, null, null, pVar16, 6, 254);
                    break;
                } else {
                    pVar16.L();
                    break;
                }
                break;
            case 16:
                g0.p pVar17 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar17.x()) {
                    x3.b(u3.q.j(R.string.title_planner, pVar17), null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, pVar17, 0, 0, 131070);
                    break;
                } else {
                    pVar17.L();
                    break;
                }
            default:
                g0.p pVar18 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar18.x()) {
                    d0.v.a(z.f4449a, null, null, null, 0.0f, null, null, pVar18, 6, 254);
                    break;
                } else {
                    pVar18.L();
                    break;
                }
                break;
        }
        return zVar;
    }
}
