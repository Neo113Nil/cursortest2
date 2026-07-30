package g4;

import com.chicken.road.whale.store.Meal;
import com.chicken.road.whale.store.PlanEntry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 extends j6.i implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ List f4280g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ List f4281h;

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        e1 e1Var = new e1(3, (h6.d) obj3);
        e1Var.f4280g = (List) obj;
        e1Var.f4281h = (List) obj2;
        return e1Var.invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        d6.a.e(obj);
        List list = this.f4280g;
        List<PlanEntry> list2 = this.f4281h;
        int h02 = e6.d0.h0(e6.n.a0(list, 10));
        if (h02 < 16) {
            h02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h02);
        for (Object obj2 : list) {
            linkedHashMap.put(new Long(((Meal) obj2).getId()), obj2);
        }
        HashMap hashMap = new HashMap();
        for (PlanEntry planEntry : list2) {
            Meal meal = (Meal) linkedHashMap.get(new Long(planEntry.getMealId()));
            if (meal != null) {
                hashMap.put(planEntry.getDayIndex() + "|" + planEntry.getSlot(), meal);
            }
        }
        return new b1(list, hashMap);
    }
}
