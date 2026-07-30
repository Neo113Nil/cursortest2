package com.crrepa.band.my.health.bodytemperature.model;

import com.crrepa.band.my.model.db.TimingTemp;

/* loaded from: classes2.dex */
public class BandTimingTempChangeEvent {
    private TimingTemp timingTemp;

    public BandTimingTempChangeEvent(TimingTemp timingTemp) {
        this.timingTemp = timingTemp;
    }

    public TimingTemp getTimingTemp() {
        return this.timingTemp;
    }

    public void setTimingTemp(TimingTemp timingTemp) {
        this.timingTemp = timingTemp;
    }
}
