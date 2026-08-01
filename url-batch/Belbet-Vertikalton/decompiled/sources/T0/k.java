package T0;

import b1.EnumC0098a;
import com.winpower.neonfit.FoodLogActivity;
import com.winpower.neonfit.data.NutritionRepository;

/* loaded from: classes.dex */
public final class k extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FoodLogActivity f1175c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FoodLogActivity foodLogActivity, a1.d dVar) {
        super(dVar);
        this.f1175c = foodLogActivity;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        return new k(this.f1175c, dVar);
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        return ((k) create((r1.r) obj, (a1.d) obj2)).invokeSuspend(W0.i.f1345a);
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        EnumC0098a enumC0098a = EnumC0098a.f2223a;
        int i = this.f1174b;
        if (i == 0) {
            H1.d.i0(obj);
            FoodLogActivity foodLogActivity = this.f1175c;
            u1.b observeTodayEntries = ((NutritionRepository) foodLogActivity.f2601z.a()).observeTodayEntries();
            g gVar = new g(foodLogActivity, 1);
            this.f1174b = 1;
            if (observeTodayEntries.collect(gVar, this) == enumC0098a) {
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
