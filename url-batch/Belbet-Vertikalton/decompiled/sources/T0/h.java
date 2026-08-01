package T0;

import b1.EnumC0098a;
import com.winpower.neonfit.DashboardActivity;
import com.winpower.neonfit.data.NutritionRepository;

/* loaded from: classes.dex */
public final class h extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1168b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f1169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DashboardActivity dashboardActivity, a1.d dVar) {
        super(dVar);
        this.f1169c = dashboardActivity;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        return new h(this.f1169c, dVar);
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        return ((h) create((r1.r) obj, (a1.d) obj2)).invokeSuspend(W0.i.f1345a);
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        EnumC0098a enumC0098a = EnumC0098a.f2223a;
        int i = this.f1168b;
        if (i == 0) {
            H1.d.i0(obj);
            int i2 = DashboardActivity.f2596A;
            DashboardActivity dashboardActivity = this.f1169c;
            u1.b observeTodayTotals = ((NutritionRepository) dashboardActivity.f2598z.a()).observeTodayTotals();
            g gVar = new g(dashboardActivity, 0);
            this.f1168b = 1;
            if (observeTodayTotals.collect(gVar, this) == enumC0098a) {
                return enumC0098a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H1.d.i0(obj);
        }
        return W0.i.f1345a;
    }
}
