package k1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class o0 implements g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f703c = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_isCompleting");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f704d = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "_rootCause");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f705e = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f706b;

    public o0(r0 r0Var, Throwable th) {
        this.f706b = r0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable b2 = b();
        if (b2 == null) {
            f704d.set(this, th);
            return;
        }
        if (th == b2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f705e;
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
                f0.l.f("State is ", obj);
                return;
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

    public final Throwable b() {
        return (Throwable) f704d.get(this);
    }

    public final boolean c() {
        return b() != null;
    }

    public final boolean d() {
        return f703c.get(this) != 0;
    }

    @Override // k1.g0
    public final r0 e() {
        return this.f706b;
    }

    @Override // k1.g0
    public final boolean f() {
        return b() == null;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f705e;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                f0.l.f("State is ", obj);
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable b2 = b();
        if (b2 != null) {
            arrayList.add(0, b2);
        }
        if (th != null && !th.equals(b2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, t.f723g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + c() + ", completing=" + d() + ", rootCause=" + b() + ", exceptions=" + f705e.get(this) + ", list=" + this.f706b + ']';
    }
}
