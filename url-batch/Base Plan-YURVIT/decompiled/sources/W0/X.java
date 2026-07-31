package W0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class X implements L {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f931f = AtomicIntegerFieldUpdater.newUpdater(X.class, "_isCompleting");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f932g = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_rootCause");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f933h = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f934e;

    public X(a0 a0Var, Throwable th) {
        this.f934e = a0Var;
        this._rootCause = th;
    }

    @Override // W0.L
    public final boolean a() {
        return c() == null;
    }

    public final void b(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            f932g.set(this, th);
            return;
        }
        if (th == c2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f933h;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable c() {
        return (Throwable) f932g.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    @Override // W0.L
    public final a0 e() {
        return this.f934e;
    }

    public final boolean f() {
        return f931f.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f933h;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !th.equals(c2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0081v.f981g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + f933h.get(this) + ", list=" + this.f934e + ']';
    }
}
