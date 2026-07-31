package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class rd3<P> {

    /* renamed from: a, reason: collision with root package name */
    private final P f11109a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f11110b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11111c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11112d;

    rd3(P p7, byte[] bArr, int i7, int i8, int i9) {
        this.f11109a = p7;
        this.f11110b = Arrays.copyOf(bArr, bArr.length);
        this.f11111c = i7;
        this.f11112d = i8;
    }

    public final P a() {
        return this.f11109a;
    }

    public final byte[] b() {
        byte[] bArr = this.f11110b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int c() {
        return this.f11111c;
    }

    public final int d() {
        return this.f11112d;
    }
}
