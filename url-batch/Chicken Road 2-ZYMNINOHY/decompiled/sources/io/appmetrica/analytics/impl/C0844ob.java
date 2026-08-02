package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844ob {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f12508a;

    /* renamed from: b, reason: collision with root package name */
    public final I2 f12509b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC0870pb f12510c;

    public C0844ob(Handler handler, I2 i22) {
        this.f12508a = handler;
        this.f12509b = i22;
        this.f12510c = new RunnableC0870pb(handler, i22);
    }

    public static void a(Handler handler, I2 i22, Runnable runnable) {
        handler.removeCallbacks(runnable, i22.f10390b.f10356b.getApiKey());
        handler.postAtTime(runnable, i22.f10390b.f10356b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(i22.f10390b.f10356b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
