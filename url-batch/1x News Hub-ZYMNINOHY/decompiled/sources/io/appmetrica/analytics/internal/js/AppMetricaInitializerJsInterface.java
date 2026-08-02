package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0815s1;

/* loaded from: classes.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0815s1 f8726a;

    public AppMetricaInitializerJsInterface(C0815s1 c0815s1) {
        this.f8726a = c0815s1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f8726a.c(str);
    }
}
