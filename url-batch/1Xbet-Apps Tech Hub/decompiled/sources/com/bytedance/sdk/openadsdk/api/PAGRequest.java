package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes2.dex */
public class PAGRequest {
    private Map<String, Object> icD;
    private String pvs;
    private Bundle vG = null;

    public String getAdString() {
        return this.pvs;
    }

    public void setAdString(String str) {
        this.pvs = str;
    }

    public Map<String, Object> getExtraInfo() {
        return this.icD;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.icD = map;
    }

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.vG == null) {
            this.vG = new Bundle();
        }
        this.vG.putBundle(cls.getName(), bundle);
    }

    public Bundle getNetworkExtrasBundle() {
        return this.vG;
    }
}
