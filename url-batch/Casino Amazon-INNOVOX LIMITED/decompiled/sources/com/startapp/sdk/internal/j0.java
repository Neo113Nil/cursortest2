package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class j0 extends v5 {
    public j0(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    @Override // com.startapp.sdk.internal.v5
    public final int a() {
        if (!m0.a(this.f462a, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        }
        int i = 0;
        for (Network network : this.b.getAllNetworks()) {
            if (network != null) {
                i |= w5.a(this.b.getNetworkCapabilities(network));
            }
        }
        return i;
    }
}
