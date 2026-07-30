package com.crrepa.band.my.health.hrv.model;

import com.crrepa.band.my.model.db.Hrv;

/* loaded from: classes2.dex */
public class BandHrvChangeEvent {
    private Hrv hrv;

    public BandHrvChangeEvent() {
    }

    public Hrv getHrv() {
        return this.hrv;
    }

    public void setHrv(Hrv hrv) {
        this.hrv = hrv;
    }

    public BandHrvChangeEvent(Hrv hrv) {
        this.hrv = hrv;
    }
}
