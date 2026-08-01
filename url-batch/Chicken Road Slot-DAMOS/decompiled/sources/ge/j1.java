package ge;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j1 implements z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4368e = AtomicIntegerFieldUpdater.newUpdater(j1.class, "_isCompleting$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4369i = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_rootCause$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4370r = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final m1 f4371d;

    public j1(m1 m1Var, Throwable th) {
        this.f4371d = m1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable b10 = b();
        if (b10 == null) {
            f4369i.set(this, th);
            return;
        }
        if (th == b10) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4370r;
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
                a2.r.n(obj, "State is ");
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
        return (Throwable) f4369i.get(this);
    }

    public final boolean c() {
        return b() != null;
    }

    @Override // ge.z0
    public final boolean d() {
        return b() == null;
    }

    @Override // ge.z0
    public final m1 e() {
        return this.f4371d;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4370r;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                a2.r.n(obj, "State is ");
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable b10 = b();
        if (b10 != null) {
            arrayList.add(0, b10);
        }
        if (th != null && !th.equals(b10)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, a0.f4329h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(c());
        sb2.append(", completing=");
        sb2.append(f4368e.get(this) == 1);
        sb2.append(", rootCause=");
        sb2.append(b());
        sb2.append(", exceptions=");
        sb2.append(f4370r.get(this));
        sb2.append(", list=");
        sb2.append(this.f4371d);
        sb2.append(']');
        return sb2.toString();
    }
}
