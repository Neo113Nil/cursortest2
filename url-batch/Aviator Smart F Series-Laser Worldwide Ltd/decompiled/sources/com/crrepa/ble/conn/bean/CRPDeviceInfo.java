package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPDeviceInfo {
    private int chipId;
    private int feature;
    private String firmwareType;
    private int mcuPlatform;

    public CRPDeviceInfo(String str, int i8, int i9, int i10) {
        this.firmwareType = str;
        this.mcuPlatform = i8;
        this.chipId = i9;
        this.feature = i10;
    }

    public int getChipId() {
        return this.chipId;
    }

    public int getFeature() {
        return this.feature;
    }

    public String getFirmwareType() {
        return this.firmwareType;
    }

    public int getMcuPlatform() {
        return this.mcuPlatform;
    }

    public String toString() {
        return "CRPDeviceInfo{firmwareType='" + this.firmwareType + "', mcuPlatform=" + this.mcuPlatform + ", chipId=" + this.chipId + ", feature=" + this.feature + '}';
    }
}
