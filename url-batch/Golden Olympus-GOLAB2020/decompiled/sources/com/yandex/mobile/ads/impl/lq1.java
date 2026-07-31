package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.HandlerThread;
import com.yandex.mobile.ads.impl.lq1;

/* loaded from: classes3.dex */
public final class lq1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28713a;

    /* renamed from: b, reason: collision with root package name */
    private final b f28714b;

    /* renamed from: c, reason: collision with root package name */
    private final kq1 f28715c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f28716d;

    /* renamed from: e, reason: collision with root package name */
    private int f28717e;

    /* renamed from: f, reason: collision with root package name */
    private c f28718f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f28719g;

    private class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            lq1.this.a();
        }

        private a() {
        }
    }

    public interface b {
        void a(lq1 lq1Var, int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        private boolean f28721a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28722b;

        private void c() {
            lq1.this.f28716d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.N9
                @Override // java.lang.Runnable
                public final void run() {
                    lq1.c.this.a();
                }
            });
        }

        private void d() {
            lq1.this.f28716d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.M9
                @Override // java.lang.Runnable
                public final void run() {
                    lq1.c.this.b();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z4) {
            if (z4) {
                return;
            }
            d();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.f28721a && this.f28722b == hasCapability) {
                if (hasCapability) {
                    d();
                }
            } else {
                this.f28721a = true;
                this.f28722b = hasCapability;
                c();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            c();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            lq1 lq1Var = lq1.this;
            if (lq1Var.f28718f != null) {
                lq1Var.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            lq1 lq1Var = lq1.this;
            if (lq1Var.f28718f == null || (lq1Var.f28717e & 3) == 0) {
                return;
            }
            lq1Var.a();
        }
    }

    public lq1(Context context, b bVar) {
        kq1 kq1Var = n30.f29386h;
        this.f28713a = context.getApplicationContext();
        this.f28714b = bVar;
        this.f28715c = kq1Var;
        this.f28716d = u82.b();
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RequirementsWatcherBackground");
        handlerThread.start();
        this.f28719g = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f28719g.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.K9
            @Override // java.lang.Runnable
            public final void run() {
                lq1.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        final int a4 = this.f28715c.a(this.f28713a);
        if (this.f28717e != a4) {
            this.f28717e = a4;
            this.f28716d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.L9
                @Override // java.lang.Runnable
                public final void run() {
                    lq1.this.a(a4);
                }
            });
        }
    }

    public final int c() {
        a();
        IntentFilter intentFilter = new IntentFilter();
        if (this.f28715c.e()) {
            if (u82.f32873a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f28713a.getSystemService("connectivity");
                connectivityManager.getClass();
                c cVar = new c();
                this.f28718f = cVar;
                connectivityManager.registerDefaultNetworkCallback(cVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f28715c.c()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f28715c.d()) {
            if (u82.f32873a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f28715c.f()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f28713a.registerReceiver(new a(), intentFilter, null, this.f28716d);
        return this.f28717e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i4) {
        this.f28714b.a(this, i4);
    }
}
