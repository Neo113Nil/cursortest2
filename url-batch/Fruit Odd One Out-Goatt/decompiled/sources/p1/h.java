package p1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.c0;
import k1.v0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class h extends k1.x implements x0.c, v0.d {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1046i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e, reason: collision with root package name */
    public final k1.p f1047e;

    /* renamed from: f, reason: collision with root package name */
    public final x0.b f1048f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1049g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1050h;

    public h(k1.p pVar, x0.b bVar) {
        super(-1);
        this.f1047e = pVar;
        this.f1048f = bVar;
        this.f1049g = a.f1035c;
        v0.h hVar = bVar.f1231c;
        hVar.getClass();
        this.f1050h = a.j(hVar);
    }

    @Override // x0.c
    public final x0.c b() {
        x0.b bVar = this.f1048f;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // k1.x
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof k1.k) {
            throw null;
        }
    }

    @Override // v0.d
    public final v0.h d() {
        v0.h hVar = this.f1048f.f1231c;
        hVar.getClass();
        return hVar;
    }

    @Override // v0.d
    public final void f(Object obj) {
        x0.b bVar = this.f1048f;
        v0.h hVar = bVar.f1231c;
        hVar.getClass();
        Throwable a2 = t0.d.a(obj);
        Object jVar = a2 == null ? obj : new k1.j(a2, false);
        k1.p pVar = this.f1047e;
        if (pVar.c()) {
            this.f1049g = jVar;
            this.f731d = 0;
            pVar.b(hVar, this);
            return;
        }
        c0 a3 = v0.a();
        if (a3.f668d >= 4294967296L) {
            this.f1049g = jVar;
            this.f731d = 0;
            u0.b bVar2 = a3.f670f;
            if (bVar2 == null) {
                bVar2 = new u0.b();
                a3.f670f = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        a3.g(true);
        try {
            v0.h hVar2 = bVar.f1231c;
            hVar2.getClass();
            Object k2 = a.k(hVar2, this.f1050h);
            try {
                bVar.f(obj);
                while (a3.m()) {
                }
            } finally {
                a.f(hVar2, k2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // k1.x
    public final Object j() {
        Object obj = this.f1049g;
        this.f1049g = a.f1035c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1047e + ", " + k1.t.g(this.f1048f) + ']';
    }

    @Override // k1.x
    public final v0.d e() {
        return this;
    }
}
