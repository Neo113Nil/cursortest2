package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes5.dex */
class h2 {
    private static final long MAX_MEMORY = Runtime.getRuntime().maxMemory();

    h2() {
    }

    static int calculateBodyLength(int i8) {
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

    static int calculateTagLength(int i8) {
        if (i8 < 31) {
            return 1;
        }
        if (i8 < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int i9 = 4;
        bArr[4] = (byte) (i8 & 127);
        do {
            i8 >>= 7;
            i9--;
            bArr[i9] = (byte) ((i8 & 127) | 128);
        } while (i8 > 127);
        return 6 - i9;
    }

    static int findLimit(InputStream inputStream) {
        if (inputStream instanceof f2) {
            return ((f2) inputStream).getLimit();
        }
        if (inputStream instanceof k) {
            return ((k) inputStream).getLimit();
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
        long j8 = MAX_MEMORY;
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j8;
    }
}
