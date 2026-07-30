package com.crrepa.band.my.health.heartrate.model;

import com.crrepa.band.my.model.db.HeartRate;

/* loaded from: classes2.dex */
public class Band24HoursHeartRateChangeEvent {
    private HeartRate heartRate;

    public Band24HoursHeartRateChangeEvent(HeartRate heartRate) {
        this.heartRate = heartRate;
    }

    public HeartRate getHeartRate() {
        return this.heartRate;
    }

    public void setHeartRate(HeartRate heartRate) {
        this.heartRate = heartRate;
    }
}
