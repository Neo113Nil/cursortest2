package com.crrepa.f;

import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12750a = 24;

    private s1() {
    }

    public static byte[] a(String str) {
        return g.a(69, b(str));
    }

    private static byte[] b(String str) {
        int i8 = 24;
        int i9 = 0;
        int i10 = 0;
        while (i9 < str.length()) {
            int i11 = i9 + 1;
            i8 -= str.substring(i9, i11).getBytes(StandardCharsets.UTF_8).length;
            if (i8 <= 0) {
                break;
            }
            i10++;
            i9 = i11;
        }
        return str.substring(0, i10).getBytes(StandardCharsets.UTF_8);
    }
}
