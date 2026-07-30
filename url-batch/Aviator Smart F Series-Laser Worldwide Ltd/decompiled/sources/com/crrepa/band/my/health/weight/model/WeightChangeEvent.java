package com.crrepa.band.my.health.weight.model;

/* loaded from: classes2.dex */
public class WeightChangeEvent {
    boolean isUpdateHistory;

    public WeightChangeEvent() {
        this.isUpdateHistory = true;
    }

    public boolean isUpdateHistory() {
        return this.isUpdateHistory;
    }

    public void setUpdateHistory(boolean z7) {
        this.isUpdateHistory = z7;
    }

    public WeightChangeEvent(boolean z7) {
        this.isUpdateHistory = z7;
    }
}
