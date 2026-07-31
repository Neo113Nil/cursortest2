package com.my.tracker.obfuscated;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: com.my.tracker.obfuscated.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1648j1 {
    private int a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return -1;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            return type != 1 ? 1 : 3;
        }
        return 2;
    }

    private String b(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.getType() == 0 ? networkInfo.getSubtypeName() : networkInfo.getTypeName();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[Catch: SecurityException -> 0x004f, TryCatch #1 {SecurityException -> 0x004f, blocks: (B:9:0x003c, B:11:0x0042, B:13:0x0048, B:15:0x004c), top: B:8:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1644i1 a(Context context) {
        NetworkInfo networkInfo;
        String b4;
        BluetoothAdapter defaultAdapter;
        int i4 = -1;
        Boolean bool = null;
        int i5 = 0;
        if (AbstractC1664n1.a("android.permission.ACCESS_NETWORK_STATE", context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                    i5 = a(connectivityManager);
                } else {
                    networkInfo = null;
                }
                i4 = a(networkInfo);
                b4 = b(networkInfo);
            } catch (SecurityException unused) {
                AbstractC1708y2.a("NetworkInfoDataProvider: No permissions for access to network state");
            }
            if (!AbstractC1664n1.a() && AbstractC1664n1.a("android.permission.BLUETOOTH", context)) {
                try {
                    defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (defaultAdapter != null) {
                        bool = defaultAdapter.isEnabled() ? Boolean.TRUE : Boolean.FALSE;
                    }
                } catch (SecurityException unused2) {
                    AbstractC1708y2.a("NetworkInfoDataProvider: Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider");
                }
            }
            return new C1644i1(i4, b4, bool, i5);
        }
        b4 = null;
        if (!AbstractC1664n1.a()) {
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
            }
        }
        return new C1644i1(i4, b4, bool, i5);
    }

    private int a(ConnectivityManager connectivityManager) {
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(4) ? 2 : 1;
            }
        } catch (Throwable unused) {
        }
        return 0;
    }
}
