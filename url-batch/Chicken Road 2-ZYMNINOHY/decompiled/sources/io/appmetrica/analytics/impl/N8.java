package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class N8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10693a;

    /* renamed from: b, reason: collision with root package name */
    public String f10694b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f10695c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f10696d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f10697e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f10698f;

    /* renamed from: g, reason: collision with root package name */
    public final C0685i7 f10699g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC0508bb f10700h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f10701i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10702j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f10703k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f10704l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10705m;
    public final String n;
    public final I8 o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC0559da f10706p;

    /* renamed from: q, reason: collision with root package name */
    public final EnumC0790m9 f10707q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f10708r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f10709s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f10710t;

    /* JADX WARN: Multi-variable type inference failed */
    public N8(ContentValues contentValues) {
        C0581e7 model = new C0607f7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f10693a = model.a().j();
        this.f10694b = model.a().p();
        this.f10695c = model.c();
        this.f10696d = model.b();
        this.f10697e = model.a().k();
        this.f10698f = model.d();
        this.f10699g = model.a().i();
        this.f10700h = model.e();
        this.f10701i = model.a().d();
        this.f10702j = model.a().f();
        this.f10703k = model.a().o();
        this.f10704l = model.a().c();
        this.f10705m = model.a().b();
        this.n = model.a().m();
        I8 e4 = model.a().e();
        this.o = e4 == null ? I8.a(null) : e4;
        EnumC0559da h2 = model.a().h();
        this.f10706p = h2 == null ? EnumC0559da.a(null) : h2;
        this.f10707q = model.a().n();
        this.f10708r = model.a().a();
        this.f10709s = model.a().l();
        this.f10710t = model.a().g();
    }
}
