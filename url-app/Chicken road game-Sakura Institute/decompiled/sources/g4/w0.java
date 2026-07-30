package g4;

import com.chicken.road.whale.store.MealRepository;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w0 extends androidx.lifecycle.w0 {

    /* renamed from: b, reason: collision with root package name */
    public final f7.z f4434b;

    public w0(MealRepository mealRepository) {
        r6.k.f(mealRepository, "repo");
        this.f4434b = f7.f0.m(new e0.e(new f7.f[]{mealRepository.getMeals(), mealRepository.getPlanEntries(), mealRepository.getGroceries()}, 4, new v0(4, null)), androidx.lifecycle.q0.j(this), f7.j0.a(2), new t0(0, 0, i1.f4315a.size() * i1.f4316b.size(), 0, e6.u.f2826f, null));
    }
}
