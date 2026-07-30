package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPStockInfo {
    private String abbreviation;
    private String code;
    private String currency;
    private String exchange;
    private byte id;

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public String getCode() {
        return this.code;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getExchange() {
        return this.exchange;
    }

    public byte getId() {
        return this.id;
    }

    public void setAbbreviation(String str) {
        this.abbreviation = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setExchange(String str) {
        this.exchange = str;
    }

    public void setId(byte b8) {
        this.id = b8;
    }
}
