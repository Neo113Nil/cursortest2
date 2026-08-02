package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avv extends ConnectivityManager.NetworkCallback {
    private final krt a;

    public avv(krt krtVar) {
        this.a = krtVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        asq.a();
        String str = awa.a;
        this.a.a(avt.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        asq.a();
        String str = awa.a;
        this.a.a(new avu(7));
    }
}
