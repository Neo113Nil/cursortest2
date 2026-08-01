package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s0 implements androidx.lifecycle.h, h1.e, androidx.lifecycle.p0 {

    /* renamed from: f, reason: collision with root package name */
    public final u f640f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.o0 f641g;
    public androidx.lifecycle.t h = null;
    public h1.d i = null;

    public s0(u uVar, androidx.lifecycle.o0 o0Var) {
        this.f640f = uVar;
        this.f641g = o0Var;
    }

    @Override // h1.e
    public final h1.c a() {
        d();
        return this.i.f1972b;
    }

    public final void b(androidx.lifecycle.l lVar) {
        this.h.d(lVar);
    }

    @Override // androidx.lifecycle.h
    public final b1.c c() {
        Application application;
        u uVar = this.f640f;
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
        b1.c cVar = new b1.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f825a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.m0.f726a, application);
        }
        linkedHashMap.put(androidx.lifecycle.g0.f710a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f711b, this);
        Bundle bundle = uVar.f647k;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f712c, bundle);
        }
        return cVar;
    }

    public final void d() {
        if (this.h == null) {
            this.h = new androidx.lifecycle.t(this);
            h1.d dVar = new h1.d(this);
            this.i = dVar;
            dVar.a();
            androidx.lifecycle.g0.a(this);
        }
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 e() {
        d();
        return this.f641g;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        d();
        return this.h;
    }
}
