package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class e6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f222a;
    public final /* synthetic */ k b;

    public e6(Context context, k kVar) {
        this.f222a = context;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            z6.a(this.f222a, "startapp_ads");
            new Handler(Looper.getMainLooper()).post(new d6(this));
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
