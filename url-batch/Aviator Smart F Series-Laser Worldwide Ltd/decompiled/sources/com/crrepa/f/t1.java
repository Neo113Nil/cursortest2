package com.crrepa.f;

import com.crrepa.ble.conn.type.CRPTempTimeType;

/* loaded from: classes3.dex */
public class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12758a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12759b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12760c = 19;

    private t1() {
    }

    public static byte[] a() {
        return g.a(-114, new byte[]{3});
    }

    public static byte[] b() {
        return g.a(59, new byte[]{3});
    }

    public static byte[] c(boolean z7) {
        return g.a(59, new byte[]{2, z7 ? (byte) 1 : (byte) 0});
    }

    public static byte[] a(byte b8) {
        return g.a(59, new byte[]{4, b8});
    }

    public static byte[] b(boolean z7) {
        return g.a(59, new byte[]{1, z7 ? (byte) 1 : (byte) 0});
    }

    public static byte[] a(int i8) {
        return g.a(63, new byte[]{(byte) i8});
    }

    public static byte[] a(CRPTempTimeType cRPTempTimeType) {
        return a(cRPTempTimeType == CRPTempTimeType.YESTERDAY ? 12 <= com.crrepa.g1.f.a() ? (byte) 2 : (byte) 1 : (byte) 0);
    }

    public static byte[] a(boolean z7) {
        return g.a(126, new byte[]{3, z7 ? (byte) 1 : (byte) 0});
    }
}
