package com.squareup.cash.util.network.impl;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class AndroidConnectivityManager {
    public final ConnectivityManager connectivityManager;

    public AndroidConnectivityManager(Context context) {
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.connectivityManager = (ConnectivityManager) systemService;
    }
}
