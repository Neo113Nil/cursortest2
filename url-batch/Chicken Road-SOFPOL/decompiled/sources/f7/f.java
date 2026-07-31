package f7;

import a7.c0;
import a7.l1;
import a7.m0;
import a7.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends c0 implements i6.d, g6.c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2772k = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final a7.q f2773g;

    /* renamed from: h, reason: collision with root package name */
    public final i6.c f2774h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2775j;

    public f(a7.q qVar, i6.c cVar) {
        super(-1);
        this.f2773g = qVar;
        this.f2774h = cVar;
        this.i = a.f2761b;
        this.f2775j = a.k(cVar.f());
    }

    @Override // i6.d
    public final i6.d e() {
        return this.f2774h;
    }

    @Override // g6.c
    public final g6.h f() {
        return this.f2774h.f();
    }

    @Override // a7.c0
    public final Object i() {
        Object obj = this.i;
        this.i = a.f2761b;
        return obj;
    }

    @Override // g6.c
    public final void k(Object obj) {
        Throwable a8 = c6.i.a(obj);
        Object oVar = a8 == null ? obj : new a7.o(a8, false);
        i6.c cVar = this.f2774h;
        g6.h f6 = cVar.f();
        a7.q qVar = this.f2773g;
        if (qVar.i(f6)) {
            this.i = oVar;
            this.f247f = 0;
            qVar.h(cVar.f(), this);
            return;
        }
        m0 a9 = l1.a();
        if (a9.f275f >= 4294967296L) {
            this.i = oVar;
            this.f247f = 0;
            a9.o(this);
            return;
        }
        a9.t(true);
        try {
            g6.h f8 = cVar.f();
            Object l3 = a.l(f8, this.f2775j);
            try {
                cVar.k(obj);
                while (a9.y()) {
                }
            } finally {
                a.g(f8, l3);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2773g + ", " + x.r(this.f2774h) + ']';
    }

    @Override // a7.c0
    public final g6.c c() {
        return this;
    }
}
