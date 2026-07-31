package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public class mw {
    private mw btk;
    private mw fb;
    private int fs;
    private com.bytedance.adsdk.ugeno.fs.zn zmn;
    private JSONObject zn;

    public com.bytedance.adsdk.ugeno.fs.zn zmn() {
        return this.zmn;
    }

    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        this.zmn = znVar;
    }

    public int fs() {
        return this.fs;
    }

    public void zmn(int i) {
        this.fs = i;
    }

    public JSONObject zn() {
        return this.zn;
    }

    public void zmn(JSONObject jSONObject) {
        this.zn = jSONObject;
    }

    public mw fb() {
        return this.fb;
    }

    public void zmn(mw mwVar) {
        this.fb = mwVar;
    }

    public void fs(mw mwVar) {
        this.btk = mwVar;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.zmn + ", mEventType=" + this.fs + ", mEvent=" + this.zn + '}';
    }
}
