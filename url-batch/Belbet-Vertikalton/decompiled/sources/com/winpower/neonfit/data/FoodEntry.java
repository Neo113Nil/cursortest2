package com.winpower.neonfit.data;

import j1.e;
import j1.h;

/* loaded from: classes.dex */
public final class FoodEntry {
    private final int calories;
    private final float carbs;
    private final float fat;
    private final long id;
    private final long loggedAt;
    private final String name;
    private final float protein;

    public FoodEntry(long j, String str, int i, float f2, float f3, float f4, long j2) {
        h.e(str, "name");
        this.id = j;
        this.name = str;
        this.calories = i;
        this.protein = f2;
        this.fat = f3;
        this.carbs = f4;
        this.loggedAt = j2;
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.calories;
    }

    public final float component4() {
        return this.protein;
    }

    public final float component5() {
        return this.fat;
    }

    public final float component6() {
        return this.carbs;
    }

    public final long component7() {
        return this.loggedAt;
    }

    public final FoodEntry copy(long j, String str, int i, float f2, float f3, float f4, long j2) {
        h.e(str, "name");
        return new FoodEntry(j, str, i, f2, f3, f4, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoodEntry)) {
            return false;
        }
        FoodEntry foodEntry = (FoodEntry) obj;
        return this.id == foodEntry.id && h.a(this.name, foodEntry.name) && this.calories == foodEntry.calories && Float.compare(this.protein, foodEntry.protein) == 0 && Float.compare(this.fat, foodEntry.fat) == 0 && Float.compare(this.carbs, foodEntry.carbs) == 0 && this.loggedAt == foodEntry.loggedAt;
    }

    public final int getCalories() {
        return this.calories;
    }

    public final float getCarbs() {
        return this.carbs;
    }

    public final float getFat() {
        return this.fat;
    }

    public final long getId() {
        return this.id;
    }

    public final long getLoggedAt() {
        return this.loggedAt;
    }

    public final String getName() {
        return this.name;
    }

    public final float getProtein() {
        return this.protein;
    }

    public int hashCode() {
        return Long.hashCode(this.loggedAt) + ((Float.hashCode(this.carbs) + ((Float.hashCode(this.fat) + ((Float.hashCode(this.protein) + ((Integer.hashCode(this.calories) + ((this.name.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "FoodEntry(id=" + this.id + ", name=" + this.name + ", calories=" + this.calories + ", protein=" + this.protein + ", fat=" + this.fat + ", carbs=" + this.carbs + ", loggedAt=" + this.loggedAt + ")";
    }

    public /* synthetic */ FoodEntry(long j, String str, int i, float f2, float f3, float f4, long j2, int i2, e eVar) {
        this((i2 & 1) != 0 ? 0L : j, str, i, f2, f3, f4, j2);
    }
}
