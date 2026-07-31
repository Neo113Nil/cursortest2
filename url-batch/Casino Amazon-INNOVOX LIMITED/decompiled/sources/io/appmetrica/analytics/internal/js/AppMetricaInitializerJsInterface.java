package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0541u1;

/* loaded from: classes3.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0541u1 f1609a;

    public AppMetricaInitializerJsInterface(C0541u1 c0541u1) {
        this.f1609a = c0541u1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f1609a.c(str);
    }
}
