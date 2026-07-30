package com.crrepa.band.my.model;

import androidx.annotation.Nullable;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/* loaded from: classes2.dex */
public class BandDataTypeModel implements MultiItemEntity {
    public static final int ADD_BAND = 1;
    public static final int GPS_TRAINING_TYPE = 32;
    public static final int TODAY_24_HOURS_HEART_RATE = 17;
    public static final int TODAY_ACTIVE_HEART_RATE = 16;
    public static final int TODAY_BLOOD_OXYGEN = 5;
    public static final int TODAY_BLOOD_PRESSURE = 4;
    public static final int TODAY_DATE = 0;
    public static final int TODAY_ECG = 6;
    public static final int TODAY_EXERCISE_CAPACITY = 38;
    public static final int TODAY_HRV = 23;
    public static final int TODAY_ONCE_HEART_RATE = 18;
    public static final int TODAY_ONCE_TEMP = 21;
    public static final int TODAY_PHYSIOLOGICAL_CYCLE = 35;
    public static final int TODAY_QUOTE = 49;
    public static final int TODAY_SLEEP = 3;
    public static final int TODAY_STEPS = 2;
    public static final int TODAY_STRESS = 24;
    public static final int TODAY_TIMING_BLOOD_OXYGEN = 22;
    public static final int TODAY_TIMING_HEART_RATE = 19;
    public static final int TODAY_TIMING_STRESS = 25;
    public static final int TODAY_TIMING_TEMP = 20;
    public static final int TODAY_TRAINING_ANALYSIS = 39;
    public static final int TODAY_TRAINING_RECOVERY = 40;
    public static final int TODAY_WATER = 36;
    public static final int TODAY_WEIGHT = 34;
    public static final int TRAINING_HISTORY_TYPE = 33;
    public static final int TRAINING_RECORD_SYNC = 37;
    private int type;

    public BandDataTypeModel(int i8) {
        this.type = i8;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && ((BandDataTypeModel) obj).type == this.type;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }
}
