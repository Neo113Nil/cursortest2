package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class i extends v5 {
    public final HashMap c;

    public i(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
        this.c = new HashMap();
    }

    @Override // com.startapp.sdk.internal.v5
    public final int a() {
        int i;
        synchronized (this.c) {
            i = 0;
            for (Integer num : this.c.values()) {
                if (num != null) {
                    i |= num.intValue();
                }
            }
        }
        return i;
    }

    @Override // com.startapp.sdk.internal.v5
    public final void b() {
        if (m0.a(this.f462a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.b.registerDefaultNetworkCallback(new h(this));
        }
    }
}
