package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class cn {
    private final int fs;
    private final int zmn;

    public cn(JSONObject jSONObject) {
        this.zmn = jSONObject.optInt("auto_click", 0);
        this.fs = jSONObject.optInt("hidden_bar", 0);
    }

    public int zmn() {
        return this.zmn;
    }

    public boolean fs() {
        return this.fs == 1;
    }

    public static boolean zmn(nqi nqiVar) {
        if (nqiVar == null || !nqiVar.ch() || nqiVar.shl() == null) {
            return false;
        }
        return nqiVar.shl().fs();
    }
}
