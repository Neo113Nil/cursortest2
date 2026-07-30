package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPLocalNavigationInfo;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12772a = 17;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12773b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12774c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12775d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12776e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12777f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12778g = 5;

    private v1() {
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{17, 5});
    }

    public static byte[] b(boolean z7) {
        byte[] bArr = new byte[3];
        bArr[0] = 17;
        bArr[1] = 3;
        bArr[2] = z7 ? (byte) 0 : (byte) -1;
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPLocalNavigationInfo.NavigationBean navigationBean) {
        byte[] bytes = com.crrepa.g1.k.a(navigationBean).getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 2];
        bArr[0] = 17;
        bArr[1] = 2;
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(boolean z7) {
        return g.a(-69, new byte[]{17, 0, z7 ? (byte) 1 : (byte) 0});
    }
}
