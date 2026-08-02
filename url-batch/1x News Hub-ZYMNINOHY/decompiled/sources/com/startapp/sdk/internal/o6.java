package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* loaded from: classes.dex */
public final class o6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0291j f4229b;

    public o6(Context context, C0291j c0291j) {
        this.f4228a = context;
        this.f4229b = c0291j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new com.startapp.sdk.adsbase.cache.a(this, e7.c(this.f4228a, "startapp_ads".concat(File.separator).concat("keys"))));
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
