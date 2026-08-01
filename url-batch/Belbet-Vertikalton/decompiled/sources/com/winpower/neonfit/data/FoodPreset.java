package com.winpower.neonfit.data;

import j1.h;

/* loaded from: classes.dex */
public final class FoodPreset {
    private final int calories;
    private final float carbs;
    private final float fat;
    private final String name;
    private final float protein;

    public FoodPreset(String str, int i, float f2, float f3, float f4) {
        h.e(str, "name");
        this.name = str;
        this.calories = i;
        this.protein = f2;
        this.fat = f3;
        this.carbs = f4;
    }

    public static /* synthetic */ FoodPreset copy$default(FoodPreset foodPreset, String str, int i, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = foodPreset.name;
        }
        if ((i2 & 2) != 0) {
            i = foodPreset.calories;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            f2 = foodPreset.protein;
        }
        float f5 = f2;
        if ((i2 & 8) != 0) {
            f3 = foodPreset.fat;
        }
        float f6 = f3;
        if ((i2 & 16) != 0) {
            f4 = foodPreset.carbs;
        }
        return foodPreset.copy(str, i3, f5, f6, f4);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.calories;
    }

    public final float component3() {
        return this.protein;
    }

    public final float component4() {
        return this.fat;
    }

    public final float component5() {
        return this.carbs;
    }

    public final FoodPreset copy(String str, int i, float f2, float f3, float f4) {
        h.e(str, "name");
        return new FoodPreset(str, i, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoodPreset)) {
            return false;
        }
        FoodPreset foodPreset = (FoodPreset) obj;
        return h.a(this.name, foodPreset.name) && this.calories == foodPreset.calories && Float.compare(this.protein, foodPreset.protein) == 0 && Float.compare(this.fat, foodPreset.fat) == 0 && Float.compare(this.carbs, foodPreset.carbs) == 0;
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

    public final String getName() {
        return this.name;
    }

    public final float getProtein() {
        return this.protein;
    }

    public int hashCode() {
        return Float.hashCode(this.carbs) + ((Float.hashCode(this.fat) + ((Float.hashCode(this.protein) + ((Integer.hashCode(this.calories) + (this.name.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "FoodPreset(name=" + this.name + ", calories=" + this.calories + ", protein=" + this.protein + ", fat=" + this.fat + ", carbs=" + this.carbs + ")";
    }
}
