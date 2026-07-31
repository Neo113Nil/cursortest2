package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sm {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f11871a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11872b;

    /* renamed from: c, reason: collision with root package name */
    private int f11873c;

    /* renamed from: d, reason: collision with root package name */
    private int f11874d = 0;

    public sm(byte[] bArr, int i7, int i8) {
        this.f11871a = bArr;
        this.f11873c = i7;
        this.f11872b = i8;
        g();
    }

    private final int f() {
        int i7 = 0;
        while (!e()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? a(i7) : 0);
    }

    private final void g() {
        int i7;
        int i8;
        int i9 = this.f11873c;
        boolean z6 = true;
        if (i9 < 0 || (i7 = this.f11874d) < 0 || i7 >= 8 || (i9 >= (i8 = this.f11872b) && (i9 != i8 || i7 != 0))) {
            z6 = false;
        }
        jm.e(z6);
    }

    private final boolean h(int i7) {
        if (i7 < 2 || i7 >= this.f11872b) {
            return false;
        }
        byte[] bArr = this.f11871a;
        return bArr[i7] == 3 && bArr[i7 + (-2)] == 0 && bArr[i7 + (-1)] == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r0 == 8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i7) {
        int i8;
        int i9;
        int i10 = i7 >> 3;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = h(this.f11873c + 1) ? this.f11873c + 2 : this.f11873c + 1;
            int i14 = this.f11874d;
            if (i14 != 0) {
                byte[] bArr = this.f11871a;
                i9 = ((bArr[i13] & 255) >>> (8 - i14)) | ((bArr[this.f11873c] & 255) << i14);
            } else {
                i9 = this.f11871a[this.f11873c];
            }
            i7 -= 8;
            i11 |= (255 & i9) << i7;
            this.f11873c = i13;
        }
        if (i7 > 0) {
            int i15 = this.f11874d + i7;
            byte b7 = (byte) (255 >> (8 - i7));
            int i16 = h(this.f11873c + 1) ? this.f11873c + 2 : this.f11873c + 1;
            byte[] bArr2 = this.f11871a;
            int i17 = this.f11873c;
            if (i15 > 8) {
                i8 = (b7 & (((255 & bArr2[i16]) >> (16 - i15)) | ((bArr2[i17] & 255) << (i15 - 8)))) | i11;
            } else {
                i8 = (b7 & ((255 & bArr2[i17]) >> (8 - i15))) | i11;
            }
            this.f11873c = i16;
            i11 = i8;
            this.f11874d = i15 % 8;
        }
        g();
        return i11;
    }

    public final int b() {
        int f7 = f();
        return (f7 % 2 == 0 ? -1 : 1) * ((f7 + 1) / 2);
    }

    public final int c() {
        return f();
    }

    public final void d(int i7) {
        int i8 = this.f11873c;
        int i9 = (i7 >> 3) + i8;
        this.f11873c = i9;
        int i10 = this.f11874d + (i7 & 7);
        this.f11874d = i10;
        if (i10 > 7) {
            this.f11873c = i9 + 1;
            this.f11874d = i10 - 8;
        }
        while (true) {
            i8++;
            if (i8 > this.f11873c) {
                g();
                return;
            } else if (h(i8)) {
                this.f11873c++;
                i8 += 2;
            }
        }
    }

    public final boolean e() {
        return a(1) == 1;
    }
}
