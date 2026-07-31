package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2647g9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39056a;

    /* renamed from: b, reason: collision with root package name */
    public String f39057b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f39058c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f39059d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f39060e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f39061f;

    /* renamed from: g, reason: collision with root package name */
    public final E7 f39062g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC3063wb f39063h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f39064i;

    /* renamed from: j, reason: collision with root package name */
    public final String f39065j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f39066k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f39067l;

    /* renamed from: m, reason: collision with root package name */
    public final String f39068m;

    /* renamed from: n, reason: collision with root package name */
    public final String f39069n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC2513b9 f39070o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC3114ya f39071p;

    /* renamed from: q, reason: collision with root package name */
    public final H9 f39072q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f39073r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f39074s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f39075t;

    /* JADX WARN: Multi-variable type inference failed */
    public C2647g9(ContentValues contentValues) {
        A7 model = new B7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f39056a = model.a().j();
        this.f39057b = model.a().p();
        this.f39058c = model.c();
        this.f39059d = model.b();
        this.f39060e = model.a().k();
        this.f39061f = model.d();
        this.f39062g = model.a().i();
        this.f39063h = model.e();
        this.f39064i = model.a().d();
        this.f39065j = model.a().f();
        this.f39066k = model.a().o();
        this.f39067l = model.a().c();
        this.f39068m = model.a().b();
        this.f39069n = model.a().m();
        EnumC2513b9 e4 = model.a().e();
        this.f39070o = e4 == null ? EnumC2513b9.a(null) : e4;
        EnumC3114ya h4 = model.a().h();
        this.f39071p = h4 == null ? EnumC3114ya.a(null) : h4;
        this.f39072q = model.a().n();
        this.f39073r = model.a().a();
        this.f39074s = model.a().l();
        this.f39075t = model.a().g();
    }
}
