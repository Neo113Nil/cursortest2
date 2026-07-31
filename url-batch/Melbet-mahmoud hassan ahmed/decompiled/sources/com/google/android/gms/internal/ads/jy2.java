package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class jy2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7286a;

    final void a(Context context) {
        uz2.b(context, "Application Context cannot be null");
        if (this.f7286a) {
            return;
        }
        this.f7286a = true;
        hz2.b().c(context);
        cz2.a().c(context);
        sz2.f(context);
        ez2.b().c(context);
    }

    final boolean b() {
        return this.f7286a;
    }
}
