package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C2872p1;

/* loaded from: classes3.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C2872p1 f40421a;

    public AppMetricaInitializerJsInterface(@NonNull C2872p1 c2872p1) {
        this.f40421a = c2872p1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f40421a.c(str);
    }
}
