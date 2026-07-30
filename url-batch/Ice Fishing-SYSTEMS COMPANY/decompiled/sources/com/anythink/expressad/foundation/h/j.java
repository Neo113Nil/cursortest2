package com.anythink.expressad.foundation.h;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19786a = "NetManager";

    /* renamed from: b, reason: collision with root package name */
    private static ConnectivityManager f19787b;

    private j() {
    }

    private static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (j.class) {
            try {
                if (f19787b == null && com.anythink.core.common.d.t.b().g() != null) {
                    f19787b = (ConnectivityManager) com.anythink.core.common.d.t.b().g().getSystemService("connectivity");
                }
            } catch (Exception e6) {
                e6.getMessage();
            }
            connectivityManager = f19787b;
        }
        return connectivityManager;
    }
}
