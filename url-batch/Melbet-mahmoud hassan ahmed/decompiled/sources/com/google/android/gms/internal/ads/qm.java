package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qm {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f10749a;

    /* renamed from: b, reason: collision with root package name */
    private int f10750b;

    /* renamed from: c, reason: collision with root package name */
    private int f10751c;

    /* renamed from: d, reason: collision with root package name */
    private int f10752d;

    public qm(byte[] bArr, int i7) {
        this.f10749a = bArr;
        this.f10752d = i7;
    }

    public final int a(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i7 >> 3;
        boolean z6 = false;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = this.f10751c;
            if (i15 != 0) {
                byte[] bArr = this.f10749a;
                int i16 = this.f10750b;
                i11 = ((bArr[i16 + 1] & 255) >>> (8 - i15)) | ((bArr[i16] & 255) << i15);
            } else {
                i11 = this.f10749a[this.f10750b];
            }
            i7 -= 8;
            i13 |= (255 & i11) << i7;
            this.f10750b++;
        }
        if (i7 > 0) {
            int i17 = this.f10751c + i7;
            byte b7 = (byte) (255 >> (8 - i7));
            byte[] bArr2 = this.f10749a;
            int i18 = this.f10750b;
            if (i17 > 8) {
                int i19 = i18 + 1;
                i10 = (b7 & (((255 & bArr2[i19]) >> (16 - i17)) | ((bArr2[i18] & 255) << (i17 - 8)))) | i13;
                this.f10750b = i19;
            } else {
                i10 = (b7 & ((255 & bArr2[i18]) >> (8 - i17))) | i13;
                if (i17 == 8) {
                    this.f10750b = i18 + 1;
                }
            }
            i13 = i10;
            this.f10751c = i17 % 8;
        }
        int i20 = this.f10750b;
        if (i20 >= 0 && (i8 = this.f10751c) >= 0 && (i20 < (i9 = this.f10752d) || (i20 == i9 && i8 == 0))) {
            z6 = true;
        }
        jm.e(z6);
        return i13;
    }
}
