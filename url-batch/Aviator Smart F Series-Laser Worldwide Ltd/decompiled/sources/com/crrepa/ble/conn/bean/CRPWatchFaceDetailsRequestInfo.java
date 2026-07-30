package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPWatchFaceStoreType;

/* loaded from: classes3.dex */
public class CRPWatchFaceDetailsRequestInfo {
    private int apiVersion;
    private int feature;
    private String firmwareVersion;
    private int id;
    private int maxSize;
    private CRPWatchFaceStoreType storeType;

    public CRPWatchFaceDetailsRequestInfo(CRPWatchFaceStoreType cRPWatchFaceStoreType, int i8) {
        this.storeType = cRPWatchFaceStoreType;
        this.id = i8;
    }

    public int getApiVersion() {
        return this.apiVersion;
    }

    public int getFeature() {
        return this.feature;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public int getId() {
        return this.id;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public CRPWatchFaceStoreType getStoreType() {
        return this.storeType;
    }

    public void setApiVersion(int i8) {
        this.apiVersion = i8;
    }

    public void setFeature(int i8) {
        this.feature = i8;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setMaxSize(int i8) {
        this.maxSize = i8;
    }

    public void setStoreType(CRPWatchFaceStoreType cRPWatchFaceStoreType) {
        this.storeType = cRPWatchFaceStoreType;
    }

    public String toString() {
        return "CRPWatchFaceDetailsRequestInfo{storeType=" + this.storeType + ", id=" + this.id + ", firmwareVersion='" + this.firmwareVersion + "', apiVersion=" + this.apiVersion + ", feature=" + this.feature + ", maxSize=" + this.maxSize + '}';
    }
}
