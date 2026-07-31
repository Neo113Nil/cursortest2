package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p52;

/* loaded from: classes3.dex */
public final class x62 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f34463a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f34464b;

    /* renamed from: c, reason: collision with root package name */
    private int f34465c;

    /* renamed from: d, reason: collision with root package name */
    private long f34466d;

    /* renamed from: e, reason: collision with root package name */
    private int f34467e;

    /* renamed from: f, reason: collision with root package name */
    private int f34468f;

    /* renamed from: g, reason: collision with root package name */
    private int f34469g;

    public final void a(p52 p52Var, p52.a aVar) {
        if (this.f34465c > 0) {
            p52Var.a(this.f34466d, this.f34467e, this.f34468f, this.f34469g, aVar);
            this.f34465c = 0;
        }
    }

    public final void a() {
        this.f34464b = false;
        this.f34465c = 0;
    }

    public final void a(p52 p52Var, long j4, int i4, int i5, int i6, p52.a aVar) {
        if (this.f34469g <= i5 + i6) {
            if (this.f34464b) {
                int i7 = this.f34465c;
                int i8 = i7 + 1;
                this.f34465c = i8;
                if (i7 == 0) {
                    this.f34466d = j4;
                    this.f34467e = i4;
                    this.f34468f = 0;
                }
                this.f34468f += i5;
                this.f34469g = i6;
                if (i8 >= 16) {
                    a(p52Var, aVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void a(q70 q70Var) {
        if (this.f34464b) {
            return;
        }
        q70Var.a(this.f34463a, 0, 10);
        q70Var.c();
        byte[] bArr = this.f34463a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b4 = bArr[7];
            if ((b4 & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b4 & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.f34464b = true;
        }
    }
}
