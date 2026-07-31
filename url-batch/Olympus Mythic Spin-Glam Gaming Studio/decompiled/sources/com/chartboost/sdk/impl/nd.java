package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class nd implements tl {
    @Override // com.chartboost.sdk.impl.tl
    public cd a(Context context, WebView webView, yc placementType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        return new qc(context, webView, placementType, null, null, null, 56, null);
    }

    @Override // com.chartboost.sdk.impl.tl
    public WebView a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new kd(context);
    }
}
