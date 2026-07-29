package com.aiming.mdt.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.umeng.commonsdk.proguard.ao;

/* renamed from: com.aiming.mdt.a.ʼʽˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0124 {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f376 = 1;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f380 = 1909027604;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int f381;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static byte[] f379 = {-9, 8, 36, -35, 25, 5, 11, -13, ao.k, -11, 17, -2, -9, 0, -1, 12, 35, -35, 18, ao.k, -22, -7, 3, -8, 3, ao.m, 23, -33, 33, 0, 0, 0, 0, 0};

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f374 = 2039252022;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f377 = 117;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static int f375 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static byte[] f378 = new byte[3];

    static {
        int i = f376 + 107;
        f381 = i % 128;
        if (!(i % 2 != 0)) {
            return;
        }
        Object obj = null;
        super.hashCode();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m471(byte b2, int i, int i2, int i3, short s) {
        StringBuilder sb = new StringBuilder();
        int i4 = i2 + f377;
        int i5 = 1;
        boolean z = i4 == -1;
        short[] sArr = null;
        if (z) {
            if (f379 != null) {
                int i6 = f376 + 93;
                f381 = i6 % 128;
                int i7 = i6 % 2;
                i4 = (byte) (f379[f374 + i] + f377);
                int i8 = f381 + 97;
                f376 = i8 % 128;
                if (i8 % 2 == 0) {
                }
            } else {
                i4 = (short) (sArr[f374 + i] + f377);
            }
        }
        if (i4 > 0) {
            int i9 = ((i + i4) - 2) + f374 + (z ? 1 : 0);
            char c2 = (char) (i3 + f380);
            sb.append(c2);
            while (true) {
                if ((i5 < i4 ? '\n' : '9') == '9') {
                    break;
                }
                if (f379 != null) {
                    c2 = (char) (c2 + (f379[i9] ^ b2));
                    i9--;
                } else {
                    c2 = (char) (c2 + (sArr[i9] ^ b2));
                    i9--;
                }
                sb.append(c2);
                i5++;
            }
        }
        return sb.toString();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static String m472(Context context) {
        ConnectivityManager connectivityManager;
        String intern = m471((byte) 0, -2039252022, -111, -1909027519, (short) 0).intern();
        if (context != null) {
            int i = f381 + 67;
            f376 = i % 128;
            int i2 = i % 2;
            NetworkInfo networkInfo = null;
            if (context.getSystemService(m471((byte) 0, -2039252017, -105, -1909027505, (short) 0).intern()) != null && (connectivityManager = (ConnectivityManager) context.getSystemService(m471((byte) 0, -2039252017, -105, -1909027505, (short) 0).intern())) != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    if (networkInfo.getType() == 1) {
                        int i3 = f376 + 101;
                        f381 = i3 % 128;
                        int i4 = i3 % 2;
                        intern = m471((byte) 0, -2039252006, -113, -1909027517, (short) 0).intern();
                    }
                    if ((networkInfo.getType() == 0 ? '7' : '_') == '7') {
                        int i5 = f376 + 77;
                        f381 = i5 % 128;
                        intern = (i5 % 2 != 0 ? m471((byte) 1, -2039252003, 122, -1909027517, (short) 0) : m471((byte) 0, -2039252003, -114, -1909027517, (short) 0)).intern();
                    }
                } else {
                    intern = m471((byte) 0, -2039252001, -108, -1909027526, (short) 0).intern();
                }
            }
        }
        int i6 = f381 + 69;
        f376 = i6 % 128;
        if (i6 % 2 == 0) {
        }
        return intern;
    }
}
