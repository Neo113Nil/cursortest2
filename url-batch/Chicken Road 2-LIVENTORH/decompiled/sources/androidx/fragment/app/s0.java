package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s0 implements androidx.lifecycle.h, g1.e, androidx.lifecycle.p0 {

    /* renamed from: f, reason: collision with root package name */
    public final u f530f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.o0 f531g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.t f532h = null;
    public g1.d i = null;

    public s0(u uVar, androidx.lifecycle.o0 o0Var) {
        this.f530f = uVar;
        this.f531g = o0Var;
    }

    @Override // androidx.lifecycle.h
    public final a1.c a() {
        Application application;
        u uVar = this.f530f;
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
        a1.c cVar = new a1.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f106a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.m0.f622a, application);
        }
        linkedHashMap.put(androidx.lifecycle.g0.f606a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f607b, this);
        Bundle bundle = uVar.f539k;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f608c, bundle);
        }
        return cVar;
    }

    @Override // g1.e
    public final g1.c b() {
        f();
        return this.i.f1703b;
    }

    public final void c(androidx.lifecycle.l lVar) {
        this.f532h.d(lVar);
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 d() {
        f();
        return this.f531g;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        f();
        return this.f532h;
    }

    public final void f() {
        if (this.f532h == null) {
            this.f532h = new androidx.lifecycle.t(this);
            g1.d dVar = new g1.d(this);
            this.i = dVar;
            dVar.a();
            androidx.lifecycle.g0.a(this);
        }
    }
}
