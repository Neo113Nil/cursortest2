package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pb0 implements n70 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(pb0.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(pb0.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final sp0 d;

    static {
        Unsafe unsafe = n51.a;
        j = unsafe.objectFieldOffset(pb0.class.getDeclaredField("_rootCause$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(pb0.class, Object.class, "_exceptionsHolder$volatile");
        i = unsafe.objectFieldOffset(pb0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public pb0(sp0 sp0Var, Throwable th) {
        this.d = sp0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable e2 = e();
        if (e2 == null) {
            i(th);
            return;
        }
        if (th == e2) {
            return;
        }
        Object c = c();
        if (c == null) {
            h(th);
            return;
        }
        if (!(c instanceof Throwable)) {
            if (c instanceof ArrayList) {
                ((ArrayList) c).add(th);
                return;
            } else {
                af.j(c, "State is ");
                return;
            }
        }
        if (th == c) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(c);
        arrayList.add(th);
        h(arrayList);
    }

    @Override // defpackage.n70
    public final boolean b() {
        return e() == null;
    }

    public final Object c() {
        h.getClass();
        return n51.a.getObjectVolatile(this, i);
    }

    @Override // defpackage.n70
    public final sp0 d() {
        return this.d;
    }

    public final Throwable e() {
        g.getClass();
        return (Throwable) n51.a.getObjectVolatile(this, j);
    }

    public final boolean f() {
        return e() != null;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Object c = c();
        if (c == null) {
            arrayList = new ArrayList(4);
        } else if (c instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(c);
            arrayList = arrayList2;
        } else {
            if (!(c instanceof ArrayList)) {
                af.j(c, "State is ");
                return null;
            }
            arrayList = (ArrayList) c;
        }
        Throwable e2 = e();
        if (e2 != null) {
            arrayList.add(0, e2);
        }
        if (th != null && !th.equals(e2)) {
            arrayList.add(th);
        }
        h(yr1.m);
        return arrayList;
    }

    public final void h(Object obj) {
        h.getClass();
        n51.a.putObjectVolatile(this, i, obj);
    }

    public final void i(Throwable th) {
        g.getClass();
        n51.a.putObjectVolatile(this, j, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(f());
        sb.append(", completing=");
        sb.append(e.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(e());
        sb.append(", exceptions=");
        sb.append(c());
        sb.append(", list=");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }
}
