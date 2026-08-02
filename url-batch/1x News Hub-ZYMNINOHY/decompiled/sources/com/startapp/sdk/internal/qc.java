package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes.dex */
public abstract class qc {
    public static void a(Context context, int i3, int i4, int i5, int i6, WebView webView) {
        si.a(webView, true, "mraid.setCurrentPosition", Integer.valueOf(ii.b(context, i3)), Integer.valueOf(Math.round(i4 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i5 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i6 / context.getResources().getDisplayMetrics().density)));
    }

    public static void b(Context context, int i3, int i4, int i5, int i6, WebView webView) {
        si.a(webView, true, "mraid.setDefaultPosition", Integer.valueOf(ii.b(context, i3)), Integer.valueOf(Math.round(i4 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i5 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i6 / context.getResources().getDisplayMetrics().density)));
    }

    public static void a(WebView webView, String str, String str2) {
        si.a(webView, true, "mraid.fireErrorEvent", str, str2);
    }
}
