package com.moat.analytics.mobile.tjy;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
class v extends MoatFactory {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference f7303c = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final bl f7304a = new bm();

    /* renamed from: b, reason: collision with root package name */
    private final a f7305b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.moat.analytics.mobile.tjy.as] */
    v(Activity activity) {
        if (f7303c.get() == null) {
            an anVar = new an();
            try {
                anVar = new as(ab.instance);
            } catch (Exception e) {
                com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            }
            f7303c.compareAndSet(null, anVar);
        }
        this.f7305b = new c(activity, (ap) f7303c.get());
        this.f7305b.b();
    }

    private NativeDisplayTracker a(View view, String str) {
        com.moat.analytics.mobile.tjy.base.asserts.a.a(view);
        ap apVar = (ap) f7303c.get();
        return (NativeDisplayTracker) ay.a(apVar, new y(this, new WeakReference(view), apVar, str), new ag());
    }

    private NativeVideoTracker a(String str) {
        ap apVar = (ap) f7303c.get();
        return (NativeVideoTracker) ay.a(apVar, new z(this, apVar, str), new ai());
    }

    private WebAdTracker a(ViewGroup viewGroup) {
        com.moat.analytics.mobile.tjy.base.asserts.a.a(viewGroup);
        ap apVar = (ap) f7303c.get();
        return (WebAdTracker) ay.a(apVar, new x(this, new WeakReference(viewGroup), apVar), new bk());
    }

    private WebAdTracker a(WebView webView) {
        com.moat.analytics.mobile.tjy.base.asserts.a.a(webView);
        WeakReference weakReference = new WeakReference(webView);
        ap apVar = (ap) f7303c.get();
        return (WebAdTracker) ay.a(apVar, new w(this, weakReference, apVar), new bk());
    }

    public Object a(ac acVar) {
        return acVar.a(this.f7305b, (ap) f7303c.get());
    }

    @Override // com.moat.analytics.mobile.tjy.MoatFactory
    public Object createCustomTracker(ac acVar) {
        try {
            return a(acVar);
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            return acVar.a();
        }
    }

    @Override // com.moat.analytics.mobile.tjy.MoatFactory
    public NativeDisplayTracker createNativeDisplayTracker(View view, String str) {
        try {
            return a(view, str);
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            return new al();
        }
    }

    @Override // com.moat.analytics.mobile.tjy.MoatFactory
    public NativeVideoTracker createNativeVideoTracker(String str) {
        try {
            return a(str);
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            return new am();
        }
    }

    @Override // com.moat.analytics.mobile.tjy.MoatFactory
    public WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
        try {
            return a(viewGroup);
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            return new ao();
        }
    }

    @Override // com.moat.analytics.mobile.tjy.MoatFactory
    public WebAdTracker createWebAdTracker(WebView webView) {
        try {
            return a(webView);
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            return new ao();
        }
    }

    @Override // com.moat.analytics.mobile.tjy.MoatFactory
    public WebAdTracker createWebDisplayTracker(ViewGroup viewGroup) {
        return createWebAdTracker(viewGroup);
    }

    @Override // com.moat.analytics.mobile.tjy.MoatFactory
    public WebAdTracker createWebDisplayTracker(WebView webView) {
        return createWebAdTracker(webView);
    }
}
