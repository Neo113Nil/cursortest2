package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ds {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f4292a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f4293b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f4294c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f4295d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f4296e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f4297f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f4298g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f4299h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f4300i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f4301j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f4302k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f4303l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f4304m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f4305n;

    /* renamed from: o, reason: collision with root package name */
    private Integer f4306o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f4307p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f4308q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f4309r;

    public ds() {
    }

    /* synthetic */ ds(fu fuVar, cr crVar) {
        this.f4292a = fuVar.f5221a;
        this.f4293b = fuVar.f5222b;
        this.f4294c = fuVar.f5223c;
        this.f4295d = fuVar.f5224d;
        this.f4296e = fuVar.f5225e;
        this.f4297f = fuVar.f5226f;
        this.f4298g = fuVar.f5227g;
        this.f4299h = fuVar.f5228h;
        this.f4300i = fuVar.f5229i;
        this.f4301j = fuVar.f5231k;
        this.f4302k = fuVar.f5232l;
        this.f4303l = fuVar.f5233m;
        this.f4304m = fuVar.f5234n;
        this.f4305n = fuVar.f5235o;
        this.f4306o = fuVar.f5236p;
        this.f4307p = fuVar.f5237q;
        this.f4308q = fuVar.f5238r;
        this.f4309r = fuVar.f5239s;
    }

    public final ds A(CharSequence charSequence) {
        this.f4307p = charSequence;
        return this;
    }

    public final fu B() {
        return new fu(this);
    }

    public final ds k(byte[] bArr, int i7) {
        if (this.f4297f == null || n13.p(Integer.valueOf(i7), 3) || !n13.p(this.f4298g, 3)) {
            this.f4297f = (byte[]) bArr.clone();
            this.f4298g = Integer.valueOf(i7);
        }
        return this;
    }

    public final ds l(CharSequence charSequence) {
        this.f4295d = charSequence;
        return this;
    }

    public final ds m(CharSequence charSequence) {
        this.f4294c = charSequence;
        return this;
    }

    public final ds n(CharSequence charSequence) {
        this.f4293b = charSequence;
        return this;
    }

    public final ds o(CharSequence charSequence) {
        this.f4308q = charSequence;
        return this;
    }

    public final ds p(CharSequence charSequence) {
        this.f4309r = charSequence;
        return this;
    }

    public final ds q(CharSequence charSequence) {
        this.f4296e = charSequence;
        return this;
    }

    public final ds r(Integer num) {
        this.f4303l = num;
        return this;
    }

    public final ds s(Integer num) {
        this.f4302k = num;
        return this;
    }

    public final ds t(Integer num) {
        this.f4301j = num;
        return this;
    }

    public final ds u(Integer num) {
        this.f4306o = num;
        return this;
    }

    public final ds v(Integer num) {
        this.f4305n = num;
        return this;
    }

    public final ds w(Integer num) {
        this.f4304m = num;
        return this;
    }

    public final ds x(CharSequence charSequence) {
        this.f4292a = charSequence;
        return this;
    }

    public final ds y(Integer num) {
        this.f4300i = num;
        return this;
    }

    public final ds z(Integer num) {
        this.f4299h = num;
        return this;
    }
}
