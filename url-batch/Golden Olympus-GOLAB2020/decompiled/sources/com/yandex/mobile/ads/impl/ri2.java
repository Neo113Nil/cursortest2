package com.yandex.mobile.ads.impl;

import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class ri2 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f31234a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31235b;

    /* renamed from: c, reason: collision with root package name */
    private int f31236c;

    /* renamed from: d, reason: collision with root package name */
    private int f31237d;

    public ri2(byte[] bArr) {
        this.f31234a = bArr;
        this.f31235b = bArr.length;
    }

    public final int a() {
        return (this.f31236c * 8) + this.f31237d;
    }

    public final boolean b() {
        boolean z4 = (((this.f31234a[this.f31236c] & 255) >> this.f31237d) & 1) == 1;
        b(1);
        return z4;
    }

    public final int a(int i4) {
        int i5 = this.f31236c;
        int min = Math.min(i4, 8 - this.f31237d);
        int i6 = i5 + 1;
        int i7 = ((this.f31234a[i5] & 255) >> this.f31237d) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - min));
        while (min < i4) {
            i7 |= (this.f31234a[i6] & 255) << min;
            min += 8;
            i6++;
        }
        int i8 = i7 & ((-1) >>> (32 - i4));
        b(i4);
        return i8;
    }

    public final void b(int i4) {
        int i5 = i4 / 8;
        int i6 = this.f31236c + i5;
        this.f31236c = i6;
        int i7 = (i4 - (i5 * 8)) + this.f31237d;
        this.f31237d = i7;
        if (i7 > 7) {
            this.f31236c = i6 + 1;
            this.f31237d = i7 - 8;
        }
        int i8 = this.f31236c;
        if (i8 >= 0) {
            int i9 = this.f31235b;
            if (i8 < i9) {
                return;
            }
            if (i8 == i9 && this.f31237d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
