package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class z1 {

    /* renamed from: a, reason: collision with root package name */
    private final a2 f14885a = new a2();

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f14886b = new dr2(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f14887c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f14888d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14889e;

    z1() {
    }

    private final int f(int i7) {
        int i8;
        int i9 = 0;
        this.f14888d = 0;
        do {
            int i10 = this.f14888d;
            int i11 = i7 + i10;
            a2 a2Var = this.f14885a;
            if (i11 >= a2Var.f2557c) {
                break;
            }
            int[] iArr = a2Var.f2560f;
            this.f14888d = i10 + 1;
            i8 = iArr[i11];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public final dr2 a() {
        return this.f14886b;
    }

    public final a2 b() {
        return this.f14885a;
    }

    public final void c() {
        this.f14885a.a();
        this.f14886b.c(0);
        this.f14887c = -1;
        this.f14889e = false;
    }

    public final void d() {
        if (this.f14886b.h().length == 65025) {
            return;
        }
        dr2 dr2Var = this.f14886b;
        dr2Var.d(Arrays.copyOf(dr2Var.h(), Math.max(65025, this.f14886b.l())), this.f14886b.l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(pc4 pc4Var) {
        if (this.f14889e) {
            this.f14889e = false;
            this.f14886b.c(0);
        }
        while (true) {
            if (this.f14889e) {
                return true;
            }
            int i7 = this.f14887c;
            if (i7 < 0) {
                if (!this.f14885a.c(pc4Var, -1L) || !this.f14885a.b(pc4Var, true)) {
                    break;
                }
                a2 a2Var = this.f14885a;
                int i8 = a2Var.f2558d;
                if ((a2Var.f2555a & 1) == 1 && this.f14886b.l() == 0) {
                    i8 += f(0);
                    i7 = this.f14888d;
                } else {
                    i7 = 0;
                }
                if (!sc4.e(pc4Var, i8)) {
                    return false;
                }
                this.f14887c = i7;
            }
            int f7 = f(i7);
            int i9 = this.f14887c + this.f14888d;
            if (f7 > 0) {
                dr2 dr2Var = this.f14886b;
                dr2Var.H(dr2Var.l() + f7);
                if (!sc4.d(pc4Var, this.f14886b.h(), this.f14886b.l(), f7)) {
                    return false;
                }
                dr2 dr2Var2 = this.f14886b;
                dr2Var2.e(dr2Var2.l() + f7);
                this.f14889e = this.f14885a.f2560f[i9 + (-1)] != 255;
            }
            if (i9 == this.f14885a.f2557c) {
                i9 = -1;
            }
            this.f14887c = i9;
        }
    }
}
