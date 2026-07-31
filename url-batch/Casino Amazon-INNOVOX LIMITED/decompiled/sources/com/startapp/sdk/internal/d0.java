package com.startapp.sdk.internal;

import android.content.DialogInterface;
import android.webkit.WebView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class d0 implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f207a;

    public d0(WebView webView) {
        this.f207a = webView;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f207a.stopLoading();
    }
}
