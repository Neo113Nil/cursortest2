package com.crrepa.ble.trans.upgrade.bean;

/* loaded from: classes3.dex */
public class HSFirmwareInfo {
    private String appFilePath;
    private String configFilePath;
    private String patchFilePath;
    private String userFilePath;
    private String userStartAddress;

    public String getAppFilePath() {
        return this.appFilePath;
    }

    public String getConfigFilePath() {
        return this.configFilePath;
    }

    public String getPatchFilePath() {
        return this.patchFilePath;
    }

    public String getUserFilePath() {
        return this.userFilePath;
    }

    public String getUserStartAddress() {
        return this.userStartAddress;
    }

    public void setAppFilePath(String str) {
        this.appFilePath = str;
    }

    public void setConfigFilePath(String str) {
        this.configFilePath = str;
    }

    public void setPatchFilePath(String str) {
        this.patchFilePath = str;
    }

    public void setUserFilePath(String str) {
        this.userFilePath = str;
    }

    public void setUserStartAddress(String str) {
        this.userStartAddress = str;
    }
}
