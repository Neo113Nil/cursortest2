package com.chicken.road.whale.store;

import f7.f;
import h6.d;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface MealDao {
    Object byId(long j8, d dVar);

    Object delete(Meal meal, d dVar);

    Object insert(Meal meal, d dVar);

    f observeAll();

    Object update(Meal meal, d dVar);
}
