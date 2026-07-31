package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class yb {
    public static void a(Context context, int i, int i2, int i3, int i4, WebView webView) {
        zh.a(webView, true, "mraid.setCurrentPosition", Integer.valueOf(ph.b(context, i)), Integer.valueOf(Math.round(i2 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i3 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i4 / context.getResources().getDisplayMetrics().density)));
    }

    public static void b(Context context, int i, int i2, int i3, int i4, WebView webView) {
        zh.a(webView, true, "mraid.setDefaultPosition", Integer.valueOf(ph.b(context, i)), Integer.valueOf(Math.round(i2 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i3 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i4 / context.getResources().getDisplayMetrics().density)));
    }
}
