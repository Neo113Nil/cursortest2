package com.onevcat.uniwebview;

import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Y1 {
    public final String a;
    public final String b;
    public final String c;
    public final JSONObject d;

    public Y1(String identifier, String resultCode, String data, Map map) {
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

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("identifier", this.a);
        hashMap.put("resultCode", this.b);
        hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.c);
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            hashMap.put("extra", String.valueOf(jSONObject));
        }
        String jSONObject2 = new JSONObject(hashMap).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "obj.toString()");
        return jSONObject2;
    }
}
