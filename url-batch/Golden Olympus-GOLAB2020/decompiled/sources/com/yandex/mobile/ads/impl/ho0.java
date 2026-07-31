package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ho0 {

    /* renamed from: a, reason: collision with root package name */
    private int f26867a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f26868b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f26869c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f26870d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f26871e = 15;

    public final void a(int i4) {
        int i5 = this.f26869c;
        int[] iArr = this.f26870d;
        if (i5 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i6 = this.f26867a;
            int i7 = length2 - i6;
            System.arraycopy(iArr, i6, iArr2, 0, i7);
            System.arraycopy(this.f26870d, 0, iArr2, i7, i6);
            this.f26867a = 0;
            this.f26868b = this.f26869c - 1;
            this.f26870d = iArr2;
            this.f26871e = length - 1;
        }
        int i8 = (this.f26868b + 1) & this.f26871e;
        this.f26868b = i8;
        this.f26870d[i8] = i4;
        this.f26869c++;
    }

    public final boolean b() {
        return this.f26869c == 0;
    }

    public final int c() {
        int i4 = this.f26869c;
        if (i4 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f26870d;
        int i5 = this.f26867a;
        int i6 = iArr[i5];
        this.f26867a = (i5 + 1) & this.f26871e;
        this.f26869c = i4 - 1;
        return i6;
    }

    public final void a() {
        this.f26867a = 0;
        this.f26868b = -1;
        this.f26869c = 0;
    }
}
