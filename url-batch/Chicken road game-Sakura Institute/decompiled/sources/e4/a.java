package e4;

import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.chicken.road.whale.store.MealRepository;
import g4.f1;
import g4.j0;
import g4.q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f2746a;

    public a(b bVar) {
        this.f2746a = bVar;
    }

    @Override // androidx.lifecycle.y0
    public final w0 a(Class cls) {
        MealRepository mealRepository = this.f2746a.f2747a;
        if (cls.isAssignableFrom(f1.class)) {
            return new f1(mealRepository);
        }
        if (cls.isAssignableFrom(q0.class)) {
            return new q0(mealRepository);
        }
        if (cls.isAssignableFrom(j0.class)) {
            return new j0(mealRepository);
        }
        if (cls.isAssignableFrom(g4.w0.class)) {
            return new g4.w0(mealRepository);
        }
        throw new IllegalArgumentException("Unknown ViewModel: ".concat(cls.getName()));
    }
}
