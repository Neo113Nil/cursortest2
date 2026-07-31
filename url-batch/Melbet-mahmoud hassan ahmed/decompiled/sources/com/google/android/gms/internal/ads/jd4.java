package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jd4 {

    /* renamed from: a, reason: collision with root package name */
    public int f7095a;

    /* renamed from: b, reason: collision with root package name */
    public String f7096b;

    /* renamed from: c, reason: collision with root package name */
    public int f7097c;

    /* renamed from: d, reason: collision with root package name */
    public int f7098d;

    /* renamed from: e, reason: collision with root package name */
    public int f7099e;

    /* renamed from: f, reason: collision with root package name */
    public int f7100f;

    /* renamed from: g, reason: collision with root package name */
    public int f7101g;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i7) {
        boolean m7;
        int i8;
        int i9;
        int i10;
        int i11;
        String[] strArr;
        int[] iArr;
        int i12;
        int l7;
        int[] iArr2;
        int[] iArr3;
        int i13;
        int i14;
        int[] iArr4;
        int[] iArr5;
        int i15;
        int[] iArr6;
        m7 = kd4.m(i7);
        if (!m7 || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        this.f7095a = i8;
        strArr = kd4.f7472a;
        this.f7096b = strArr[3 - i9];
        iArr = kd4.f7473b;
        int i16 = iArr[i11];
        this.f7098d = i16;
        if (i8 != 2) {
            if (i8 == 0) {
                i12 = i16 / 4;
            }
            int i17 = (i7 >>> 9) & 1;
            l7 = kd4.l(i8, i9);
            this.f7101g = l7;
            if (i9 != 3) {
                if (i8 == 3) {
                    iArr6 = kd4.f7474c;
                    i15 = iArr6[i10 - 1];
                } else {
                    iArr5 = kd4.f7475d;
                    i15 = iArr5[i10 - 1];
                }
                this.f7100f = i15;
                i14 = (((i15 * 12) / this.f7098d) + i17) * 4;
            } else {
                if (i8 != 3) {
                    iArr2 = kd4.f7478g;
                    int i18 = iArr2[i10 - 1];
                    this.f7100f = i18;
                    this.f7097c = (((i9 == 1 ? 72 : 144) * i18) / this.f7098d) + i17;
                    this.f7099e = ((i7 >> 6) & 3) == 3 ? 1 : 2;
                    return true;
                }
                if (i9 == 2) {
                    iArr4 = kd4.f7476e;
                    i13 = iArr4[i10 - 1];
                } else {
                    iArr3 = kd4.f7477f;
                    i13 = iArr3[i10 - 1];
                }
                this.f7100f = i13;
                i14 = ((i13 * 144) / this.f7098d) + i17;
            }
            this.f7097c = i14;
            this.f7099e = ((i7 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
        i12 = i16 / 2;
        this.f7098d = i12;
        int i172 = (i7 >>> 9) & 1;
        l7 = kd4.l(i8, i9);
        this.f7101g = l7;
        if (i9 != 3) {
        }
        this.f7097c = i14;
        this.f7099e = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
