package com.google.ads.mediation.testsuite.dataobjects;

import com.google.gson.a.c;

/* loaded from: classes.dex */
public class AdUnitResponse {

    @c(a = "ad_unit_id")
    private String adUnitId;

    @c(a = "ad_unit_name")
    private String adUnitName;
    private String format;

    @c(a = "mediation_config")
    private MediationConfig mediationConfig;

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public String getAdUnitName() {
        return this.adUnitName;
    }

    public MediationConfig getMediationConfig() {
        return this.mediationConfig;
    }
}
