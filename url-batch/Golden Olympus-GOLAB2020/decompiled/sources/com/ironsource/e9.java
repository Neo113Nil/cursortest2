package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* loaded from: classes2.dex */
public class e9 {

    /* renamed from: a, reason: collision with root package name */
    MutableContextWrapper f15985a;

    public Activity a() {
        return (Activity) this.f15985a.getBaseContext();
    }

    public synchronized void b() {
        this.f15985a = null;
    }

    public synchronized void a(Activity activity) {
        try {
            if (this.f15985a == null) {
                this.f15985a = new MutableContextWrapper(activity);
            }
            this.f15985a.setBaseContext(activity);
        } catch (Throwable th) {
            throw th;
        }
    }
}
