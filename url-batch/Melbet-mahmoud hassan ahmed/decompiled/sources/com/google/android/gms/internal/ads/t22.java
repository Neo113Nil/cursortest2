package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t22 implements pv2<s22, o22> {

    /* renamed from: a, reason: collision with root package name */
    private final String f12062a;

    public t22(String str) {
        this.f12062a = str;
    }

    @Override // com.google.android.gms.internal.ads.pv2
    public final /* bridge */ /* synthetic */ o22 c(s22 s22Var) {
        JSONObject jSONObject;
        yi0 yi0Var;
        yi0 yi0Var2;
        yi0 yi0Var3;
        yi0 yi0Var4;
        yi0 yi0Var5;
        yi0 yi0Var6;
        yi0 yi0Var7;
        JSONObject jSONObject2;
        s22 s22Var2 = s22Var;
        jSONObject = s22Var2.f11624a;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        yi0Var = s22Var2.f11625b;
        if (yi0Var.a() != -2) {
            if (yi0Var.a() != 1) {
                throw new fz1(1);
            }
            if (yi0Var.f() != null) {
                io0.d(TextUtils.join(", ", yi0Var.f()));
            }
            throw new fz1(2, "Error building request URL.");
        }
        HashMap hashMap = new HashMap();
        yi0Var2 = s22Var2.f11625b;
        if (yi0Var2.h() && !TextUtils.isEmpty(this.f12062a)) {
            hashMap.put("Cookie", this.f12062a);
        }
        yi0Var3 = s22Var2.f11625b;
        String str = "";
        if (yi0Var3.i()) {
            jSONObject2 = s22Var2.f11624a;
            JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                a3.r1.k("DSID signal does not exist.");
            }
        }
        yi0Var4 = s22Var2.f11625b;
        if (yi0Var4 != null) {
            yi0Var6 = s22Var2.f11625b;
            if (!TextUtils.isEmpty(yi0Var6.d())) {
                yi0Var7 = s22Var2.f11625b;
                str = yi0Var7.d();
            }
        }
        yi0Var5 = s22Var2.f11625b;
        return new o22(yi0Var5.e(), optInt, hashMap, str.getBytes(c43.f3729c), "");
    }
}
