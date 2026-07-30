package e4;

import com.chicken.road.whale.App;
import com.chicken.road.whale.store.MealRepository;
import com.chicken.road.whale.store.PlanDatabase;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final MealRepository f2747a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2748b;

    public b(App app) {
        PlanDatabase build = PlanDatabase.Companion.build(app);
        this.f2747a = new MealRepository(build.mealDao(), build.planDao(), build.groceryDao());
        this.f2748b = new a(this);
    }
}
