package com.crrepa.band.my.health.pressure.model;

import com.crrepa.band.my.model.db.TimingStress;

/* loaded from: classes2.dex */
public class BandTimingStressChangeEvent {
    private TimingStress timingStress;

    public BandTimingStressChangeEvent(TimingStress timingStress) {
        this.timingStress = timingStress;
    }

    public TimingStress getTimingStress() {
        return this.timingStress;
    }
}
