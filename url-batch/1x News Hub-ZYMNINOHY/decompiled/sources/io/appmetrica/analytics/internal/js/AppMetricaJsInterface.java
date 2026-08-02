package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0815s1;

/* loaded from: classes.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0815s1 f8727a;

    public AppMetricaJsInterface(C0815s1 c0815s1) {
        this.f8727a = c0815s1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f8727a.d(str, str2);
    }
}
