package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class f6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f235a;
    public final /* synthetic */ j b;

    public f6(Context context, j jVar) {
        this.f235a = context;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new com.startapp.sdk.adsbase.cache.a(this, z6.c(this.f235a, "startapp_ads".concat(File.separator).concat("keys"))));
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
