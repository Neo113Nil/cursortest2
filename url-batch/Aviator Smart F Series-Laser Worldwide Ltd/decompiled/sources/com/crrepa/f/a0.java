package com.crrepa.f;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12445a = 13;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12446b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12447c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12448d = 13;

    private a0() {
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{13, 0});
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 1];
        bArr[0] = 13;
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        return g.a(-73, bArr);
    }
}
