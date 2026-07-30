package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class c extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    private g f10481a;

    /* renamed from: b, reason: collision with root package name */
    private d f10482b = null;

    /* renamed from: c, reason: collision with root package name */
    private b f10483c = null;

    /* renamed from: d, reason: collision with root package name */
    private i f10484d = null;

    public void a(Bundle bundle, int i8) {
        if (bundle == null) {
            return;
        }
        d().a(bundle, i8);
    }

    public b b() {
        if (this.f10483c == null) {
            this.f10483c = new b();
        }
        return this.f10483c;
    }

    public d c() {
        if (this.f10482b == null) {
            this.f10482b = new d();
        }
        return this.f10482b;
    }

    public g d() {
        if (this.f10481a == null) {
            this.f10481a = new g();
        }
        return this.f10481a;
    }

    public i e() {
        if (this.f10484d == null) {
            this.f10484d = new i();
        }
        return this.f10484d;
    }

    public boolean g(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return c().a(bundle);
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        this.f10481a = null;
    }

    public void a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return;
        }
        e().a(bundleArr);
    }

    public void c(int i8) {
        b().a(i8);
    }

    public boolean a(com.baidu.platform.comapi.h.h.a aVar) {
        if (aVar == null) {
            return false;
        }
        return d().a(aVar);
    }
}
