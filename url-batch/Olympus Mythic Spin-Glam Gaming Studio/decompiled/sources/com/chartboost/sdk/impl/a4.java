package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public class a4 {
    public JSONObject a(y3 y3Var) {
        if (y3Var == null) {
            return new JSONObject();
        }
        return b3.a(b3.a("carrier-name", y3Var.d()), b3.a("mobile-country-code", y3Var.a()), b3.a("mobile-network-code", y3Var.b()), b3.a("iso-country-code", y3Var.c()), b3.a("phone-type", Integer.valueOf(y3Var.e())));
    }
}
