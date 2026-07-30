package com.crrepa.band.my.health.bloodoxygen.model;

import com.crrepa.band.my.model.db.BloodOxygen;

/* loaded from: classes2.dex */
public class BandBloodOxygenChangeEvent {
    private BloodOxygen bloodOxygen;

    public BandBloodOxygenChangeEvent() {
    }

    public BloodOxygen getBloodOxygen() {
        return this.bloodOxygen;
    }

    public void setBloodOxygen(BloodOxygen bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public BandBloodOxygenChangeEvent(BloodOxygen bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }
}
