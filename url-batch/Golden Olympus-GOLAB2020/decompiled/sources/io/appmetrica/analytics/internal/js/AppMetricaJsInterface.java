package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C2872p1;

/* loaded from: classes3.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C2872p1 f40422a;

    public AppMetricaJsInterface(@NonNull C2872p1 c2872p1) {
        this.f40422a = c2872p1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f40422a.d(str, str2);
    }
}
