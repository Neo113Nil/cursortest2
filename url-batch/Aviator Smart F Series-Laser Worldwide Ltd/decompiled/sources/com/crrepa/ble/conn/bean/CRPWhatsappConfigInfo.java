package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPWhatsappConfigInfo {
    private int contactCount;
    private int receiveMsgLength;
    private int sendMsgLength;
    private boolean supported;

    public CRPWhatsappConfigInfo(boolean z7) {
        this.supported = z7;
    }

    public int getContactCount() {
        return this.contactCount;
    }

    public int getReceiveMsgLength() {
        return this.receiveMsgLength;
    }

    public int getSendMsgLength() {
        return this.sendMsgLength;
    }

    public boolean isSupported() {
        return this.supported;
    }

    public void setContactCount(int i8) {
        this.contactCount = i8;
    }

    public void setReceiveMsgLength(int i8) {
        this.receiveMsgLength = i8;
    }

    public void setSendMsgLength(int i8) {
        this.sendMsgLength = i8;
    }

    public void setSupported(boolean z7) {
        this.supported = z7;
    }

    public String toString() {
        return "CRPWhatsappConfigInfo{supported=" + this.supported + ", contactCount=" + this.contactCount + ", receiveMsgLength=" + this.receiveMsgLength + ", sendMsgLength=" + this.sendMsgLength + '}';
    }
}
