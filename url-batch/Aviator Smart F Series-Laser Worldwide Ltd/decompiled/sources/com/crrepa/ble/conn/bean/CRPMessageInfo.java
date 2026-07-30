package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPMessageInfo {
    private boolean isHs;
    private boolean isSmallScreen;
    private int maxByteLength;
    private String message;
    private int type;
    private int versionCode;

    public CRPMessageInfo() {
    }

    public CRPMessageInfo(String str, int i8, int i9, boolean z7, boolean z8) {
        this.message = str;
        this.type = i8;
        this.versionCode = i9;
        this.isHs = z7;
        this.isSmallScreen = z8;
    }

    public int getMaxByteLength() {
        return this.maxByteLength;
    }

    public String getMessage() {
        return this.message;
    }

    public int getType() {
        return this.type;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public boolean isHs() {
        return this.isHs;
    }

    public boolean isSmallScreen() {
        return this.isSmallScreen;
    }

    public void setHs(boolean z7) {
        this.isHs = z7;
    }

    public void setMaxByteLength(int i8) {
        this.maxByteLength = i8;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSmallScreen(boolean z7) {
        this.isSmallScreen = z7;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    public void setVersionCode(int i8) {
        this.versionCode = i8;
    }

    public String toString() {
        return "CRPMessageInfo{message='" + this.message + "', type=" + this.type + ", versionCode=" + this.versionCode + ", isHs=" + this.isHs + ", isSmallScreen=" + this.isSmallScreen + '}';
    }
}
