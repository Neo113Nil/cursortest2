package com.winpower.neonfit.data;

import a1.d;
import u1.b;

/* loaded from: classes.dex */
public interface FoodDao {
    Object delete(FoodEntry foodEntry, d dVar);

    Object deleteEntriesBetween(long j, long j2, d dVar);

    Object getEntriesBetween(long j, long j2, d dVar);

    Object insert(FoodEntry foodEntry, d dVar);

    b observeEntriesBetween(long j, long j2);
}
