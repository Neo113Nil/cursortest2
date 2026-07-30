package com.crrepa.band.my.health.water.model;

/* loaded from: classes2.dex */
public class WaterGoalChangeEvent {
    private int goal;
    private boolean isAuto;

    public WaterGoalChangeEvent(int i8, boolean z7) {
        this.goal = i8;
        this.isAuto = z7;
    }

    public int getGoal() {
        return this.goal;
    }

    public boolean isAuto() {
        return this.isAuto;
    }

    public void setAuto(boolean z7) {
        this.isAuto = z7;
    }

    public void setGoal(int i8) {
        this.goal = i8;
    }
}
