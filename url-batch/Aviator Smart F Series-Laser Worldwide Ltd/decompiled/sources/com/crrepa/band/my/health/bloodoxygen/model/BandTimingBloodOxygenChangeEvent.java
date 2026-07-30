package com.crrepa.band.my.health.bloodoxygen.model;

import com.crrepa.band.my.model.db.TimingBloodOxygen;

/* loaded from: classes2.dex */
public class BandTimingBloodOxygenChangeEvent {
    private TimingBloodOxygen bloodOxygen;

    public BandTimingBloodOxygenChangeEvent(TimingBloodOxygen timingBloodOxygen) {
        this.bloodOxygen = timingBloodOxygen;
    }

    public TimingBloodOxygen getBloodOxygen() {
        return this.bloodOxygen;
    }
}
