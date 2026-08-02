package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7851a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f7852b;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f7854d = new R1.n(24, this);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f7853c = new Handler(Looper.getMainLooper());

    public x1(Context context, wd wdVar) {
        this.f7851a = context;
        this.f7852b = new w1(this, wdVar);
    }

    public abstract void a();
}
