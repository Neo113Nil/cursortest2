package com.crrepa.band.my.model.net;

/* loaded from: classes2.dex */
public class IncomingNumberEntity {
    private String Amount;
    private String NumInfo;
    private int errorCode;

    public String getAmount() {
        return this.Amount;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getNumInfo() {
        return this.NumInfo;
    }

    public void setAmount(String str) {
        this.Amount = str;
    }

    public void setErrorCode(int i8) {
        this.errorCode = i8;
    }

    public void setNumInfo(String str) {
        this.NumInfo = str;
    }
}
