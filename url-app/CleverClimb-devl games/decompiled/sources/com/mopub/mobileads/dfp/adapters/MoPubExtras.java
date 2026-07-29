package com.mopub.mobileads.dfp.adapters;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MoPubExtras implements NetworkExtras {
    private Map<String, Object> mExtras;

    public MoPubExtras() {
        eraseExtras();
    }

    public MoPubExtras eraseExtras() {
        this.mExtras = new HashMap();
        return this;
    }

    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    public MoPubExtras setExtras(Map<String, Object> map) {
        if (map == null) {
            throw new IllegalArgumentException("Extras cannot be empty");
        }
        this.mExtras = map;
        return this;
    }

    public MoPubExtras addExtra(String str, Object obj) {
        this.mExtras.put(str, obj);
        return this;
    }
}
