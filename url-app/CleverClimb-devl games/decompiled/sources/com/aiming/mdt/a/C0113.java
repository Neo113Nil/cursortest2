package com.aiming.mdt.a;

import android.webkit.ValueCallback;

/* renamed from: com.aiming.mdt.a.ʼʽʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0113 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static long f322 = -4499564482206794971L;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f323 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f324 = 1;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m425(String str, ValueCallback<String> valueCallback) {
        RunnableC0096 runnableC0096 = new RunnableC0096(valueCallback, str);
        m426("ۓ綣盭漵思奃厐咅䷉䘞㽺し⪪⏳Ⓢᴝᙛཇƞ\ufae9\uf379\uf418\ued72\ue7be\ud8cd퇹쨮쌐쑥뺪럺\ua8daꄤ驲").intern();
        C0044.m108();
        C0195.m731().m736(runnableC0096);
        int i = f323 + 27;
        f324 = i % 128;
        if ((i % 2 == 0 ? 'I' : '*') != '*') {
            Object obj = null;
            super.hashCode();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m426(String str) {
        int i = f324 + 31;
        f323 = i % 128;
        if (i % 2 != 0) {
        }
        char[] charArray = str.toCharArray();
        char c2 = charArray[0];
        char[] cArr = new char[charArray.length - 1];
        int i2 = 1;
        while (true) {
            if (!(i2 < charArray.length)) {
                String str2 = new String(cArr);
                int i3 = f323 + 9;
                f324 = i3 % 128;
                if (i3 % 2 == 0) {
                }
                return str2;
            }
            cArr[i2 - 1] = (char) ((charArray[i2] ^ (i2 * c2)) ^ f322);
            i2++;
        }
    }
}
