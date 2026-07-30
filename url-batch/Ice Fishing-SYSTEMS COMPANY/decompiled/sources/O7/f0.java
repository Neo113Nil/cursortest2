package O7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class f0 implements V {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2592u = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_isCompleting$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2593v = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_rootCause$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2594w = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final k0 f2595n;

    public f0(k0 k0Var, Throwable th) {
        this.f2595n = k0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable b9 = b();
        if (b9 == null) {
            f2593v.set(this, th);
            return;
        }
        if (th == b9) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2594w;
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

    public final Throwable b() {
        return (Throwable) f2593v.get(this);
    }

    public final boolean c() {
        return b() != null;
    }

    public final boolean d() {
        return f2592u.get(this) != 0;
    }

    public final ArrayList e(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2594w;
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
        Throwable b9 = b();
        if (b9 != null) {
            arrayList.add(0, b9);
        }
        if (th != null && !th.equals(b9)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0399y.f2650h);
        return arrayList;
    }

    @Override // O7.V
    public final boolean j() {
        return b() == null;
    }

    @Override // O7.V
    public final k0 k() {
        return this.f2595n;
    }

    public final String toString() {
        return "Finishing[cancelling=" + c() + ", completing=" + d() + ", rootCause=" + b() + ", exceptions=" + f2594w.get(this) + ", list=" + this.f2595n + ']';
    }
}
