package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPQuickResponsesDetailInfo;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f12818a = 9;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12819b = 25;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12820c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12821d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12822e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12823f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12824g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f12825h = 80;

    private z() {
    }

    public static byte[] a() {
        return g.a(-71, new byte[]{25, 0});
    }

    public static byte[] a(byte b8) {
        return g.a(-71, new byte[]{25, 2, b8});
    }

    public static byte[] a(CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo) {
        byte[] a8 = com.crrepa.g1.c.a(cRPQuickResponsesDetailInfo.getMessage(), 80, StandardCharsets.UTF_8);
        byte length = com.crrepa.g1.c.h(a8) ? (byte) 0 : (byte) a8.length;
        byte[] bArr = new byte[length + 4];
        bArr[0] = 9;
        bArr[1] = 3;
        bArr[2] = cRPQuickResponsesDetailInfo.getId();
        bArr[3] = length;
        if (length > 0) {
            System.arraycopy(a8, 0, bArr, 4, a8.length);
        }
        return g.a(-71, bArr);
    }

    public static byte[] a(boolean z7) {
        return g.a(-71, new byte[]{9, 1, z7 ? (byte) 1 : (byte) 0});
    }
}
