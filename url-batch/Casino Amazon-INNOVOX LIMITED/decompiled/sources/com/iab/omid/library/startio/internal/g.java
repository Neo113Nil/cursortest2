package com.iab.omid.library.startio.internal;

import android.content.Context;

/* loaded from: classes2.dex */
public class g {
    private static g b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f36a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public Context a() {
        return this.f36a;
    }

    public void a(Context context) {
        this.f36a = context != null ? context.getApplicationContext() : null;
    }
}
