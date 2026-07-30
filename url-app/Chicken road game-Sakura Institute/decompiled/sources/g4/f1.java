package g4;

import com.chicken.road.whale.store.MealRepository;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f1 extends androidx.lifecycle.w0 {

    /* renamed from: b, reason: collision with root package name */
    public final MealRepository f4289b;

    /* renamed from: c, reason: collision with root package name */
    public final f7.z f4290c;

    public f1(MealRepository mealRepository) {
        r6.k.f(mealRepository, "repo");
        this.f4289b = mealRepository;
        this.f4290c = f7.f0.m(new f7.v(mealRepository.getMeals(), mealRepository.getPlanEntries(), new e1(3, null)), androidx.lifecycle.q0.j(this), f7.j0.a(2), new b1(e6.u.f2826f, e6.v.f2827f));
    }
}
