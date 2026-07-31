package com.startapp.sdk.internal;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class hh implements gf {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f266a;
    public final HashMap b = new HashMap();
    public final ScheduledExecutorService c = Executors.newScheduledThreadPool(1, new k5("scheduler"));

    public hh(Context context) {
        this.f266a = new WeakReference(context);
    }

    @Override // com.startapp.sdk.internal.gf
    public final boolean a(pd pdVar, long j) {
        Context context = (Context) this.f266a.get();
        if (context == null) {
            return false;
        }
        return new fh(this, pdVar, j).a(context, pdVar.f380a, new gh(), null);
    }

    @Override // com.startapp.sdk.internal.gf
    public final synchronized boolean a(int i) {
        Future future = (Future) this.b.get(Integer.valueOf(i));
        if (future == null) {
            return false;
        }
        this.b.remove(Integer.valueOf(i));
        return future.cancel(true);
    }
}
