package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* renamed from: com.yandex.mobile.ads.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1790a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f23100a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, JosStatusCodes.RTN_CODE_COMMON_ERROR, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f23101b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.yandex.mobile.ads.impl.a$a, reason: collision with other inner class name */
    public static final class C0181a {

        /* renamed from: a, reason: collision with root package name */
        public final int f23102a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23103b;

        /* renamed from: c, reason: collision with root package name */
        public final String f23104c;

        private C0181a(int i4, int i5, String str) {
            this.f23102a = i4;
            this.f23103b = i5;
            this.f23104c = str;
        }
    }

    public static C0181a a(rf1 rf1Var, boolean z4) {
        int i4;
        int i5;
        int b4 = rf1Var.b(5);
        if (b4 == 31) {
            b4 = rf1Var.b(6) + 32;
        }
        int b5 = rf1Var.b(4);
        if (b5 == 15) {
            i4 = rf1Var.b(24);
        } else {
            if (b5 >= 13) {
                throw wf1.a((String) null, (Exception) null);
            }
            i4 = f23100a[b5];
        }
        int b6 = rf1Var.b(4);
        String a4 = C1877de.a("mp4a.40.", b4);
        if (b4 == 5 || b4 == 29) {
            int b7 = rf1Var.b(4);
            if (b7 == 15) {
                i5 = rf1Var.b(24);
            } else {
                if (b7 >= 13) {
                    throw wf1.a((String) null, (Exception) null);
                }
                i5 = f23100a[b7];
            }
            i4 = i5;
            int b8 = rf1Var.b(5);
            if (b8 == 31) {
                b8 = rf1Var.b(6) + 32;
            }
            b4 = b8;
            if (b4 == 22) {
                b6 = rf1Var.b(4);
            }
        }
        if (z4) {
            if (b4 != 6 && b4 != 7 && b4 != 17 && b4 != 1 && b4 != 2 && b4 != 3 && b4 != 4) {
                switch (b4) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                        break;
                    default:
                        throw wf1.a("Unsupported audio object type: " + b4);
                }
            }
            if (rf1Var.f()) {
                ms0.d("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (rf1Var.f()) {
                rf1Var.d(14);
            }
            boolean f4 = rf1Var.f();
            if (b6 == 0) {
                throw new UnsupportedOperationException();
            }
            if (b4 == 6 || b4 == 20) {
                rf1Var.d(3);
            }
            if (f4) {
                if (b4 == 22) {
                    rf1Var.d(16);
                }
                if (b4 == 17 || b4 == 19 || b4 == 20 || b4 == 23) {
                    rf1Var.d(3);
                }
                rf1Var.d(1);
            }
            switch (b4) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                    int b9 = rf1Var.b(2);
                    if (b9 == 2 || b9 == 3) {
                        throw wf1.a("Unsupported epConfig: " + b9);
                    }
            }
        }
        int i6 = f23101b[b6];
        if (i6 != -1) {
            return new C0181a(i4, i6, a4);
        }
        throw wf1.a((String) null, (Exception) null);
    }
}
