package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes3.dex */
public final class lb0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f28500a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r14 == r22.f30393f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if ((r21.t() * 1000) == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (r3 == r2) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(sf1 sf1Var, pb0 pb0Var, int i4, a aVar) {
        int i5;
        int i6;
        int i7;
        int t4;
        int d4 = sf1Var.d();
        long v4 = sf1Var.v();
        long j4 = v4 >>> 16;
        if (j4 != i4) {
            return false;
        }
        boolean z4 = (j4 & 1) == 1;
        int i8 = (int) ((v4 >> 12) & 15);
        int i9 = (int) ((v4 >> 8) & 15);
        int i10 = (int) (15 & (v4 >> 4));
        int i11 = (int) ((v4 >> 1) & 7);
        boolean z5 = (v4 & 1) == 1;
        if (i10 > 7 ? !(i10 > 10 || pb0Var.f30394g != 2) : i10 == pb0Var.f30394g - 1) {
            if ((i11 == 0 || i11 == pb0Var.f30396i) && !z5) {
                try {
                    long A4 = sf1Var.A();
                    if (!z4) {
                        A4 *= pb0Var.f30389b;
                    }
                    aVar.f28500a = A4;
                    switch (i8) {
                        case 1:
                            i5 = 192;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            i6 = i8 - 2;
                            i7 = 576;
                            i5 = i7 << i6;
                            break;
                        case 6:
                            t4 = sf1Var.t();
                            i5 = t4 + 1;
                            break;
                        case 7:
                            t4 = sf1Var.z();
                            i5 = t4 + 1;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            i6 = i8 - 8;
                            i7 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            i5 = i7 << i6;
                            break;
                        default:
                            i5 = -1;
                            break;
                    }
                    if (i5 != -1 && i5 <= pb0Var.f30389b) {
                        int i12 = pb0Var.f30392e;
                        if (i9 != 0) {
                            if (i9 > 11) {
                                if (i9 != 12) {
                                    if (i9 <= 14) {
                                        int z6 = sf1Var.z();
                                        if (i9 == 14) {
                                            z6 *= 10;
                                        }
                                    }
                                }
                            }
                        }
                        if (sf1Var.t() == u82.a(d4, sf1Var.d() - 1, sf1Var.c())) {
                            return true;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }
}
