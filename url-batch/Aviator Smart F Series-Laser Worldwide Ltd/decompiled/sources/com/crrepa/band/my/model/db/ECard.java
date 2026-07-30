package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class ECard {
    private Long id;
    private Integer index;
    private String title;
    private String url;

    public ECard(Long l8, Integer num, String str, String str2) {
        this.id = l8;
        this.index = num;
        this.title = str;
        this.url = str2;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setIndex(Integer num) {
        this.index = num;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public ECard() {
    }
}
