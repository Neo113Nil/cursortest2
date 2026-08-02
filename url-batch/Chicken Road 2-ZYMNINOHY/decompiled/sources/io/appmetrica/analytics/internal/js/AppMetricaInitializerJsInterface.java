package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0963t1;

/* loaded from: classes.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0963t1 f13119a;

    public AppMetricaInitializerJsInterface(C0963t1 c0963t1) {
        this.f13119a = c0963t1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f13119a.c(str);
    }
}
