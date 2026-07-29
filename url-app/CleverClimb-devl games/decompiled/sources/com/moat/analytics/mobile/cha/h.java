package com.moat.analytics.mobile.cha;

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

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final h f902 = new h();

    /* renamed from: ʽ, reason: contains not printable characters */
    private ScheduledFuture<?> f903;

    /* renamed from: ˎ, reason: contains not printable characters */
    private ScheduledFuture<?> f905;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final ScheduledExecutorService f906 = Executors.newScheduledThreadPool(1);

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Map<j, String> f904 = new WeakHashMap();

    /* renamed from: ॱ, reason: contains not printable characters */
    private final Map<d, String> f907 = new WeakHashMap();

    /* renamed from: ˊ, reason: contains not printable characters */
    static h m1044() {
        return f902;
    }

    private h() {
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final void m1050(final Context context, j jVar) {
        if (jVar != null) {
            this.f904.put(jVar, "");
            if (this.f903 == null || this.f903.isDone()) {
                a.m994(3, "JSUpdateLooper", this, "Starting metadata reporting loop");
                this.f903 = this.f906.scheduleWithFixedDelay(new Runnable() { // from class: com.moat.analytics.mobile.cha.h.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_METADATA"));
                            if (h.this.f904.isEmpty()) {
                                h.this.f903.cancel(true);
                            }
                        } catch (Exception e) {
                            o.m1110(e);
                        }
                    }
                }, 0L, 50L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final void m1049(j jVar) {
        if (jVar != null) {
            a.m994(3, "JSUpdateLooper", this, "removeSetupNeededBridge" + jVar.hashCode());
            this.f904.remove(jVar);
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final void m1051(final Context context, d dVar) {
        if (dVar != null) {
            a.m994(3, "JSUpdateLooper", this, "addActiveTracker" + dVar.hashCode());
            if (this.f907.containsKey(dVar)) {
                return;
            }
            this.f907.put(dVar, "");
            if (this.f905 == null || this.f905.isDone()) {
                a.m994(3, "JSUpdateLooper", this, "Starting view update loop");
                this.f905 = this.f906.scheduleWithFixedDelay(new Runnable() { // from class: com.moat.analytics.mobile.cha.h.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_VIEW_INFO"));
                            if (h.this.f907.isEmpty()) {
                                a.m994(3, "JSUpdateLooper", h.this, "No more active trackers");
                                h.this.f905.cancel(true);
                            }
                        } catch (Exception e) {
                            o.m1110(e);
                        }
                    }
                }, 0L, t.m1144().f1007, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final void m1052(d dVar) {
        if (dVar != null) {
            a.m994(3, "JSUpdateLooper", this, "removeActiveTracker" + dVar.hashCode());
            this.f907.remove(dVar);
        }
    }
}
