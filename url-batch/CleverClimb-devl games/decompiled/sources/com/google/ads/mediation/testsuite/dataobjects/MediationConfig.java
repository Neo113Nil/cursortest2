package com.google.ads.mediation.testsuite.dataobjects;

import com.google.gson.a.c;
import java.util.List;

/* loaded from: classes.dex */
public class MediationConfig {

    @c(a = "ad_networks")
    private List<NetworkResponse> adNetworks;

    @c(a = "mediation_group_name")
    private String mediationGroupName;

    public List<NetworkResponse> getAdNetworks() {
        return this.adNetworks;
    }

    public String getMediationGroupName() {
        return this.mediationGroupName;
    }
}
