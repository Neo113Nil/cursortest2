package com.moyoung.lib.ai.img;

/* loaded from: classes4.dex */
public class g {
    private String id;
    private String name;
    private String url;

    public g() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "ImgStyle{id='" + this.id + "', name='" + this.name + "', url='" + this.url + "'}";
    }

    public g(String str, String str2, String str3) {
        this.id = str;
        this.name = str2;
        this.url = str3;
    }
}
