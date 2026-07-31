package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class u34 {

    /* renamed from: a, reason: collision with root package name */
    private int f12620a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f12621b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f12622c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f12623d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f12624e;

    public u34() {
        this.f12624e = r0.length - 1;
    }

    public final int a() {
        int i7 = this.f12622c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f12623d;
        int i8 = this.f12620a;
        int i9 = iArr[i8];
        this.f12620a = (i8 + 1) & this.f12624e;
        this.f12622c = i7 - 1;
        return i9;
    }

    public final void b(int i7) {
        int i8 = this.f12622c;
        int[] iArr = this.f12623d;
        int length = iArr.length;
        if (i8 == length) {
            int i9 = length + length;
            if (i9 < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[i9];
            int i10 = this.f12620a;
            int i11 = length - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f12623d, 0, iArr2, i11, i10);
            this.f12620a = 0;
            this.f12621b = this.f12622c - 1;
            this.f12623d = iArr2;
            this.f12624e = iArr2.length - 1;
            iArr = iArr2;
        }
        int i12 = (this.f12621b + 1) & this.f12624e;
        this.f12621b = i12;
        iArr[i12] = i7;
        this.f12622c++;
    }

    public final void c() {
        this.f12620a = 0;
        this.f12621b = -1;
        this.f12622c = 0;
    }

    public final boolean d() {
        return this.f12622c == 0;
    }
}
