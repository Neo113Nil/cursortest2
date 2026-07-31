package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class rf1 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f31172a;

    /* renamed from: b, reason: collision with root package name */
    private int f31173b;

    /* renamed from: c, reason: collision with root package name */
    private int f31174c;

    /* renamed from: d, reason: collision with root package name */
    private int f31175d;

    public rf1() {
        this.f31172a = u82.f32878f;
    }

    private void a() {
        int i4 = this.f31173b;
        if (i4 >= 0) {
            int i5 = this.f31175d;
            if (i4 < i5) {
                return;
            }
            if (i4 == i5 && this.f31174c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int b() {
        return ((this.f31175d - this.f31173b) * 8) - this.f31174c;
    }

    public final void c() {
        if (this.f31174c == 0) {
            return;
        }
        this.f31174c = 0;
        this.f31173b++;
        a();
    }

    public final int d() {
        if (this.f31174c == 0) {
            return this.f31173b;
        }
        throw new IllegalStateException();
    }

    public final int e() {
        return (this.f31173b * 8) + this.f31174c;
    }

    public final boolean f() {
        boolean z4 = (this.f31172a[this.f31173b] & (UserVerificationMethods.USER_VERIFY_PATTERN >> this.f31174c)) != 0;
        h();
        return z4;
    }

    public final long g() {
        int b4 = b(4);
        int b5 = b(32);
        int i4 = u82.f32873a;
        return ((b4 & 4294967295L) << 32) | (b5 & 4294967295L);
    }

    public final void h() {
        int i4 = this.f31174c + 1;
        this.f31174c = i4;
        if (i4 == 8) {
            this.f31174c = 0;
            this.f31173b++;
        }
        a();
    }

    public final int b(int i4) {
        int i5;
        if (i4 == 0) {
            return 0;
        }
        this.f31174c += i4;
        int i6 = 0;
        while (true) {
            i5 = this.f31174c;
            if (i5 <= 8) {
                break;
            }
            int i7 = i5 - 8;
            this.f31174c = i7;
            byte[] bArr = this.f31172a;
            int i8 = this.f31173b;
            this.f31173b = i8 + 1;
            i6 |= (bArr[i8] & 255) << i7;
        }
        byte[] bArr2 = this.f31172a;
        int i9 = this.f31173b;
        int i10 = ((-1) >>> (32 - i4)) & (i6 | ((bArr2[i9] & 255) >> (8 - i5)));
        if (i5 == 8) {
            this.f31174c = 0;
            this.f31173b = i9 + 1;
        }
        a();
        return i10;
    }

    public final void e(int i4) {
        if (this.f31174c != 0) {
            throw new IllegalStateException();
        }
        this.f31173b += i4;
        a();
    }

    public rf1(int i4, byte[] bArr) {
        this.f31172a = bArr;
        this.f31175d = i4;
    }

    public final void a(int i4) {
        int i5 = i4 & 16383;
        int min = Math.min(8 - this.f31174c, 14);
        int i6 = this.f31174c;
        int i7 = (8 - i6) - min;
        byte[] bArr = this.f31172a;
        int i8 = this.f31173b;
        byte b4 = (byte) (((65280 >> i6) | ((1 << i7) - 1)) & bArr[i8]);
        bArr[i8] = b4;
        int i9 = 14 - min;
        bArr[i8] = (byte) (b4 | ((i5 >>> i9) << i7));
        int i10 = i8 + 1;
        while (i9 > 8) {
            this.f31172a[i10] = (byte) (i5 >>> (i9 - 8));
            i9 -= 8;
            i10++;
        }
        int i11 = 8 - i9;
        byte[] bArr2 = this.f31172a;
        byte b5 = (byte) (bArr2[i10] & ((1 << i11) - 1));
        bArr2[i10] = b5;
        bArr2[i10] = (byte) (((i5 & ((1 << i9) - 1)) << i11) | b5);
        d(14);
        a();
    }

    public final void d(int i4) {
        int i5 = i4 / 8;
        int i6 = this.f31173b + i5;
        this.f31173b = i6;
        int i7 = (i4 - (i5 * 8)) + this.f31174c;
        this.f31174c = i7;
        if (i7 > 7) {
            this.f31173b = i6 + 1;
            this.f31174c = i7 - 8;
        }
        a();
    }

    public final void c(int i4) {
        int i5 = i4 / 8;
        this.f31173b = i5;
        this.f31174c = i4 - (i5 * 8);
        a();
    }

    public rf1(byte[] bArr) {
        this(bArr.length, bArr);
    }

    public final void b(byte[] bArr, int i4) {
        if (this.f31174c == 0) {
            System.arraycopy(this.f31172a, this.f31173b, bArr, 0, i4);
            this.f31173b += i4;
            a();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(byte[] bArr, int i4) {
        int i5 = i4 >> 3;
        for (int i6 = 0; i6 < i5; i6++) {
            byte[] bArr2 = this.f31172a;
            int i7 = this.f31173b;
            int i8 = i7 + 1;
            this.f31173b = i8;
            byte b4 = bArr2[i7];
            int i9 = this.f31174c;
            byte b5 = (byte) (b4 << i9);
            bArr[i6] = b5;
            bArr[i6] = (byte) (((255 & bArr2[i8]) >> (8 - i9)) | b5);
        }
        int i10 = i4 & 7;
        if (i10 == 0) {
            return;
        }
        byte b6 = (byte) (bArr[i5] & (KotlinVersion.MAX_COMPONENT_VALUE >> i10));
        bArr[i5] = b6;
        int i11 = this.f31174c;
        if (i11 + i10 > 8) {
            byte[] bArr3 = this.f31172a;
            int i12 = this.f31173b;
            this.f31173b = i12 + 1;
            bArr[i5] = (byte) (b6 | ((bArr3[i12] & 255) << i11));
            this.f31174c = i11 - 8;
        }
        int i13 = this.f31174c + i10;
        this.f31174c = i13;
        byte[] bArr4 = this.f31172a;
        int i14 = this.f31173b;
        bArr[i5] = (byte) (((byte) (((255 & bArr4[i14]) >> (8 - i13)) << (8 - i10))) | bArr[i5]);
        if (i13 == 8) {
            this.f31174c = 0;
            this.f31173b = i14 + 1;
        }
        a();
    }

    public final String a(int i4, Charset charset) {
        byte[] bArr = new byte[i4];
        b(bArr, i4);
        return new String(bArr, charset);
    }

    public final void a(int i4, byte[] bArr) {
        this.f31172a = bArr;
        this.f31173b = 0;
        this.f31174c = 0;
        this.f31175d = i4;
    }
}
