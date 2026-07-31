package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes15.dex */
public class PAGRequest {
    private Map<String, Object> fs;
    private String zmn;
    private Bundle zn = null;

    public String getAdString() {
        return this.zmn;
    }

    public void setAdString(String str) {
        this.zmn = str;
    }

    public Map<String, Object> getExtraInfo() {
        return this.fs;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.fs = map;
    }

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.zn == null) {
            this.zn = new Bundle();
        }
        this.zn.putBundle(cls.getName(), bundle);
    }

    public Bundle getNetworkExtrasBundle() {
        return this.zn;
    }
}
