package com.startapp.sdk.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class bd extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f3607a;

    /* renamed from: b, reason: collision with root package name */
    public final BannerStandard.a f3608b;

    public bd(v1 v1Var, BannerStandard.a aVar) {
        this.f3607a = v1Var;
        this.f3608b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        BannerStandard.a aVar;
        if (webView == null || str == null || (aVar = this.f3608b) == null) {
            return;
        }
        aVar.onPageFinished(str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!zc.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        BannerStandard.a aVar = this.f3608b;
        if (aVar != null) {
            aVar.onMraidDetected();
        }
        return ((zc) com.startapp.sdk.components.a.a(webView.getContext()).f3461T.a()).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        char c3;
        if (webView == null || str == null || si.c(webView.getContext(), str)) {
            return true;
        }
        if (!str.startsWith("mraid://")) {
            return this.f3607a.open(str);
        }
        String[] strArr = {"close", "resize"};
        String[] strArr2 = {"createCalendarEvent", "expand", "open", "playVideo", "storePicture", "useCustomClose"};
        String[] strArr3 = {"setOrientationProperties", "setResizeProperties"};
        try {
            HashMap a3 = yc.a(str);
            if (a3 == null || (str2 = (String) a3.get("command")) == null) {
                return false;
            }
            if (Arrays.asList(strArr).contains(str2)) {
                oc.class.getDeclaredMethod(str2, new Class[0]).invoke(this.f3607a, new Object[0]);
            } else if (Arrays.asList(strArr2).contains(str2)) {
                Method declaredMethod = oc.class.getDeclaredMethod(str2, String.class);
                int hashCode = str2.hashCode();
                String str3 = "useCustomClose";
                if (hashCode != -733616544) {
                    if (hashCode == 1614272768 && str2.equals("useCustomClose")) {
                        c3 = 1;
                        if (c3 != 0) {
                            str3 = "eventJSON";
                        } else if (c3 != 1) {
                            str3 = "url";
                        }
                        declaredMethod.invoke(this.f3607a, (String) a3.get(str3));
                    }
                    c3 = 65535;
                    if (c3 != 0) {
                    }
                    declaredMethod.invoke(this.f3607a, (String) a3.get(str3));
                } else {
                    if (str2.equals("createCalendarEvent")) {
                        c3 = 0;
                        if (c3 != 0) {
                        }
                        declaredMethod.invoke(this.f3607a, (String) a3.get(str3));
                    }
                    c3 = 65535;
                    if (c3 != 0) {
                    }
                    declaredMethod.invoke(this.f3607a, (String) a3.get(str3));
                }
            } else if (Arrays.asList(strArr3).contains(str2)) {
                oc.class.getDeclaredMethod(str2, Map.class).invoke(this.f3607a, a3);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
