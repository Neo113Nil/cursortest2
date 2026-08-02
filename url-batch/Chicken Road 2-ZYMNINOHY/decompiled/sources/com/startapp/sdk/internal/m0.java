package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class m0 extends e6 {
    public m0(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    @Override // com.startapp.sdk.internal.e6
    public final int a() {
        if (!p0.a(this.f6835a, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        }
        int i4 = 0;
        for (Network network : this.f6836b.getAllNetworks()) {
            if (network != null) {
                i4 |= f6.a(this.f6836b.getNetworkCapabilities(network));
            }
        }
        return i4;
    }
}
