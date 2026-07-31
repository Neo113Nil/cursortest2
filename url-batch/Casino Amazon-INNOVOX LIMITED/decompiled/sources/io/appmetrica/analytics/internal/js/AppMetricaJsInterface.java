package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0541u1;

/* loaded from: classes3.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0541u1 f1610a;

    public AppMetricaJsInterface(C0541u1 c0541u1) {
        this.f1610a = c0541u1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f1610a.d(str, str2);
    }
}
