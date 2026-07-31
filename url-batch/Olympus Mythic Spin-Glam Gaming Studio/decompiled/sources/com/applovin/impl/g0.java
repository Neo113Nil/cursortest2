package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public class g0 implements AppLovinBroadcastManager.Receiver {
    private static final Set c = new HashSet();
    private final g7 a;
    private final com.applovin.impl.sdk.k b;

    private g0(long j, final boolean z, com.applovin.impl.sdk.k kVar, final Runnable runnable) {
        this.a = g7.a(j, z, kVar, new Runnable() { // from class: com.applovin.impl.g0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.a(z, runnable);
            }
        });
        this.b = kVar;
        c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public static g0 a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j, false, kVar, runnable);
    }

    public long b() {
        return this.a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.a.e();
        }
    }

    public static g0 a(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new g0(j, z, kVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Runnable runnable) {
        if (!z) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        c.remove(this);
    }
}
