package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.openadsdk.core.model.nqi;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class zmn {
    private zn btk;
    private JSONObject fb;
    private String fs;
    private boolean hhw = false;
    private nqi zmn;
    private JSONObject zn;

    public zmn(nqi nqiVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.zmn = nqiVar;
        this.fs = str;
        this.zn = jSONObject;
        this.fb = jSONObject2;
    }

    public nqi zmn() {
        return this.zmn;
    }

    public String fs() {
        return this.fs;
    }

    public JSONObject zn() {
        if (this.zn == null) {
            this.zn = new JSONObject();
        }
        return this.zn;
    }

    public JSONObject fb() {
        if (this.fb == null) {
            this.fb = new JSONObject();
        }
        return this.fb;
    }

    public zn btk() {
        return this.btk;
    }

    public void zmn(zn znVar) {
        this.btk = znVar;
    }

    public boolean hhw() {
        return this.hhw;
    }

    public void zmn(boolean z) {
        this.hhw = z;
    }

    public void nps() {
        zn znVar = this.btk;
        if (znVar != null) {
            znVar.zmn(this);
        }
    }
}
