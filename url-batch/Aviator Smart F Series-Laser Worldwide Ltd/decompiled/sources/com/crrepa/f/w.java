package com.crrepa.f;

import java.util.List;

/* loaded from: classes3.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12779a = 14;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12780b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12781c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12782d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12783e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12784f = 4;

    private w() {
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{14, 3});
    }

    public static byte[] b() {
        return g.a(-69, new byte[]{14, 0});
    }

    public static byte[] a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                byte[] bArr = new byte[(list.size() * 4) + 2];
                bArr[0] = 14;
                bArr[1] = 2;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    byte[] b8 = com.crrepa.g1.c.b(Integer.parseInt(list.get(i8).trim()));
                    System.arraycopy(b8, 0, bArr, (i8 * 4) + 2, b8.length);
                }
                return g.a(-69, bArr);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }
}
