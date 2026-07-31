package H5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e0 implements U {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1067g = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_isCompleting");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1068h = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_rootCause");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1069i = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f1070f;

    public e0(i0 i0Var, Throwable th) {
        this.f1070f = i0Var;
        this._rootCause = th;
    }

    @Override // H5.U
    public final boolean a() {
        return c() == null;
    }

    public final void b(Throwable th) {
        Throwable c7 = c();
        if (c7 == null) {
            f1068h.set(this, th);
            return;
        }
        if (th == c7) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1069i;
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
        return (Throwable) f1068h.get(this);
    }

    @Override // H5.U
    public final i0 d() {
        return this.f1070f;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return f1067g.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1069i;
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
        Throwable c7 = c();
        if (c7 != null) {
            arrayList.add(0, c7);
        }
        if (th != null && !th.equals(c7)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0165z.f1121h);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + f1069i.get(this) + ", list=" + this.f1070f + ']';
    }
}
