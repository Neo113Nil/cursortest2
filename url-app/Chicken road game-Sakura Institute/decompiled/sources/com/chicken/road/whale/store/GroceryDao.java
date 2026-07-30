package com.chicken.road.whale.store;

import f7.f;
import h6.d;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface GroceryDao {
    Object clearChecked(d dVar);

    Object clearGenerated(d dVar);

    Object delete(GroceryItem groceryItem, d dVar);

    Object insert(GroceryItem groceryItem, d dVar);

    Object names(d dVar);

    f observeAll();

    Object update(GroceryItem groceryItem, d dVar);
}
