package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class BandFunction {
    private String functions;
    private Long id;
    private String name;
    private String supportFunctions;

    public BandFunction(Long l8, String str, String str2, String str3) {
        this.id = l8;
        this.name = str;
        this.functions = str2;
        this.supportFunctions = str3;
    }

    public String getFunctions() {
        return this.functions;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSupportFunctions() {
        return this.supportFunctions;
    }

    public void setFunctions(String str) {
        this.functions = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSupportFunctions(String str) {
        this.supportFunctions = str;
    }

    public BandFunction() {
    }
}
