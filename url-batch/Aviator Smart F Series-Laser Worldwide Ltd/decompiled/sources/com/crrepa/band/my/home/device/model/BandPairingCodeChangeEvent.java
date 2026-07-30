package com.crrepa.band.my.home.device.model;

import com.crrepa.band.my.ble.band.utils.a;

/* loaded from: classes2.dex */
public class BandPairingCodeChangeEvent {
    private int code;
    private String name = a.getInstance().getName();
    private int state;

    public BandPairingCodeChangeEvent(int i8, int i9) {
        this.code = i8;
        this.state = i9;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public int getState() {
        return this.state;
    }

    public boolean isSuccess() {
        return this.state == 1;
    }
}
