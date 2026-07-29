package com.moat.analytics.mobile.tjy;

import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class y implements ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f7312a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f7313b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f7314c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ v f7315d;

    y(v vVar, WeakReference weakReference, ap apVar, String str) {
        this.f7315d = vVar;
        this.f7312a = weakReference;
        this.f7313b = apVar;
        this.f7314c = str;
    }

    @Override // com.moat.analytics.mobile.tjy.ba
    public com.moat.analytics.mobile.tjy.base.functional.a a() {
        a aVar;
        View view = (View) this.f7312a.get();
        if (view == null) {
            if (this.f7313b.b()) {
                Log.e("MoatFactory", "Target view is null. Not creating NativeDisplayTracker.");
            }
            return com.moat.analytics.mobile.tjy.base.functional.a.a();
        }
        if (this.f7313b.b()) {
            Log.d("MoatFactory", "Creating NativeDisplayTracker for " + view.getClass().getSimpleName() + "@" + view.hashCode());
        }
        String str = this.f7314c;
        aVar = this.f7315d.f7305b;
        return com.moat.analytics.mobile.tjy.base.functional.a.a(new af(view, str, aVar, this.f7313b));
    }
}
