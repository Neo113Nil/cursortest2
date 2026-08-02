package x3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b0 implements InterfaceC1538M {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16018b = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_isCompleting$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16019c = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_rootCause$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16020d = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f16021a;

    public b0(e0 e0Var, Throwable th) {
        this.f16021a = e0Var;
        this._rootCause$volatile = th;
    }

    @Override // x3.InterfaceC1538M
    public final boolean a() {
        return d() == null;
    }

    public final void b(Throwable th) {
        Throwable d4 = d();
        if (d4 == null) {
            f16019c.set(this, th);
            return;
        }
        if (th == d4) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16020d;
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

    @Override // x3.InterfaceC1538M
    public final e0 c() {
        return this.f16021a;
    }

    public final Throwable d() {
        return (Throwable) f16019c.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final boolean f() {
        return f16018b.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16020d;
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
        Throwable d4 = d();
        if (d4 != null) {
            arrayList.add(0, d4);
        }
        if (th != null && !th.equals(d4)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC1562w.f16069g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + f16020d.get(this) + ", list=" + this.f16021a + ']';
    }
}
