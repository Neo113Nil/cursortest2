package c7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 implements u0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1687g = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_isCompleting$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1688h = AtomicReferenceFieldUpdater.newUpdater(e1.class, Object.class, "_rootCause$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1689i = AtomicReferenceFieldUpdater.newUpdater(e1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: f, reason: collision with root package name */
    public final h1 f1690f;

    public e1(h1 h1Var, Throwable th) {
        this.f1690f = h1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable d8 = d();
        if (d8 == null) {
            f1688h.set(this, th);
            return;
        }
        if (th == d8) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1689i;
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

    @Override // c7.u0
    public final boolean b() {
        return d() == null;
    }

    @Override // c7.u0
    public final h1 c() {
        return this.f1690f;
    }

    public final Throwable d() {
        return (Throwable) f1688h.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1689i;
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
        Throwable d8 = d();
        if (d8 != null) {
            arrayList.add(0, d8);
        }
        if (th != null && !th.equals(d8)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, a0.f1667h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f1687g.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(f1689i.get(this));
        sb.append(", list=");
        sb.append(this.f1690f);
        sb.append(']');
        return sb.toString();
    }
}
