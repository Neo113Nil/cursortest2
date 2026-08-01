package com.winpower.neonfit.data;

import j1.e;

/* loaded from: classes.dex */
public final class DailyTotals {
    private final int calories;
    private final float carbs;
    private final float fat;
    private final float protein;

    public DailyTotals() {
        this(0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ DailyTotals copy$default(DailyTotals dailyTotals, int i, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dailyTotals.calories;
        }
        if ((i2 & 2) != 0) {
            f2 = dailyTotals.protein;
        }
        if ((i2 & 4) != 0) {
            f3 = dailyTotals.fat;
        }
        if ((i2 & 8) != 0) {
            f4 = dailyTotals.carbs;
        }
        return dailyTotals.copy(i, f2, f3, f4);
    }

    public final int component1() {
        return this.calories;
    }

    public final float component2() {
        return this.protein;
    }

    public final float component3() {
        return this.fat;
    }

    public final float component4() {
        return this.carbs;
    }

    public final DailyTotals copy(int i, float f2, float f3, float f4) {
        return new DailyTotals(i, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyTotals)) {
            return false;
        }
        DailyTotals dailyTotals = (DailyTotals) obj;
        return this.calories == dailyTotals.calories && Float.compare(this.protein, dailyTotals.protein) == 0 && Float.compare(this.fat, dailyTotals.fat) == 0 && Float.compare(this.carbs, dailyTotals.carbs) == 0;
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

    public final float getProtein() {
        return this.protein;
    }

    public int hashCode() {
        return Float.hashCode(this.carbs) + ((Float.hashCode(this.fat) + ((Float.hashCode(this.protein) + (Integer.hashCode(this.calories) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "DailyTotals(calories=" + this.calories + ", protein=" + this.protein + ", fat=" + this.fat + ", carbs=" + this.carbs + ")";
    }

    public DailyTotals(int i, float f2, float f3, float f4) {
        this.calories = i;
        this.protein = f2;
        this.fat = f3;
        this.carbs = f4;
    }

    public /* synthetic */ DailyTotals(int i, float f2, float f3, float f4, int i2, e eVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? 0.0f : f4);
    }
}
