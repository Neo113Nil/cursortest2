package T0;

import b1.EnumC0098a;
import com.winpower.neonfit.SettingsActivity;
import com.winpower.neonfit.data.NutritionRepository;

/* loaded from: classes.dex */
public final class r extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f1193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SettingsActivity settingsActivity, a1.d dVar) {
        super(dVar);
        this.f1193c = settingsActivity;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        return new r(this.f1193c, dVar);
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        return ((r) create((r1.r) obj, (a1.d) obj2)).invokeSuspend(W0.i.f1345a);
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        EnumC0098a enumC0098a = EnumC0098a.f2223a;
        int i = this.f1192b;
        SettingsActivity settingsActivity = this.f1193c;
        if (i == 0) {
            H1.d.i0(obj);
            int i2 = SettingsActivity.f2610A;
            NutritionRepository nutritionRepository = (NutritionRepository) settingsActivity.f2612z.a();
            this.f1192b = 1;
            if (nutritionRepository.resetToday(this) == enumC0098a) {
                return enumC0098a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H1.d.i0(obj);
        }
        settingsActivity.finish();
        return W0.i.f1345a;
    }
}
