package com.aiming.mdt.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.aiming.mdt.a.ʻʼʽˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0038 extends WebView {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f57 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f58 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f59 = 3;

    public C0038(Context context) {
        super(context);
        try {
            WebSettings settings = getSettings();
            if (Build.VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(true);
                settings.setAllowUniversalAccessFromFileURLs(true);
            }
            settings.setBlockNetworkImage(false);
            settings.setBlockNetworkLoads(false);
            settings.setBuiltInZoomControls(false);
            settings.setCacheMode(2);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(false);
            settings.setEnableSmoothTransition(false);
            settings.setGeolocationEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setJavaScriptEnabled(true);
            settings.setLightTouchEnabled(false);
            settings.setLoadsImagesAutomatically(true);
            if (Build.VERSION.SDK_INT >= 17) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                settings.setMixedContentMode(1);
            }
            settings.setNeedInitialFocus(true);
            settings.setPluginState(WebSettings.PluginState.OFF);
            settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
            settings.setSaveFormData(false);
            settings.setSavePassword(false);
            settings.setSupportMultipleWindows(false);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            settings.setSupportZoom(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getFilesDir().getAbsolutePath());
            sb.append(m77(true, 94, 6, "\bￔ\n\r\b\u0006", 1).intern());
            String obj = sb.toString();
            settings.setAppCachePath(obj);
            settings.setAppCacheMaxSize(20000000L);
            settings.setAppCacheEnabled(true);
            settings.setDatabasePath(obj);
            settings.setDatabaseEnabled(true);
            settings.setCacheMode(1);
            settings.setLoadWithOverviewMode(true);
            setHorizontalScrollBarEnabled(false);
            setVerticalScrollBarEnabled(false);
            setInitialScale(0);
            setBackgroundColor(0);
            setBackgroundResource(0);
            addJavascriptInterface(new C0179(), m77(true, 110, 3, "\ufff9\b\u0000", 2).intern());
            setWebViewClient(new C0154(this));
        } catch (Exception unused) {
            m77(false, 96, 21, "\f\b\u001aￃ\f\u0011\f\u0017ￃ\b\u0015\u0015\u0012\u0015\uffdd￭\ufff6\ufffa\b\u0005\ufff9", 15).intern();
            C0044.m109();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m77(boolean z, int i, int i2, String str, int i3) {
        char[] cArr;
        int i4 = f57 + 41;
        f58 = i4 % 128;
        int i5 = i4 % 2;
        char[] charArray = str.toCharArray();
        char[] cArr2 = new char[i2];
        int i6 = f57 + 119;
        f58 = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            if ((i8 < i2 ? 'Y' : '0') != 'Y') {
                break;
            }
            cArr2[i8] = (char) (charArray[i8] + i);
            cArr2[i8] = (char) (cArr2[i8] - f59);
            i8++;
        }
        if (i3 > 0) {
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            int i9 = i2 - i3;
            System.arraycopy(cArr3, 0, cArr2, i9, i3);
            System.arraycopy(cArr3, i3, cArr2, 0, i9);
        }
        if ((z ? 'c' : (char) 3) == 'c') {
            int i10 = f57 + 97;
            f58 = i10 % 128;
            int i11 = i10 % 2;
            cArr = new char[i2];
            int i12 = 0;
            while (true) {
                if (!(i12 < i2)) {
                    break;
                }
                cArr[i12] = cArr2[(i2 - i12) - 1];
                i12++;
            }
        } else {
            cArr = cArr2;
        }
        return new String(cArr);
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        int i;
        int i2;
        String str2;
        int i3;
        int i4 = f58 + 47;
        f57 = i4 % 128;
        if ((i4 % 2 == 0 ? 'S' : 'P') != 'S') {
            i = 102;
            i2 = 26;
            str2 = "\u0002\u0014\f\u000f\b￩\f\ufffe\u0001\uffe7\ufffe\u0013\ufffe\u0010\u0000\u000f\u0006\r\u0011ￗ\uffe7\ufff0￣\u000f\ufffe\n";
            i3 = 20;
        } else {
            i = 81;
            i2 = 85;
            str2 = "\u0002\u0014\f\u000f\b￩\f\ufffe\u0001\uffe7\ufffe\u0013\ufffe\u0010\u0000\u000f\u0006\r\u0011ￗ\uffe7\ufff0￣\u000f\ufffe\n";
            i3 = 89;
        }
        m77(false, i, i2, str2, i3).intern();
        C0044.m108();
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        int i = f57 + 11;
        f58 = i % 128;
        (!(i % 2 != 0) ? m77(false, 100, 19, "\ufff4\u0011\u000b\uffd9￩\ufff2￥\u0011\u0000\f\u0004\u0016\u000e\u0011\n￫\u000e\u0000\u0003", 4) : m77(false, 118, 85, "\ufff4\u0011\u000b\uffd9￩\ufff2￥\u0011\u0000\f\u0004\u0016\u000e\u0011\n￫\u000e\u0000\u0003", 2)).intern();
        C0044.m108();
        super.loadUrl(str);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m78(String str, ValueCallback valueCallback) {
        C0195.m731().m736(new RunnableC0133(this, str, valueCallback));
        int i = f58 + 117;
        f57 = i % 128;
        if (!(i % 2 == 0)) {
            return;
        }
        Object obj = null;
        super.hashCode();
    }
}
