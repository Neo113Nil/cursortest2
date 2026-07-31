package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ironsource.b9;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.dk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1883dk extends WebView {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f24653a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1883dk(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24653a = new LinkedHashMap();
        g();
    }

    private final String a(String str) {
        return str + c() + "<body style='margin:0; padding:0;'>";
    }

    private final void g() {
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setAllowFileAccess(false);
        if (C2385z9.a(11)) {
            settings.setAllowContentAccess(false);
            if (C2385z9.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    @Override // android.webkit.WebView
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public final void addJavascriptInterface(@NotNull Object any, @NotNull String jsName) {
        Intrinsics.checkNotNullParameter(any, "any");
        Intrinsics.checkNotNullParameter(jsName, "jsName");
        super.addJavascriptInterface(any, jsName);
        this.f24653a.put(jsName, any);
    }

    public final void b(@NotNull String sourcePageData) {
        Intrinsics.checkNotNullParameter(sourcePageData, "sourcePageData");
        loadDataWithBaseURL("https://yandex.ru", a(sourcePageData), "text/html", "UTF-8", null);
    }

    @NotNull
    public String c() {
        return "";
    }

    public void d() {
        lh2.a((ViewGroup) this);
        Iterator it = this.f24653a.keySet().iterator();
        while (it.hasNext()) {
            removeJavascriptInterface((String) it.next());
        }
        this.f24653a.clear();
        destroy();
        ap0.f(getClass().toString());
    }

    public final void e() {
        int i4 = C2362y9.f34935b;
        try {
            WebView.class.getDeclaredMethod(b9.h.f15505t0, null).invoke(this, null);
        } catch (Exception unused) {
        }
        ap0.d(getClass().toString());
    }

    public final void f() {
        int i4 = C2362y9.f34935b;
        try {
            WebView.class.getDeclaredMethod(b9.h.f15507u0, null).invoke(this, null);
        } catch (Exception unused) {
        }
        ap0.d(getClass().toString());
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(@NotNull String jsName) {
        Intrinsics.checkNotNullParameter(jsName, "jsName");
        if (C2385z9.a(11)) {
            super.removeJavascriptInterface(jsName);
        }
    }

    public final void setDisplayZoomControls(boolean z4) {
        if (C2385z9.a(11)) {
            getSettings().setDisplayZoomControls(z4);
        }
    }
}
