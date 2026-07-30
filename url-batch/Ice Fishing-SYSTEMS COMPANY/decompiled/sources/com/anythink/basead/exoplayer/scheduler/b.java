package com.anythink.basead.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8895a = "RequirementsWatcher";

    /* renamed from: b, reason: collision with root package name */
    private final Context f8896b;

    /* renamed from: c, reason: collision with root package name */
    private final c f8897c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.scheduler.a f8898d;

    /* renamed from: e, reason: collision with root package name */
    private C0036b f8899e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8900f;

    /* renamed from: g, reason: collision with root package name */
    private a f8901g;

    public final class a extends ConnectivityManager.NetworkCallback {
        private a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            super.onAvailable(network);
            Objects.toString(b.this);
            b.this.a(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            super.onLost(network);
            Objects.toString(b.this);
            b.this.a(false);
        }

        public /* synthetic */ a(b bVar, byte b9) {
            this();
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.scheduler.b$b, reason: collision with other inner class name */
    public class C0036b extends BroadcastReceiver {
        private C0036b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            Objects.toString(b.this);
            intent.getAction();
            b.this.a(false);
        }

        public /* synthetic */ C0036b(b bVar, byte b9) {
            this();
        }
    }

    public interface c {
        void a();

        void b();
    }

    private b(Context context, c cVar, com.anythink.basead.exoplayer.scheduler.a aVar) {
        this.f8898d = aVar;
        this.f8897c = cVar;
        this.f8896b = context.getApplicationContext();
        toString();
    }

    private void b() {
        this.f8896b.unregisterReceiver(this.f8899e);
        this.f8899e = null;
        if (this.f8901g != null && af.f8503a >= 21) {
            ((ConnectivityManager) this.f8896b.getSystemService("connectivity")).unregisterNetworkCallback(this.f8901g);
            this.f8901g = null;
        }
        toString();
    }

    private com.anythink.basead.exoplayer.scheduler.a c() {
        return this.f8898d;
    }

    private void d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8896b.getSystemService("connectivity");
        NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
        a aVar = new a(this, (byte) 0);
        this.f8901g = aVar;
        connectivityManager.registerNetworkCallback(build, aVar);
    }

    private void e() {
        if (af.f8503a >= 21) {
            ((ConnectivityManager) this.f8896b.getSystemService("connectivity")).unregisterNetworkCallback(this.f8901g);
            this.f8901g = null;
        }
    }

    private static void f() {
    }

    private static /* synthetic */ void g() {
    }

    public final String toString() {
        return super.toString();
    }

    private void a() {
        C0544a.a(Looper.myLooper());
        a(true);
        IntentFilter intentFilter = new IntentFilter();
        byte b9 = 0;
        if (this.f8898d.a() != 0) {
            if (af.f8503a >= 23) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f8896b.getSystemService("connectivity");
                NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
                a aVar = new a(this, b9);
                this.f8901g = aVar;
                connectivityManager.registerNetworkCallback(build, aVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f8898d.b()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f8898d.c()) {
            if (af.f8503a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        C0036b c0036b = new C0036b(this, b9);
        this.f8899e = c0036b;
        this.f8896b.registerReceiver(c0036b, intentFilter, null, new Handler());
        toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z8) {
        boolean a9 = this.f8898d.a(this.f8896b);
        if (z8 || a9 != this.f8900f) {
            this.f8900f = a9;
        }
    }
}
