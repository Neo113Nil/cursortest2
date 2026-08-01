package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class R5 {
    /* JADX WARN: Incorrect condition in loop: B:7:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < i; i++) {
            R4 t1 = R4.A00(jSONArray, i);
            if (t1 != R4.A00(jSONArray2, i) || !t1.A05(jSONArray, jSONArray2, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        R4 A01;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next) || (A01 = R4.A01(jSONObject, next)) != R4.A01(jSONObject2, next) || !A01.A07(jSONObject, jSONObject2, next)) {
                return false;
            }
        }
        return true;
    }
}
