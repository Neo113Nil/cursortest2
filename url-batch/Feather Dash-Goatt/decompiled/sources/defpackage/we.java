package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class we implements fg {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(we.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(we.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(we.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(we.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(we.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k;
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ AtomicReferenceFieldUpdater m;
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = n51.a;
        s = unsafe.objectFieldOffset(we.class.getDeclaredField("sendSegment$volatile"));
        k = AtomicReferenceFieldUpdater.newUpdater(we.class, Object.class, "receiveSegment$volatile");
        r = unsafe.objectFieldOffset(we.class.getDeclaredField("receiveSegment$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(we.class, Object.class, "bufferEndSegment$volatile");
        p = unsafe.objectFieldOffset(we.class.getDeclaredField("bufferEndSegment$volatile"));
        m = AtomicReferenceFieldUpdater.newUpdater(we.class, Object.class, "_closeCause$volatile");
        o = unsafe.objectFieldOffset(we.class.getDeclaredField("_closeCause$volatile"));
        n = AtomicReferenceFieldUpdater.newUpdater(we.class, Object.class, "closeHandler$volatile");
        q = unsafe.objectFieldOffset(we.class.getDeclaredField("closeHandler$volatile"));
    }

    public we(int i2) {
        this.d = i2;
        if (i2 < 0) {
            dd0.g("Invalid channel capacity: ", i2, ", should be >=0");
            throw null;
        }
        pg pgVar = ye.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = h.get(this);
        pg pgVar2 = new pg(0L, null, this, 3);
        this.sendSegment$volatile = pgVar2;
        this.receiveSegment$volatile = pgVar2;
        if (A()) {
            pgVar2 = ye.a;
            pgVar2.getClass();
        }
        this.bufferEndSegment$volatile = pgVar2;
        this._closeCause$volatile = ye.s;
    }

    public static Object D(we weVar, sf1 sf1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        atomicReferenceFieldUpdater.getClass();
        if (weVar == null) {
            af.c();
            return null;
        }
        pg pgVar = (pg) n51.a.getObjectVolatile(weVar, r);
        while (true) {
            weVar.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            boolean z = true;
            if (weVar.y(atomicLongFieldUpdater.get(weVar), true)) {
                Throwable r2 = weVar.r();
                int i2 = qc1.a;
                throw r2;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(weVar);
            long j2 = ye.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (pgVar.e != j3) {
                pg n2 = weVar.n(j3, pgVar);
                if (n2 == null) {
                    continue;
                } else {
                    pgVar = n2;
                }
            }
            Object J = weVar.J(pgVar, i3, andIncrement, null);
            Object obj = ye.m;
            if (J == obj) {
                dd0.j("unexpected");
                return null;
            }
            Object obj2 = ye.o;
            if (J != obj2) {
                if (J != ye.n) {
                    pgVar.a();
                    return J;
                }
                tf z2 = op.z(qa0.b(sf1Var));
                try {
                    Object J2 = weVar.J(pgVar, i3, andIncrement, z2);
                    if (J2 == obj) {
                        z2.a(pgVar, i3);
                    } else if (J2 == obj2) {
                        if (andIncrement < weVar.u()) {
                            pgVar.a();
                        }
                        pg pgVar2 = (pg) atomicReferenceFieldUpdater.get(weVar);
                        while (true) {
                            if (weVar.y(atomicLongFieldUpdater.get(weVar), z)) {
                                i31 i31Var = k31.d;
                                z2.l(new j31(weVar.r()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(weVar);
                            long j4 = ye.b;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j5 = andIncrement2 / j4;
                            int i4 = (int) (andIncrement2 % j4);
                            if (pgVar2.e != j5) {
                                pg n3 = weVar.n(j5, pgVar2);
                                if (n3 == null) {
                                    continue;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                } else {
                                    pgVar2 = n3;
                                }
                            }
                            Object J3 = weVar.J(pgVar2, i4, andIncrement2, z2);
                            if (J3 == ye.m) {
                                z2.a(pgVar2, i4);
                                break;
                            }
                            if (J3 == ye.o) {
                                if (andIncrement2 < weVar.u()) {
                                    pgVar2.a();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                z = true;
                            } else {
                                if (J3 == ye.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                pgVar2.a();
                                z2.n(J3, null);
                            }
                        }
                    } else {
                        pgVar.a();
                        z2.n(J2, null);
                    }
                    Object u = z2.u();
                    tn tnVar = tn.d;
                    return u;
                } catch (Throwable th) {
                    z2.E();
                    throw th;
                }
            }
            if (andIncrement < weVar.u()) {
                pgVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object F(we weVar, Object obj, dn dnVar) {
        Object u;
        tn tnVar;
        String str;
        int i2;
        int i3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        atomicReferenceFieldUpdater.getClass();
        pg pgVar = (pg) n51.a.getObjectVolatile(weVar, s);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(weVar);
            long j2 = andIncrement & 1152921504606846975L;
            boolean y = weVar.y(andIncrement, false);
            int i4 = ye.b;
            long j3 = i4;
            long j4 = j2 / j3;
            int i5 = (int) (j2 % j3);
            if (pgVar.e != j4) {
                pg o2 = weVar.o(j4, pgVar);
                if (o2 != null) {
                    pgVar = o2;
                } else if (y) {
                    Object C = weVar.C(dnVar, obj);
                    if (C == tn.d) {
                        return C;
                    }
                }
            }
            int c = c(weVar, pgVar, i5, obj, j2, null, y);
            if (c == 0) {
                pgVar.a();
                break;
            }
            if (c == 1) {
                break;
            }
            if (c != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
                if (c == 3) {
                    tf z = op.z(qa0.b(dnVar));
                    try {
                        int c2 = c(weVar, pgVar, i5, obj, j2, z, false);
                        if (c2 == 0) {
                            pgVar.a();
                            i31 i31Var = k31.d;
                        } else if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 4) {
                                    String str2 = "unexpected";
                                    if (c2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    pgVar.a();
                                    pg pgVar2 = (pg) atomicReferenceFieldUpdater.get(weVar);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(weVar);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean y2 = weVar.y(andIncrement2, false);
                                        int i6 = ye.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j6 = i6;
                                        long j7 = j5 / j6;
                                        int i7 = (int) (j5 % j6);
                                        if (pgVar2.e != j7) {
                                            pg o3 = weVar.o(j7, pgVar2);
                                            if (o3 != null) {
                                                pgVar2 = o3;
                                                str = str2;
                                                i3 = i7;
                                                i2 = i6;
                                            } else {
                                                if (y2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                            }
                                        } else {
                                            str = str2;
                                            i2 = i6;
                                            i3 = i7;
                                        }
                                        int c3 = c(weVar, pgVar2, i3, obj, j5, z, y2);
                                        if (c3 == 0) {
                                            pgVar2.a();
                                            i31 i31Var2 = k31.d;
                                            break;
                                        }
                                        if (c3 == 1) {
                                            i31 i31Var3 = k31.d;
                                            break;
                                        }
                                        if (c3 != 2) {
                                            if (c3 == 3) {
                                                throw new IllegalStateException(str);
                                            }
                                            if (c3 != 4) {
                                                if (c3 == 5) {
                                                    pgVar2.a();
                                                }
                                                str2 = str;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                            } else if (j5 < atomicLongFieldUpdater2.get(weVar)) {
                                                pgVar2.a();
                                            }
                                        } else if (y2) {
                                            pgVar2.m();
                                        } else {
                                            z.a(pgVar2, i3 + i2);
                                        }
                                    }
                                } else if (j2 < atomicLongFieldUpdater2.get(weVar)) {
                                    pgVar.a();
                                }
                                b(weVar, obj, z);
                            } else {
                                z.a(pgVar, i5 + i4);
                            }
                            u = z.u();
                            tnVar = tn.d;
                            if (u != tnVar) {
                                u = Unit.a;
                            }
                            if (u == tnVar) {
                                return u;
                            }
                        } else {
                            i31 i31Var4 = k31.d;
                        }
                        z.l(Unit.a);
                        u = z.u();
                        tnVar = tn.d;
                        if (u != tnVar) {
                        }
                        if (u == tnVar) {
                        }
                    } catch (Throwable th) {
                        z.E();
                        throw th;
                    }
                } else if (c == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(weVar)) {
                        pgVar.a();
                    }
                    Object C2 = weVar.C(dnVar, obj);
                    if (C2 == tn.d) {
                        return C2;
                    }
                } else if (c == 5) {
                    pgVar.a();
                }
            } else if (y) {
                pgVar.m();
                Object C3 = weVar.C(dnVar, obj);
                if (C3 == tn.d) {
                    return C3;
                }
            }
        }
        return Unit.a;
    }

    public static boolean H(Object obj) {
        if (!(obj instanceof sf)) {
            af.j(obj, "Unexpected waiter: ");
            return false;
        }
        sf sfVar = (sf) obj;
        Unit unit = Unit.a;
        pg pgVar = ye.a;
        fv r2 = sfVar.r(unit, null);
        if (r2 == null) {
            return false;
        }
        sfVar.B(r2);
        return true;
    }

    public static final void b(we weVar, Object obj, tf tfVar) {
        Throwable t = weVar.t();
        i31 i31Var = k31.d;
        tfVar.l(new j31(t));
    }

    public static final int c(we weVar, pg pgVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        pgVar.r(i2, obj);
        if (z) {
            return weVar.K(pgVar, i2, obj, j2, obj2, z);
        }
        Object p2 = pgVar.p(i2);
        if (p2 == null) {
            if (weVar.d(j2)) {
                if (pgVar.o(null, i2, ye.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pgVar.o(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (p2 instanceof yn1) {
            pgVar.r(i2, null);
            if (weVar.G(p2, obj)) {
                pgVar.s(i2, ye.i);
                return 0;
            }
            fv fvVar = ye.k;
            if (pgVar.h.getAndSet((i2 * 2) + 1, fvVar) == fvVar) {
                return 5;
            }
            pgVar.q(i2, true);
            return 5;
        }
        return weVar.K(pgVar, i2, obj, j2, obj2, z);
    }

    public static void w(we weVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if ((atomicLongFieldUpdater.addAndGet(weVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(weVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j2 = h.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r5.j() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r5.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j2, pg pgVar) {
        we weVar;
        pg pgVar2;
        pg pgVar3;
        while (pgVar.e < j2 && (pgVar3 = (pg) pgVar.c()) != null) {
            pgVar = pgVar3;
        }
        while (true) {
            pg pgVar4 = pgVar;
            while (pgVar4.f() && (pgVar2 = (pg) pgVar4.c()) != null) {
                pgVar4 = pgVar2;
            }
            while (true) {
                l.getClass();
                Unsafe unsafe = n51.a;
                long j3 = p;
                e81 e81Var = (e81) unsafe.getObjectVolatile(this, j3);
                if (e81Var.e >= pgVar4.e) {
                    return;
                }
                if (!pgVar4.n()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = n51.a;
                    weVar = this;
                    if (unsafe2.compareAndSwapObject(weVar, p, e81Var, pgVar4)) {
                        if (e81Var.j()) {
                            e81Var.h();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(weVar, j3) != e81Var) {
                        break;
                    } else {
                        this = weVar;
                    }
                }
                this = weVar;
            }
            pgVar = pgVar4;
        }
    }

    public final Object C(dn dnVar, Object obj) {
        tf tfVar = new tf(1, qa0.b(dnVar));
        tfVar.w();
        Throwable t = t();
        i31 i31Var = k31.d;
        tfVar.l(new j31(t));
        Object u = tfVar.u();
        return u == tn.d ? u : Unit.a;
    }

    public final void E(yn1 yn1Var, boolean z) {
        if (yn1Var instanceof sf) {
            dn dnVar = (dn) yn1Var;
            i31 i31Var = k31.d;
            dnVar.l(new j31(z ? r() : t()));
            return;
        }
        if (!(yn1Var instanceof ve)) {
            af.j(yn1Var, "Unexpected waiter: ");
            return;
        }
        ve veVar = (ve) yn1Var;
        tf tfVar = veVar.e;
        tfVar.getClass();
        veVar.e = null;
        veVar.d = ye.l;
        Throwable p2 = veVar.g.p();
        if (p2 == null) {
            i31 i31Var2 = k31.d;
            tfVar.l(Boolean.FALSE);
        } else {
            i31 i31Var3 = k31.d;
            tfVar.l(new j31(p2));
        }
    }

    public final boolean G(Object obj, Object obj2) {
        if (!(obj instanceof ve)) {
            if (!(obj instanceof sf)) {
                af.j(obj, "Unexpected receiver type: ");
                return false;
            }
            sf sfVar = (sf) obj;
            pg pgVar = ye.a;
            fv r2 = sfVar.r(obj2, null);
            if (r2 == null) {
                return false;
            }
            sfVar.B(r2);
            return true;
        }
        ve veVar = (ve) obj;
        tf tfVar = veVar.e;
        tfVar.getClass();
        veVar.e = null;
        veVar.d = obj2;
        Boolean bool = Boolean.TRUE;
        veVar.g.getClass();
        pg pgVar2 = ye.a;
        fv r3 = tfVar.r(bool, null);
        if (r3 == null) {
            return false;
        }
        tfVar.B(r3);
        return true;
    }

    public final Object I(Object obj) {
        pg pgVar;
        int i2;
        we weVar;
        ev evVar = ye.d;
        j.getClass();
        pg pgVar2 = (pg) n51.a.getObjectVolatile(this, s);
        while (true) {
            long andIncrement = e.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean y = this.y(andIncrement, false);
            int i3 = ye.b;
            long j3 = i3;
            long j4 = j2 / j3;
            int i4 = (int) (j2 % j3);
            if (pgVar2.e != j4) {
                pgVar = this.o(j4, pgVar2);
                if (pgVar != null) {
                    weVar = this;
                    i2 = i4;
                } else if (y) {
                    return new ng(this.t());
                }
            } else {
                pgVar = pgVar2;
                i2 = i4;
                weVar = this;
            }
            Object obj2 = obj;
            int c = c(weVar, pgVar, i2, obj2, j2, evVar, y);
            we weVar2 = weVar;
            pgVar2 = pgVar;
            if (c == 0) {
                pgVar2.a();
                return Unit.a;
            }
            if (c == 1) {
                return Unit.a;
            }
            if (c == 2) {
                if (y) {
                    pgVar2.m();
                    return new ng(weVar2.t());
                }
                yn1 yn1Var = evVar instanceof yn1 ? (yn1) evVar : null;
                if (yn1Var != null) {
                    yn1Var.a(pgVar2, i2 + i3);
                }
                weVar2.j((pgVar2.e * j3) + i2);
                return Unit.a;
            }
            if (c == 3) {
                dd0.j("unexpected");
                return null;
            }
            if (c == 4) {
                if (j2 < g.get(weVar2)) {
                    pgVar2.a();
                }
                return new ng(weVar2.t());
            }
            if (c == 5) {
                pgVar2.a();
            }
            this = weVar2;
            obj = obj2;
        }
    }

    public final Object J(pg pgVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = pgVar.h;
        Object p2 = pgVar.p(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (p2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return ye.n;
                }
                if (pgVar.o(p2, i2, obj)) {
                    k();
                    return ye.m;
                }
            }
        } else if (p2 == ye.d && pgVar.o(p2, i2, ye.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            pgVar.r(i2, null);
            return obj2;
        }
        while (true) {
            Object p3 = pgVar.p(i2);
            if (p3 == null || p3 == ye.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pgVar.o(p3, i2, ye.h)) {
                        k();
                        return ye.o;
                    }
                } else {
                    if (obj == null) {
                        return ye.n;
                    }
                    if (pgVar.o(p3, i2, obj)) {
                        k();
                        return ye.m;
                    }
                }
            } else if (p3 != ye.d) {
                fv fvVar = ye.j;
                if (p3 == fvVar) {
                    return ye.o;
                }
                if (p3 == ye.h) {
                    return ye.o;
                }
                if (p3 == ye.l) {
                    k();
                    return ye.o;
                }
                if (p3 != ye.g && pgVar.o(p3, i2, ye.f)) {
                    boolean z = p3 instanceof zn1;
                    if (z) {
                        p3 = ((zn1) p3).a;
                    }
                    if (H(p3)) {
                        pgVar.s(i2, ye.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        pgVar.r(i2, null);
                        return obj3;
                    }
                    pgVar.s(i2, fvVar);
                    pgVar.m();
                    if (z) {
                        k();
                    }
                    return ye.o;
                }
            } else if (pgVar.o(p3, i2, ye.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                pgVar.r(i2, null);
                return obj4;
            }
        }
    }

    public final int K(pg pgVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object p2 = pgVar.p(i2);
            if (p2 == null) {
                if (!d(j2) || z) {
                    if (z) {
                        if (pgVar.o(null, i2, ye.j)) {
                            pgVar.m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pgVar.o(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (pgVar.o(null, i2, ye.d)) {
                    break;
                }
            } else {
                if (p2 != ye.e) {
                    fv fvVar = ye.k;
                    if (p2 == fvVar) {
                        pgVar.r(i2, null);
                        return 5;
                    }
                    if (p2 == ye.h) {
                        pgVar.r(i2, null);
                        return 5;
                    }
                    if (p2 == ye.l) {
                        pgVar.r(i2, null);
                        i();
                        return 4;
                    }
                    pgVar.r(i2, null);
                    if (p2 instanceof zn1) {
                        p2 = ((zn1) p2).a;
                    }
                    if (G(p2, obj)) {
                        pgVar.s(i2, ye.i);
                        return 0;
                    }
                    if (pgVar.h.getAndSet((i2 * 2) + 1, fvVar) != fvVar) {
                        pgVar.q(i2, true);
                    }
                    return 5;
                }
                if (pgVar.o(p2, i2, ye.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void L(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        we weVar = this;
        if (weVar.A()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = h;
            if (atomicLongFieldUpdater.get(weVar) > j2) {
                break;
            } else {
                weVar = this;
            }
        }
        int i2 = ye.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(weVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(weVar)) && j3 == atomicLongFieldUpdater.get(weVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(weVar);
                    if (atomicLongFieldUpdater2.compareAndSet(weVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        weVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(weVar);
                    long j6 = atomicLongFieldUpdater2.get(weVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(weVar)) {
                        break;
                    }
                    if (z) {
                        weVar = this;
                    } else {
                        weVar = this;
                        atomicLongFieldUpdater2.compareAndSet(weVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(weVar);
                    if (atomicLongFieldUpdater2.compareAndSet(weVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        weVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.fg
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean d(long j2) {
        return j2 < h.get(this) || j2 < g.get(this) + ((long) this.d);
    }

    @Override // defpackage.c91
    public Object e(dn dnVar, Object obj) {
        return F(this, obj, dnVar);
    }

    public final pg f() {
        l.getClass();
        Unsafe unsafe = n51.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, p);
        j.getClass();
        pg pgVar = (pg) unsafe.getObjectVolatile(this, s);
        if (pgVar.e > ((pg) objectVolatile).e) {
            objectVolatile = pgVar;
        }
        k.getClass();
        pg pgVar2 = (pg) unsafe.getObjectVolatile(this, r);
        if (pgVar2.e > ((pg) objectVolatile).e) {
            objectVolatile = pgVar2;
        }
        dm dmVar = (dm) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dm.a;
            Object d = dmVar.d();
            if (d == yr1.h) {
                break;
            }
            dm dmVar2 = (dm) d;
            if (dmVar2 != null) {
                dmVar = dmVar2;
            } else if (dmVar.g()) {
                break;
            }
        }
        return (pg) dmVar;
    }

    public final boolean g(Throwable th, boolean z) {
        we weVar;
        boolean z2;
        long j2;
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (z) {
            while (true) {
                long j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                pg pgVar = ye.a;
                weVar = this;
                if (atomicLongFieldUpdater.compareAndSet(weVar, j5, (j5 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = weVar;
            }
        }
        weVar = this;
        fv fvVar = ye.s;
        while (true) {
            m.getClass();
            we weVar2 = weVar;
            Unsafe unsafe = n51.a;
            long j6 = o;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(weVar2, j6, fvVar, th2);
            weVar = weVar2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(weVar, j6) != fvVar) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(weVar);
            } while (!atomicLongFieldUpdater.compareAndSet(weVar, j4, 3458764513820540928L + (j4 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(weVar);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = (j2 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (j2 & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(weVar, j2, j3));
        }
        weVar.i();
        if (z2) {
            weVar.x();
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r1 = (defpackage.pg) r1.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg h(long j2) {
        long j3;
        pg f = f();
        if (z()) {
            pg pgVar = f;
            loop0: do {
                int i2 = ye.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (pgVar.e * ye.b) + i2;
                    if (j3 < g.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object p2 = pgVar.p(i2);
                        if (p2 != null && p2 != ye.e) {
                            if (p2 == ye.d) {
                                break loop0;
                            }
                        } else {
                            if (pgVar.o(p2, i2, ye.l)) {
                                pgVar.m();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (pgVar != null);
            j3 = -1;
            if (j3 != -1) {
                j(j3);
            }
        }
        Object obj = null;
        loop3: for (pg pgVar2 = f; pgVar2 != null; pgVar2 = (pg) pgVar2.e()) {
            for (int i3 = ye.b - 1; -1 < i3; i3--) {
                if ((pgVar2.e * ye.b) + i3 < j2) {
                    break loop3;
                }
                while (true) {
                    Object p3 = pgVar2.p(i3);
                    if (p3 != null && p3 != ye.e) {
                        if (!(p3 instanceof zn1)) {
                            if (!(p3 instanceof yn1)) {
                                break;
                            }
                            if (pgVar2.o(p3, i3, ye.l)) {
                                obj = t80.I(obj, p3);
                                pgVar2.q(i3, true);
                                break;
                            }
                        } else {
                            if (pgVar2.o(p3, i3, ye.l)) {
                                obj = t80.I(obj, ((zn1) p3).a);
                                pgVar2.q(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (pgVar2.o(p3, i3, ye.l)) {
                            pgVar2.m();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                E((yn1) obj, true);
                return f;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                E((yn1) arrayList.get(size), true);
            }
        }
        return f;
    }

    public final void i() {
        y(e.get(this), false);
    }

    public final void j(long j2) {
        k.getClass();
        pg pgVar = (pg) n51.a.getObjectVolatile(this, r);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.d + j3, h.get(this))) {
                return;
            }
            we weVar = this;
            if (atomicLongFieldUpdater.compareAndSet(weVar, j3, 1 + j3)) {
                long j4 = ye.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (pgVar.e != j5) {
                    pg n2 = weVar.n(j5, pgVar);
                    if (n2 != null) {
                        pgVar = n2;
                    }
                }
                pg pgVar2 = pgVar;
                if (weVar.J(pgVar2, i2, j3, null) != ye.o) {
                    pgVar2.a();
                } else if (j3 < weVar.u()) {
                    pgVar2.a();
                }
                this = weVar;
                pgVar = pgVar2;
            }
            this = weVar;
        }
    }

    public final void k() {
        we weVar;
        if (A()) {
            return;
        }
        l.getClass();
        pg pgVar = (pg) n51.a.getObjectVolatile(this, p);
        loop0: while (true) {
            long andIncrement = h.getAndIncrement(this);
            long j2 = ye.b;
            long j3 = andIncrement / j2;
            if (this.u() <= andIncrement) {
                if (pgVar.e < j3 && pgVar.c() != null) {
                    this.B(j3, pgVar);
                }
                w(this);
                return;
            }
            weVar = this;
            if (pgVar.e != j3) {
                pg l2 = weVar.l(j3, pgVar, andIncrement);
                if (l2 == null) {
                    continue;
                    this = weVar;
                } else {
                    pgVar = l2;
                }
            }
            int i2 = (int) (andIncrement % j2);
            Object p2 = pgVar.p(i2);
            boolean z = p2 instanceof yn1;
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            if (!z || andIncrement < atomicLongFieldUpdater.get(weVar) || !pgVar.o(p2, i2, ye.g)) {
                while (true) {
                    Object p3 = pgVar.p(i2);
                    if (!(p3 instanceof yn1)) {
                        if (p3 != ye.j) {
                            if (p3 != null) {
                                if (p3 == ye.d || p3 == ye.h || p3 == ye.i || p3 == ye.k || p3 == ye.l) {
                                    break loop0;
                                } else if (p3 != ye.f) {
                                    af.j(p3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (pgVar.o(p3, i2, ye.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater.get(weVar)) {
                        if (pgVar.o(p3, i2, new zn1((yn1) p3))) {
                            break loop0;
                        }
                    } else if (pgVar.o(p3, i2, ye.g)) {
                        if (H(p3)) {
                            pgVar.s(i2, ye.d);
                            break;
                        } else {
                            pgVar.s(i2, ye.j);
                            pgVar.m();
                        }
                    }
                }
                w(weVar);
            } else if (H(p2)) {
                pgVar.s(i2, ye.d);
                break;
            } else {
                pgVar.s(i2, ye.j);
                pgVar.m();
                w(weVar);
            }
            this = weVar;
        }
        w(weVar);
    }

    public final pg l(long j2, pg pgVar, long j3) {
        Object I;
        Unsafe unsafe;
        pg pgVar2 = ye.a;
        xe xeVar = xe.m;
        loop0: while (true) {
            I = yr1.I(pgVar, j2, xeVar);
            if (!t90.t(I)) {
                e81 s2 = t90.s(I);
                while (true) {
                    l.getClass();
                    Unsafe unsafe2 = n51.a;
                    long j4 = p;
                    e81 e81Var = (e81) unsafe2.getObjectVolatile(this, j4);
                    if (e81Var.e >= s2.e) {
                        break loop0;
                    }
                    if (!s2.n()) {
                        break;
                    }
                    do {
                        unsafe = n51.a;
                        if (unsafe.compareAndSwapObject(this, p, e81Var, s2)) {
                            if (e81Var.j()) {
                                e81Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == e81Var);
                    if (s2.j()) {
                        s2.h();
                    }
                }
            } else {
                break;
            }
        }
        if (t90.t(I)) {
            i();
            B(j2, pgVar);
            w(this);
            return null;
        }
        pg pgVar3 = (pg) t90.s(I);
        long j5 = pgVar3.e;
        if (j5 <= j2) {
            return pgVar3;
        }
        long j6 = j5 * ye.b;
        if (!h.compareAndSet(this, j3 + 1, j6)) {
            w(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if ((atomicLongFieldUpdater.addAndGet(this, j6 - j3) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    @Override // defpackage.fg
    public final Object m(sf1 sf1Var) {
        return D(this, sf1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r8.j() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8.h();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg n(long j2, pg pgVar) {
        Object I;
        pg pgVar2;
        long j3;
        Unsafe unsafe;
        pg pgVar3 = ye.a;
        xe xeVar = xe.m;
        loop0: while (true) {
            I = yr1.I(pgVar, j2, xeVar);
            if (!t90.t(I)) {
                e81 s2 = t90.s(I);
                while (true) {
                    k.getClass();
                    Unsafe unsafe2 = n51.a;
                    long j4 = r;
                    e81 e81Var = (e81) unsafe2.getObjectVolatile(this, j4);
                    if (e81Var.e >= s2.e) {
                        break loop0;
                    }
                    if (!s2.n()) {
                        break;
                    }
                    do {
                        unsafe = n51.a;
                        if (unsafe.compareAndSwapObject(this, r, e81Var, s2)) {
                            if (e81Var.j()) {
                                e81Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == e81Var);
                    if (s2.j()) {
                        s2.h();
                    }
                }
            } else {
                break;
            }
        }
        if (t90.t(I)) {
            i();
            if (pgVar.e * ye.b < u()) {
                pgVar.a();
                return null;
            }
        } else {
            pg pgVar4 = (pg) t90.s(I);
            long j5 = pgVar4.e;
            if (!A() && j2 <= h.get(this) / ye.b) {
                while (true) {
                    l.getClass();
                    Unsafe unsafe3 = n51.a;
                    long j6 = p;
                    e81 e81Var2 = (e81) unsafe3.getObjectVolatile(this, j6);
                    if (e81Var2.e >= j5 || !pgVar4.n()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = n51.a;
                        pgVar2 = pgVar4;
                        if (unsafe4.compareAndSwapObject(this, p, e81Var2, pgVar4)) {
                            if (e81Var2.j()) {
                                e81Var2.h();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j6) != e81Var2) {
                                break;
                            }
                            pgVar4 = pgVar2;
                        }
                    }
                    pgVar4 = pgVar2;
                }
                if (j5 > j2) {
                    return pgVar2;
                }
                long j7 = j5 * ye.b;
                do {
                    j3 = g.get(this);
                    if (j3 >= j7) {
                        break;
                    }
                } while (!g.compareAndSet(this, j3, j7));
                if (j5 * ye.b < u()) {
                    pgVar2.a();
                }
            }
            pgVar2 = pgVar4;
            if (j5 > j2) {
            }
        }
        return null;
    }

    public final pg o(long j2, pg pgVar) {
        Object I;
        long j3;
        long j4;
        Unsafe unsafe;
        pg pgVar2 = ye.a;
        xe xeVar = xe.m;
        loop0: while (true) {
            I = yr1.I(pgVar, j2, xeVar);
            if (!t90.t(I)) {
                e81 s2 = t90.s(I);
                while (true) {
                    j.getClass();
                    Unsafe unsafe2 = n51.a;
                    long j5 = s;
                    e81 e81Var = (e81) unsafe2.getObjectVolatile(this, j5);
                    if (e81Var.e >= s2.e) {
                        break loop0;
                    }
                    if (!s2.n()) {
                        break;
                    }
                    do {
                        unsafe = n51.a;
                        if (unsafe.compareAndSwapObject(this, s, e81Var, s2)) {
                            if (e81Var.j()) {
                                e81Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j5) == e81Var);
                    if (s2.j()) {
                        s2.h();
                    }
                }
            } else {
                break;
            }
        }
        boolean t = t90.t(I);
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if (t) {
            i();
            if (pgVar.e * ye.b < atomicLongFieldUpdater.get(this)) {
                pgVar.a();
                return null;
            }
        } else {
            pg pgVar3 = (pg) t90.s(I);
            long j6 = pgVar3.e;
            if (j6 <= j2) {
                return pgVar3;
            }
            long j7 = j6 * ye.b;
            do {
                j3 = e.get(this);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j7) {
                    break;
                }
            } while (!e.compareAndSet(this, j3, j4 + (((int) (j3 >> 60)) << 60)));
            if (j6 * ye.b < atomicLongFieldUpdater.get(this)) {
                pgVar3.a();
            }
        }
        return null;
    }

    public final Throwable p() {
        m.getClass();
        return (Throwable) n51.a.getObjectVolatile(this, o);
    }

    @Override // defpackage.fg
    public final Object q() {
        pg pgVar;
        og ogVar = yr1.g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (y(j3, true)) {
            return new ng(p());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return ogVar;
        }
        Object obj = ye.k;
        k.getClass();
        pg pgVar2 = (pg) n51.a.getObjectVolatile(this, r);
        while (!this.y(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = ye.b;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (pgVar2.e != j5) {
                pg n2 = this.n(j5, pgVar2);
                if (n2 == null) {
                    continue;
                } else {
                    pgVar = n2;
                }
            } else {
                pgVar = pgVar2;
            }
            we weVar = this;
            Object J = weVar.J(pgVar, i2, andIncrement, obj);
            pgVar2 = pgVar;
            if (J == ye.m) {
                yn1 yn1Var = obj instanceof yn1 ? (yn1) obj : null;
                if (yn1Var != null) {
                    yn1Var.a(pgVar2, i2);
                }
                weVar.L(andIncrement);
                pgVar2.m();
                return ogVar;
            }
            if (J != ye.o) {
                if (J != ye.n) {
                    pgVar2.a();
                    return J;
                }
                dd0.j("unexpected");
                return null;
            }
            if (andIncrement < weVar.u()) {
                pgVar2.a();
            }
            this = weVar;
        }
        return new ng(this.p());
    }

    public final Throwable r() {
        Throwable p2 = p();
        return p2 == null ? new oh("Channel was closed") : p2;
    }

    @Override // defpackage.c91
    public Object s(Object obj) {
        og ogVar = yr1.g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        boolean z = false;
        long j2 = 1152921504606846975L;
        if (y(atomicLongFieldUpdater.get(this), false) ? false : !d(r1 & 1152921504606846975L)) {
            return ogVar;
        }
        ev evVar = ye.j;
        j.getClass();
        pg pgVar = (pg) n51.a.getObjectVolatile(this, s);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean y = y(andIncrement, z);
            int i2 = ye.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (pgVar.e != j5) {
                pg o2 = o(j5, pgVar);
                if (o2 != null) {
                    pgVar = o2;
                } else {
                    if (y) {
                        return new ng(t());
                    }
                    z = false;
                    j2 = 1152921504606846975L;
                }
            }
            int c = c(this, pgVar, i3, obj, j3, evVar, y);
            if (c == 0) {
                pgVar.a();
                return Unit.a;
            }
            if (c == 1) {
                return Unit.a;
            }
            if (c == 2) {
                if (y) {
                    pgVar.m();
                    return new ng(t());
                }
                yn1 yn1Var = evVar instanceof yn1 ? (yn1) evVar : null;
                if (yn1Var != null) {
                    yn1Var.a(pgVar, i3 + i2);
                }
                pgVar.m();
                return ogVar;
            }
            if (c == 3) {
                dd0.j("unexpected");
                return null;
            }
            if (c == 4) {
                if (j3 < g.get(this)) {
                    pgVar.a();
                }
                return new ng(t());
            }
            if (c == 5) {
                pgVar.a();
            }
            z = false;
            j2 = 1152921504606846975L;
        }
    }

    public final Throwable t() {
        Throwable p2 = p();
        return p2 == null ? new ph("Channel was closed") : p2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        r15 = r8;
        r3 = (defpackage.pg) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a6, code lost:
    
        if (r3 != null) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i2;
        String str;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (e.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.d + ',');
        sb.append("data=[");
        k.getClass();
        Unsafe unsafe = n51.a;
        int i4 = 0;
        j.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, s);
        int i5 = 1;
        l.getClass();
        List e2 = zh.e(unsafe.getObjectVolatile(this, r), objectVolatile, unsafe.getObjectVolatile(this, p));
        ArrayList arrayList = new ArrayList();
        for (Object obj : e2) {
            if (((pg) obj) != ye.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            dd0.c();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((pg) next).e;
            do {
                Object next2 = it.next();
                long j3 = ((pg) next2).e;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        pg pgVar = (pg) next;
        long j4 = g.get(this);
        long u = u();
        loop2: while (true) {
            int i6 = ye.b;
            int i7 = i4;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                i2 = i5;
                long j5 = (pgVar.e * ye.b) + i7;
                if (j5 >= u && j5 >= j4) {
                    break loop2;
                }
                Object p2 = pgVar.p(i7);
                Object obj2 = pgVar.h.get(i7 * 2);
                if (p2 instanceof sf) {
                    str = (j5 >= j4 || j5 < u) ? (j5 >= u || j5 < j4) ? "cont" : "send" : "receive";
                } else if (p2 instanceof zn1) {
                    str = "EB(" + p2 + ')';
                } else if (Intrinsics.a(p2, ye.f) || Intrinsics.a(p2, ye.g)) {
                    str = "resuming_sender";
                } else {
                    if (p2 != null && !p2.equals(ye.e) && !p2.equals(ye.i) && !p2.equals(ye.h) && !p2.equals(ye.k) && !p2.equals(ye.j) && !p2.equals(ye.l)) {
                        str = p2.toString();
                    }
                    i7++;
                    i5 = i2;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i7++;
                i5 = i2;
            }
            i5 = i2;
            i4 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - i2) == ',') {
            sb.deleteCharAt(sb.length() - i2).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final long u() {
        return e.get(this) & 1152921504606846975L;
    }

    public final boolean v() {
        while (true) {
            k.getClass();
            Unsafe unsafe = n51.a;
            long j2 = r;
            pg pgVar = (pg) unsafe.getObjectVolatile(this, j2);
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long j3 = atomicLongFieldUpdater.get(this);
            if (u() <= j3) {
                return false;
            }
            long j4 = ye.b;
            long j5 = j3 / j4;
            if (pgVar.e == j5 || (pgVar = n(j5, pgVar)) != null) {
                pgVar.a();
                int i2 = (int) (j3 % j4);
                while (true) {
                    Object p2 = pgVar.p(i2);
                    if (p2 == null || p2 == ye.e) {
                        if (pgVar.o(p2, i2, ye.h)) {
                            k();
                            break;
                        }
                    } else {
                        if (p2 == ye.d) {
                            return true;
                        }
                        if (p2 != ye.j && p2 != ye.l && p2 != ye.i && p2 != ye.h) {
                            if (p2 == ye.g) {
                                return true;
                            }
                            if (p2 != ye.f && j3 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                g.compareAndSet(this, j3, j3 + 1);
            } else if (((pg) unsafe.getObjectVolatile(this, j2)).e < j5) {
                return false;
            }
        }
    }

    public final void x() {
        Object objectVolatile;
        we weVar;
        loop0: while (true) {
            n.getClass();
            Unsafe unsafe = n51.a;
            long j2 = q;
            objectVolatile = unsafe.getObjectVolatile(this, j2);
            fv fvVar = objectVolatile == null ? ye.q : ye.r;
            while (true) {
                Unsafe unsafe2 = n51.a;
                weVar = this;
                if (unsafe2.compareAndSwapObject(weVar, q, objectVolatile, fvVar)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(weVar, j2) != objectVolatile) {
                    break;
                } else {
                    this = weVar;
                }
            }
            this = weVar;
        }
        if (objectVolatile == null) {
            return;
        }
        tj1.b(1, objectVolatile);
        ((Function1) objectVolatile).invoke(weVar.p());
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a3, code lost:
    
        r10 = (defpackage.pg) r10.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                h(j2 & 1152921504606846975L);
                if (!z || !v()) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(qy0.i(i2, "unexpected close status: ").toString());
                }
                pg h2 = h(j2 & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i3 = ye.b - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j3 = (h2.e * ye.b) + i3;
                        while (true) {
                            Object p2 = h2.p(i3);
                            if (p2 == ye.i) {
                                break loop0;
                            }
                            fv fvVar = ye.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
                            if (p2 == fvVar) {
                                if (j3 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (h2.o(p2, i3, ye.l)) {
                                    h2.r(i3, null);
                                    h2.m();
                                    break;
                                }
                            } else if (p2 != ye.e && p2 != null) {
                                if (!(p2 instanceof yn1) && !(p2 instanceof zn1)) {
                                    fv fvVar2 = ye.g;
                                    if (p2 == fvVar2 || p2 == ye.f) {
                                        break loop0;
                                    }
                                    if (p2 != fvVar2) {
                                        break;
                                    }
                                } else {
                                    if (j3 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    yn1 yn1Var = p2 instanceof zn1 ? ((zn1) p2).a : (yn1) p2;
                                    if (h2.o(p2, i3, ye.l)) {
                                        obj = t80.I(obj, yn1Var);
                                        h2.r(i3, null);
                                        h2.m();
                                        break;
                                    }
                                }
                            } else if (h2.o(p2, i3, ye.l)) {
                                h2.m();
                                break;
                            }
                        }
                        i3--;
                    }
                } while (h2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            E((yn1) arrayList.get(size), false);
                        }
                    } else {
                        E((yn1) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean z() {
        return false;
    }
}
