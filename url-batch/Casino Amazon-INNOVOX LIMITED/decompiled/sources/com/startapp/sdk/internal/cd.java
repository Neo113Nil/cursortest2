package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.startapp.sdk.adsbase.utils.NetworkMonitor$NetworkType;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class cd implements ad {

    /* renamed from: a, reason: collision with root package name */
    public final Context f201a;
    public final Object b;
    public final ArrayList c;
    public final bd d;

    public cd(Context context) {
        context.getClass();
        this.f201a = context;
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new bd(this);
    }

    public final void a(zc zcVar) {
        zcVar.getClass();
        synchronized (this.b) {
            boolean isEmpty = this.c.isEmpty();
            this.c.add(zcVar);
            if (isEmpty) {
                try {
                    ConnectivityManager a2 = a();
                    if (a2 != null) {
                        a2.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.d);
                    }
                } catch (Throwable unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final NetworkMonitor$NetworkType b() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager a2 = a();
        if (a2 != null && (networkCapabilities = a2.getNetworkCapabilities(a2.getActiveNetwork())) != null) {
            return (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) ? NetworkMonitor$NetworkType.f157a : networkCapabilities.hasTransport(0) ? networkCapabilities.getLinkDownstreamBandwidthKbps() >= 10000 ? NetworkMonitor$NetworkType.b : NetworkMonitor$NetworkType.c : NetworkMonitor$NetworkType.d;
        }
        return NetworkMonitor$NetworkType.d;
    }

    public final ConnectivityManager a() {
        try {
            Object systemService = this.f201a.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                return (ConnectivityManager) systemService;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final void b(zc zcVar) {
        zcVar.getClass();
        synchronized (this.b) {
            this.c.remove(zcVar);
            if (this.c.isEmpty()) {
                try {
                    ConnectivityManager a2 = a();
                    if (a2 != null) {
                        a2.unregisterNetworkCallback(this.d);
                    }
                } catch (Throwable unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
