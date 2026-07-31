package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ld4 {
    public static List<byte[]> a(byte[] bArr) {
        byte b7 = bArr[11];
        byte b8 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(c(b(((b7 & 255) << 8) | (b8 & 255))));
        arrayList.add(c(b(3840L)));
        return arrayList;
    }

    private static long b(long j7) {
        return (j7 * 1000000000) / 48000;
    }

    private static byte[] c(long j7) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j7).array();
    }
}
