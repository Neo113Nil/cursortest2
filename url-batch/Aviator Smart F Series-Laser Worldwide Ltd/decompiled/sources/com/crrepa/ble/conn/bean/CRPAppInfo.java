package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPAppInfo {
    public static final int UNKNOWN_VERSION_CODE = -1;
    private String packageName;
    private String version;
    private int versionCode;

    public CRPAppInfo(String str, String str2, int i8) {
        this.packageName = str;
        this.version = str2;
        this.versionCode = i8;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getVersion() {
        return this.version;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVersionCode(int i8) {
        this.versionCode = i8;
    }

    public String toString() {
        return "CRPAppInfo{packageName='" + this.packageName + "', version='" + this.version + "', versionCode=" + this.versionCode + '}';
    }
}
