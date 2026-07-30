package q6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import n6.C0775h;
import n6.C0787u;
import n6.X;
import n6.f0;
import p6.EnumC0830a;
import r6.AbstractC0854b;

/* loaded from: classes.dex */
public final class v extends AbstractC0854b implements r, d, r6.p {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7420m = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: l, reason: collision with root package name */
    public int f7421l;

    public v(Object obj) {
        this._state$volatile = obj;
    }

    @Override // q6.e
    public final Object a(Object obj, V5.b bVar) {
        b(obj);
        return Unit.f6114a;
    }

    public final void b(Object obj) {
        if (obj == null) {
            obj = r6.s.f7582a;
        }
        c(null, obj);
    }

    public final boolean c(Object obj, Object obj2) {
        int i2;
        x[] xVarArr;
        C0654a c0654a;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7420m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj3, obj)) {
                return false;
            }
            if (Intrinsics.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i5 = this.f7421l;
            if ((i5 & 1) != 0) {
                this.f7421l = i5 + 2;
                return true;
            }
            int i7 = i5 + 1;
            this.f7421l = i7;
            x[] xVarArr2 = this.f7542d;
            Unit unit = Unit.f6114a;
            while (true) {
                if (xVarArr2 != null) {
                    for (x xVar : xVarArr2) {
                        if (xVar != null) {
                            AtomicReference atomicReference = xVar.f7424a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c0654a = w.f7423b)) {
                                    C0654a c0654a2 = w.f7422a;
                                    if (obj4 != c0654a2) {
                                        while (!atomicReference.compareAndSet(obj4, c0654a2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        R5.l lVar = R5.n.f2421d;
                                        ((C0775h) obj4).resumeWith(Unit.f6114a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c0654a)) {
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
                    i2 = this.f7421l;
                    if (i2 == i7) {
                        this.f7421l = i7 + 1;
                        return true;
                    }
                    xVarArr = this.f7542d;
                    Unit unit2 = Unit.f6114a;
                }
                xVarArr2 = xVarArr;
                i7 = i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r12.equals(r13) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
    
        if (r13 == r1) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:14:0x00bf, B:16:0x00c7, B:19:0x00ce, B:20:0x00d4, B:24:0x00d7, B:26:0x00f8, B:29:0x0108, B:32:0x00dd, B:35:0x00e4, B:43:0x004f, B:45:0x005a, B:46:0x00b0), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:14:0x00bf, B:16:0x00c7, B:19:0x00ce, B:20:0x00d4, B:24:0x00d7, B:26:0x00f8, B:29:0x0108, B:32:0x00dd, B:35:0x00e4, B:43:0x004f, B:45:0x005a, B:46:0x00b0), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v5, types: [q6.x] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0107 -> B:14:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0118 -> B:14:0x00bf). Please report as a decompilation issue!!! */
    @Override // q6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(e eVar, V5.b bVar) {
        u uVar;
        W5.a aVar;
        int i2;
        x xVar;
        x xVar2;
        AtomicReference atomicReference;
        v vVar;
        x xVar3;
        e eVar2;
        X x7;
        Object obj;
        x xVar4;
        Object andSet;
        Object obj2;
        try {
            if (bVar instanceof u) {
                uVar = (u) bVar;
                int i5 = uVar.f7419p;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    uVar.f7419p = i5 - Integer.MIN_VALUE;
                    Object obj3 = uVar.f7417n;
                    aVar = W5.a.f2787d;
                    i2 = uVar.f7419p;
                    xVar = 1;
                    if (i2 != 0) {
                        V6.b.P(obj3);
                        synchronized (this) {
                            try {
                                x[] xVarArr = this.f7542d;
                                if (xVarArr == null) {
                                    xVarArr = new x[2];
                                    this.f7542d = xVarArr;
                                } else if (this.f7543e >= xVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(xVarArr, xVarArr.length * 2);
                                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                                    this.f7542d = (x[]) copyOf;
                                    xVarArr = (x[]) copyOf;
                                }
                                int i7 = this.f7544i;
                                do {
                                    xVar2 = xVarArr[i7];
                                    if (xVar2 == null) {
                                        xVar2 = new x();
                                        xVarArr[i7] = xVar2;
                                    }
                                    i7++;
                                    if (i7 >= xVarArr.length) {
                                        i7 = 0;
                                    }
                                    atomicReference = xVar2.f7424a;
                                } while (atomicReference.get() != null);
                                atomicReference.set(w.f7422a);
                                this.f7544i = i7;
                                this.f7543e++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        vVar = this;
                        xVar3 = xVar2;
                    } else if (i2 == 1) {
                        x xVar5 = uVar.f7414i;
                        eVar = uVar.f7413e;
                        vVar = uVar.f7412d;
                        V6.b.P(obj3);
                        xVar3 = xVar5;
                    } else if (i2 == 2) {
                        obj = uVar.f7416m;
                        x7 = uVar.f7415l;
                        x xVar6 = uVar.f7414i;
                        eVar2 = uVar.f7413e;
                        vVar = uVar.f7412d;
                        V6.b.P(obj3);
                        xVar4 = xVar6;
                        andSet = xVar4.f7424a.getAndSet(w.f7422a);
                        Intrinsics.b(andSet);
                        if (andSet != w.f7423b) {
                        }
                        Object obj4 = f7420m.get(vVar);
                        if (x7 != null) {
                        }
                        if (obj4 == r6.s.f7582a) {
                        }
                        uVar.f7412d = vVar;
                        uVar.f7413e = eVar2;
                        uVar.f7414i = xVar;
                        uVar.f7415l = x7;
                        uVar.f7416m = obj4;
                        uVar.f7419p = 2;
                        if (eVar2.a(obj2, uVar) == aVar) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = uVar.f7416m;
                        x7 = uVar.f7415l;
                        x xVar7 = uVar.f7414i;
                        eVar2 = uVar.f7413e;
                        vVar = uVar.f7412d;
                        V6.b.P(obj3);
                        xVar = xVar7;
                        Object obj42 = f7420m.get(vVar);
                        if (x7 != null && !x7.a()) {
                            throw ((f0) x7).w();
                        }
                        obj2 = obj42 == r6.s.f7582a ? null : obj42;
                        uVar.f7412d = vVar;
                        uVar.f7413e = eVar2;
                        uVar.f7414i = xVar;
                        uVar.f7415l = x7;
                        uVar.f7416m = obj42;
                        uVar.f7419p = 2;
                        if (eVar2.a(obj2, uVar) == aVar) {
                            return aVar;
                        }
                        obj = obj42;
                        xVar4 = xVar;
                        andSet = xVar4.f7424a.getAndSet(w.f7422a);
                        Intrinsics.b(andSet);
                        if (andSet != w.f7423b) {
                            xVar = xVar4;
                        } else {
                            uVar.f7412d = vVar;
                            uVar.f7413e = eVar2;
                            uVar.f7414i = xVar4;
                            uVar.f7415l = x7;
                            uVar.f7416m = obj;
                            uVar.f7419p = 3;
                            Object a7 = xVar4.a(uVar);
                            xVar = xVar4;
                        }
                        Object obj422 = f7420m.get(vVar);
                        if (x7 != null) {
                            throw ((f0) x7).w();
                        }
                        if (obj422 == r6.s.f7582a) {
                        }
                        uVar.f7412d = vVar;
                        uVar.f7413e = eVar2;
                        uVar.f7414i = xVar;
                        uVar.f7415l = x7;
                        uVar.f7416m = obj422;
                        uVar.f7419p = 2;
                        if (eVar2.a(obj2, uVar) == aVar) {
                        }
                    }
                    eVar2 = eVar;
                    x7 = (X) uVar.getContext().g(C0787u.f7085e);
                    obj = null;
                    xVar = xVar3;
                    Object obj4222 = f7420m.get(vVar);
                    if (x7 != null) {
                    }
                    if (obj4222 == r6.s.f7582a) {
                    }
                    uVar.f7412d = vVar;
                    uVar.f7413e = eVar2;
                    uVar.f7414i = xVar;
                    uVar.f7415l = x7;
                    uVar.f7416m = obj4222;
                    uVar.f7419p = 2;
                    if (eVar2.a(obj2, uVar) == aVar) {
                    }
                }
            }
            if (i2 != 0) {
            }
            eVar2 = eVar;
            x7 = (X) uVar.getContext().g(C0787u.f7085e);
            obj = null;
            xVar = xVar3;
            Object obj42222 = f7420m.get(vVar);
            if (x7 != null) {
            }
            if (obj42222 == r6.s.f7582a) {
            }
            uVar.f7412d = vVar;
            uVar.f7413e = eVar2;
            uVar.f7414i = xVar;
            uVar.f7415l = x7;
            uVar.f7416m = obj42222;
            uVar.f7419p = 2;
            if (eVar2.a(obj2, uVar) == aVar) {
            }
        } catch (Throwable th2) {
            synchronized (vVar) {
                try {
                    int i8 = vVar.f7543e - 1;
                    vVar.f7543e = i8;
                    if (i8 == 0) {
                        vVar.f7544i = 0;
                    }
                    Intrinsics.c(xVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    xVar.f7424a.set(null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        uVar = new u(this, bVar);
        Object obj32 = uVar.f7417n;
        aVar = W5.a.f2787d;
        i2 = uVar.f7419p;
        xVar = 1;
    }

    @Override // r6.p
    public final d o(CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a) {
        return w.e(this, coroutineContext, i2, enumC0830a);
    }
}
