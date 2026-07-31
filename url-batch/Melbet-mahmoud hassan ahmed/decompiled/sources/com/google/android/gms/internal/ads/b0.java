package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f3094a = new dr2(8);

    /* renamed from: b, reason: collision with root package name */
    private int f3095b;

    private final long b(pc4 pc4Var) {
        jc4 jc4Var = (jc4) pc4Var;
        int i7 = 0;
        jc4Var.n(this.f3094a.h(), 0, 1, false);
        int i8 = this.f3094a.h()[0] & 255;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = 128;
        int i10 = 0;
        while ((i8 & i9) == 0) {
            i9 >>= 1;
            i10++;
        }
        int i11 = i8 & (i9 ^ (-1));
        jc4Var.n(this.f3094a.h(), 1, i10, false);
        while (i7 < i10) {
            i7++;
            i11 = (this.f3094a.h()[i7] & 255) + (i11 << 8);
        }
        this.f3095b += i10 + 1;
        return i11;
    }

    public final boolean a(pc4 pc4Var) {
        long c7 = pc4Var.c();
        long j7 = 1024;
        if (c7 != -1 && c7 <= 1024) {
            j7 = c7;
        }
        int i7 = (int) j7;
        jc4 jc4Var = (jc4) pc4Var;
        jc4Var.n(this.f3094a.h(), 0, 4, false);
        long A = this.f3094a.A();
        this.f3095b = 4;
        while (A != 440786851) {
            int i8 = this.f3095b + 1;
            this.f3095b = i8;
            if (i8 == i7) {
                return false;
            }
            jc4Var.n(this.f3094a.h(), 0, 1, false);
            A = ((A << 8) & (-256)) | (this.f3094a.h()[0] & 255);
        }
        long b7 = b(pc4Var);
        long j8 = this.f3095b;
        if (b7 != Long.MIN_VALUE && (c7 == -1 || j8 + b7 < c7)) {
            while (true) {
                long j9 = this.f3095b;
                long j10 = j8 + b7;
                if (j9 < j10) {
                    if (b(pc4Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b8 = b(pc4Var);
                    if (b8 < 0) {
                        return false;
                    }
                    if (b8 != 0) {
                        int i9 = (int) b8;
                        jc4Var.o(i9, false);
                        this.f3095b += i9;
                    }
                } else if (j9 == j10) {
                    return true;
                }
            }
        }
        return false;
    }
}
