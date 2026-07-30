package com.baidu.mshield.core;

import java.util.Random;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f8339a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static byte[] a() {
        try {
            char[] charArray = f8339a.toCharArray();
            char[] cArr = new char[16];
            for (int i8 = 0; i8 < 16; i8++) {
                cArr[i8] = charArray[new Random().nextInt(62)];
            }
            return new String(cArr).getBytes();
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return new byte[0];
        }
    }
}
