package com.crrepa.band.my.health.steps.model;

import com.crrepa.band.my.model.db.Step;

/* loaded from: classes2.dex */
public class BandStepChangeEvent {
    private Step step;

    public BandStepChangeEvent(Step step) {
        this.step = step;
    }

    public Step getStep() {
        return this.step;
    }

    public void setStep(Step step) {
        this.step = step;
    }
}
