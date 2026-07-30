package com.chicken.road.whale.store;

import f7.f;
import h6.d;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface PlanDao {
    Object all(d dVar);

    Object clearForMeal(long j8, d dVar);

    Object clearSlot(int i7, String str, d dVar);

    Object insert(PlanEntry planEntry, d dVar);

    f observeAll();
}
