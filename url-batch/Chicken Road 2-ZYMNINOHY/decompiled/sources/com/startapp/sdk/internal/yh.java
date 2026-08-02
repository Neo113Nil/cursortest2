package com.startapp.sdk.internal;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class yh implements yf {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7965a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7966b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f7967c = Executors.newScheduledThreadPool(1, new u5("scheduler"));

    public yh(Context context) {
        this.f7965a = new WeakReference(context);
    }

    @Override // com.startapp.sdk.internal.yf
    public final boolean a(de deVar, long j4) {
        Context context = (Context) this.f7965a.get();
        if (context == null) {
            return false;
        }
        return new wh(this, deVar, j4).a(context, deVar.f6809a, new xh(), null);
    }

    @Override // com.startapp.sdk.internal.yf
    public final synchronized boolean a(int i4) {
        Future future = (Future) this.f7966b.get(Integer.valueOf(i4));
        if (future == null) {
            return false;
        }
        this.f7966b.remove(Integer.valueOf(i4));
        return future.cancel(true);
    }
}
