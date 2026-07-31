package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

/* loaded from: classes.dex */
public final class k93 {

    /* renamed from: a, reason: collision with root package name */
    private static final OutputStream f7431a = new j93();

    public static byte[] a(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i7 = 8192;
        int i8 = 0;
        while (i8 < 2147483639) {
            int min = Math.min(i7, 2147483639 - i8);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i9 = 0;
            while (i9 < min) {
                int read = inputStream.read(bArr, i9, min - i9);
                if (read == -1) {
                    return b(arrayDeque, i8);
                }
                i9 += read;
                i8 += read;
            }
            long j7 = i7;
            long j8 = j7 + j7;
            i7 = j8 > 2147483647L ? Integer.MAX_VALUE : j8 < -2147483648L ? Integer.MIN_VALUE : (int) j8;
        }
        if (inputStream.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] b(Queue<byte[]> queue, int i7) {
        byte[] bArr = new byte[i7];
        int i8 = i7;
        while (i8 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i8, remove.length);
            System.arraycopy(remove, 0, bArr, i7 - i8, min);
            i8 -= min;
        }
        return bArr;
    }
}
