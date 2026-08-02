package y2;

import b2.C0192f;
import c2.C0204b;
import d2.InterfaceC0300c;
import f2.AbstractC0326c;
import f2.InterfaceC0327d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t2.AbstractC1205o;
import t2.AbstractC1208s;
import t2.AbstractC1212w;
import t2.C;
import t2.C1204n;
import t2.J;
import t2.l0;

/* loaded from: classes.dex */
public final class h extends C implements InterfaceC0327d, InterfaceC0300c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10843h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1208s f10844d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0326c f10845e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10846g;

    public h(AbstractC1208s abstractC1208s, AbstractC0326c abstractC0326c) {
        super(-1);
        this.f10844d = abstractC1208s;
        this.f10845e = abstractC0326c;
        this.f = a.f10833c;
        this.f10846g = a.k(abstractC0326c.getContext());
    }

    @Override // t2.C
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC1205o) {
            ((AbstractC1205o) obj).getClass();
            throw null;
        }
    }

    @Override // f2.InterfaceC0327d
    public final InterfaceC0327d c() {
        AbstractC0326c abstractC0326c = this.f10845e;
        if (abstractC0326c != null) {
            return abstractC0326c;
        }
        return null;
    }

    @Override // d2.InterfaceC0300c
    public final void f(Object obj) {
        AbstractC0326c abstractC0326c = this.f10845e;
        d2.h context = abstractC0326c.getContext();
        Throwable a3 = C0192f.a(obj);
        Object c1204n = a3 == null ? obj : new C1204n(a3, false);
        AbstractC1208s abstractC1208s = this.f10844d;
        if (abstractC1208s.d()) {
            this.f = c1204n;
            this.f10376c = 0;
            abstractC1208s.c(context, this);
            return;
        }
        J a4 = l0.a();
        if (a4.f10384c >= 4294967296L) {
            this.f = c1204n;
            this.f10376c = 0;
            C0204b c0204b = a4.f10386e;
            if (c0204b == null) {
                c0204b = new C0204b();
                a4.f10386e = c0204b;
            }
            c0204b.addLast(this);
            return;
        }
        a4.g(true);
        try {
            d2.h context2 = abstractC0326c.getContext();
            Object l3 = a.l(context2, this.f10846g);
            try {
                abstractC0326c.f(obj);
                while (a4.m()) {
                }
            } finally {
                a.f(context2, l3);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // d2.InterfaceC0300c
    public final d2.h getContext() {
        return this.f10845e.getContext();
    }

    @Override // t2.C
    public final Object j() {
        Object obj = this.f;
        this.f = a.f10833c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f10844d + ", " + AbstractC1212w.l(this.f10845e) + ']';
    }

    @Override // t2.C
    public final InterfaceC0300c e() {
        return this;
    }
}
