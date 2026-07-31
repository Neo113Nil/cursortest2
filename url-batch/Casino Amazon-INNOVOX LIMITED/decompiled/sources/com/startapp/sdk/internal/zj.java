package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.text.StringsKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class zj implements uj {

    /* renamed from: a, reason: collision with root package name */
    public final Context f530a;

    public zj(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f530a = context;
            return;
        }
        Context createWindowContext = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
        createWindowContext.getClass();
        this.f530a = createWindowContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r1 != null) goto L12;
     */
    @Override // com.startapp.sdk.internal.uj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a() {
        String str;
        try {
            str = WebSettings.getDefaultUserAgent(this.f530a);
        } catch (Throwable th) {
            n8.a(th);
            str = null;
        }
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
        }
        try {
            str = System.getProperty("http.agent");
            if (str == null) {
                return null;
            }
            if (StringsKt.isBlank(str)) {
                return null;
            }
            return str;
        } catch (Throwable th2) {
            n8.a(th2);
            return null;
        }
    }

    @Override // com.startapp.sdk.internal.uj
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.uj
    public final WebView c() {
        return new WebView(this.f530a);
    }
}
