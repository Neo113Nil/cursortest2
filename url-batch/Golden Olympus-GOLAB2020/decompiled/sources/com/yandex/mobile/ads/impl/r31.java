package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class r31 {

    /* renamed from: a, reason: collision with root package name */
    private final int f31021a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31022b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31023c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f31024d;

    /* renamed from: e, reason: collision with root package name */
    public int f31025e;

    public r31(int i4) {
        this.f31021a = i4;
        byte[] bArr = new byte[131];
        this.f31024d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.f31022b) {
            int i6 = i5 - i4;
            byte[] bArr2 = this.f31024d;
            int length = bArr2.length;
            int i7 = this.f31025e + i6;
            if (length < i7) {
                this.f31024d = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i4, this.f31024d, this.f31025e, i6);
            this.f31025e += i6;
        }
    }

    public final void b() {
        this.f31022b = false;
        this.f31023c = false;
    }

    public final void b(int i4) {
        if (!this.f31022b) {
            boolean z4 = i4 == this.f31021a;
            this.f31022b = z4;
            if (z4) {
                this.f31025e = 3;
                this.f31023c = false;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean a(int i4) {
        if (!this.f31022b) {
            return false;
        }
        this.f31025e -= i4;
        this.f31022b = false;
        this.f31023c = true;
        return true;
    }

    public final boolean a() {
        return this.f31023c;
    }
}
