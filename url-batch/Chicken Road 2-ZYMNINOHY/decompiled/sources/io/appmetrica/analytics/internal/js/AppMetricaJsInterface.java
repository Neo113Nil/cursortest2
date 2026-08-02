package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0963t1;

/* loaded from: classes.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0963t1 f13120a;

    public AppMetricaJsInterface(C0963t1 c0963t1) {
        this.f13120a = c0963t1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f13120a.d(str, str2);
    }
}
