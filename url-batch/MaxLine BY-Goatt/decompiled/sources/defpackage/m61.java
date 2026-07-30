package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m61 implements v11 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(m61.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(m61.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final ms1 m;

    static {
        Unsafe unsafe = hd2.a;
        r = unsafe.objectFieldOffset(m61.class.getDeclaredField("_rootCause$volatile"));
        p = AtomicReferenceFieldUpdater.newUpdater(m61.class, Object.class, "_exceptionsHolder$volatile");
        q = unsafe.objectFieldOffset(m61.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public m61(ms1 ms1Var, Throwable th) {
        this.m = ms1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable e = e();
        if (e == null) {
            i(th);
            return;
        }
        if (th == e) {
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
                dm0.i(c, "State is ");
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

    @Override // defpackage.v11
    public final boolean b() {
        return e() == null;
    }

    public final Object c() {
        p.getClass();
        return hd2.a.getObjectVolatile(this, q);
    }

    @Override // defpackage.v11
    public final ms1 d() {
        return this.m;
    }

    public final Throwable e() {
        o.getClass();
        return (Throwable) hd2.a.getObjectVolatile(this, r);
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
                dm0.i(c, "State is ");
                return null;
            }
            arrayList = (ArrayList) c;
        }
        Throwable e = e();
        if (e != null) {
            arrayList.add(0, e);
        }
        if (th != null && !th.equals(e)) {
            arrayList.add(th);
        }
        h(j8.k);
        return arrayList;
    }

    public final void h(Object obj) {
        p.getClass();
        hd2.a.putObjectVolatile(this, q, obj);
    }

    public final void i(Throwable th) {
        o.getClass();
        hd2.a.putObjectVolatile(this, r, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(f());
        sb.append(", completing=");
        sb.append(n.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(e());
        sb.append(", exceptions=");
        sb.append(c());
        sb.append(", list=");
        sb.append(this.m);
        sb.append(']');
        return sb.toString();
    }
}
