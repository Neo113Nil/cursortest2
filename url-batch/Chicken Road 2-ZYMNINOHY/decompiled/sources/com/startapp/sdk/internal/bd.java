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
    public final v1 f6714a;

    /* renamed from: b, reason: collision with root package name */
    public final BannerStandard.a f6715b;

    public bd(v1 v1Var, BannerStandard.a aVar) {
        this.f6714a = v1Var;
        this.f6715b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        BannerStandard.a aVar;
        if (webView == null || str == null || (aVar = this.f6715b) == null) {
            return;
        }
        aVar.onPageFinished(str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!zc.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        BannerStandard.a aVar = this.f6715b;
        if (aVar != null) {
            aVar.onMraidDetected();
        }
        return ((zc) com.startapp.sdk.components.a.a(webView.getContext()).f6559T.a()).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        char c4;
        if (webView == null || str == null || si.c(webView.getContext(), str)) {
            return true;
        }
        if (!str.startsWith("mraid://")) {
            return this.f6714a.open(str);
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
                oc.class.getDeclaredMethod(str2, null).invoke(this.f6714a, null);
            } else if (Arrays.asList(strArr2).contains(str2)) {
                Method declaredMethod = oc.class.getDeclaredMethod(str2, String.class);
                int hashCode = str2.hashCode();
                String str3 = "useCustomClose";
                if (hashCode != -733616544) {
                    if (hashCode == 1614272768 && str2.equals("useCustomClose")) {
                        c4 = 1;
                        if (c4 != 0) {
                            str3 = "eventJSON";
                        } else if (c4 != 1) {
                            str3 = "url";
                        }
                        declaredMethod.invoke(this.f6714a, (String) a3.get(str3));
                    }
                    c4 = 65535;
                    if (c4 != 0) {
                    }
                    declaredMethod.invoke(this.f6714a, (String) a3.get(str3));
                } else {
                    if (str2.equals("createCalendarEvent")) {
                        c4 = 0;
                        if (c4 != 0) {
                        }
                        declaredMethod.invoke(this.f6714a, (String) a3.get(str3));
                    }
                    c4 = 65535;
                    if (c4 != 0) {
                    }
                    declaredMethod.invoke(this.f6714a, (String) a3.get(str3));
                }
            } else if (Arrays.asList(strArr3).contains(str2)) {
                oc.class.getDeclaredMethod(str2, Map.class).invoke(this.f6714a, a3);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
