package a6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f308a;

    public i(j jVar) {
        this.f308a = jVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        o.d().a(k.f310a, "Network capabilities changed: " + networkCapabilities);
        j jVar = this.f308a;
        jVar.c(k.a(jVar.f309f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        o.d().a(k.f310a, "Network connection lost");
        j jVar = this.f308a;
        jVar.c(k.a(jVar.f309f));
    }
}
