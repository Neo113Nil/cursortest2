package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class be1 extends w0 implements c00, d40, zd1, d00 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(be1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long k = n51.a.objectFieldOffset(be1.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int i;

    public be1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.w0
    public final x0 b() {
        return new ce1();
    }

    @Override // defpackage.w0
    public final x0[] c() {
        return new ce1[2];
    }

    @Override // defpackage.d00
    public final Object e(Object obj, dn dnVar) {
        if (obj == null) {
            obj = op.l;
        }
        j(null, obj);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        r2 = r2;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r12.equals(r14) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
    
        if (r14 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (kotlin.Unit.a == r1) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x007a, B:16:0x0082, B:19:0x0089, B:20:0x008d, B:24:0x0090, B:26:0x00b1, B:29:0x00c1, B:30:0x00db, B:36:0x00ef, B:41:0x00f8, B:32:0x00e2, B:35:0x00e8, B:46:0x0096, B:49:0x009d, B:57:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x007a, B:16:0x0082, B:19:0x0089, B:20:0x008d, B:24:0x0090, B:26:0x00b1, B:29:0x00c1, B:30:0x00db, B:36:0x00ef, B:41:0x00f8, B:32:0x00e2, B:35:0x00e8, B:46:0x0096, B:49:0x009d, B:57:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [ce1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [x0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [ce1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ce1] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ce1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [w0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [be1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [be1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [be1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c0 -> B:14:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.c00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(d00 d00Var, dn dnVar) {
        ae1 ae1Var;
        tn tnVar;
        ?? r2;
        ?? r8;
        d00 d00Var2;
        jb0 jb0Var;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (dnVar instanceof ae1) {
                ae1Var = (ae1) dnVar;
                int i = ae1Var.o;
                if ((i & Integer.MIN_VALUE) != 0) {
                    ae1Var.o = i - Integer.MIN_VALUE;
                    Object obj3 = ae1Var.m;
                    tnVar = tn.d;
                    r2 = ae1Var.o;
                    if (r2 != 0) {
                        ca0.v(obj3);
                        r2 = (ce1) a();
                    } else if (r2 == 1) {
                        r2 = ae1Var.j;
                        d00Var = ae1Var.i;
                        this = ae1Var.h;
                        try {
                            ca0.v(obj3);
                            r2 = r2;
                        } catch (Throwable th) {
                            r8 = this;
                            th = th;
                            r8.d(r2);
                            throw th;
                        }
                    } else if (r2 == 2) {
                        obj = ae1Var.l;
                        jb0Var = ae1Var.k;
                        ce1 ce1Var = ae1Var.j;
                        d00Var2 = ae1Var.i;
                        be1 be1Var = ae1Var.h;
                        ca0.v(obj3);
                        r2 = ce1Var;
                        r8 = be1Var;
                        AtomicReference atomicReference = r2.a;
                        fv fvVar = m90.o;
                        andSet = atomicReference.getAndSet(fvVar);
                        andSet.getClass();
                        if (andSet == m90.p) {
                        }
                        Object obj4 = j.get(r8);
                        if (jb0Var != null) {
                        }
                        if (obj4 == op.l) {
                        }
                        ae1Var.h = r8;
                        ae1Var.i = d00Var2;
                        ae1Var.j = r2;
                        ae1Var.k = jb0Var;
                        ae1Var.l = obj4;
                        ae1Var.o = 2;
                        if (d00Var2.e(obj2, ae1Var) == tnVar) {
                        }
                    } else {
                        if (r2 != 3) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = ae1Var.l;
                        jb0Var = ae1Var.k;
                        r2 = ae1Var.j;
                        d00Var2 = ae1Var.i;
                        r8 = ae1Var.h;
                        ca0.v(obj3);
                        Object obj42 = j.get(r8);
                        if (jb0Var != null && !jb0Var.b()) {
                            throw jb0Var.o();
                        }
                        obj2 = obj42 == op.l ? null : obj42;
                        ae1Var.h = r8;
                        ae1Var.i = d00Var2;
                        ae1Var.j = r2;
                        ae1Var.k = jb0Var;
                        ae1Var.l = obj42;
                        ae1Var.o = 2;
                        if (d00Var2.e(obj2, ae1Var) == tnVar) {
                            return tnVar;
                        }
                        obj = obj42;
                        r2 = r2;
                        r8 = r8;
                        AtomicReference atomicReference2 = r2.a;
                        fv fvVar2 = m90.o;
                        andSet = atomicReference2.getAndSet(fvVar2);
                        andSet.getClass();
                        if (andSet == m90.p) {
                            ae1Var.h = r8;
                            ae1Var.i = d00Var2;
                            ae1Var.j = r2;
                            ae1Var.k = jb0Var;
                            ae1Var.l = obj;
                            ae1Var.o = 3;
                            tf tfVar = new tf(1, qa0.b(ae1Var));
                            tfVar.w();
                            AtomicReference atomicReference3 = r2.a;
                            while (true) {
                                if (atomicReference3.compareAndSet(fvVar2, tfVar)) {
                                    break;
                                }
                                if (atomicReference3.get() != fvVar2) {
                                    i31 i31Var = k31.d;
                                    tfVar.l(Unit.a);
                                    break;
                                }
                            }
                            Object u = tfVar.u();
                            if (u != tn.d) {
                            }
                        }
                        Object obj422 = j.get(r8);
                        if (jb0Var != null) {
                            throw jb0Var.o();
                        }
                        if (obj422 == op.l) {
                        }
                        ae1Var.h = r8;
                        ae1Var.i = d00Var2;
                        ae1Var.j = r2;
                        ae1Var.k = jb0Var;
                        ae1Var.l = obj422;
                        ae1Var.o = 2;
                        if (d00Var2.e(obj2, ae1Var) == tnVar) {
                        }
                    }
                    CoroutineContext coroutineContext = ae1Var.e;
                    coroutineContext.getClass();
                    r8 = this;
                    d00Var2 = d00Var;
                    jb0Var = (jb0) coroutineContext.d(j41.m);
                    obj = null;
                    Object obj4222 = j.get(r8);
                    if (jb0Var != null) {
                    }
                    if (obj4222 == op.l) {
                    }
                    ae1Var.h = r8;
                    ae1Var.i = d00Var2;
                    ae1Var.j = r2;
                    ae1Var.k = jb0Var;
                    ae1Var.l = obj4222;
                    ae1Var.o = 2;
                    if (d00Var2.e(obj2, ae1Var) == tnVar) {
                    }
                }
            }
            if (r2 != 0) {
            }
            CoroutineContext coroutineContext2 = ae1Var.e;
            coroutineContext2.getClass();
            r8 = this;
            d00Var2 = d00Var;
            jb0Var = (jb0) coroutineContext2.d(j41.m);
            obj = null;
            Object obj42222 = j.get(r8);
            if (jb0Var != null) {
            }
            if (obj42222 == op.l) {
            }
            ae1Var.h = r8;
            ae1Var.i = d00Var2;
            ae1Var.j = r2;
            ae1Var.k = jb0Var;
            ae1Var.l = obj42222;
            ae1Var.o = 2;
            if (d00Var2.e(obj2, ae1Var) == tnVar) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        ae1Var = new ae1(this, dnVar);
        Object obj32 = ae1Var.m;
        tnVar = tn.d;
        r2 = ae1Var.o;
    }

    @Override // defpackage.zd1
    public final Object getValue() {
        fv fvVar = op.l;
        j.getClass();
        Object objectVolatile = n51.a.getObjectVolatile(this, k);
        if (objectVolatile == fvVar) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean h(Object obj, Object obj2) {
        fv fvVar = op.l;
        if (obj == null) {
            obj = fvVar;
        }
        if (obj2 == null) {
            obj2 = fvVar;
        }
        return j(obj, obj2);
    }

    @Override // defpackage.d40
    public final c00 i(CoroutineContext coroutineContext, int i, ue ueVar) {
        return ((((i < 0 || i >= 2) && i != -2) || ueVar != ue.e) && !((i == 0 || i == -3) && ueVar == ue.d)) ? new ig(this, coroutineContext, i, ueVar) : this;
    }

    public final boolean j(Object obj, Object obj2) {
        int i;
        x0[] x0VarArr;
        fv fvVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj3, obj)) {
                return false;
            }
            if (Intrinsics.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.i;
            if ((i2 & 1) != 0) {
                this.i = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.i = i3;
            x0[] x0VarArr2 = this.d;
            while (true) {
                ce1[] ce1VarArr = (ce1[]) x0VarArr2;
                if (ce1VarArr != null) {
                    for (ce1 ce1Var : ce1VarArr) {
                        if (ce1Var != null) {
                            AtomicReference atomicReference = ce1Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (fvVar = m90.p)) {
                                    fv fvVar2 = m90.o;
                                    if (obj4 != fvVar2) {
                                        while (!atomicReference.compareAndSet(obj4, fvVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        i31 i31Var = k31.d;
                                        ((tf) obj4).l(Unit.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, fvVar)) {
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
                    i = this.i;
                    if (i == i3) {
                        this.i = i3 + 1;
                        return true;
                    }
                    x0VarArr = this.d;
                }
                x0VarArr2 = x0VarArr;
                i3 = i;
            }
        }
    }
}
