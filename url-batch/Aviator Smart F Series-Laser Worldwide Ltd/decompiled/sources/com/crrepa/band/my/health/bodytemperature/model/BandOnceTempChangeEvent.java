package com.crrepa.band.my.health.bodytemperature.model;

import com.crrepa.band.my.model.db.OnceTemp;

/* loaded from: classes2.dex */
public class BandOnceTempChangeEvent {
    private OnceTemp onceTemp;

    public BandOnceTempChangeEvent(OnceTemp onceTemp) {
        this.onceTemp = onceTemp;
    }

    public OnceTemp getOnceTemp() {
        return this.onceTemp;
    }
}
