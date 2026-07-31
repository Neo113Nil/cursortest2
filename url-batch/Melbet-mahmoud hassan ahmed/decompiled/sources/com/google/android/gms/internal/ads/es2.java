package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class es2 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f4737a;

    /* renamed from: b, reason: collision with root package name */
    private int f4738b;

    /* renamed from: c, reason: collision with root package name */
    private int f4739c;

    /* renamed from: d, reason: collision with root package name */
    private int f4740d = 0;

    public es2(byte[] bArr, int i7, int i8) {
        this.f4737a = bArr;
        this.f4739c = i7;
        this.f4738b = i8;
        h();
    }

    private final int g() {
        int i7 = 0;
        while (!f()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? a(i7) : 0);
    }

    private final void h() {
        int i7;
        int i8 = this.f4739c;
        boolean z6 = true;
        if (i8 < 0 || (i8 >= (i7 = this.f4738b) && (i8 != i7 || this.f4740d != 0))) {
            z6 = false;
        }
        wu1.f(z6);
    }

    private final boolean i(int i7) {
        if (i7 < 2 || i7 >= this.f4738b) {
            return false;
        }
        byte[] bArr = this.f4737a;
        return bArr[i7] == 3 && bArr[i7 + (-2)] == 0 && bArr[i7 + (-1)] == 0;
    }

    public final int a(int i7) {
        int i8;
        this.f4740d += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f4740d;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f4740d = i10;
            byte[] bArr = this.f4737a;
            int i11 = this.f4739c;
            i9 |= (bArr[i11] & 255) << i10;
            if (true != i(i11 + 1)) {
                r3 = 1;
            }
            this.f4739c = i11 + r3;
        }
        byte[] bArr2 = this.f4737a;
        int i12 = this.f4739c;
        int i13 = ((-1) >>> (32 - i7)) & (i9 | ((bArr2[i12] & 255) >> (8 - i8)));
        if (i8 == 8) {
            this.f4740d = 0;
            this.f4739c = i12 + (true != i(i12 + 1) ? 1 : 2);
        }
        h();
        return i13;
    }

    public final int b() {
        int g7 = g();
        return (g7 % 2 == 0 ? -1 : 1) * ((g7 + 1) / 2);
    }

    public final int c() {
        return g();
    }

    public final void d() {
        int i7 = this.f4740d + 1;
        this.f4740d = i7;
        if (i7 == 8) {
            this.f4740d = 0;
            int i8 = this.f4739c;
            this.f4739c = i8 + (true == i(i8 + 1) ? 2 : 1);
        }
        h();
    }

    public final void e(int i7) {
        int i8 = this.f4739c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        this.f4739c = i10;
        int i11 = this.f4740d + (i7 - (i9 * 8));
        this.f4740d = i11;
        if (i11 > 7) {
            this.f4739c = i10 + 1;
            this.f4740d = i11 - 8;
        }
        while (true) {
            i8++;
            if (i8 > this.f4739c) {
                h();
                return;
            } else if (i(i8)) {
                this.f4739c++;
                i8 += 2;
            }
        }
    }

    public final boolean f() {
        boolean z6 = (this.f4737a[this.f4739c] & (128 >> this.f4740d)) != 0;
        d();
        return z6;
    }
}
