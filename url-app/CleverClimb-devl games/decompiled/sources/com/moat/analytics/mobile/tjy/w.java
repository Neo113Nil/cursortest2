package com.moat.analytics.mobile.tjy;

import android.util.Log;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class w implements ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f7306a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f7307b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f7308c;

    w(v vVar, WeakReference weakReference, ap apVar) {
        this.f7308c = vVar;
        this.f7306a = weakReference;
        this.f7307b = apVar;
    }

    @Override // com.moat.analytics.mobile.tjy.ba
    public com.moat.analytics.mobile.tjy.base.functional.a a() {
        a aVar;
        WebView webView = (WebView) this.f7306a.get();
        boolean b2 = this.f7307b.b();
        if (webView == null) {
            if (b2) {
                Log.e("MoatFactory", "Target ViewGroup is null. Not creating WebAdTracker.");
            }
            return com.moat.analytics.mobile.tjy.base.functional.a.a();
        }
        if (b2) {
            Log.d("MoatFactory", "Creating WebAdTracker for " + webView.getClass().getSimpleName() + "@" + webView.hashCode());
        }
        aVar = this.f7308c.f7305b;
        return com.moat.analytics.mobile.tjy.base.functional.a.a(new bj(webView, aVar, this.f7307b));
    }
}
