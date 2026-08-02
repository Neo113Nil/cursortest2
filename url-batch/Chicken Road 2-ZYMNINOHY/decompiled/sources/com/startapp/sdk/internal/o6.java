package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* loaded from: classes.dex */
public final class o6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0369j f7362b;

    public o6(Context context, C0369j c0369j) {
        this.f7361a = context;
        this.f7362b = c0369j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new com.startapp.sdk.adsbase.cache.a(this, e7.c(this.f7361a, "startapp_ads".concat(File.separator).concat("keys"))));
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
