package t2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3311E;
import o2.AbstractC3313G;
import o2.AbstractC3328f0;
import o2.C3309C;
import o2.C3345o;
import o2.InterfaceC3343n;
import o2.T0;
import o2.W;

/* renamed from: t2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3440k extends W implements kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46231i = AtomicReferenceFieldUpdater.newUpdater(C3440k.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC3313G f46232e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.coroutines.d f46233f;

    /* renamed from: g, reason: collision with root package name */
    public Object f46234g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f46235h;

    public C3440k(AbstractC3313G abstractC3313G, kotlin.coroutines.d dVar) {
        super(-1);
        G g4;
        this.f46232e = abstractC3313G;
        this.f46233f = dVar;
        g4 = AbstractC3441l.f46236a;
        this.f46234g = g4;
        this.f46235h = K.b(getContext());
    }

    private final C3345o o() {
        Object obj = f46231i.get(this);
        if (obj instanceof C3345o) {
            return (C3345o) obj;
        }
        return null;
    }

    @Override // o2.W
    public void a(Object obj, Throwable th) {
        if (obj instanceof C3309C) {
            ((C3309C) obj).f41964b.invoke(th);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f46233f;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return this.f46233f.getContext();
    }

    @Override // o2.W
    public Object j() {
        G g4;
        Object obj = this.f46234g;
        g4 = AbstractC3441l.f46236a;
        this.f46234g = g4;
        return obj;
    }

    public final void l() {
        while (f46231i.get(this) == AbstractC3441l.f46237b) {
        }
    }

    public final C3345o m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46231i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f46231i.set(this, AbstractC3441l.f46237b);
                return null;
            }
            if (obj instanceof C3345o) {
                if (androidx.concurrent.futures.b.a(f46231i, this, obj, AbstractC3441l.f46237b)) {
                    return (C3345o) obj;
                }
            } else if (obj != AbstractC3441l.f46237b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(CoroutineContext coroutineContext, Object obj) {
        this.f46234g = obj;
        this.f42029d = 1;
        this.f46232e.h(coroutineContext, this);
    }

    public final boolean r() {
        return f46231i.get(this) != null;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        CoroutineContext context = this.f46233f.getContext();
        Object d4 = AbstractC3311E.d(obj, null, 1, null);
        if (this.f46232e.i(context)) {
            this.f46234g = d4;
            this.f42029d = 0;
            this.f46232e.g(context, this);
            return;
        }
        AbstractC3328f0 b4 = T0.f42024a.b();
        if (b4.Z()) {
            this.f46234g = d4;
            this.f42029d = 0;
            b4.V(this);
            return;
        }
        b4.X(true);
        try {
            CoroutineContext context2 = getContext();
            Object c4 = K.c(context2, this.f46235h);
            try {
                this.f46233f.resumeWith(obj);
                Unit unit = Unit.f41027a;
                while (b4.c0()) {
                }
            } finally {
                K.a(context2, c4);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean s(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46231i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            G g4 = AbstractC3441l.f46237b;
            if (Intrinsics.areEqual(obj, g4)) {
                if (androidx.concurrent.futures.b.a(f46231i, this, g4, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f46231i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void t() {
        l();
        C3345o o4 = o();
        if (o4 != null) {
            o4.s();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f46232e + ", " + o2.N.c(this.f46233f) + ']';
    }

    public final Throwable v(InterfaceC3343n interfaceC3343n) {
        G g4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46231i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g4 = AbstractC3441l.f46237b;
            if (obj != g4) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f46231i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f46231i, this, g4, interfaceC3343n));
        return null;
    }

    @Override // o2.W
    public kotlin.coroutines.d b() {
        return this;
    }
}
