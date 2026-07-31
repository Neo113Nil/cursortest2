package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class m3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f8386a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8387b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8388c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f8389d;

    /* renamed from: e, reason: collision with root package name */
    public int f8390e;

    public m3(int i7, int i8) {
        this.f8386a = i7;
        byte[] bArr = new byte[131];
        this.f8389d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f8387b) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f8389d;
            int length = bArr2.length;
            int i10 = this.f8390e + i9;
            if (length < i10) {
                this.f8389d = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.f8389d, this.f8390e, i9);
            this.f8390e += i9;
        }
    }

    public final void b() {
        this.f8387b = false;
        this.f8388c = false;
    }

    public final void c(int i7) {
        wu1.f(!this.f8387b);
        boolean z6 = i7 == this.f8386a;
        this.f8387b = z6;
        if (z6) {
            this.f8390e = 3;
            this.f8388c = false;
        }
    }

    public final boolean d(int i7) {
        if (!this.f8387b) {
            return false;
        }
        this.f8390e -= i7;
        this.f8387b = false;
        this.f8388c = true;
        return true;
    }

    public final boolean e() {
        return this.f8388c;
    }
}
