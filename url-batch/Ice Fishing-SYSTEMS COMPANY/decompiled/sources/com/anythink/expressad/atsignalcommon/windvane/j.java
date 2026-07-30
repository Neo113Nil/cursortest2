package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: f, reason: collision with root package name */
    protected Context f18235f;

    /* renamed from: g, reason: collision with root package name */
    protected Object f18236g;

    /* renamed from: h, reason: collision with root package name */
    protected WindVaneWebView f18237h;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f18235f = context;
        this.f18237h = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f18236g = obj;
        this.f18237h = windVaneWebView;
    }
}
