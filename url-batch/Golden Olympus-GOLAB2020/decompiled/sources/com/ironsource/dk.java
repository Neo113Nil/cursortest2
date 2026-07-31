package com.ironsource;

import com.ironsource.fh;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class dk {

    /* renamed from: a, reason: collision with root package name */
    static String f15900a = "ManRewInst_";

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a(sj sjVar) {
        return (sjVar.i() ? fh.e.Banner : sjVar.n() ? fh.e.RewardedVideo : fh.e.Interstitial).toString();
    }

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f15900a + jSONObject.optString("name");
    }
}
