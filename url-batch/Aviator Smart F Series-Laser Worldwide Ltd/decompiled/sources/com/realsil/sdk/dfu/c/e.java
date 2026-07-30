package com.realsil.sdk.dfu.c;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f15710a;

    /* renamed from: b, reason: collision with root package name */
    public int f15711b;

    /* renamed from: c, reason: collision with root package name */
    public String f15712c;

    /* renamed from: d, reason: collision with root package name */
    public int f15713d;

    /* renamed from: e, reason: collision with root package name */
    public int f15714e;

    /* renamed from: f, reason: collision with root package name */
    public int f15715f;

    /* renamed from: g, reason: collision with root package name */
    public int f15716g;

    public e(long j8, int i8, int i9) {
        this.f15710a = j8;
        this.f15711b = i8;
        this.f15713d = 0;
        this.f15714e = 0;
        this.f15715f = 0;
        this.f15716g = i9;
        this.f15712c = String.valueOf(i9);
    }

    public int a(e eVar) {
        int i8 = this.f15713d;
        int i9 = eVar.f15713d;
        if (i8 > i9) {
            return 1;
        }
        if (i8 < i9) {
            return -1;
        }
        int i10 = this.f15714e;
        int i11 = eVar.f15714e;
        if (i10 > i11) {
            return 1;
        }
        if (i10 < i11) {
            return -1;
        }
        int i12 = this.f15715f;
        int i13 = eVar.f15715f;
        if (i12 > i13) {
            return 1;
        }
        if (i12 < i13) {
            return -1;
        }
        return Integer.compare(this.f15716g, eVar.f15716g);
    }

    public String toString() {
        return "ImageVersion{" + String.format("%08X -> %d(%s))", Long.valueOf(this.f15710a), Integer.valueOf(this.f15711b), this.f15712c) + "}";
    }

    public e(long j8, int i8, int i9, int i10, int i11, int i12) {
        this.f15710a = j8;
        this.f15711b = i8;
        this.f15713d = i9;
        this.f15714e = i10;
        this.f15715f = i11;
        this.f15716g = i12;
        this.f15712c = String.format("%d.%d.%d.%d", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static e a(int i8, long j8) {
        if (com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 == j8 || -1 == j8) {
            return new e(j8, i8, 0);
        }
        if (i8 == 1) {
            return new e(j8, i8, (int) (j8 & 255), (int) ((j8 >> 8) & 255), (int) ((j8 >> 16) & 255), (int) ((j8 >> 24) & 255));
        }
        if (i8 != 515 && i8 != 516 && i8 != 2) {
            if (i8 == 3) {
                return new e(j8, i8, (int) (j8 & 15), (int) ((j8 >> 4) & 255), (int) ((j8 >> 12) & 32767), (int) ((j8 >> 27) & 31));
            }
            if (i8 == 5) {
                return new e(j8, i8, (int) (j8 & 15), (int) ((j8 >> 4) & 255), (int) ((j8 >> 12) & 511), (int) ((j8 >> 21) & 2047));
            }
            if (i8 != 4 && i8 != 7 && i8 == 514) {
                return new e(j8, i8, (int) ((j8 >> 8) & 255), (int) (j8 & 255), (int) ((j8 >> 24) & 255), (int) ((j8 >> 16) & 255));
            }
            return new e(j8, i8, (int) j8);
        }
        return new e(j8, i8, (int) ((j8 >> 24) & 255), (int) ((j8 >> 16) & 255), (int) ((j8 >> 8) & 255), (int) (255 & j8));
    }
}
