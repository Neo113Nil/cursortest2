package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class wk implements rk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7848a;

    public wk(Context context) {
        boolean isUiContext;
        Context createWindowContext;
        kotlin.jvm.internal.i.e(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            isUiContext = context.isUiContext();
            if (!isUiContext) {
                createWindowContext = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
                this.f7848a = createWindowContext;
                return;
            }
        }
        this.f7848a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r1 != null) goto L12;
     */
    @Override // com.startapp.sdk.internal.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a() {
        String str;
        try {
            str = WebSettings.getDefaultUserAgent(this.f7848a);
        } catch (Throwable th) {
            d9.a(th);
            str = null;
        }
        if (str != null) {
            if (AbstractC1510g.j0(str)) {
                str = null;
            }
        }
        try {
            str = System.getProperty("http.agent");
            if (str == null) {
                return null;
            }
            if (AbstractC1510g.j0(str)) {
                return null;
            }
            return str;
        } catch (Throwable th2) {
            d9.a(th2);
            return null;
        }
    }

    @Override // com.startapp.sdk.internal.rk
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.rk
    public final WebView c() {
        return new WebView(this.f7848a);
    }
}
