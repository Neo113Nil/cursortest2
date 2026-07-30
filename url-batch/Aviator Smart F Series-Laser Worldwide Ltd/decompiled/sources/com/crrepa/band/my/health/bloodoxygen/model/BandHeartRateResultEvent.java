package com.crrepa.band.my.health.bloodoxygen.model;

import com.crrepa.band.my.model.db.ActiveHeartRate;

/* loaded from: classes2.dex */
public class BandHeartRateResultEvent {
    private ActiveHeartRate activeHeartRate;

    public BandHeartRateResultEvent(ActiveHeartRate activeHeartRate) {
        this.activeHeartRate = activeHeartRate;
    }

    public ActiveHeartRate getActiveHeartRate() {
        return this.activeHeartRate;
    }

    public void setActiveHeartRate(ActiveHeartRate activeHeartRate) {
        this.activeHeartRate = activeHeartRate;
    }
}
