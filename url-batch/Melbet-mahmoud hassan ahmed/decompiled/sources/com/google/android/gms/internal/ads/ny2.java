package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ny2 {

    /* renamed from: a, reason: collision with root package name */
    private final uy2 f9386a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f9387b;

    /* renamed from: c, reason: collision with root package name */
    private final List<vy2> f9388c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, vy2> f9389d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f9390e = "";

    /* renamed from: f, reason: collision with root package name */
    private final String f9391f;

    /* renamed from: g, reason: collision with root package name */
    private final oy2 f9392g;

    private ny2(uy2 uy2Var, WebView webView, String str, List<vy2> list, String str2, String str3, oy2 oy2Var) {
        this.f9386a = uy2Var;
        this.f9387b = webView;
        this.f9392g = oy2Var;
        this.f9391f = str2;
    }

    public static ny2 b(uy2 uy2Var, WebView webView, String str, String str2) {
        return new ny2(uy2Var, webView, null, null, str, "", oy2.HTML);
    }

    public static ny2 c(uy2 uy2Var, WebView webView, String str, String str2) {
        return new ny2(uy2Var, webView, null, null, str, "", oy2.JAVASCRIPT);
    }

    public final WebView a() {
        return this.f9387b;
    }

    public final oy2 d() {
        return this.f9392g;
    }

    public final uy2 e() {
        return this.f9386a;
    }

    public final String f() {
        return this.f9391f;
    }

    public final String g() {
        return this.f9390e;
    }

    public final List<vy2> h() {
        return Collections.unmodifiableList(this.f9388c);
    }

    public final Map<String, vy2> i() {
        return Collections.unmodifiableMap(this.f9389d);
    }
}
