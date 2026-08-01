package o1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class S implements I {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3321b = AtomicIntegerFieldUpdater.newUpdater(S.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3322c = AtomicReferenceFieldUpdater.newUpdater(S.class, Object.class, "_rootCause");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(S.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final V f3323a;

    public S(V v2, Throwable th) {
        this.f3323a = v2;
        this._rootCause = th;
    }

    @Override // o1.I
    public final boolean a() {
        return d() == null;
    }

    @Override // o1.I
    public final V b() {
        return this.f3323a;
    }

    public final void c(Throwable th) {
        Throwable d2 = d();
        if (d2 == null) {
            f3322c.set(this, th);
            return;
        }
        if (th == d2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
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

    public final Throwable d() {
        return (Throwable) f3322c.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final boolean f() {
        return f3321b.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
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
        Throwable d2 = d();
        if (d2 != null) {
            arrayList.add(0, d2);
        }
        if (th != null && !th.equals(d2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0299s.f3363f);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + d.get(this) + ", list=" + this.f3323a + ']';
    }
}
