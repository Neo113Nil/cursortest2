package com.cmplay.gppay.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static Uri f4094a = Uri.parse("content://telephony/carriers/preferapn");

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            int i = 4;
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 4;
            }
            if (activeNetworkInfo.getType() != 1) {
                int subtype = activeNetworkInfo.getSubtype();
                if (a(subtype)) {
                    i = 1;
                } else if (b(subtype)) {
                    i = 2;
                } else if (c(subtype)) {
                    i = 5;
                }
            } else if (b(context)) {
                i = 3;
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean a(int i) {
        if (i != 4 && i != 7 && i != 11) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private static boolean b(int i) {
        switch (i) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            case 13:
            default:
                return false;
        }
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return activeNetworkInfo.getType() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean c(int i) {
        return i == 13;
    }
}
