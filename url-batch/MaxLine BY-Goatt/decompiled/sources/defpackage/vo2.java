package defpackage;

import defpackage.aa2;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vo2 extends k1 implements xm0, hu0, to2, xn1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(vo2.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long s = hd2.a.objectFieldOffset(vo2.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int q;

    public vo2(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r2 = r2;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r12.equals(r14) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
    
        if (r14 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (kotlin.Unit.a == r1) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0079, B:16:0x0081, B:19:0x0088, B:20:0x008c, B:24:0x008f, B:26:0x00b0, B:29:0x00c0, B:30:0x00da, B:36:0x00ee, B:41:0x00f7, B:32:0x00e1, B:35:0x00e7, B:46:0x0095, B:49:0x009c, B:57:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0079, B:16:0x0081, B:19:0x0088, B:20:0x008c, B:24:0x008f, B:26:0x00b0, B:29:0x00c0, B:30:0x00da, B:36:0x00ee, B:41:0x00f7, B:32:0x00e1, B:35:0x00e7, B:46:0x0095, B:49:0x009c, B:57:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [wo2] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [l1] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [wo2] */
    /* JADX WARN: Type inference failed for: r2v7, types: [wo2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [wo2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [k1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [vo2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, vo2] */
    /* JADX WARN: Type inference failed for: r8v7, types: [vo2] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bf -> B:14:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ym0 ym0Var, o30 o30Var) {
        uo2 uo2Var;
        b50 b50Var;
        ?? r2;
        ?? r8;
        ym0 ym0Var2;
        g61 g61Var;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (o30Var instanceof uo2) {
                uo2Var = (uo2) o30Var;
                int i = uo2Var.t;
                if ((i & Integer.MIN_VALUE) != 0) {
                    uo2Var.t = i - Integer.MIN_VALUE;
                    Object obj3 = uo2Var.r;
                    b50Var = b50.m;
                    r2 = uo2Var.t;
                    if (r2 != 0) {
                        ca2.b(obj3);
                        r2 = (wo2) c();
                    } else if (r2 == 1) {
                        r2 = uo2Var.o;
                        ym0Var = uo2Var.n;
                        this = uo2Var.m;
                        try {
                            ca2.b(obj3);
                            r2 = r2;
                        } catch (Throwable th) {
                            r8 = this;
                            th = th;
                            r8.g(r2);
                            throw th;
                        }
                    } else if (r2 == 2) {
                        obj = uo2Var.q;
                        g61Var = uo2Var.p;
                        wo2 wo2Var = uo2Var.o;
                        ym0Var2 = uo2Var.n;
                        vo2 vo2Var = uo2Var.m;
                        ca2.b(obj3);
                        r2 = wo2Var;
                        r8 = vo2Var;
                        AtomicReference atomicReference = r2.a;
                        ng0 ng0Var = zm3.j;
                        andSet = atomicReference.getAndSet(ng0Var);
                        andSet.getClass();
                        if (andSet == zm3.k) {
                        }
                        Object obj4 = r.get(r8);
                        if (g61Var != null) {
                        }
                        if (obj4 == yj1.k) {
                        }
                        uo2Var.m = r8;
                        uo2Var.n = ym0Var2;
                        uo2Var.o = r2;
                        uo2Var.p = g61Var;
                        uo2Var.q = obj4;
                        uo2Var.t = 2;
                        if (ym0Var2.d(obj2, uo2Var) == b50Var) {
                        }
                    } else {
                        if (r2 != 3) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = uo2Var.q;
                        g61Var = uo2Var.p;
                        r2 = uo2Var.o;
                        ym0Var2 = uo2Var.n;
                        r8 = uo2Var.m;
                        ca2.b(obj3);
                        Object obj42 = r.get(r8);
                        if (g61Var != null && !g61Var.b()) {
                            throw g61Var.v();
                        }
                        obj2 = obj42 == yj1.k ? null : obj42;
                        uo2Var.m = r8;
                        uo2Var.n = ym0Var2;
                        uo2Var.o = r2;
                        uo2Var.p = g61Var;
                        uo2Var.q = obj42;
                        uo2Var.t = 2;
                        if (ym0Var2.d(obj2, uo2Var) == b50Var) {
                            return b50Var;
                        }
                        obj = obj42;
                        r2 = r2;
                        r8 = r8;
                        AtomicReference atomicReference2 = r2.a;
                        ng0 ng0Var2 = zm3.j;
                        andSet = atomicReference2.getAndSet(ng0Var2);
                        andSet.getClass();
                        if (andSet == zm3.k) {
                            uo2Var.m = r8;
                            uo2Var.n = ym0Var2;
                            uo2Var.o = r2;
                            uo2Var.p = g61Var;
                            uo2Var.q = obj;
                            uo2Var.t = 3;
                            fs fsVar = new fs(1, q41.b(uo2Var));
                            fsVar.u();
                            AtomicReference atomicReference3 = r2.a;
                            while (true) {
                                if (atomicReference3.compareAndSet(ng0Var2, fsVar)) {
                                    break;
                                }
                                if (atomicReference3.get() != ng0Var2) {
                                    aa2.a aVar = aa2.m;
                                    fsVar.resumeWith(Unit.a);
                                    break;
                                }
                            }
                            Object s2 = fsVar.s();
                            if (s2 != b50.m) {
                            }
                        }
                        Object obj422 = r.get(r8);
                        if (g61Var != null) {
                            throw g61Var.v();
                        }
                        if (obj422 == yj1.k) {
                        }
                        uo2Var.m = r8;
                        uo2Var.n = ym0Var2;
                        uo2Var.o = r2;
                        uo2Var.p = g61Var;
                        uo2Var.q = obj422;
                        uo2Var.t = 2;
                        if (ym0Var2.d(obj2, uo2Var) == b50Var) {
                        }
                    }
                    r8 = this;
                    ym0Var2 = ym0Var;
                    g61Var = (g61) uo2Var.getContext().m(qb2.U);
                    obj = null;
                    Object obj4222 = r.get(r8);
                    if (g61Var != null) {
                    }
                    if (obj4222 == yj1.k) {
                    }
                    uo2Var.m = r8;
                    uo2Var.n = ym0Var2;
                    uo2Var.o = r2;
                    uo2Var.p = g61Var;
                    uo2Var.q = obj4222;
                    uo2Var.t = 2;
                    if (ym0Var2.d(obj2, uo2Var) == b50Var) {
                    }
                }
            }
            if (r2 != 0) {
            }
            r8 = this;
            ym0Var2 = ym0Var;
            g61Var = (g61) uo2Var.getContext().m(qb2.U);
            obj = null;
            Object obj42222 = r.get(r8);
            if (g61Var != null) {
            }
            if (obj42222 == yj1.k) {
            }
            uo2Var.m = r8;
            uo2Var.n = ym0Var2;
            uo2Var.o = r2;
            uo2Var.p = g61Var;
            uo2Var.q = obj42222;
            uo2Var.t = 2;
            if (ym0Var2.d(obj2, uo2Var) == b50Var) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        uo2Var = new uo2(this, o30Var);
        Object obj32 = uo2Var.r;
        b50Var = b50.m;
        r2 = uo2Var.t;
    }

    @Override // defpackage.hu0
    public final xm0 b(CoroutineContext coroutineContext, int i, hq hqVar) {
        return (((i < 0 || i >= 2) && i != -2) || hqVar != hq.n) ? s93.E(this, coroutineContext, i, hqVar) : this;
    }

    @Override // defpackage.ym0
    public final Object d(Object obj, o30 o30Var) {
        i(obj);
        return Unit.a;
    }

    @Override // defpackage.k1
    public final l1 e() {
        return new wo2();
    }

    @Override // defpackage.k1
    public final l1[] f() {
        return new wo2[2];
    }

    @Override // defpackage.to2
    public final Object getValue() {
        ng0 ng0Var = yj1.k;
        r.getClass();
        Object objectVolatile = hd2.a.getObjectVolatile(this, s);
        if (objectVolatile == ng0Var) {
            return null;
        }
        return objectVolatile;
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = yj1.k;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i;
        l1[] l1VarArr;
        ng0 ng0Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.b(obj3, obj)) {
                return false;
            }
            if (Intrinsics.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.q;
            if ((i2 & 1) != 0) {
                this.q = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.q = i3;
            l1[] l1VarArr2 = this.m;
            Unit unit = Unit.a;
            while (true) {
                wo2[] wo2VarArr = (wo2[]) l1VarArr2;
                if (wo2VarArr != null) {
                    for (wo2 wo2Var : wo2VarArr) {
                        if (wo2Var != null) {
                            AtomicReference atomicReference = wo2Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (ng0Var = zm3.k)) {
                                    ng0 ng0Var2 = zm3.j;
                                    if (obj4 != ng0Var2) {
                                        while (!atomicReference.compareAndSet(obj4, ng0Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        aa2.a aVar = aa2.m;
                                        ((fs) obj4).resumeWith(Unit.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, ng0Var)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.q;
                    if (i == i3) {
                        this.q = i3 + 1;
                        return true;
                    }
                    l1VarArr = this.m;
                    Unit unit2 = Unit.a;
                }
                l1VarArr2 = l1VarArr;
                i3 = i;
            }
        }
    }
}
