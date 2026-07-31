package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class pd1 {

    /* renamed from: a, reason: collision with root package name */
    private final qd1 f30415a = new qd1();

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f30416b = new sf1(0, new byte[65025]);

    /* renamed from: c, reason: collision with root package name */
    private int f30417c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f30418d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30419e;

    pd1() {
    }

    public final qd1 a() {
        return this.f30415a;
    }

    public final sf1 b() {
        return this.f30416b;
    }

    public final void c() {
        qd1 qd1Var = this.f30415a;
        qd1Var.f30740a = 0;
        qd1Var.f30741b = 0L;
        qd1Var.f30742c = 0;
        qd1Var.f30743d = 0;
        qd1Var.f30744e = 0;
        this.f30416b.c(0);
        this.f30417c = -1;
        this.f30419e = false;
    }

    public final void d() {
        if (this.f30416b.c().length == 65025) {
            return;
        }
        sf1 sf1Var = this.f30416b;
        sf1Var.a(this.f30416b.e(), Arrays.copyOf(sf1Var.c(), Math.max(65025, this.f30416b.e())));
    }

    public final boolean a(lz lzVar) {
        int i4;
        int i5;
        int i6;
        if (this.f30419e) {
            this.f30419e = false;
            this.f30416b.c(0);
        }
        while (true) {
            if (this.f30419e) {
                return true;
            }
            if (this.f30417c < 0) {
                if (!this.f30415a.a(lzVar, -1L) || !this.f30415a.a(lzVar, true)) {
                    break;
                }
                qd1 qd1Var = this.f30415a;
                int i7 = qd1Var.f30743d;
                if ((qd1Var.f30740a & 1) == 1 && this.f30416b.e() == 0) {
                    this.f30418d = 0;
                    int i8 = 0;
                    do {
                        int i9 = this.f30418d;
                        qd1 qd1Var2 = this.f30415a;
                        if (i9 >= qd1Var2.f30742c) {
                            break;
                        }
                        int[] iArr = qd1Var2.f30745f;
                        this.f30418d = i9 + 1;
                        i6 = iArr[i9];
                        i8 += i6;
                    } while (i6 == 255);
                    i7 += i8;
                    i5 = this.f30418d;
                } else {
                    i5 = 0;
                }
                try {
                    lzVar.a(i7);
                    this.f30417c = i5;
                } catch (EOFException unused) {
                }
            }
            int i10 = this.f30417c;
            this.f30418d = 0;
            int i11 = 0;
            do {
                int i12 = this.f30418d;
                int i13 = i10 + i12;
                qd1 qd1Var3 = this.f30415a;
                if (i13 >= qd1Var3.f30742c) {
                    break;
                }
                int[] iArr2 = qd1Var3.f30745f;
                this.f30418d = i12 + 1;
                i4 = iArr2[i13];
                i11 += i4;
            } while (i4 == 255);
            int i14 = this.f30417c + this.f30418d;
            if (i11 > 0) {
                sf1 sf1Var = this.f30416b;
                sf1Var.a(sf1Var.e() + i11);
                try {
                    lzVar.a(this.f30416b.c(), this.f30416b.e(), i11, false);
                    sf1 sf1Var2 = this.f30416b;
                    sf1Var2.d(sf1Var2.e() + i11);
                    this.f30419e = this.f30415a.f30745f[i14 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i14 == this.f30415a.f30742c) {
                i14 = -1;
            }
            this.f30417c = i14;
        }
        return false;
    }
}
