package k2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e0 implements U {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5352e = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_isCompleting$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5353f = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_rootCause$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5354g = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f5355d;

    public e0(h0 h0Var, Throwable th) {
        this.f5355d = h0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c3 = c();
        if (c3 == null) {
            f5353f.set(this, th);
            return;
        }
        if (th == c3) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5354g;
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

    @Override // k2.U
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f5353f.get(this);
    }

    @Override // k2.U
    public final h0 d() {
        return this.f5355d;
    }

    public final boolean e() {
        return c() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5354g;
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
        Throwable c3 = c();
        if (c3 != null) {
            arrayList.add(0, c3);
        }
        if (th != null && !th.equals(c3)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0552y.f5407h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f5352e.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(f5354g.get(this));
        sb.append(", list=");
        sb.append(this.f5355d);
        sb.append(']');
        return sb.toString();
    }
}
