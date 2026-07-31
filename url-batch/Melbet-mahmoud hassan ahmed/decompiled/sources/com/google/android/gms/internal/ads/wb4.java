package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wb4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13788a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13789b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if (r11 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vb4 a(cq2 cq2Var) {
        int i7;
        int i8;
        int c7;
        int c8 = cq2Var.c(16);
        int c9 = cq2Var.c(16);
        if (c9 == 65535) {
            c9 = cq2Var.c(24);
            i7 = 7;
        } else {
            i7 = 4;
        }
        int i9 = c9 + i7;
        if (c8 == 44097) {
            i9 += 2;
        }
        int i10 = i9;
        int c10 = cq2Var.c(2);
        if (c10 == 3) {
            int i11 = 0;
            while (true) {
                c7 = i11 + cq2Var.c(2);
                if (!cq2Var.l()) {
                    break;
                }
                i11 = (c7 + 1) << 2;
            }
            c10 = c7 + 3;
        }
        int c11 = cq2Var.c(10);
        if (cq2Var.l() && cq2Var.c(3) > 0) {
            cq2Var.j(2);
        }
        int i12 = true != cq2Var.l() ? 44100 : 48000;
        int c12 = cq2Var.c(4);
        if (i12 == 44100 && c12 == 13) {
            i8 = f13788a[13];
        } else if (i12 != 48000 || c12 >= 14) {
            i8 = 0;
        } else {
            int i13 = f13788a[c12];
            int i14 = c11 % 5;
            if (i14 != 1) {
                if (i14 == 2) {
                    if (c12 != 8) {
                    }
                    i13++;
                    i8 = i13;
                } else if (i14 != 3) {
                    if (i14 == 4) {
                        if (c12 != 3) {
                            if (c12 != 8) {
                            }
                        }
                        i13++;
                    }
                    i8 = i13;
                }
            }
            if (c12 != 3) {
            }
            i13++;
            i8 = i13;
        }
        return new vb4(c10, 2, i12, i10, i8, null);
    }

    public static void b(int i7, dr2 dr2Var) {
        dr2Var.c(7);
        byte[] h7 = dr2Var.h();
        h7[0] = -84;
        h7[1] = 64;
        h7[2] = -1;
        h7[3] = -1;
        h7[4] = (byte) ((i7 >> 16) & 255);
        h7[5] = (byte) ((i7 >> 8) & 255);
        h7[6] = (byte) (i7 & 255);
    }
}
