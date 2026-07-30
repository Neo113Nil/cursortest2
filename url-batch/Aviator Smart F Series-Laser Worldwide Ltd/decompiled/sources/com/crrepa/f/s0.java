package com.crrepa.f;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12745a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12746b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12747c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12748d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12749e = 3;

    private s0() {
    }

    public static byte[] a() {
        return g.a(-68, new byte[]{0, 2});
    }

    public static byte[] b() {
        return g.a(-68, new byte[]{0, 1});
    }

    public static byte[] c() {
        return g.a(-68, new byte[]{0, 0});
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 2];
        bArr[0] = 0;
        bArr[1] = 3;
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        return g.a(-68, bArr);
    }
}
