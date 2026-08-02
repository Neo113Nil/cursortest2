package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class n6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0370k f7318b;

    public n6(Context context, C0370k c0370k) {
        this.f7317a = context;
        this.f7318b = c0370k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            e7.a(this.f7317a, "startapp_ads");
            new Handler(Looper.getMainLooper()).post(new m6(this));
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
