package com.aiming.mdt.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: com.aiming.mdt.a.ʻʽʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0079 {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static ConnectivityManager f191;

    /* renamed from: com.aiming.mdt.a.ʻʽʿˊ$ʻ, reason: contains not printable characters */
    public enum EnumC0080 {
        Wifi,
        Wired,
        Mobile,
        Mobile2G,
        Mobile3G,
        Mobile4G
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean m239(Context context) {
        return m241(context, EnumC0080.Wifi);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static boolean m240(Context context) {
        return m241(context, EnumC0080.Wired);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static boolean m241(Context context, EnumC0080 enumC0080) {
        if (f191 == null) {
            f191 = (ConnectivityManager) context.getSystemService("connectivity");
        }
        if (f191 == null) {
            return false;
        }
        return m243(enumC0080, f191.getActiveNetworkInfo());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m242(Context context) {
        return m241(context, EnumC0080.Mobile);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m243(EnumC0080 enumC0080, NetworkInfo networkInfo) {
        EnumC0080 enumC00802;
        if (networkInfo == null) {
            return false;
        }
        switch (C0047.f90[enumC0080.ordinal()]) {
            case 1:
                return m245(networkInfo) && networkInfo.getType() == 1;
            case 2:
                return m245(networkInfo) && Build.VERSION.SDK_INT >= 13 && networkInfo.getType() == 9;
            case 3:
                return m245(networkInfo) && networkInfo.getType() == 0;
            case 4:
                if (!m243(EnumC0080.Mobile, networkInfo)) {
                    return false;
                }
                enumC00802 = EnumC0080.Mobile2G;
                break;
            case 5:
                if (!m243(EnumC0080.Mobile, networkInfo)) {
                    return false;
                }
                enumC00802 = EnumC0080.Mobile3G;
                break;
            case 6:
                if (!m243(EnumC0080.Mobile, networkInfo)) {
                    return false;
                }
                enumC00802 = EnumC0080.Mobile4G;
                break;
            default:
                return false;
        }
        return m246(enumC00802, networkInfo);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m244(Context context) {
        return m239(context) || m240(context) || m242(context);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean m245(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean m246(EnumC0080 enumC0080, NetworkInfo networkInfo) {
        switch (networkInfo.getType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return enumC0080 == EnumC0080.Mobile2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return enumC0080 == EnumC0080.Mobile3G;
            case 13:
            case 18:
                return enumC0080 == EnumC0080.Mobile4G;
            default:
                String subtypeName = networkInfo.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) && enumC0080 == EnumC0080.Mobile3G;
        }
    }
}
