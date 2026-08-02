package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class S8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6611a;

    /* renamed from: b, reason: collision with root package name */
    public String f6612b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f6613c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f6614d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f6615e;
    public final Long f;

    /* renamed from: g, reason: collision with root package name */
    public final C0770q7 f6616g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC0567ib f6617h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f6618i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6619j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f6620k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f6621l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6622m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6623n;
    public final N8 o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC0617ka f6624p;

    /* renamed from: q, reason: collision with root package name */
    public final EnumC0849t9 f6625q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f6626r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f6627s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f6628t;

    /* JADX WARN: Multi-variable type inference failed */
    public S8(ContentValues contentValues) {
        C0666m7 model = new C0692n7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f6611a = model.a().j();
        this.f6612b = model.a().p();
        this.f6613c = model.c();
        this.f6614d = model.b();
        this.f6615e = model.a().k();
        this.f = model.d();
        this.f6616g = model.a().i();
        this.f6617h = model.e();
        this.f6618i = model.a().d();
        this.f6619j = model.a().f();
        this.f6620k = model.a().o();
        this.f6621l = model.a().c();
        this.f6622m = model.a().b();
        this.f6623n = model.a().m();
        N8 e3 = model.a().e();
        this.o = e3 == null ? N8.a(null) : e3;
        EnumC0617ka h3 = model.a().h();
        this.f6624p = h3 == null ? EnumC0617ka.a(null) : h3;
        this.f6625q = model.a().n();
        this.f6626r = model.a().a();
        this.f6627s = model.a().l();
        this.f6628t = model.a().g();
    }
}
