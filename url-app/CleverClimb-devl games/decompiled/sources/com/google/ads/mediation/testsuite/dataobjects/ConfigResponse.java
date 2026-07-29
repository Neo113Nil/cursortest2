package com.google.ads.mediation.testsuite.dataobjects;

import java.util.List;

/* loaded from: classes.dex */
public class ConfigResponse {
    private List<AdUnit> adUnits;
    private List<Network> networks;

    public ConfigResponse(List<AdUnit> list, List<Network> list2) {
        this.adUnits = list;
        this.networks = list2;
    }

    public List<AdUnit> getAdUnits() {
        return this.adUnits;
    }

    public List<Network> getNetworks() {
        return this.networks;
    }
}
