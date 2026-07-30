package com.anythink.core.common.n.b.a.k;

import D.y;
import com.anythink.core.common.n.c.c;
import com.anythink.core.common.n.c.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final String f15574a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* renamed from: b, reason: collision with root package name */
    static final int f15575b = 128;

    /* renamed from: c, reason: collision with root package name */
    static final int f15576c = 64;

    /* renamed from: d, reason: collision with root package name */
    static final int f15577d = 32;

    /* renamed from: e, reason: collision with root package name */
    static final int f15578e = 16;

    /* renamed from: f, reason: collision with root package name */
    static final int f15579f = 15;

    /* renamed from: g, reason: collision with root package name */
    static final int f15580g = 8;

    /* renamed from: h, reason: collision with root package name */
    static final int f15581h = 128;
    static final int i = 127;

    /* renamed from: j, reason: collision with root package name */
    static final int f15582j = 0;

    /* renamed from: k, reason: collision with root package name */
    static final int f15583k = 1;

    /* renamed from: l, reason: collision with root package name */
    static final int f15584l = 2;

    /* renamed from: m, reason: collision with root package name */
    static final int f15585m = 8;

    /* renamed from: n, reason: collision with root package name */
    static final int f15586n = 9;

    /* renamed from: o, reason: collision with root package name */
    static final int f15587o = 10;

    /* renamed from: p, reason: collision with root package name */
    static final long f15588p = 125;

    /* renamed from: q, reason: collision with root package name */
    static final long f15589q = 123;

    /* renamed from: r, reason: collision with root package name */
    static final int f15590r = 126;

    /* renamed from: s, reason: collision with root package name */
    static final long f15591s = 65535;

    /* renamed from: t, reason: collision with root package name */
    static final int f15592t = 127;

    /* renamed from: u, reason: collision with root package name */
    static final int f15593u = 1001;

    /* renamed from: v, reason: collision with root package name */
    static final int f15594v = 1005;

    private b() {
        throw new AssertionError("No instances.");
    }

    public static void a(c.a aVar, byte[] bArr) {
        int length = bArr.length;
        int i4 = 0;
        do {
            byte[] bArr2 = aVar.f16011d;
            int i9 = aVar.f16012e;
            int i10 = aVar.f16013f;
            while (i9 < i10) {
                int i11 = i4 % length;
                bArr2[i9] = (byte) (bArr2[i9] ^ bArr[i11]);
                i9++;
                i4 = i11 + 1;
            }
        } while (aVar.a() != -1);
    }

    public static void b(int i4) {
        String a9 = a(i4);
        if (a9 != null) {
            throw new IllegalArgumentException(a9);
        }
    }

    public static String a(int i4) {
        if (i4 < 1000 || i4 >= 5000) {
            return "Code must be in range [1000,5000): ".concat(String.valueOf(i4));
        }
        if ((i4 < 1004 || i4 > 1006) && (i4 < 1012 || i4 > 2999)) {
            return null;
        }
        return y.i(i4, "Code ", " is reserved and may not be used.");
    }

    private static String a(String str) {
        return f.a(str + f15574a).d().b();
    }
}
