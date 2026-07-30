package com.crrepa.band.my.device.appmarket.openharmony.bridge.bean;

import com.google.gson.JsonObject;

/* loaded from: classes2.dex */
public class OptParam {
    private JsonObject object;

    public OptParam(JsonObject jsonObject) {
        this.object = jsonObject;
    }

    public String getOpt() {
        return this.object.get("opt").getAsString();
    }

    public JsonObject getParam() {
        return this.object.getAsJsonObject("param");
    }
}
