package com.crrepa.g1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes3.dex */
public class m {
    public static boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) d.a().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }
}
