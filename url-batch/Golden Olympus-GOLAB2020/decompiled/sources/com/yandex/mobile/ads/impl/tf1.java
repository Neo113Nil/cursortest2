package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes3.dex */
public final class tf1 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f32415a;

    /* renamed from: b, reason: collision with root package name */
    private int f32416b;

    /* renamed from: c, reason: collision with root package name */
    private int f32417c;

    /* renamed from: d, reason: collision with root package name */
    private int f32418d;

    public tf1(byte[] bArr, int i4, int i5) {
        a(bArr, i4, i5);
    }

    private void a() {
        int i4 = this.f32417c;
        if (i4 >= 0) {
            int i5 = this.f32416b;
            if (i4 < i5) {
                return;
            }
            if (i4 == i5 && this.f32418d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        int i4 = this.f32417c;
        int i5 = this.f32418d;
        int i6 = 0;
        while (this.f32417c < this.f32416b && !c()) {
            i6++;
        }
        boolean z4 = this.f32417c == this.f32416b;
        this.f32417c = i4;
        this.f32418d = i5;
        return !z4 && a((i6 * 2) + 1);
    }

    public final boolean c() {
        boolean z4 = (this.f32415a[this.f32417c] & (UserVerificationMethods.USER_VERIFY_PATTERN >> this.f32418d)) != 0;
        f();
        return z4;
    }

    public final int d() {
        int i4 = 0;
        while (!c()) {
            i4++;
        }
        int b4 = ((1 << i4) - 1) + (i4 > 0 ? b(i4) : 0);
        return ((b4 + 1) / 2) * (b4 % 2 == 0 ? -1 : 1);
    }

    public final int e() {
        int i4 = 0;
        while (!c()) {
            i4++;
        }
        return ((1 << i4) - 1) + (i4 > 0 ? b(i4) : 0);
    }

    public final void f() {
        int i4 = this.f32418d + 1;
        this.f32418d = i4;
        if (i4 == 8) {
            this.f32418d = 0;
            int i5 = this.f32417c;
            this.f32417c = i5 + (c(i5 + 1) ? 2 : 1);
        }
        a();
    }

    private boolean c(int i4) {
        if (2 > i4 || i4 >= this.f32416b) {
            return false;
        }
        byte[] bArr = this.f32415a;
        return bArr[i4] == 3 && bArr[i4 + (-2)] == 0 && bArr[i4 - 1] == 0;
    }

    public final boolean a(int i4) {
        int i5 = this.f32417c;
        int i6 = i4 / 8;
        int i7 = i5 + i6;
        int i8 = (this.f32418d + i4) - (i6 * 8);
        if (i8 > 7) {
            i7++;
            i8 -= 8;
        }
        while (true) {
            int i9 = i5 + 1;
            if (i9 > i7 || i7 >= this.f32416b) {
                break;
            }
            if (c(i9)) {
                i7++;
                i5 += 3;
            } else {
                i5 = i9;
            }
        }
        int i10 = this.f32416b;
        if (i7 >= i10) {
            return i7 == i10 && i8 == 0;
        }
        return true;
    }

    public final void d(int i4) {
        int i5 = this.f32417c;
        int i6 = i4 / 8;
        int i7 = i5 + i6;
        this.f32417c = i7;
        int i8 = (i4 - (i6 * 8)) + this.f32418d;
        this.f32418d = i8;
        if (i8 > 7) {
            this.f32417c = i7 + 1;
            this.f32418d = i8 - 8;
        }
        while (true) {
            int i9 = i5 + 1;
            if (i9 <= this.f32417c) {
                if (c(i9)) {
                    this.f32417c++;
                    i5 += 3;
                } else {
                    i5 = i9;
                }
            } else {
                a();
                return;
            }
        }
    }

    public final int b(int i4) {
        int i5;
        this.f32418d += i4;
        int i6 = 0;
        while (true) {
            i5 = this.f32418d;
            if (i5 <= 8) {
                break;
            }
            int i7 = i5 - 8;
            this.f32418d = i7;
            byte[] bArr = this.f32415a;
            int i8 = this.f32417c;
            i6 |= (bArr[i8] & 255) << i7;
            if (!c(i8 + 1)) {
                r3 = 1;
            }
            this.f32417c = i8 + r3;
        }
        byte[] bArr2 = this.f32415a;
        int i9 = this.f32417c;
        int i10 = ((-1) >>> (32 - i4)) & (i6 | ((bArr2[i9] & 255) >> (8 - i5)));
        if (i5 == 8) {
            this.f32418d = 0;
            this.f32417c = i9 + (c(i9 + 1) ? 2 : 1);
        }
        a();
        return i10;
    }

    public final void a(byte[] bArr, int i4, int i5) {
        this.f32415a = bArr;
        this.f32417c = i4;
        this.f32416b = i5;
        this.f32418d = 0;
        a();
    }
}
