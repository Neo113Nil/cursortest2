package g4;

import com.chicken.road.whale.store.MealRepository;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 extends androidx.lifecycle.w0 {

    /* renamed from: b, reason: collision with root package name */
    public final MealRepository f4364b;

    /* renamed from: c, reason: collision with root package name */
    public final f7.z f4365c;

    public q0(MealRepository mealRepository) {
        r6.k.f(mealRepository, "repo");
        this.f4364b = mealRepository;
        this.f4365c = f7.f0.m(mealRepository.getMeals(), androidx.lifecycle.q0.j(this), f7.j0.a(2), e6.u.f2826f);
    }
}
