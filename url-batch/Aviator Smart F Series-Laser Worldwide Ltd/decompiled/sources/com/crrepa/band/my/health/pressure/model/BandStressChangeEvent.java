package com.crrepa.band.my.health.pressure.model;

import com.crrepa.band.my.model.db.Stress;

/* loaded from: classes2.dex */
public class BandStressChangeEvent {
    private Stress stress;

    public BandStressChangeEvent() {
    }

    public Stress getStress() {
        return this.stress;
    }

    public void setStress(Stress stress) {
        this.stress = stress;
    }

    public BandStressChangeEvent(Stress stress) {
        this.stress = stress;
    }
}
