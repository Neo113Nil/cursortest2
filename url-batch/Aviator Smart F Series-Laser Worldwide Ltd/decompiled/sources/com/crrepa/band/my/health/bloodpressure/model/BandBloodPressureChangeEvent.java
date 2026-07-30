package com.crrepa.band.my.health.bloodpressure.model;

import com.crrepa.band.my.model.db.BloodPressure;

/* loaded from: classes2.dex */
public class BandBloodPressureChangeEvent {
    private BloodPressure bloodPressure;

    public BandBloodPressureChangeEvent() {
    }

    public BloodPressure getBloodPressure() {
        return this.bloodPressure;
    }

    public void setBloodPressure(BloodPressure bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public BandBloodPressureChangeEvent(BloodPressure bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
}
