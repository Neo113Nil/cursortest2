package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public final class ez2 {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final ez2 f4922b = new ez2();

    /* renamed from: a, reason: collision with root package name */
    private Context f4923a;

    private ez2() {
    }

    public static ez2 b() {
        return f4922b;
    }

    public final Context a() {
        return this.f4923a;
    }

    public final void c(Context context) {
        this.f4923a = context != null ? context.getApplicationContext() : null;
    }
}
