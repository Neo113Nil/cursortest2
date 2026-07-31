package com.ironsource;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public class yg {

    /* renamed from: a, reason: collision with root package name */
    private bh f20433a;

    yg(bh bhVar) {
        this.f20433a = bhVar;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f20433a.handleMessageFromAd(str);
    }
}
