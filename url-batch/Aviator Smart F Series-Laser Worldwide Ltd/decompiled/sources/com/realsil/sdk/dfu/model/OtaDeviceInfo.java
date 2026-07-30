package com.realsil.sdk.dfu.model;

import com.realsil.sdk.dfu.RtkDfu;

/* loaded from: classes4.dex */
public final class OtaDeviceInfo extends DeviceInfo {
    public OtaDeviceInfo() {
    }

    public OtaDeviceInfo(int i8) {
        this(0, i8);
    }

    public OtaDeviceInfo(int i8, int i9) {
        this.protocolType = i8;
        this.f16136a = RtkDfu.DEBUG_ENABLE;
        this.f16137b = RtkDfu.VDBG;
        this.f16138c = RtkDfu.TDBG;
        setMode(i9);
        this.normalBankInfo = new BankInfo();
        this.bootBankInfo = new BankInfo();
        this.secureBankInfo = new BankInfo();
        this.disInfo = new DisInfo();
    }
}
