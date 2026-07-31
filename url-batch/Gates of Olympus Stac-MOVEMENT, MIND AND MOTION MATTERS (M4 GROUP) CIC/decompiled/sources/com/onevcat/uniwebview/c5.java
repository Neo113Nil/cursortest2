package com.onevcat.uniwebview;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c5 {
    public final String a;
    public final String b;
    public final String c;
    public final JSONObject d;

    public c5(String identifier, String resultCode, String data, Map map) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = identifier;
        this.b = resultCode;
        this.c = data;
        if (map != null) {
            this.d = new JSONObject(map);
        }
    }

    public final String a() {
        HashMap hashMap = new HashMap();
        hashMap.put("identifier", this.a);
        hashMap.put("resultCode", this.b);
        hashMap.put("data", this.c);
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            hashMap.put("extra", String.valueOf(jSONObject));
        }
        String jSONObject2 = new JSONObject(hashMap).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "obj.toString()");
        return jSONObject2;
    }

    public final String toString() {
        return a();
    }
}
