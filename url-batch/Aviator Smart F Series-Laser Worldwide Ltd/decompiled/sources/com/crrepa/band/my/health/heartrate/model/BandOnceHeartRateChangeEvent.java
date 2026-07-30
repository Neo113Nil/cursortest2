package com.crrepa.band.my.health.heartrate.model;

import com.crrepa.band.my.model.db.OnceHeartRate;

/* loaded from: classes2.dex */
public class BandOnceHeartRateChangeEvent {
    private OnceHeartRate onceHeartRate;

    public BandOnceHeartRateChangeEvent() {
    }

    public OnceHeartRate getOnceHeartRate() {
        return this.onceHeartRate;
    }

    public void setOnceHeartRate(OnceHeartRate onceHeartRate) {
        this.onceHeartRate = onceHeartRate;
    }

    public BandOnceHeartRateChangeEvent(OnceHeartRate onceHeartRate) {
        this.onceHeartRate = onceHeartRate;
    }
}
