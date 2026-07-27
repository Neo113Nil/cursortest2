package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0966s1;

/* loaded from: classes.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0966s1 f9688a;

    public AppMetricaInitializerJsInterface(C0966s1 c0966s1) {
        this.f9688a = c0966s1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f9688a.c(str);
    }
}
