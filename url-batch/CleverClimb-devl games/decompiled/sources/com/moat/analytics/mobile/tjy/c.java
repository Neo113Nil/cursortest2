package com.moat.analytics.mobile.tjy;

import android.app.Activity;
import android.app.Application;
import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f7275a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f7276b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7277c;

    /* renamed from: d, reason: collision with root package name */
    private final ap f7278d;
    private boolean e;

    c(Activity activity, ap apVar) {
        String str;
        com.moat.analytics.mobile.tjy.base.asserts.a.a(activity);
        if (apVar.b()) {
            StringBuilder sb = new StringBuilder("Listening to Activity: ");
            if (activity != null) {
                str = activity.getClass() + "@" + activity.hashCode();
            } else {
                str = "null";
            }
            sb.append(str);
            Log.d("MoatActivityState", sb.toString());
        }
        this.f7275a = new WeakReference(activity.getApplication());
        this.f7276b = new WeakReference(activity);
        this.f7278d = apVar;
        this.f7277c = false;
    }

    @Override // com.moat.analytics.mobile.tjy.a
    public boolean a() {
        return this.e;
    }

    @Override // com.moat.analytics.mobile.tjy.a
    public void b() {
        if (this.f7277c) {
            return;
        }
        ((Application) this.f7275a.get()).registerActivityLifecycleCallbacks(new e(this));
    }

    @Override // com.moat.analytics.mobile.tjy.a
    public Activity c() {
        return (Activity) this.f7276b.get();
    }
}
