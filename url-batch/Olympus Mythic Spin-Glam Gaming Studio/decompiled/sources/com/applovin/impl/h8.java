package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes8.dex */
public class h8 {
    private static final Set f = new HashSet();
    private final boolean a;
    private final com.applovin.impl.sdk.k b;
    private Runnable c;
    private final Object d = new Object();
    private final Timer e;

    class a extends TimerTask {

        /* renamed from: com.applovin.impl.h8$a$a, reason: collision with other inner class name */
        class C0076a implements AppLovinBroadcastManager.Receiver {
            C0076a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                h8.this.c();
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!h8.this.b.m0().isApplicationPaused() || h8.this.a) {
                h8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0076a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private h8(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.e = timer;
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j);
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.a = z;
        this.b = kVar;
        this.c = runnable;
        f.add(this);
        timer.schedule(b(), j);
    }

    public static h8 a(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new h8(j, z, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.d) {
            this.e.cancel();
            this.c = null;
            f.remove(this);
        }
    }
}
