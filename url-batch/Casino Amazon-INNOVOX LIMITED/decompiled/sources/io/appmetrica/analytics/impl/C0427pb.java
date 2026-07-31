package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0427pb {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1431a;
    public final J2 b;
    public final RunnableC0452qb c;

    public C0427pb(Handler handler, J2 j2) {
        this.f1431a = handler;
        this.b = j2;
        this.c = new RunnableC0452qb(handler, j2);
    }

    public static void a(Handler handler, J2 j2, Runnable runnable) {
        handler.removeCallbacks(runnable, j2.b.b.getApiKey());
        handler.postAtTime(runnable, j2.b.b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(j2.b.b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
