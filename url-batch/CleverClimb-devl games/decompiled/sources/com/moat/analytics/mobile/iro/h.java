package com.moat.analytics.mobile.iro;

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
final class h {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final h f1146 = new h();

    /* renamed from: ʽ, reason: contains not printable characters */
    private ScheduledFuture<?> f1147;

    /* renamed from: ˏ, reason: contains not printable characters */
    private ScheduledFuture<?> f1150;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final ScheduledExecutorService f1148 = Executors.newScheduledThreadPool(1);

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Map<f, String> f1149 = new WeakHashMap();

    /* renamed from: ॱ, reason: contains not printable characters */
    private final Map<c, String> f1151 = new WeakHashMap();

    /* renamed from: ˋ, reason: contains not printable characters */
    static h m1244() {
        return f1146;
    }

    private h() {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    final void m1249(final Context context, f fVar) {
        if (fVar != null) {
            this.f1149.put(fVar, "");
            if (this.f1147 == null || this.f1147.isDone()) {
                b.m1182(3, "JSUpdateLooper", this, "Starting metadata reporting loop");
                this.f1147 = this.f1148.scheduleWithFixedDelay(new Runnable() { // from class: com.moat.analytics.mobile.iro.h.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_METADATA"));
                            if (h.this.f1149.isEmpty()) {
                                h.this.f1147.cancel(true);
                            }
                        } catch (Exception e) {
                            o.m1290(e);
                        }
                    }
                }, 0L, 50L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    final void m1250(f fVar) {
        if (fVar != null) {
            b.m1182(3, "JSUpdateLooper", this, "removeSetupNeededBridge" + fVar.hashCode());
            this.f1149.remove(fVar);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final void m1248(final Context context, c cVar) {
        if (cVar != null) {
            b.m1182(3, "JSUpdateLooper", this, "addActiveTracker" + cVar.hashCode());
            if (this.f1151.containsKey(cVar)) {
                return;
            }
            this.f1151.put(cVar, "");
            if (this.f1150 == null || this.f1150.isDone()) {
                b.m1182(3, "JSUpdateLooper", this, "Starting view update loop");
                this.f1150 = this.f1148.scheduleWithFixedDelay(new Runnable() { // from class: com.moat.analytics.mobile.iro.h.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_VIEW_INFO"));
                            if (h.this.f1151.isEmpty()) {
                                b.m1182(3, "JSUpdateLooper", h.this, "No more active trackers");
                                h.this.f1150.cancel(true);
                            }
                        } catch (Exception e) {
                            o.m1290(e);
                        }
                    }
                }, 0L, t.m1319().f1235, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final void m1251(c cVar) {
        if (cVar != null) {
            b.m1182(3, "JSUpdateLooper", this, "removeActiveTracker" + cVar.hashCode());
            this.f1151.remove(cVar);
        }
    }
}
