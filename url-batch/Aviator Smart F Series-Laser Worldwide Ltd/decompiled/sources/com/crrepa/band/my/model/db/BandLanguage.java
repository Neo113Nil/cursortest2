package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class BandLanguage {
    private String bandName;
    private Long id;
    private String languages;

    public BandLanguage(Long l8, String str, String str2) {
        this.id = l8;
        this.bandName = str;
        this.languages = str2;
    }

    public String getBandName() {
        return this.bandName;
    }

    public Long getId() {
        return this.id;
    }

    public String getLanguages() {
        return this.languages;
    }

    public void setBandName(String str) {
        this.bandName = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setLanguages(String str) {
        this.languages = str;
    }

    public BandLanguage() {
    }
}
