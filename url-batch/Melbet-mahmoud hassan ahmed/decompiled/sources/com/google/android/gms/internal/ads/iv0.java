package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
/* loaded from: classes.dex */
public class iv0 extends lu0 {
    public iv0(eu0 eu0Var, ar arVar, boolean z6) {
        super(eu0Var, arVar, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse z0(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof eu0)) {
            io0.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        eu0 eu0Var = (eu0) webView;
        ml0 ml0Var = this.f8092z;
        if (ml0Var != null) {
            ml0Var.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.C(str, map);
        }
        if (eu0Var.E0() != null) {
            eu0Var.E0().e0();
        }
        String str2 = (String) sw.c().b(eu0Var.w().i() ? m10.J : eu0Var.N0() ? m10.I : m10.H);
        y2.t.q();
        return a3.g2.b(eu0Var.getContext(), eu0Var.l().f10301f, str2);
    }
}
