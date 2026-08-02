package com.squareup.util.android;

import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class AndroidDeviceInfo {
    public final AndroidConnectivityManager connectivityManager;
    public final int smallestScreenWidthDp;
    public final OkHttpCall.AnonymousClass1 telephonyManager;

    public AndroidDeviceInfo(OkHttpCall.AnonymousClass1 anonymousClass1, AndroidConnectivityManager androidConnectivityManager, int i) {
        anonymousClass1.getClass();
        androidConnectivityManager.getClass();
        this.telephonyManager = anonymousClass1;
        this.connectivityManager = androidConnectivityManager;
        this.smallestScreenWidthDp = i;
    }
}
