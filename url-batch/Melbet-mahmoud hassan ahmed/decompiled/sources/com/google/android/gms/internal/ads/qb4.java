package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class qb4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10641a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f10642b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10643c = 0;

    public static pb4 a(byte[] bArr) {
        return b(new cq2(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        if (r12 != 3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pb4 b(cq2 cq2Var, boolean z6) {
        int i7;
        int c7 = c(cq2Var);
        int d7 = d(cq2Var);
        int c8 = cq2Var.c(4);
        StringBuilder sb = new StringBuilder(19);
        sb.append("mp4a.40.");
        sb.append(c7);
        String sb2 = sb.toString();
        int i8 = 22;
        if (c7 == 5 || c7 == 29) {
            d7 = d(cq2Var);
            c7 = c(cq2Var);
            if (c7 == 22) {
                c8 = cq2Var.c(4);
            }
        }
        if (z6) {
            int i9 = 3;
            if (c7 != 1 && c7 != 2 && c7 != 3 && c7 != 4 && c7 != 6 && c7 != 7 && c7 != 17) {
                switch (c7) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb3 = new StringBuilder(42);
                        sb3.append("Unsupported audio object type: ");
                        sb3.append(c7);
                        throw dz.c(sb3.toString());
                }
            }
            if (cq2Var.l()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (cq2Var.l()) {
                cq2Var.j(14);
            }
            boolean l7 = cq2Var.l();
            if (c8 == 0) {
                throw new UnsupportedOperationException();
            }
            if (c7 == 6) {
                i7 = c7;
            } else {
                if (c7 != 20) {
                    i7 = c7;
                    if (l7) {
                        if (c7 == 22) {
                            cq2Var.j(16);
                        } else {
                            i8 = c7;
                        }
                        if (i8 == 17 || i8 == 19 || i8 == 20 || i8 == 23) {
                            cq2Var.j(3);
                        }
                        cq2Var.j(1);
                    }
                    switch (i7) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int c9 = cq2Var.c(2);
                            if (c9 == 2) {
                                i9 = c9;
                            }
                            StringBuilder sb4 = new StringBuilder(33);
                            sb4.append("Unsupported epConfig: ");
                            sb4.append(i9);
                            throw dz.c(sb4.toString());
                    }
                }
                c7 = 20;
                i7 = 20;
            }
            cq2Var.j(3);
            if (l7) {
            }
            switch (i7) {
            }
        }
        int i10 = f10642b[c8];
        if (i10 != -1) {
            return new pb4(d7, i10, sb2, null);
        }
        throw dz.a(null, null);
    }

    private static int c(cq2 cq2Var) {
        int c7 = cq2Var.c(5);
        return c7 == 31 ? cq2Var.c(6) + 32 : c7;
    }

    private static int d(cq2 cq2Var) {
        int c7 = cq2Var.c(4);
        if (c7 == 15) {
            return cq2Var.c(24);
        }
        if (c7 < 13) {
            return f10641a[c7];
        }
        throw dz.a(null, null);
    }
}
