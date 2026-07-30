package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061h0 extends AbstractC0074k0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0061h0(String webViewName, String identifier, String gesture, String str) {
        super(webViewName, "EmbeddedToolbarItemAction", r5);
        Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(gesture, "gesture");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", identifier);
        jSONObject.put("gesture", gesture);
        if (str != null && str.length() != 0) {
            jSONObject.put("copyToastText", str);
        } else {
            jSONObject.put("copyToastText", JSONObject.NULL);
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "obj.toString()");
    }
}
