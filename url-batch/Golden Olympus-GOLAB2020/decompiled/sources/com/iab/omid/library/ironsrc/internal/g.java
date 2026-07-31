package com.iab.omid.library.ironsrc.internal;

import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f14548b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f14549a;

    private g() {
    }

    public static g b() {
        return f14548b;
    }

    public Context a() {
        return this.f14549a;
    }

    public void a(Context context) {
        this.f14549a = context != null ? context.getApplicationContext() : null;
    }
}
