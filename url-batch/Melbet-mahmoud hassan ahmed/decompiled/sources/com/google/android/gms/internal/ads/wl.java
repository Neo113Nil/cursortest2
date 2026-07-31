package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wl {

    /* renamed from: b, reason: collision with root package name */
    private int f13849b;

    /* renamed from: c, reason: collision with root package name */
    private int f13850c;

    /* renamed from: d, reason: collision with root package name */
    private int f13851d = 0;

    /* renamed from: e, reason: collision with root package name */
    private ql[] f13852e = new ql[100];

    /* renamed from: a, reason: collision with root package name */
    private final ql[] f13848a = new ql[1];

    public wl(boolean z6, int i7) {
    }

    public final synchronized int a() {
        return this.f13850c * 65536;
    }

    public final synchronized ql b() {
        ql qlVar;
        this.f13850c++;
        int i7 = this.f13851d;
        if (i7 > 0) {
            ql[] qlVarArr = this.f13852e;
            int i8 = i7 - 1;
            this.f13851d = i8;
            qlVar = qlVarArr[i8];
            qlVarArr[i8] = null;
        } else {
            qlVar = new ql(new byte[65536], 0);
        }
        return qlVar;
    }

    public final synchronized void c(ql qlVar) {
        ql[] qlVarArr = this.f13848a;
        qlVarArr[0] = qlVar;
        d(qlVarArr);
    }

    public final synchronized void d(ql[] qlVarArr) {
        int length = this.f13851d + qlVarArr.length;
        ql[] qlVarArr2 = this.f13852e;
        int length2 = qlVarArr2.length;
        if (length >= length2) {
            this.f13852e = (ql[]) Arrays.copyOf(qlVarArr2, Math.max(length2 + length2, length));
        }
        for (ql qlVar : qlVarArr) {
            byte[] bArr = qlVar.f10744a;
            ql[] qlVarArr3 = this.f13852e;
            int i7 = this.f13851d;
            this.f13851d = i7 + 1;
            qlVarArr3[i7] = qlVar;
        }
        this.f13850c -= qlVarArr.length;
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i7) {
        int i8 = this.f13849b;
        this.f13849b = i7;
        if (i7 < i8) {
            g();
        }
    }

    public final synchronized void g() {
        int max = Math.max(0, zm.d(this.f13849b, 65536) - this.f13850c);
        int i7 = this.f13851d;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f13852e, max, i7, (Object) null);
        this.f13851d = max;
    }
}
