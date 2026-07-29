package com.moat.analytics.mobile.tjy;

import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class x implements ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f7309a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f7310b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f7311c;

    x(v vVar, WeakReference weakReference, ap apVar) {
        this.f7311c = vVar;
        this.f7309a = weakReference;
        this.f7310b = apVar;
    }

    @Override // com.moat.analytics.mobile.tjy.ba
    public com.moat.analytics.mobile.tjy.base.functional.a a() {
        bl blVar;
        a aVar;
        ViewGroup viewGroup = (ViewGroup) this.f7309a.get();
        boolean b2 = this.f7310b.b();
        if (viewGroup == null) {
            if (b2) {
                Log.e("MoatFactory", "Target ViewGroup is null. Not creating WebAdTracker.");
            }
            return com.moat.analytics.mobile.tjy.base.functional.a.a();
        }
        if (b2) {
            Log.d("MoatFactory", "Creating WebAdTracker for " + viewGroup.getClass().getSimpleName() + "@" + viewGroup.hashCode());
        }
        blVar = this.f7311c.f7304a;
        com.moat.analytics.mobile.tjy.base.functional.a a2 = blVar.a(viewGroup);
        boolean c2 = a2.c();
        if (b2) {
            StringBuilder sb = new StringBuilder("WebView ");
            sb.append(c2 ? "" : "not ");
            sb.append("found inside of ad container.");
            Log.e("MoatFactory", sb.toString());
        }
        WebView webView = (WebView) a2.c(null);
        aVar = this.f7311c.f7305b;
        return com.moat.analytics.mobile.tjy.base.functional.a.a(new bj(webView, aVar, this.f7310b));
    }
}
