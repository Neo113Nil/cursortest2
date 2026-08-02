package com.startapp.sdk.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public final class lf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f7238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf f7239b;

    public lf(pf pfVar, Activity activity) {
        this.f7239b = pfVar;
        this.f7238a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7239b.b(this.f7238a);
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
