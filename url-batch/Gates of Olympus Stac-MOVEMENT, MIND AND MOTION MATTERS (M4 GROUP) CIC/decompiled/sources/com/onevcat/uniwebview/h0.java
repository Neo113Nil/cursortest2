package com.onevcat.uniwebview;

import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 extends i0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(String webViewName, String url) {
        super(webViewName, "ShouldUniWebViewHandleRequest", r4, 0);
        Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        Intrinsics.checkNotNullParameter(url, "url");
        String jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to("url", url))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "obj.toString()");
    }
}
