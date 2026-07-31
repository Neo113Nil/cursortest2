package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    private s f19356a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19357b = false;

    r(s sVar) {
        this.f19356a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f19357b) {
            return "";
        }
        this.f19357b = true;
        return this.f19356a.b();
    }
}
