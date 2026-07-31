package com.chartboost.sdk.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w4 {
    public static final w4 a = new w4();
    public static final byte[] b = new byte[0];

    public final int a(InputStream input, OutputStream output) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        long b2 = b(input, output);
        if (b2 > 2147483647L) {
            return -1;
        }
        return (int) b2;
    }

    public final long b(InputStream input, OutputStream output) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return a(input, output, 8192);
    }

    public final long a(InputStream input, OutputStream output, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        return a(input, output, new byte[i]);
    }

    public final long a(InputStream input, OutputStream output, byte[] buffer) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        long j = 0;
        while (true) {
            int read = input.read(buffer);
            if (read == -1) {
                return j;
            }
            output.write(buffer, 0, read);
            j += read;
        }
    }

    public final byte[] a(InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(input, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return byteArray;
        } finally {
        }
    }
}
