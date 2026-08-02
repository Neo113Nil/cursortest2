package com.startapp.sdk.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public final class lf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f4110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf f4111b;

    public lf(pf pfVar, Activity activity) {
        this.f4111b = pfVar;
        this.f4110a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4111b.b(this.f4110a);
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
