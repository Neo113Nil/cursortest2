package g4;

import com.chicken.road.whale.store.GroceryItem;
import com.chicken.road.whale.store.Meal;
import com.chicken.road.whale.store.PlanEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 extends j6.i implements q6.g {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ List f4422g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ List f4423h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ List f4424i;

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        d6.a.e(obj);
        List list = this.f4422g;
        List list2 = this.f4423h;
        List list3 = this.f4424i;
        int h02 = e6.d0.h0(e6.n.a0(list, 10));
        if (h02 < 16) {
            h02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h02);
        for (Object obj2 : list) {
            linkedHashMap.put(new Long(((Meal) obj2).getId()), obj2);
        }
        List t02 = e6.l.t0(e6.c0.k0(a.a.s(new b6.c(19, list))), new u0());
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Meal meal = (Meal) linkedHashMap.get(new Long(((PlanEntry) it.next()).getMealId()));
            String name = meal != null ? meal.getName() : null;
            if (name != null) {
                arrayList.add(name);
            }
        }
        Iterator it2 = e6.c0.k0(a.a.s(new f1.g(arrayList))).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((d6.j) next).f2619g).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue2 = ((Number) ((d6.j) next2).f2619g).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        d6.j jVar = (d6.j) next;
        int size = list.size();
        int size2 = list2.size();
        int size3 = i1.f4315a.size() * i1.f4316b.size();
        int i7 = 0;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                if (!((GroceryItem) it3.next()).getChecked() && (i7 = i7 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return new t0(size, size2, size3, i7, t02, jVar != null ? (String) jVar.f2618f : null);
    }

    @Override // q6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        v0 v0Var = new v0(4, (h6.d) obj4);
        v0Var.f4422g = (List) obj;
        v0Var.f4423h = (List) obj2;
        v0Var.f4424i = (List) obj3;
        return v0Var.invokeSuspend(d6.z.f2639a);
    }
}
