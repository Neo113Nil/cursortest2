package com.crrepa.band.my.health.sleep.model;

import com.crrepa.band.my.model.db.Sleep;

/* loaded from: classes2.dex */
public class BandSleepChangeEvent {
    private Sleep sleep;

    public BandSleepChangeEvent(Sleep sleep) {
        this.sleep = sleep;
    }

    public Sleep getSleep() {
        return this.sleep;
    }

    public void setSleep(Sleep sleep) {
        this.sleep = sleep;
    }
}
