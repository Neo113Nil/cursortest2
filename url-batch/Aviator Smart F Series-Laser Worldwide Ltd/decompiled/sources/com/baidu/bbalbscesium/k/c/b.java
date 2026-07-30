package com.baidu.bbalbscesium.k.c;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f4126a;

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f4127b;

    public static byte[] a() {
        byte[] bArr = f4127b;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(a.f4123c).modPow(new BigInteger(a.f4124d), new BigInteger(a.f4125e)).toByteArray();
        f4127b = byteArray;
        return byteArray;
    }

    public static byte[] b() {
        byte[] bArr = f4126a;
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = new BigInteger(a.f4121a).modPow(new BigInteger(a.f4122b), new BigInteger(a.f4125e)).toByteArray();
        f4126a = byteArray;
        return byteArray;
    }
}
