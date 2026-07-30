package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPQuickResponsesDetailInfo {
    private byte id;
    private String message;

    public CRPQuickResponsesDetailInfo() {
    }

    public CRPQuickResponsesDetailInfo(byte b8, String str) {
        this.id = b8;
        this.message = str;
    }

    public byte getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setId(byte b8) {
        this.id = b8;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "CRPQuickResponsesDetailInfo{id=" + ((int) this.id) + ", message='" + this.message + "'}";
    }
}
