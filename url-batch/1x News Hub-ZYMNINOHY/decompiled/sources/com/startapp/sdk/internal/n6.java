package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class n6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0292k f4186b;

    public n6(Context context, C0292k c0292k) {
        this.f4185a = context;
        this.f4186b = c0292k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            e7.a(this.f4185a, "startapp_ads");
            new Handler(Looper.getMainLooper()).post(new m6(this));
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
