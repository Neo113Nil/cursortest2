package t2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3434e {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46226b = AtomicReferenceFieldUpdater.newUpdater(AbstractC3434e.class, Object.class, "_next$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46227c = AtomicReferenceFieldUpdater.newUpdater(AbstractC3434e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC3434e(AbstractC3434e abstractC3434e) {
        this._prev$volatile = abstractC3434e;
    }

    private final AbstractC3434e d() {
        AbstractC3434e h4 = h();
        while (h4 != null && h4.k()) {
            h4 = (AbstractC3434e) f46227c.get(h4);
        }
        return h4;
    }

    private final AbstractC3434e e() {
        AbstractC3434e f4;
        AbstractC3434e f5 = f();
        Intrinsics.checkNotNull(f5);
        while (f5.k() && (f4 = f5.f()) != null) {
            f5 = f4;
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f46226b.get(this);
    }

    public final void c() {
        f46227c.set(this, null);
    }

    public final AbstractC3434e f() {
        Object g4 = g();
        if (g4 == AbstractC3433d.f46225a) {
            return null;
        }
        return (AbstractC3434e) g4;
    }

    public final AbstractC3434e h() {
        return (AbstractC3434e) f46227c.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f46226b, this, null, AbstractC3433d.f46225a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC3434e d4 = d();
            AbstractC3434e e4 = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46227c;
            do {
                obj = atomicReferenceFieldUpdater.get(e4);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, e4, obj, ((AbstractC3434e) obj) == null ? null : d4));
            if (d4 != null) {
                f46226b.set(d4, e4);
            }
            if (!e4.k() || e4.l()) {
                if (d4 == null || !d4.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC3434e abstractC3434e) {
        return androidx.concurrent.futures.b.a(f46226b, this, null, abstractC3434e);
    }
}
