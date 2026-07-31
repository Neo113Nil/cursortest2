package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* loaded from: classes3.dex */
public final class s11 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f31522a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f31523b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f31524c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f31525d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f31526e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f31527f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f31528g = {JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f31529a;

        /* renamed from: b, reason: collision with root package name */
        public String f31530b;

        /* renamed from: c, reason: collision with root package name */
        public int f31531c;

        /* renamed from: d, reason: collision with root package name */
        public int f31532d;

        /* renamed from: e, reason: collision with root package name */
        public int f31533e;

        /* renamed from: f, reason: collision with root package name */
        public int f31534f;

        /* renamed from: g, reason: collision with root package name */
        public int f31535g;

        public final boolean a(int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            if ((i4 & (-2097152)) != -2097152 || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
                return false;
            }
            this.f31529a = i5;
            this.f31530b = s11.f31522a[3 - i6];
            int i10 = s11.f31523b[i8];
            this.f31532d = i10;
            if (i5 == 2) {
                this.f31532d = i10 / 2;
            } else if (i5 == 0) {
                this.f31532d = i10 / 4;
            }
            int i11 = (i4 >>> 9) & 1;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new IllegalArgumentException();
                    }
                    i9 = 384;
                }
                i9 = 1152;
            } else {
                if (i5 != 3) {
                    i9 = 576;
                }
                i9 = 1152;
            }
            this.f31535g = i9;
            if (i6 == 3) {
                int i12 = i5 == 3 ? s11.f31524c[i7 - 1] : s11.f31525d[i7 - 1];
                this.f31534f = i12;
                this.f31531c = (((i12 * 12) / this.f31532d) + i11) * 4;
            } else {
                if (i5 == 3) {
                    int i13 = i6 == 2 ? s11.f31526e[i7 - 1] : s11.f31527f[i7 - 1];
                    this.f31534f = i13;
                    this.f31531c = ((i13 * 144) / this.f31532d) + i11;
                } else {
                    int i14 = s11.f31528g[i7 - 1];
                    this.f31534f = i14;
                    this.f31531c = (((i6 == 1 ? 72 : 144) * i14) / this.f31532d) + i11;
                }
            }
            this.f31533e = ((i4 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int a(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i4 & (-2097152)) != -2097152 || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = f31523b[i8];
        if (i5 == 2) {
            i9 /= 2;
        } else if (i5 == 0) {
            i9 /= 4;
        }
        int i10 = (i4 >>> 9) & 1;
        if (i6 == 3) {
            return ((((i5 == 3 ? f31524c[i7 - 1] : f31525d[i7 - 1]) * 12) / i9) + i10) * 4;
        }
        int i11 = i5 == 3 ? i6 == 2 ? f31526e[i7 - 1] : f31527f[i7 - 1] : f31528g[i7 - 1];
        if (i5 == 3) {
            return ((i11 * 144) / i9) + i10;
        }
        return (((i6 == 1 ? 72 : 144) * i11) / i9) + i10;
    }

    public static int b(int i4) {
        int i5;
        int i6;
        if ((i4 & (-2097152)) != -2097152 || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0) {
            return -1;
        }
        int i7 = (i4 >>> 12) & 15;
        int i8 = (i4 >>> 10) & 3;
        if (i7 != 0 && i7 != 15 && i8 != 3) {
            if (i6 == 1) {
                return i5 == 3 ? 1152 : 576;
            }
            if (i6 == 2) {
                return 1152;
            }
            if (i6 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
        return -1;
    }
}
