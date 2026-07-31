package com.onevcat.uniwebview;

import com.google.firebase.messaging.Constants;
import com.unity3d.player.UnityPlayer;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.onevcat.uniwebview.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0042f implements c2 {
    @Override // com.onevcat.uniwebview.c2
    public final void a(String name, d2 method, Y1 payload) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(payload, "payload");
        HashMap hashMap = new HashMap();
        hashMap.put("identifier", payload.a);
        hashMap.put("resultCode", payload.b);
        hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, payload.c);
        JSONObject jSONObject = payload.d;
        if (jSONObject != null) {
            hashMap.put("extra", String.valueOf(jSONObject));
        }
        String jSONObject2 = new JSONObject(hashMap).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "obj.toString()");
        a(name, method, jSONObject2);
    }

    @Override // com.onevcat.uniwebview.c2
    public final void a(String name, d2 method, String parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        UnityPlayer.UnitySendMessage("UniWebViewAndroidStaticListener", "OnJavaMessage", name + '@' + method.name() + '@' + parameters);
    }
}
