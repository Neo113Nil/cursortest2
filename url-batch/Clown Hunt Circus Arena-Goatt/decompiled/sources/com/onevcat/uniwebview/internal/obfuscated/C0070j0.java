package com.onevcat.uniwebview.internal.obfuscated;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070j0 extends AbstractC0074k0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0070j0(String webViewName, boolean z, String url) {
        super(webViewName, "ShouldUniWebViewHandleRequest", r4);
        Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        Intrinsics.checkNotNullParameter(url, "url");
        String jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to(ImagesContract.URL, url), TuplesKt.to("isMainFrame", Boolean.valueOf(z)))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "obj.toString()");
    }
}
