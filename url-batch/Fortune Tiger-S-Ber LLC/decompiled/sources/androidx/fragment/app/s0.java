package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s0 implements androidx.lifecycle.h, c1.f, androidx.lifecycle.p0 {

    /* renamed from: f, reason: collision with root package name */
    public final u f517f;
    public final androidx.lifecycle.o0 g;
    public androidx.lifecycle.t h = null;

    /* renamed from: i, reason: collision with root package name */
    public c1.e f518i = null;

    public s0(u uVar, androidx.lifecycle.o0 o0Var) {
        this.f517f = uVar;
        this.g = o0Var;
    }

    @Override // c1.f
    public final c1.d a() {
        d();
        return this.f518i.f1004b;
    }

    public final void b(androidx.lifecycle.l lVar) {
        this.h.d(lVar);
    }

    @Override // androidx.lifecycle.h
    public final x0.b c() {
        Application application;
        u uVar = this.f517f;
        Context applicationContext = uVar.C().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        x0.b bVar = new x0.b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f2763a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.m0.f594a, application);
        }
        linkedHashMap.put(androidx.lifecycle.g0.f581a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f582b, this);
        Bundle bundle = uVar.f523k;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.g0.c, bundle);
        }
        return bVar;
    }

    public final void d() {
        if (this.h == null) {
            this.h = new androidx.lifecycle.t(this);
            c1.e eVar = new c1.e(this);
            this.f518i = eVar;
            eVar.a();
            androidx.lifecycle.g0.a(this);
        }
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 e() {
        d();
        return this.g;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        d();
        return this.h;
    }
}
