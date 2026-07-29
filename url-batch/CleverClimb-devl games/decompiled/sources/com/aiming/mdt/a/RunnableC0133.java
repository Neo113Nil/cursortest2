package com.aiming.mdt.a;

import android.os.Build;
import android.webkit.ValueCallback;

/* renamed from: com.aiming.mdt.a.ʼʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0133 implements Runnable {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f417;

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ String f418;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ C0038 f419;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ ValueCallback f420;

    RunnableC0133(C0038 c0038, String str, ValueCallback valueCallback) {
        this.f419 = c0038;
        this.f418 = str;
        this.f420 = valueCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!(Build.VERSION.SDK_INT >= 19)) {
            this.f419.loadUrl(this.f418);
        } else {
            this.f419.evaluateJavascript(this.f418, this.f420);
        }
    }
}
