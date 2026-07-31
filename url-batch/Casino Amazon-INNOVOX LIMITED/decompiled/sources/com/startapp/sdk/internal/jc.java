package com.startapp.sdk.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class jc extends tj {

    /* renamed from: a, reason: collision with root package name */
    public final wb f289a;
    public final xb b;

    public jc(r1 r1Var, BannerStandard.a aVar) {
        this.f289a = r1Var;
        this.b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        xb xbVar;
        if (webView == null || str == null || (xbVar = this.b) == null) {
            return;
        }
        xbVar.onPageFinished(str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!hc.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        xb xbVar = this.b;
        if (xbVar != null) {
            xbVar.onMraidDetected();
        }
        return ((hc) com.startapp.sdk.components.a.a(webView.getContext()).R.a()).b();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        if (webView == null || str == null || zh.c(webView.getContext(), str)) {
            return true;
        }
        if (!str.startsWith("mraid://")) {
            return this.f289a.open(str);
        }
        String[] strArr = {"close", WebViewManager.EVENT_TYPE_RESIZE};
        String str3 = "useCustomClose";
        String[] strArr2 = {"createCalendarEvent", "expand", "open", "playVideo", "storePicture", "useCustomClose"};
        String[] strArr3 = {"setOrientationProperties", "setResizeProperties"};
        try {
            HashMap a2 = gc.a(str);
            if (a2 == null || (str2 = (String) a2.get("command")) == null) {
                return false;
            }
            if (Arrays.asList(strArr).contains(str2)) {
                wb.class.getDeclaredMethod(str2, null).invoke(this.f289a, null);
            } else if (Arrays.asList(strArr2).contains(str2)) {
                Method declaredMethod = wb.class.getDeclaredMethod(str2, String.class);
                int hashCode = str2.hashCode();
                if (hashCode != -733616544) {
                    if (hashCode == 1614272768 && str2.equals("useCustomClose")) {
                        declaredMethod.invoke(this.f289a, (String) a2.get(str3));
                    }
                    str3 = ImagesContract.URL;
                    declaredMethod.invoke(this.f289a, (String) a2.get(str3));
                } else {
                    if (str2.equals("createCalendarEvent")) {
                        str3 = "eventJSON";
                        declaredMethod.invoke(this.f289a, (String) a2.get(str3));
                    }
                    str3 = ImagesContract.URL;
                    declaredMethod.invoke(this.f289a, (String) a2.get(str3));
                }
            } else if (Arrays.asList(strArr3).contains(str2)) {
                wb.class.getDeclaredMethod(str2, Map.class).invoke(this.f289a, a2);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
