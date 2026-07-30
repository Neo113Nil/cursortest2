package com.anythink.expressad.advanced.d;

import com.anythink.expressad.out.p;
import java.util.Random;

/* loaded from: classes.dex */
public final class d implements com.anythink.expressad.advanced.b.b {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f18022a = "NativeAdvancedShowListenerImpl";

    /* renamed from: b, reason: collision with root package name */
    protected p f18023b;

    /* renamed from: c, reason: collision with root package name */
    protected com.anythink.expressad.foundation.d.d f18024c;

    /* renamed from: d, reason: collision with root package name */
    protected c f18025d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18026e;

    public d(c cVar, p pVar, double d2, com.anythink.expressad.foundation.d.d dVar) {
        this.f18025d = cVar;
        this.f18023b = pVar;
        this.f18024c = dVar;
        this.f18026e = a(d2, dVar);
    }

    private void g() {
        if (this.f18023b != null) {
            this.f18023b = null;
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void a() {
        c cVar = this.f18025d;
        if (cVar != null) {
            cVar.f17997d = true;
        }
        cVar.d();
        p pVar = this.f18023b;
        if (pVar == null || this.f18026e) {
            return;
        }
        pVar.b();
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void b() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void c() {
        p pVar = this.f18023b;
        if (pVar != null) {
            pVar.f();
            c cVar = this.f18025d;
            if (cVar != null) {
                cVar.f17997d = false;
            }
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void d() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void e() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void f() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        p pVar = this.f18023b;
        if (pVar == null || this.f18026e) {
            return;
        }
        pVar.a(dVar);
    }

    private static boolean a(double d2, com.anythink.expressad.foundation.d.d dVar) {
        try {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.a c4 = com.anythink.expressad.f.b.c();
            long l9 = c4.l() * 1000;
            long w9 = c4.w() * 1000;
            if (dVar != null) {
                if (dVar.a(w9, l9)) {
                    dVar.g(1);
                    return true;
                }
                dVar.g(0);
            }
        } catch (Exception unused) {
        }
        return (dVar == null || dVar.B() || d2 == 1.0d || new Random().nextDouble() <= d2) ? false : true;
    }
}
