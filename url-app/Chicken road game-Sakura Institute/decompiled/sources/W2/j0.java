package W2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class j0 implements Z {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4275e = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_isCompleting$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4276i = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_rootCause$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4277j = AtomicReferenceFieldUpdater.newUpdater(j0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f4278d;

    public j0(m0 m0Var, Throwable th) {
        this.f4278d = m0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c4 = c();
        if (c4 == null) {
            f4276i.set(this, th);
            return;
        }
        if (th == c4) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4277j;
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

    @Override // W2.Z
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f4276i.get(this);
    }

    @Override // W2.Z
    public final m0 d() {
        return this.f4278d;
    }

    public final boolean e() {
        return c() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4277j;
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
        Throwable c4 = c();
        if (c4 != null) {
            arrayList.add(0, c4);
        }
        if (th != null && !th.equals(c4)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, B.f4215h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f4275e.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(f4277j.get(this));
        sb.append(", list=");
        sb.append(this.f4278d);
        sb.append(']');
        return sb.toString();
    }
}
