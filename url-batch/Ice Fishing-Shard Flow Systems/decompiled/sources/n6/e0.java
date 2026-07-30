package n6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e0 implements U {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7050e = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_isCompleting$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7051i = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_rootCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7052l = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f7053d;

    public e0(h0 h0Var, Throwable th) {
        this.f7053d = h0Var;
        this._rootCause$volatile = th;
    }

    @Override // n6.U
    public final boolean a() {
        return d() == null;
    }

    public final void b(Throwable th) {
        Throwable d7 = d();
        if (d7 == null) {
            f7051i.set(this, th);
            return;
        }
        if (th == d7) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7052l;
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

    @Override // n6.U
    public final h0 c() {
        return this.f7053d;
    }

    public final Throwable d() {
        return (Throwable) f7051i.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7052l;
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
        Throwable d7 = d();
        if (d7 != null) {
            arrayList.add(0, d7);
        }
        if (th != null && !th.equals(d7)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0792z.f7102h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f7050e.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(f7052l.get(this));
        sb.append(", list=");
        sb.append(this.f7053d);
        sb.append(']');
        return sb.toString();
    }
}
