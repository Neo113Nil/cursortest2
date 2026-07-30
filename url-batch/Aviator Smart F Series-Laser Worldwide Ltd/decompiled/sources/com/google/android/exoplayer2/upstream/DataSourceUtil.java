package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static void closeQuietly(@Nullable DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(DataSource dataSource, int i8) {
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int read = dataSource.read(bArr, i9, i8 - i9);
            if (read == -1) {
                throw new IllegalStateException("Not enough data could be read: " + i9 + " < " + i8);
            }
            i9 += read;
        }
        return bArr;
    }

    public static byte[] readToEnd(DataSource dataSource) {
        byte[] bArr = new byte[1024];
        int i8 = 0;
        int i9 = 0;
        while (i8 != -1) {
            if (i9 == bArr.length) {
                bArr = Arrays.copyOf(bArr, bArr.length * 2);
            }
            i8 = dataSource.read(bArr, i9, bArr.length - i9);
            if (i8 != -1) {
                i9 += i8;
            }
        }
        return Arrays.copyOf(bArr, i9);
    }
}
