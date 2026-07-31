package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2214s {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f31500a = {2002, 2000, 1920, IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1001, 1000, 960, 800, 800, 480, 400, 400, com.ironsource.mediationsdk.metadata.a.f17688n};

    /* renamed from: com.yandex.mobile.ads.impl.s$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f31501a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31502b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31503c;

        private a(int i4, int i5, int i6) {
            this.f31501a = i4;
            this.f31502b = i5;
            this.f31503c = i6;
        }
    }

    public static void a(int i4, sf1 sf1Var) {
        sf1Var.c(7);
        byte[] c4 = sf1Var.c();
        c4[0] = -84;
        c4[1] = 64;
        c4[2] = -1;
        c4[3] = -1;
        c4[4] = (byte) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        c4[5] = (byte) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        c4[6] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(rf1 rf1Var) {
        int i4;
        int i5;
        int b4 = rf1Var.b(16);
        int b5 = rf1Var.b(16);
        if (b5 == 65535) {
            b5 = rf1Var.b(24);
            i4 = 7;
        } else {
            i4 = 4;
        }
        int i6 = b5 + i4;
        if (b4 == 44097) {
            i6 += 2;
        }
        if (rf1Var.b(2) == 3) {
            do {
                rf1Var.b(2);
            } while (rf1Var.f());
        }
        int b6 = rf1Var.b(10);
        if (rf1Var.f() && rf1Var.b(3) > 0) {
            rf1Var.d(2);
        }
        int i7 = rf1Var.f() ? 48000 : 44100;
        int b7 = rf1Var.b(4);
        if (i7 == 44100 && b7 == 13) {
            i5 = f31500a[b7];
        } else {
            if (i7 == 48000) {
                int[] iArr = f31500a;
                if (b7 < 14) {
                    int i8 = iArr[b7];
                    int i9 = b6 % 5;
                    if (i9 != 1) {
                        if (i9 == 2) {
                            if (b7 != 8) {
                            }
                            i5 = i8 + 1;
                        } else if (i9 != 3) {
                            if (i9 == 4) {
                                if (b7 != 3) {
                                    if (b7 != 8) {
                                    }
                                }
                                i5 = i8 + 1;
                            }
                            i5 = i8;
                        }
                    }
                    if (b7 != 3) {
                    }
                    i5 = i8 + 1;
                }
            }
            i5 = 0;
        }
        return new a(i7, i6, i5);
    }
}
