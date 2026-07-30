package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPSupportAppInfo {
    private int installedCount;
    private int templateID;
    private int version;

    public CRPSupportAppInfo(int i8, int i9, int i10) {
        this.templateID = i8;
        this.version = i9;
        this.installedCount = i10;
    }

    public int getInstalledCount() {
        return this.installedCount;
    }

    public int getTemplateID() {
        return this.templateID;
    }

    public int getVersion() {
        return this.version;
    }

    public void setInstalledCount(int i8) {
        this.installedCount = i8;
    }

    public void setTemplateID(int i8) {
        this.templateID = i8;
    }

    public void setVersion(int i8) {
        this.version = i8;
    }

    public String toString() {
        return "CRPSupportAppInfo{templateID=" + this.templateID + ", version=" + this.version + ", installedCount=" + this.installedCount + '}';
    }
}
