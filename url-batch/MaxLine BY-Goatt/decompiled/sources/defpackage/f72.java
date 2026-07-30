package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f72 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ mh a;

    public f72(mh mhVar) {
        this.a = mhVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        mh.g(this.a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        mh.g(this.a, network, false);
    }
}
