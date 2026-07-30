package com.crrepa.ble.conn.bean;

import com.crrepa.g1.c;

/* loaded from: classes3.dex */
public class CRPBluetrumWatchFaceInfo {
    private byte apiVersion;
    private byte[] bytes;
    private byte feature;

    public CRPBluetrumWatchFaceInfo(byte b8, byte b9, byte[] bArr) {
        this.apiVersion = b8;
        this.feature = b9;
        this.bytes = bArr;
    }

    public byte getApiVersion() {
        return this.apiVersion;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public byte getFeature() {
        return this.feature;
    }

    public void setApiVersion(byte b8) {
        this.apiVersion = b8;
    }

    public void setBytes(byte[] bArr) {
        this.bytes = bArr;
    }

    public void setFeature(byte b8) {
        this.feature = b8;
    }

    public String toString() {
        return "CRPBluetrumWatchFaceInfo{apiVersion=" + ((int) this.apiVersion) + ", feature=" + ((int) this.feature) + ", bytes=" + c.c(this.bytes) + "}";
    }
}
