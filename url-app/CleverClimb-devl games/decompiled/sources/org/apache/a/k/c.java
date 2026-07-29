package org.apache.a.k;

import java.io.UnsupportedEncodingException;

/* compiled from: EncodingUtils.java */
/* loaded from: classes2.dex */
public final class c {
    public static byte[] a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("data may not be null");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("charset may not be null or empty");
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static byte[] a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        try {
            return str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            throw new Error("HttpClient requires ASCII support");
        }
    }

    public static String a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        try {
            return new String(bArr, i, i2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            throw new Error("HttpClient requires ASCII support");
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        return a(bArr, 0, bArr.length);
    }
}
