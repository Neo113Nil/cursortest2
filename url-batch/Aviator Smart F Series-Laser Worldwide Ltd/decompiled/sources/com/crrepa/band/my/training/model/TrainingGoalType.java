package com.crrepa.band.my.training.model;

/* loaded from: classes3.dex */
public enum TrainingGoalType {
    DISTANCE(0),
    TIME(1),
    PACE(2),
    CALORIES(3);

    private int value;

    TrainingGoalType(int i8) {
        this.value = i8;
    }

    public int getValue() {
        return this.value;
    }
}
