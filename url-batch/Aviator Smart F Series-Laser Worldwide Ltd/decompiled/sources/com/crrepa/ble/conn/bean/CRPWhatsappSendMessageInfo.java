package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPWhatsappSendMessageInfo {
    public static final int TYPE_EMOJI = 2;
    public static final int TYPE_TEXT = 1;
    private String message;
    private String name;
    private int type;

    public CRPWhatsappSendMessageInfo(int i8, String str, String str2) {
        this.type = i8;
        this.name = str;
        this.message = str2;
    }

    public String getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    public String toString() {
        return "CRPWhatsappSendMessageInfo{type=" + this.type + ", name='" + this.name + "', message='" + this.message + "'}";
    }
}
