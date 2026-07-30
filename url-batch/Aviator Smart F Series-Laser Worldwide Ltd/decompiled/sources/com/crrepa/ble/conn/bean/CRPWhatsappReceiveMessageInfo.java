package com.crrepa.ble.conn.bean;

import java.util.Objects;

/* loaded from: classes3.dex */
public class CRPWhatsappReceiveMessageInfo {
    private String message;
    private String name;

    public CRPWhatsappReceiveMessageInfo(String str, String str2) {
        this.name = str;
        this.message = str2;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CRPWhatsappReceiveMessageInfo cRPWhatsappReceiveMessageInfo = (CRPWhatsappReceiveMessageInfo) obj;
        return Objects.equals(this.name, cRPWhatsappReceiveMessageInfo.name) && Objects.equals(this.message, cRPWhatsappReceiveMessageInfo.message);
    }

    public String getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.message);
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "CRPWhatsappReceiveMessageInfo{name='" + this.name + "', message='" + this.message + "'}";
    }
}
