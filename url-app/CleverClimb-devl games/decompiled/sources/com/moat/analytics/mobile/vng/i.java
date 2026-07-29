package com.moat.analytics.mobile.vng;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private static final i f7358a = new i();
    private ScheduledFuture<?> e;
    private ScheduledFuture<?> f;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f7361d = Executors.newScheduledThreadPool(1);

    /* renamed from: b, reason: collision with root package name */
    private final Map<j, String> f7359b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<b, String> f7360c = new WeakHashMap();

    private i() {
    }

    static i a() {
        return f7358a;
    }

    private void a(final Context context) {
        if (this.f == null || this.f.isDone()) {
            p.a(3, "JSUpdateLooper", this, "Starting metadata reporting loop");
            this.f = this.f7361d.scheduleWithFixedDelay(new Runnable() { // from class: com.moat.analytics.mobile.vng.i.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_METADATA"));
                        if (i.this.f7359b.isEmpty()) {
                            i.this.f.cancel(true);
                        }
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            }, 0L, 50L, TimeUnit.MILLISECONDS);
        }
    }

    private void b(final Context context) {
        if (this.e == null || this.e.isDone()) {
            p.a(3, "JSUpdateLooper", this, "Starting view update loop");
            this.e = this.f7361d.scheduleWithFixedDelay(new Runnable() { // from class: com.moat.analytics.mobile.vng.i.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_VIEW_INFO"));
                        if (i.this.f7360c.isEmpty()) {
                            p.a(3, "JSUpdateLooper", i.this, "No more active trackers");
                            i.this.e.cancel(true);
                        }
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            }, 0L, w.a().f7408d, TimeUnit.MILLISECONDS);
        }
    }

    void a(Context context, b bVar) {
        if (bVar != null) {
            p.a(3, "JSUpdateLooper", this, "addActiveTracker" + bVar.hashCode());
            if (this.f7360c == null || this.f7360c.containsKey(bVar)) {
                return;
            }
            this.f7360c.put(bVar, "");
            b(context);
        }
    }

    void a(Context context, j jVar) {
        if (this.f7359b == null || jVar == null) {
            return;
        }
        this.f7359b.put(jVar, "");
        a(context);
    }

    void a(b bVar) {
        if (bVar != null) {
            p.a(3, "JSUpdateLooper", this, "removeActiveTracker" + bVar.hashCode());
            if (this.f7360c != null) {
                this.f7360c.remove(bVar);
            }
        }
    }

    void a(j jVar) {
        if (jVar != null) {
            p.a(3, "JSUpdateLooper", this, "removeSetupNeededBridge" + jVar.hashCode());
            if (this.f7359b != null) {
                this.f7359b.remove(jVar);
            }
        }
    }
}
