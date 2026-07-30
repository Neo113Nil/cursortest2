package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPJieliWatchFaceInfo {
    private byte apiVersion;
    private byte feature;

    public CRPJieliWatchFaceInfo(byte b8, byte b9) {
        this.apiVersion = b8;
        this.feature = b9;
    }

    public byte getApiVersion() {
        return this.apiVersion;
    }

    public byte getFeature() {
        return this.feature;
    }

    public void setApiVersion(byte b8) {
        this.apiVersion = b8;
    }

    public void setFeature(byte b8) {
        this.feature = b8;
    }

    public String toString() {
        return "CRPJieliWatchFaceInfo{apiVersion=" + ((int) this.apiVersion) + ", feature=" + ((int) this.feature) + '}';
    }
}
