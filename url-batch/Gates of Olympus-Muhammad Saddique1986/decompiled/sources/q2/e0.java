package q2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e0 implements U {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7891e = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_isCompleting$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7892f = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_rootCause$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7893g = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f7894d;

    public e0(h0 h0Var, Throwable th) {
        this.f7894d = h0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            f7892f.set(this, th);
            return;
        }
        if (th == c2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7893g;
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

    @Override // q2.U
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f7892f.get(this);
    }

    @Override // q2.U
    public final h0 d() {
        return this.f7894d;
    }

    public final boolean e() {
        return c() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7893g;
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
        atomicReferenceFieldUpdater.set(this, AbstractC0837y.f7947h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f7891e.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(f7893g.get(this));
        sb.append(", list=");
        sb.append(this.f7894d);
        sb.append(']');
        return sb.toString();
    }
}
