package com.baidu.platform.comapi.bmsdk.style;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8974a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    public int[] f8975b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f8976c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f8977d;

    private static void a(int[] iArr, ByteBuffer byteBuffer) {
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = byteBuffer.getInt();
        }
    }

    private static void a(int i8) {
        if (i8 == 0 || (i8 & 1) != 0) {
            throw new RuntimeException("invalid nine-patch: " + i8);
        }
    }

    public static b a(byte[] bArr) {
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (order.get() == 0) {
            return null;
        }
        b bVar = new b();
        bVar.f8975b = new int[order.get()];
        bVar.f8976c = new int[order.get()];
        bVar.f8977d = new int[order.get()];
        a(bVar.f8975b.length);
        a(bVar.f8976c.length);
        order.getInt();
        order.getInt();
        bVar.f8974a[0] = order.getInt();
        bVar.f8974a[1] = order.getInt();
        bVar.f8974a[2] = order.getInt();
        bVar.f8974a[3] = order.getInt();
        order.getInt();
        a(bVar.f8975b, order);
        a(bVar.f8976c, order);
        a(bVar.f8977d, order);
        return bVar;
    }
}
