package com.google.ads.mediation.testsuite.dataobjects;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class NetworkResponse {
    private List<String> adapters;
    private Map<String, String> data;

    public Map<String, String> getData() {
        return this.data;
    }

    public void setData(Map<String, String> map) {
        this.data = map;
    }

    public List<String> getAdapters() {
        return this.adapters;
    }

    public void setAdapters(List<String> list) {
        this.adapters = list;
    }

    public String getClassName() {
        if (this.adapters == null || this.adapters.size() == 0) {
            return null;
        }
        return this.adapters.get(0);
    }

    public boolean hasValidMediationAdapter() {
        String className = getClassName();
        return (className == null || className.equals(AdUnit.GOOGLE_ADAPTER_CLASS) || this.data == null) ? false : true;
    }

    public boolean isCustomEventAdapter() {
        return getClassName() != null && getClassName().equals(AdUnit.CUSTOM_EVENT_ADAPTER_CLASS);
    }
}
