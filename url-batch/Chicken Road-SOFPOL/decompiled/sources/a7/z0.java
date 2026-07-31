package a7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z0 implements p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f326e = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_isCompleting$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f327f = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_rootCause$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f328g = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f329d;

    public z0(c1 c1Var, Throwable th) {
        this.f329d = c1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c8 = c();
        if (c8 == null) {
            f327f.set(this, th);
            return;
        }
        if (th == c8) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f328g;
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

    @Override // a7.p0
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f327f.get(this);
    }

    @Override // a7.p0
    public final c1 d() {
        return this.f329d;
    }

    public final boolean e() {
        return c() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f328g;
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
        Throwable c8 = c();
        if (c8 != null) {
            arrayList.add(0, c8);
        }
        if (th != null && !th.equals(c8)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, x.f317h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f326e.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(f328g.get(this));
        sb.append(", list=");
        sb.append(this.f329d);
        sb.append(']');
        return sb.toString();
    }
}
