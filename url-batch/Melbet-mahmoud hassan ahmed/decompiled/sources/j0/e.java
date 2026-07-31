package j0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import d0.j;

/* loaded from: classes.dex */
public class e extends d<h0.b> {

    /* renamed from: j, reason: collision with root package name */
    static final String f18061j = j.f("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    private final ConnectivityManager f18062g;

    /* renamed from: h, reason: collision with root package name */
    private b f18063h;

    /* renamed from: i, reason: collision with root package name */
    private a f18064i;

    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            j.c().a(e.f18061j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.c().a(e.f18061j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.c().a(e.f18061j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, n0.a aVar) {
        super(context, aVar);
        this.f18062g = (ConnectivityManager) this.f18055b.getSystemService("connectivity");
        if (j()) {
            this.f18063h = new b();
        } else {
            this.f18064i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // j0.d
    public void e() {
        if (!j()) {
            j.c().a(f18061j, "Registering broadcast receiver", new Throwable[0]);
            this.f18055b.registerReceiver(this.f18064i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            j.c().a(f18061j, "Registering network callback", new Throwable[0]);
            this.f18062g.registerDefaultNetworkCallback(this.f18063h);
        } catch (IllegalArgumentException | SecurityException e7) {
            j.c().b(f18061j, "Received exception while registering network callback", e7);
        }
    }

    @Override // j0.d
    public void f() {
        if (!j()) {
            j.c().a(f18061j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f18055b.unregisterReceiver(this.f18064i);
            return;
        }
        try {
            j.c().a(f18061j, "Unregistering network callback", new Throwable[0]);
            this.f18062g.unregisterNetworkCallback(this.f18063h);
        } catch (IllegalArgumentException | SecurityException e7) {
            j.c().b(f18061j, "Received exception while unregistering network callback", e7);
        }
    }

    h0.b g() {
        NetworkInfo activeNetworkInfo = this.f18062g.getActiveNetworkInfo();
        return new h0.b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), i(), o.a.a(this.f18062g), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // j0.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public h0.b b() {
        return g();
    }

    boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f18062g.getNetworkCapabilities(this.f18062g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e7) {
            j.c().b(f18061j, "Unable to validate active network", e7);
            return false;
        }
    }
}
