package T0;

import android.content.Intent;
import b1.EnumC0098a;
import com.winpower.neonfit.AddFoodActivity;
import com.winpower.neonfit.TargetCrashActivity;
import com.winpower.neonfit.data.DailyTotals;
import com.winpower.neonfit.data.FoodEntry;
import com.winpower.neonfit.data.NutritionRepository;

/* loaded from: classes.dex */
public final class c extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddFoodActivity f1154c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1155d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f1156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f1157g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f1158h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddFoodActivity addFoodActivity, String str, int i, float f2, float f3, float f4, a1.d dVar) {
        super(dVar);
        this.f1154c = addFoodActivity;
        this.f1155d = str;
        this.e = i;
        this.f1156f = f2;
        this.f1157g = f3;
        this.f1158h = f4;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        return new c(this.f1154c, this.f1155d, this.e, this.f1156f, this.f1157g, this.f1158h, dVar);
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        return ((c) create((r1.r) obj, (a1.d) obj2)).invokeSuspend(W0.i.f1345a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    @Override // c1.AbstractC0104a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object todayTotals;
        EnumC0098a enumC0098a = EnumC0098a.f2223a;
        int i = this.f1153b;
        AddFoodActivity addFoodActivity = this.f1154c;
        if (i == 0) {
            H1.d.i0(obj);
            NutritionRepository nutritionRepository = (NutritionRepository) addFoodActivity.f2595z.a();
            long currentTimeMillis = System.currentTimeMillis();
            FoodEntry foodEntry = new FoodEntry(0L, this.f1155d, this.e, this.f1156f, this.f1157g, this.f1158h, currentTimeMillis, 1, null);
            this.f1153b = 1;
            if (nutritionRepository.insertFood(foodEntry, this) == enumC0098a) {
                return enumC0098a;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                H1.d.i0(obj);
                todayTotals = obj;
                if (((NutritionRepository) addFoodActivity.f2595z.a()).shouldCelebrateCrash(((DailyTotals) todayTotals).getCalories())) {
                    addFoodActivity.finish();
                } else {
                    ((NutritionRepository) addFoodActivity.f2595z.a()).markCrashShown();
                    addFoodActivity.startActivity(new Intent(addFoodActivity, (Class<?>) TargetCrashActivity.class));
                    addFoodActivity.finish();
                }
                return W0.i.f1345a;
            }
            H1.d.i0(obj);
        }
        NutritionRepository nutritionRepository2 = (NutritionRepository) addFoodActivity.f2595z.a();
        this.f1153b = 2;
        todayTotals = nutritionRepository2.getTodayTotals(this);
        if (todayTotals == enumC0098a) {
            return enumC0098a;
        }
        if (((NutritionRepository) addFoodActivity.f2595z.a()).shouldCelebrateCrash(((DailyTotals) todayTotals).getCalories())) {
        }
        return W0.i.f1345a;
    }
}
