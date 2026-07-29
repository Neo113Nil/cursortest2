package com.google.ads.mediation.testsuite.dataobjects;

import com.google.gson.a.c;
import java.util.List;

/* loaded from: classes.dex */
public class CLDResponse {

    @c(a = "ad_unit_settings")
    private List<AdUnitResponse> adUnitSettings;

    public List<AdUnitResponse> getAdUnitSettings() {
        return this.adUnitSettings;
    }

    public void setAdUnitSettings(List<AdUnitResponse> list) {
        this.adUnitSettings = list;
    }
}
