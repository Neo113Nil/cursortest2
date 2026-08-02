package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;

/* renamed from: com.startapp.sdk.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368i extends e6 {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7074c;

    public C0368i(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
        this.f7074c = new HashMap();
    }

    @Override // com.startapp.sdk.internal.e6
    public final int a() {
        int i4;
        synchronized (this.f7074c) {
            try {
                i4 = 0;
                for (Integer num : this.f7074c.values()) {
                    if (num != null) {
                        i4 |= num.intValue();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    @Override // com.startapp.sdk.internal.e6
    public final void b() {
        if (p0.a(this.f6835a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f6836b.registerDefaultNetworkCallback(new C0367h(this));
        }
    }
}
