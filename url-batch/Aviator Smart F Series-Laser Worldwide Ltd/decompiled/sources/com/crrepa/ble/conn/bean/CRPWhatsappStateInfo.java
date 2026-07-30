package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPWhatsappStateInfo {
    public static final byte STATE_BUSY = 12;
    public static final byte STATE_NOT_NETWORK = 11;
    public static final byte STATE_PERMISSION_ERROR = 13;
    public static final byte STATE_RECORDING_READY = 1;
    public static final byte STATE_SPEECH_RECOGNITION_FAIL = 10;
    public static final byte STATE_SPEECH_RECOGNITION_SUCCESS = 2;
    private String msg;
    private byte state;

    public CRPWhatsappStateInfo(byte b8) {
        this.state = b8;
    }

    public String getMsg() {
        return this.msg;
    }

    public byte getState() {
        return this.state;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setState(byte b8) {
        this.state = b8;
    }

    public String toString() {
        return "CRPWhatsappStateInfo{state=" + ((int) this.state) + ", msg='" + this.msg + "'}";
    }

    public CRPWhatsappStateInfo(byte b8, String str) {
        this.state = b8;
        this.msg = str;
    }
}
