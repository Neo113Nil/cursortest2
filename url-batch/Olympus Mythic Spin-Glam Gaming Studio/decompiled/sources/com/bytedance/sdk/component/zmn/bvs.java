package com.bytedance.sdk.component.zmn;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes13.dex */
public class bvs {
    Context btk;
    klz bvs;
    nps fb;
    zmn fs;
    boolean hhw;
    boolean mw;
    boolean nps;
    rc zg;
    WebView zmn;
    String zn = "IESJSBridge";
    String iv = "host";
    final Set<String> rc = new LinkedHashSet();
    final Set<String> klz = new LinkedHashSet();

    bvs(WebView webView) {
        this.zmn = webView;
    }

    bvs() {
    }

    public bvs zmn(zmn zmnVar) {
        this.fs = zmnVar;
        return this;
    }

    public bvs zmn(String str) {
        this.zn = str;
        return this;
    }

    public bvs zmn(iv ivVar) {
        this.fb = nps.zmn(ivVar);
        return this;
    }

    public bvs zmn(boolean z) {
        this.hhw = z;
        return this;
    }

    public bvs fs(boolean z) {
        this.nps = z;
        return this;
    }

    public cn zmn() {
        fs();
        return new cn(this);
    }

    private void fs() {
        if ((this.zmn == null && !this.mw && this.fs == null) || ((TextUtils.isEmpty(this.zn) && this.zmn != null) || this.fb == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
