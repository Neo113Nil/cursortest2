package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bko extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ giq a;

    public bko(giq giqVar) {
        this.a = giqVar;
    }

    private final void a(boolean z) {
        bmi.g(new kgi(this, z, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
