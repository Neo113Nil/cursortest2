package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPAppStoreInfo {
    private String chipModel;
    private String chipPlatform;
    private String os;
    private String osVersion;
    private String sdkVersion;

    public String getChipModel() {
        return this.chipModel;
    }

    public String getChipPlatform() {
        return this.chipPlatform;
    }

    public String getOs() {
        return this.os;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public void setChipModel(String str) {
        this.chipModel = str;
    }

    public void setChipPlatform(String str) {
        this.chipPlatform = str;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public String toString() {
        return "CRPAppStoreInfo{chipPlatform='" + this.chipPlatform + "', chipModel='" + this.chipModel + "', os='" + this.os + "', osVersion='" + this.osVersion + "', sdkVersion='" + this.sdkVersion + "'}";
    }
}
