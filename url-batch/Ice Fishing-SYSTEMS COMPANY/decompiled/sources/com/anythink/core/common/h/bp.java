package com.anythink.core.common.h;

import java.util.List;

/* loaded from: classes.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.core.d.l f13891a;

    /* renamed from: b, reason: collision with root package name */
    n f13892b;

    /* renamed from: c, reason: collision with root package name */
    List<bv> f13893c;

    /* renamed from: d, reason: collision with root package name */
    List<bv> f13894d;

    /* renamed from: e, reason: collision with root package name */
    List<bv> f13895e;

    /* renamed from: f, reason: collision with root package name */
    List<bv> f13896f;

    /* renamed from: g, reason: collision with root package name */
    List<bv> f13897g;

    /* renamed from: h, reason: collision with root package name */
    int f13898h;

    public bp(com.anythink.core.d.l lVar, n nVar, int i) {
        this.f13891a = lVar;
        this.f13892b = nVar;
        this.f13898h = i;
    }

    public final com.anythink.core.d.l a() {
        return this.f13891a;
    }

    public final int b() {
        return this.f13898h;
    }

    public final n c() {
        return this.f13892b;
    }

    public final List<bv> d() {
        return this.f13893c;
    }

    public final List<bv> e() {
        return this.f13894d;
    }

    public final List<bv> f() {
        return this.f13896f;
    }

    public final List<bv> g() {
        return this.f13897g;
    }

    public final List<bv> h() {
        return this.f13895e;
    }

    public final boolean i() {
        List<bv> list = this.f13893c;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<bv> list2 = this.f13894d;
        if (list2 != null && list2.size() > 0) {
            return true;
        }
        List<bv> list3 = this.f13895e;
        if (list3 != null && list3.size() > 0) {
            return true;
        }
        List<bv> list4 = this.f13896f;
        if (list4 != null && list4.size() > 0) {
            return true;
        }
        List<bv> list5 = this.f13897g;
        return list5 != null && list5.size() > 0;
    }

    public final boolean j() {
        List<bv> list = this.f13896f;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<bv> list2 = this.f13897g;
        return list2 != null && list2.size() > 0;
    }

    public final boolean k() {
        List<bv> list = this.f13893c;
        if (list != null && list.size() > 0) {
            return false;
        }
        List<bv> list2 = this.f13895e;
        return list2 == null || list2.size() <= 0;
    }

    public final void a(List<bv> list) {
        this.f13893c = list;
    }

    public final void b(List<bv> list) {
        this.f13894d = list;
    }

    public final void c(List<bv> list) {
        this.f13896f = list;
    }

    public final void d(List<bv> list) {
        this.f13897g = list;
    }

    public final void e(List<bv> list) {
        this.f13895e = list;
    }
}
