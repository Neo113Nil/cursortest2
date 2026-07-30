package com.crrepa.band.my.training.utils;

import com.crrepa.band.aviator.R;

/* loaded from: classes3.dex */
public class n {
    public static String getTrainingEffectStr(float f8) {
        return f8 <= 1.0f ? com.moyoung.dafit.module.common.utils.d.get().getString(R.string.training_effect_no) : f8 <= 2.0f ? com.moyoung.dafit.module.common.utils.d.get().getString(R.string.training_effect_recovery) : f8 <= 3.0f ? com.moyoung.dafit.module.common.utils.d.get().getString(R.string.training_effect_maintenance) : f8 <= 4.0f ? com.moyoung.dafit.module.common.utils.d.get().getString(R.string.training_effect_improvement) : f8 <= 5.0f ? com.moyoung.dafit.module.common.utils.d.get().getString(R.string.training_effect_enhancement) : com.moyoung.dafit.module.common.utils.d.get().getString(R.string.training_effect_overload);
    }
}
