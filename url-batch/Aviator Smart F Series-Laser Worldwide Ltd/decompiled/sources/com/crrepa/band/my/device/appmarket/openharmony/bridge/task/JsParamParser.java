package com.crrepa.band.my.device.appmarket.openharmony.bridge.task;

import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.OptParam;
import com.google.gson.JsonParser;

/* loaded from: classes2.dex */
public class JsParamParser {
    public static OptParam Parser(Object obj) {
        return new OptParam(JsonParser.parseString(obj.toString()).getAsJsonObject().getAsJsonObject("data"));
    }
}
