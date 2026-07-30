package com.crrepa.band.my.device.appmarket.openharmony.bean;

/* loaded from: classes2.dex */
public class OpenWearPlayLoadInfo {
    private String chipModel;
    private String osVersion;
    private String resolution;
    private String sdkVersion;
    private String vendorIdentity = "V386D662FBAC7424";
    private String consumerIdentity = "TJD-Test-Customer-001";
    private int consumerType = 0;
    private String deviceSn = "TJD-Test-Device-466";
    private String themeMode = "light";
    private String chipPlatform = "hisi";
    private String os = "openharmony";

    public String getChipModel() {
        return this.chipModel;
    }

    public String getChipPlatform() {
        return this.chipPlatform;
    }

    public String getConsumerIdentity() {
        return this.consumerIdentity;
    }

    public int getConsumerType() {
        return this.consumerType;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public String getOs() {
        return this.os;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getThemeMode() {
        return this.themeMode;
    }

    public String getVendorIdentity() {
        return this.vendorIdentity;
    }

    public void setChipModel(String str) {
        this.chipModel = str;
    }

    public void setChipPlatform(String str) {
        this.chipPlatform = str;
    }

    public void setConsumerIdentity(String str) {
        this.consumerIdentity = str;
    }

    public void setConsumerType(int i8) {
        this.consumerType = i8;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setThemeMode(String str) {
        this.themeMode = str;
    }

    public void setVendorIdentity(String str) {
        this.vendorIdentity = str;
    }
}
