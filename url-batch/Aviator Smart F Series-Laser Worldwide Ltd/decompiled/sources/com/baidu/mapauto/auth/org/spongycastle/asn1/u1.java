package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7843a = Runtime.getRuntime().maxMemory();

    public static int a(int i8) {
        int i9 = 1;
        if (i8 > 127) {
            int i10 = 1;
            while (true) {
                i8 >>>= 8;
                if (i8 == 0) {
                    break;
                }
                i10++;
            }
            for (int i11 = (i10 - 1) * 8; i11 >= 0; i11 -= 8) {
                i9++;
            }
        }
        return i9;
    }

    public static int b(int i8) {
        if (i8 < 31) {
            return 1;
        }
        if (i8 < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int i9 = 4;
        do {
            i8 >>= 7;
            i9--;
            bArr[i9] = (byte) ((i8 & 127) | 128);
        } while (i8 > 127);
        return 6 - i9;
    }

    public static int a(InputStream inputStream) {
        if (inputStream instanceof t1) {
            return ((t1) inputStream).a();
        }
        if (inputStream instanceof i) {
            return ((i) inputStream).f7789a;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j8 = f7843a;
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j8;
    }
}
