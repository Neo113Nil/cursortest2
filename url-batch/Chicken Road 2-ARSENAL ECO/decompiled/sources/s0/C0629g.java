package s0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import l0.q;

/* renamed from: s0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0630h f5875a;

    public C0629g(C0630h c0630h) {
        this.f5875a = c0630h;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        kotlin.jvm.internal.i.e(network, "network");
        kotlin.jvm.internal.i.e(capabilities, "capabilities");
        q.d().a(i.f5878a, "Network capabilities changed: " + capabilities);
        C0630h c0630h = this.f5875a;
        c0630h.c(i.a(c0630h.f5876f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.i.e(network, "network");
        q.d().a(i.f5878a, "Network connection lost");
        C0630h c0630h = this.f5875a;
        c0630h.c(i.a(c0630h.f5876f));
    }
}
