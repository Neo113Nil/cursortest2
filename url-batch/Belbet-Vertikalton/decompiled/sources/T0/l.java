package T0;

import b1.EnumC0098a;
import com.winpower.neonfit.FoodLogActivity;
import com.winpower.neonfit.data.FoodEntry;
import com.winpower.neonfit.data.NutritionRepository;

/* loaded from: classes.dex */
public final class l extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FoodLogActivity f1177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FoodEntry f1178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(FoodLogActivity foodLogActivity, FoodEntry foodEntry, a1.d dVar) {
        super(dVar);
        this.f1177c = foodLogActivity;
        this.f1178d = foodEntry;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        return new l(this.f1177c, this.f1178d, dVar);
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        return ((l) create((r1.r) obj, (a1.d) obj2)).invokeSuspend(W0.i.f1345a);
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        EnumC0098a enumC0098a = EnumC0098a.f2223a;
        int i = this.f1176b;
        if (i == 0) {
            H1.d.i0(obj);
            NutritionRepository nutritionRepository = (NutritionRepository) this.f1177c.f2601z.a();
            this.f1176b = 1;
            if (nutritionRepository.deleteFood(this.f1178d, this) == enumC0098a) {
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
