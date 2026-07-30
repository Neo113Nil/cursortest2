package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPElectronicCardInfo {
    private int id;
    private String title;
    private String url;

    public CRPElectronicCardInfo(int i8, String str, String str2) {
        this.id = i8;
        this.title = str;
        this.url = str2;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "CRPElectronicCardInfo{id=" + this.id + ", title='" + this.title + "', url='" + this.url + "'}";
    }
}
