package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class l5 {
    public static final l5 a = new l5();
    public static WeakReference b;
    public static Application c;

    public final void a(Context context) {
        if (!(context instanceof Application)) {
            b = new WeakReference(context);
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            c = applicationContext instanceof Application ? (Application) applicationContext : null;
            return;
        }
        c = (Application) context;
    }

    public final Context a() {
        Context context;
        WeakReference weakReference = b;
        return (weakReference == null || (context = (Context) weakReference.get()) == null) ? c : context;
    }
}
