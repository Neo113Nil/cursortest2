package com.yandex.mobile.ads.impl;

import java.util.UUID;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class tm1 {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f32504a;

        /* renamed from: b, reason: collision with root package name */
        private final int f32505b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f32506c;

        public a(UUID uuid, int i4, byte[] bArr) {
            this.f32504a = uuid;
            this.f32505b = i4;
            this.f32506c = bArr;
        }
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    private static a b(byte[] bArr) {
        sf1 sf1Var = new sf1(bArr);
        if (sf1Var.e() < 32) {
            return null;
        }
        sf1Var.e(0);
        if (sf1Var.h() != sf1Var.a() + 4 || sf1Var.h() != 1886614376) {
            return null;
        }
        int h4 = (sf1Var.h() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (h4 > 1) {
            fr0.a("Unsupported pssh version: ", h4, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(sf1Var.p(), sf1Var.p());
        if (h4 == 1) {
            sf1Var.f(sf1Var.x() * 16);
        }
        int x4 = sf1Var.x();
        if (x4 != sf1Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[x4];
        sf1Var.a(bArr2, 0, x4);
        return new a(uuid, h4, bArr2);
    }

    public static UUID c(byte[] bArr) {
        a b4 = b(bArr);
        if (b4 == null) {
            return null;
        }
        return b4.f32504a;
    }

    public static int d(byte[] bArr) {
        a b4 = b(bArr);
        if (b4 == null) {
            return -1;
        }
        return b4.f32505b;
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        a b4 = b(bArr);
        if (b4 == null) {
            return null;
        }
        if (uuid.equals(b4.f32504a)) {
            return b4.f32506c;
        }
        ms0.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + b4.f32504a + ".");
        return null;
    }
}
