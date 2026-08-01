package com.winpower.neonfit.data;

import X0.l;
import java.util.List;

/* loaded from: classes.dex */
public final class FoodPresets {
    public static final FoodPresets INSTANCE = new FoodPresets();
    private static final List<FoodPreset> all = l.k0(new FoodPreset("Chicken Breast", 165, 31.0f, 3.6f, 0.0f), new FoodPreset("Brown Rice", 216, 5.0f, 1.8f, 45.0f), new FoodPreset("Greek Salad", 180, 6.0f, 14.0f, 10.0f), new FoodPreset("Protein Shake", 220, 30.0f, 3.0f, 12.0f), new FoodPreset("Banana", 105, 1.3f, 0.4f, 27.0f), new FoodPreset("Egg Whites", 85, 18.0f, 0.2f, 1.0f), new FoodPreset("Avocado Toast", 290, 8.0f, 18.0f, 28.0f), new FoodPreset("Oatmeal", 158, 6.0f, 3.0f, 27.0f));

    private FoodPresets() {
    }

    public final List<FoodPreset> getAll() {
        return all;
    }
}
