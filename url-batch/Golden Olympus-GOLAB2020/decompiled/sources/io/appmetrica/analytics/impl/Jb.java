package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes3.dex */
public final class Jb {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f37827a;

    /* renamed from: b, reason: collision with root package name */
    public final V2 f37828b;

    /* renamed from: c, reason: collision with root package name */
    public final Kb f37829c;

    public Jb(Handler handler, V2 v22) {
        this.f37827a = handler;
        this.f37828b = v22;
        this.f37829c = new Kb(handler, v22);
    }

    public static void a(Handler handler, V2 v22, Runnable runnable) {
        handler.removeCallbacks(runnable, v22.f38392b.f38818b.getApiKey());
        handler.postAtTime(runnable, v22.f38392b.f38818b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(v22.f38392b.f38818b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
