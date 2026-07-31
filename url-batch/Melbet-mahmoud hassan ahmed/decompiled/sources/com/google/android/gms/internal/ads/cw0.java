package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class cw0 {

    /* renamed from: a, reason: collision with root package name */
    private po0 f3964a;

    /* renamed from: b, reason: collision with root package name */
    private Context f3965b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f3966c;

    public final cw0 c(Context context) {
        this.f3966c = new WeakReference<>(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f3965b = context;
        return this;
    }

    public final cw0 d(po0 po0Var) {
        this.f3964a = po0Var;
        return this;
    }
}
