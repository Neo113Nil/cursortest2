package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwsHeader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zn {
    public static byte[] a(byte[] bArr) {
        if (u82.f32873a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(u82.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                if (i4 != 0) {
                    sb.append(StringUtils.COMMA);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                sb.append("{\"k\":\"");
                sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                sb.append("\",\"kid\":\"");
                sb.append(jSONObject2.getString(JwsHeader.KEY_ID).replace('-', '+').replace('_', '/'));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return u82.c(sb.toString());
        } catch (JSONException e4) {
            ms0.a("ClearKeyUtil", "Failed to adjust response data: ".concat(u82.a(bArr)), e4);
            return bArr;
        }
    }
}
