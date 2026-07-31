package com.onevcat.uniwebview;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class C extends D {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C(String webViewName, String url) {
        super(webViewName, "ShouldUniWebViewHandleRequest", r3);
        Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        Intrinsics.checkNotNullParameter(url, "url");
        String jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to(ImagesContract.URL, url))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "obj.toString()");
    }
}
