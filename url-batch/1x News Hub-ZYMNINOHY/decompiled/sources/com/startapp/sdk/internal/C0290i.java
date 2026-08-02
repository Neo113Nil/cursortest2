package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;

/* renamed from: com.startapp.sdk.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290i extends e6 {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3949c;

    public C0290i(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
        this.f3949c = new HashMap();
    }

    @Override // com.startapp.sdk.internal.e6
    public final int a() {
        int i3;
        synchronized (this.f3949c) {
            try {
                i3 = 0;
                for (Integer num : this.f3949c.values()) {
                    if (num != null) {
                        i3 |= num.intValue();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    @Override // com.startapp.sdk.internal.e6
    public final void b() {
        if (p0.a(this.f3721a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f3722b.registerDefaultNetworkCallback(new C0289h(this));
        }
    }
}
