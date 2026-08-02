package C3;

import c3.C0294f;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x3.AbstractC1527B;
import x3.AbstractC1534I;
import x3.AbstractC1555o;
import x3.AbstractC1558s;
import x3.AbstractC1562w;
import x3.C1554n;
import x3.l0;

/* loaded from: classes.dex */
public final class h extends AbstractC1527B implements h3.d, InterfaceC0425c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f292h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1558s f293d;

    /* renamed from: e, reason: collision with root package name */
    public final h3.c f294e;

    /* renamed from: f, reason: collision with root package name */
    public Object f295f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f296g;

    public h(AbstractC1558s abstractC1558s, h3.c cVar) {
        super(-1);
        this.f293d = abstractC1558s;
        this.f294e = cVar;
        this.f295f = a.f281c;
        this.f296g = a.k(cVar.getContext());
    }

    @Override // x3.AbstractC1527B
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC1555o) {
            ((AbstractC1555o) obj).getClass();
            throw null;
        }
    }

    @Override // h3.d
    public final h3.d getCallerFrame() {
        h3.c cVar = this.f294e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // f3.InterfaceC0425c
    public final InterfaceC0430h getContext() {
        return this.f294e.getContext();
    }

    @Override // x3.AbstractC1527B
    public final Object h() {
        Object obj = this.f295f;
        this.f295f = a.f281c;
        return obj;
    }

    @Override // f3.InterfaceC0425c
    public final void resumeWith(Object obj) {
        h3.c cVar = this.f294e;
        InterfaceC0430h context = cVar.getContext();
        Throwable a3 = C0294f.a(obj);
        Object c1554n = a3 == null ? obj : new C1554n(a3, false);
        AbstractC1558s abstractC1558s = this.f293d;
        if (abstractC1558s.t()) {
            this.f295f = c1554n;
            this.f15988c = 0;
            abstractC1558s.s(context, this);
            return;
        }
        AbstractC1534I a4 = l0.a();
        if (a4.f15997c >= 4294967296L) {
            this.f295f = c1554n;
            this.f15988c = 0;
            d3.f fVar = a4.f15999e;
            if (fVar == null) {
                fVar = new d3.f();
                a4.f15999e = fVar;
            }
            fVar.addLast(this);
            return;
        }
        a4.w(true);
        try {
            InterfaceC0430h context2 = cVar.getContext();
            Object l4 = a.l(context2, this.f296g);
            try {
                cVar.resumeWith(obj);
                while (a4.y()) {
                }
            } finally {
                a.f(context2, l4);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f293d + ", " + AbstractC1562w.k(this.f294e) + ']';
    }

    @Override // x3.AbstractC1527B
    public final InterfaceC0425c d() {
        return this;
    }
}
