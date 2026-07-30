package R0;

import M0.AbstractC0060s;
import M0.AbstractC0063v;
import M0.C0056n;
import M0.C0057o;
import M0.H;
import M0.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.AbstractC0244d;

/* loaded from: classes.dex */
public final class h extends M0.A implements y0.c, w0.d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f906l = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0060s f907h;

    /* renamed from: i, reason: collision with root package name */
    public final y0.b f908i;

    /* renamed from: j, reason: collision with root package name */
    public Object f909j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f910k;

    public h(AbstractC0060s abstractC0060s, y0.b bVar) {
        super(-1);
        this.f907h = abstractC0060s;
        this.f908i = bVar;
        this.f909j = AbstractC0068a.f895c;
        this.f910k = AbstractC0068a.m(bVar.getContext());
    }

    @Override // M0.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0057o) {
            ((C0057o) obj).f678b.i(cancellationException);
        }
    }

    @Override // y0.c
    public final y0.c g() {
        y0.b bVar = this.f908i;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // w0.d
    public final w0.i getContext() {
        return this.f908i.getContext();
    }

    @Override // M0.A
    public final Object k() {
        Object obj = this.f909j;
        this.f909j = AbstractC0068a.f895c;
        return obj;
    }

    @Override // w0.d
    public final void resumeWith(Object obj) {
        y0.b bVar = this.f908i;
        w0.i context = bVar.getContext();
        Throwable a2 = AbstractC0244d.a(obj);
        Object c0056n = a2 == null ? obj : new C0056n(a2, false);
        AbstractC0060s abstractC0060s = this.f907h;
        if (abstractC0060s.d()) {
            this.f909j = c0056n;
            this.f615g = 0;
            abstractC0060s.c(context, this);
            return;
        }
        H a3 = h0.a();
        if (a3.f624g >= 4294967296L) {
            this.f909j = c0056n;
            this.f615g = 0;
            v0.b bVar2 = a3.f626i;
            if (bVar2 == null) {
                bVar2 = new v0.b();
                a3.f626i = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        a3.j(true);
        try {
            w0.i context2 = bVar.getContext();
            Object n2 = AbstractC0068a.n(context2, this.f910k);
            try {
                bVar.resumeWith(obj);
                while (a3.m()) {
                }
            } finally {
                AbstractC0068a.h(context2, n2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f907h + ", " + AbstractC0063v.k(this.f908i) + ']';
    }

    @Override // M0.A
    public final w0.d d() {
        return this;
    }
}
