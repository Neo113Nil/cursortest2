package com.squareup.cash.util.network.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class RealNetworkInfo {
    public final Context context;

    public RealNetworkInfo(Context context) {
        this.context = context;
    }

    public final boolean isNetworkAvailable() {
        Context context = this.context;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        Object systemService2 = context.getSystemService("connectivity");
        systemService2.getClass();
        NetworkCapabilities networkCapabilities = ((ConnectivityManager) systemService).getNetworkCapabilities(((ConnectivityManager) systemService2).getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
