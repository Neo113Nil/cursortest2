package com.yandex.mobile.ads.impl;

import android.text.Layout;

/* loaded from: classes3.dex */
final class k72 {

    /* renamed from: a, reason: collision with root package name */
    private String f28091a;

    /* renamed from: b, reason: collision with root package name */
    private int f28092b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28093c;

    /* renamed from: d, reason: collision with root package name */
    private int f28094d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28095e;

    /* renamed from: k, reason: collision with root package name */
    private float f28101k;

    /* renamed from: l, reason: collision with root package name */
    private String f28102l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f28105o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f28106p;

    /* renamed from: r, reason: collision with root package name */
    private f42 f28108r;

    /* renamed from: f, reason: collision with root package name */
    private int f28096f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f28097g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f28098h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f28099i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f28100j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f28103m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f28104n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f28107q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f28109s = Float.MAX_VALUE;

    public final k72 a(k72 k72Var) {
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (k72Var != null) {
            if (!this.f28093c && k72Var.f28093c) {
                this.f28092b = k72Var.f28092b;
                this.f28093c = true;
            }
            if (this.f28098h == -1) {
                this.f28098h = k72Var.f28098h;
            }
            if (this.f28099i == -1) {
                this.f28099i = k72Var.f28099i;
            }
            if (this.f28091a == null && (str = k72Var.f28091a) != null) {
                this.f28091a = str;
            }
            if (this.f28096f == -1) {
                this.f28096f = k72Var.f28096f;
            }
            if (this.f28097g == -1) {
                this.f28097g = k72Var.f28097g;
            }
            if (this.f28104n == -1) {
                this.f28104n = k72Var.f28104n;
            }
            if (this.f28105o == null && (alignment2 = k72Var.f28105o) != null) {
                this.f28105o = alignment2;
            }
            if (this.f28106p == null && (alignment = k72Var.f28106p) != null) {
                this.f28106p = alignment;
            }
            if (this.f28107q == -1) {
                this.f28107q = k72Var.f28107q;
            }
            if (this.f28100j == -1) {
                this.f28100j = k72Var.f28100j;
                this.f28101k = k72Var.f28101k;
            }
            if (this.f28108r == null) {
                this.f28108r = k72Var.f28108r;
            }
            if (this.f28109s == Float.MAX_VALUE) {
                this.f28109s = k72Var.f28109s;
            }
            if (!this.f28095e && k72Var.f28095e) {
                this.f28094d = k72Var.f28094d;
                this.f28095e = true;
            }
            if (this.f28103m == -1 && (i4 = k72Var.f28103m) != -1) {
                this.f28103m = i4;
            }
        }
        return this;
    }

    public final int b() {
        if (this.f28093c) {
            return this.f28092b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final String c() {
        return this.f28091a;
    }

    public final float d() {
        return this.f28101k;
    }

    public final int e() {
        return this.f28100j;
    }

    public final String f() {
        return this.f28102l;
    }

    public final Layout.Alignment g() {
        return this.f28106p;
    }

    public final int h() {
        return this.f28104n;
    }

    public final int i() {
        return this.f28103m;
    }

    public final float j() {
        return this.f28109s;
    }

    public final int k() {
        int i4 = this.f28098h;
        if (i4 == -1 && this.f28099i == -1) {
            return -1;
        }
        return (i4 == 1 ? 1 : 0) | (this.f28099i == 1 ? 2 : 0);
    }

    public final Layout.Alignment l() {
        return this.f28105o;
    }

    public final boolean m() {
        return this.f28107q == 1;
    }

    public final f42 n() {
        return this.f28108r;
    }

    public final boolean o() {
        return this.f28095e;
    }

    public final boolean p() {
        return this.f28093c;
    }

    public final boolean q() {
        return this.f28096f == 1;
    }

    public final boolean r() {
        return this.f28097g == 1;
    }

    public final void c(int i4) {
        this.f28100j = i4;
    }

    public final k72 d(int i4) {
        this.f28104n = i4;
        return this;
    }

    public final k72 e(int i4) {
        this.f28103m = i4;
        return this;
    }

    public final k72 c(boolean z4) {
        this.f28096f = z4 ? 1 : 0;
        return this;
    }

    public final k72 d(boolean z4) {
        this.f28107q = z4 ? 1 : 0;
        return this;
    }

    public final k72 e(boolean z4) {
        this.f28097g = z4 ? 1 : 0;
        return this;
    }

    public final void b(int i4) {
        this.f28092b = i4;
        this.f28093c = true;
    }

    public final k72 b(String str) {
        this.f28102l = str;
        return this;
    }

    public final k72 b(boolean z4) {
        this.f28099i = z4 ? 1 : 0;
        return this;
    }

    public final k72 b(float f4) {
        this.f28109s = f4;
        return this;
    }

    public final k72 b(Layout.Alignment alignment) {
        this.f28105o = alignment;
        return this;
    }

    public final int a() {
        if (this.f28095e) {
            return this.f28094d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final void a(int i4) {
        this.f28094d = i4;
        this.f28095e = true;
    }

    public final k72 a(boolean z4) {
        this.f28098h = z4 ? 1 : 0;
        return this;
    }

    public final k72 a(String str) {
        this.f28091a = str;
        return this;
    }

    public final void a(float f4) {
        this.f28101k = f4;
    }

    public final k72 a(Layout.Alignment alignment) {
        this.f28106p = alignment;
        return this;
    }

    public final k72 a(f42 f42Var) {
        this.f28108r = f42Var;
        return this;
    }
}
