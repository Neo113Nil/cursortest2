package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lao implements kzq, lba, lai, lah, kzr {
    public int a;
    public int b;
    public bst[] c;
    private final kuk d;
    private int e;

    public lao(Object obj) {
        this.d = new kuk(obj, kul.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
    
        if (defpackage.ksp.b(r14, r15) == false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x013a: INVOKE (r8 I:java.lang.Object) VIRTUAL call: java.lang.Object.getClass():java.lang.Class A[Catch: all -> 0x0148, MD:():java.lang.Class<?> (c)] (LINE:315), block:B:81:0x013a */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0033, B:14:0x00b7, B:16:0x00bd, B:18:0x00c2, B:20:0x00e0, B:22:0x00f4, B:24:0x0112, B:25:0x0117, B:27:0x011f, B:32:0x00c8, B:35:0x00cf, B:42:0x0048, B:44:0x0051, B:45:0x00a8, B:65:0x00a4, B:67:0x0125, B:68:0x012e), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0033, B:14:0x00b7, B:16:0x00bd, B:18:0x00c2, B:20:0x00e0, B:22:0x00f4, B:24:0x0112, B:25:0x0117, B:27:0x011f, B:32:0x00c8, B:35:0x00cf, B:42:0x0048, B:44:0x0051, B:45:0x00a8, B:65:0x00a4, B:67:0x0125, B:68:0x012e), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0033, B:14:0x00b7, B:16:0x00bd, B:18:0x00c2, B:20:0x00e0, B:22:0x00f4, B:24:0x0112, B:25:0x0117, B:27:0x011f, B:32:0x00c8, B:35:0x00cf, B:42:0x0048, B:44:0x0051, B:45:0x00a8, B:65:0x00a4, B:67:0x0125, B:68:0x012e), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [bst, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00f2 -> B:14:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0123 -> B:14:0x00b7). Please report as a decompilation issue!!! */
    @Override // defpackage.kzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kzr kzrVar, kqj kqjVar) {
        laj lajVar;
        kqp kqpVar;
        int i;
        ?? r8;
        bst bstVar;
        Object obj;
        kzr kzrVar2;
        kzr kzrVar3;
        Object obj2;
        kzr kzrVar4;
        kwu kwuVar;
        Object andSet;
        kwu kwuVar2;
        Object obj3;
        try {
            if (kqjVar instanceof laj) {
                lajVar = (laj) kqjVar;
                int i2 = lajVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lajVar.e = i2 - Integer.MIN_VALUE;
                    Object obj4 = lajVar.d;
                    kqpVar = kqp.a;
                    i = lajVar.e;
                    if (i != 0) {
                        ixc.Y(obj4);
                        synchronized (this) {
                            bst[] bstVarArr = this.c;
                            if (bstVarArr == null) {
                                bstVarArr = new bst[2];
                                this.c = bstVarArr;
                            } else {
                                int i3 = this.a;
                                int length = bstVarArr.length;
                                if (i3 >= length) {
                                    Object[] copyOf = Arrays.copyOf(bstVarArr, length + length);
                                    copyOf.getClass();
                                    bstVarArr = (bst[]) copyOf;
                                    this.c = bstVarArr;
                                }
                            }
                            int i4 = this.b;
                            do {
                                bstVar = bstVarArr[i4];
                                if (bstVar == null) {
                                    bstVar = new bst((byte[]) null, (char[]) null);
                                    bstVarArr[i4] = bstVar;
                                }
                                i4++;
                                if (i4 >= bstVarArr.length) {
                                    i4 = 0;
                                }
                                obj = bstVar.a;
                            } while (((AtomicReference) obj).get() != null);
                            ((AtomicReference) obj).set(lak.a);
                            this.b = i4;
                            this.a++;
                        }
                        boolean z = kzrVar instanceof lal;
                        kzrVar2 = kzrVar;
                        if (z) {
                            lajVar.a = kzrVar;
                            lajVar.g = bstVar;
                            lajVar.e = 1;
                            throw null;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                obj2 = lajVar.c;
                                Object obj5 = lajVar.b;
                                bstVar = lajVar.g;
                                Object obj6 = lajVar.a;
                                ixc.Y(obj4);
                                kwuVar = obj5;
                                kzrVar4 = obj6;
                                Object obj7 = bstVar.a;
                                ldb ldbVar = lak.a;
                                andSet = ((AtomicReference) obj7).getAndSet(ldbVar);
                                andSet.getClass();
                                boolean z2 = kvo.a;
                                kwuVar2 = kwuVar;
                                kzrVar3 = kzrVar4;
                                if (andSet != lak.b) {
                                }
                                Object obj8 = this.d.a;
                                if (kwuVar2 != null) {
                                }
                                if (obj2 != null) {
                                }
                                if (obj8 == lbd.a) {
                                }
                                lajVar.a = kzrVar3;
                                lajVar.g = bstVar;
                                lajVar.b = kwuVar2;
                                lajVar.c = obj8;
                                lajVar.e = 2;
                                if (kzrVar3.cg(obj3, lajVar) != kqpVar) {
                                }
                                return kqpVar;
                            }
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj2 = lajVar.c;
                            Object obj9 = lajVar.b;
                            bstVar = lajVar.g;
                            Object obj10 = lajVar.a;
                            ixc.Y(obj4);
                            kwuVar2 = obj9;
                            kzrVar3 = obj10;
                            Object obj82 = this.d.a;
                            if (kwuVar2 != null) {
                                ixi.j(kwuVar2);
                            }
                            if (obj2 != null) {
                                kwuVar = kwuVar2;
                                kzrVar4 = kzrVar3;
                            }
                            obj3 = obj82 == lbd.a ? null : obj82;
                            lajVar.a = kzrVar3;
                            lajVar.g = bstVar;
                            lajVar.b = kwuVar2;
                            lajVar.c = obj82;
                            lajVar.e = 2;
                            if (kzrVar3.cg(obj3, lajVar) != kqpVar) {
                                obj2 = obj82;
                                kwuVar = kwuVar2;
                                kzrVar4 = kzrVar3;
                                Object obj72 = bstVar.a;
                                ldb ldbVar2 = lak.a;
                                andSet = ((AtomicReference) obj72).getAndSet(ldbVar2);
                                andSet.getClass();
                                boolean z22 = kvo.a;
                                kwuVar2 = kwuVar;
                                kzrVar3 = kzrVar4;
                                if (andSet != lak.b) {
                                    lajVar.a = kzrVar4;
                                    lajVar.g = bstVar;
                                    lajVar.b = kwuVar;
                                    lajVar.c = obj2;
                                    lajVar.e = 3;
                                    kuw kuwVar = new kuw(ixe.d(lajVar), 1);
                                    kuwVar.y();
                                    if (!a.a((AtomicReference) obj72, ldbVar2, kuwVar)) {
                                        kuwVar.ca(kow.a);
                                    }
                                    Object l = kuwVar.l();
                                    if (l != kqp.a) {
                                        l = kow.a;
                                    }
                                    if (l != kqpVar) {
                                        kwuVar2 = kwuVar;
                                        kzrVar3 = kzrVar4;
                                    }
                                }
                                Object obj822 = this.d.a;
                                if (kwuVar2 != null) {
                                }
                                if (obj2 != null) {
                                }
                                if (obj822 == lbd.a) {
                                }
                                lajVar.a = kzrVar3;
                                lajVar.g = bstVar;
                                lajVar.b = kwuVar2;
                                lajVar.c = obj822;
                                lajVar.e = 2;
                                if (kzrVar3.cg(obj3, lajVar) != kqpVar) {
                                }
                            }
                            return kqpVar;
                        }
                        bstVar = lajVar.g;
                        Object obj11 = lajVar.a;
                        ixc.Y(obj4);
                        kzrVar2 = obj11;
                    }
                    kzrVar3 = kzrVar2;
                    obj2 = null;
                    kwuVar2 = (kwu) lajVar.bU().get(kwu.d);
                    Object obj8222 = this.d.a;
                    if (kwuVar2 != null) {
                    }
                    if (obj2 != null) {
                    }
                    if (obj8222 == lbd.a) {
                    }
                    lajVar.a = kzrVar3;
                    lajVar.g = bstVar;
                    lajVar.b = kwuVar2;
                    lajVar.c = obj8222;
                    lajVar.e = 2;
                    if (kzrVar3.cg(obj3, lajVar) != kqpVar) {
                    }
                    return kqpVar;
                }
            }
            if (i != 0) {
            }
            kzrVar3 = kzrVar2;
            obj2 = null;
            kwuVar2 = (kwu) lajVar.bU().get(kwu.d);
            Object obj82222 = this.d.a;
            if (kwuVar2 != null) {
            }
            if (obj2 != null) {
            }
            if (obj82222 == lbd.a) {
            }
            lajVar.a = kzrVar3;
            lajVar.g = bstVar;
            lajVar.b = kwuVar2;
            lajVar.c = obj82222;
            lajVar.e = 2;
            if (kzrVar3.cg(obj3, lajVar) != kqpVar) {
            }
            return kqpVar;
        } catch (Throwable th) {
            synchronized (this) {
                int i5 = this.a - 1;
                this.a = i5;
                if (i5 == 0) {
                    this.b = 0;
                }
                r8.getClass();
                ((AtomicReference) r8.a).set(null);
                kqj[] kqjVarArr = lap.a;
                throw th;
            }
        }
        lajVar = new laj(this, kqjVar);
        Object obj42 = lajVar.d;
        kqpVar = kqp.a;
        i = lajVar.e;
    }

    @Override // defpackage.lai
    public final Object b() {
        ldb ldbVar = lbd.a;
        Object obj = this.d.a;
        if (obj == ldbVar) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.lba
    public final kzq cf() {
        boolean z = kvo.a;
        return this;
    }

    @Override // defpackage.kzr
    public final Object cg(Object obj, kqj kqjVar) {
        d(obj);
        return kow.a;
    }

    public final void d(Object obj) {
        if (obj == null) {
            obj = lbd.a;
        }
        e(null, obj);
    }

    public final boolean e(Object obj, Object obj2) {
        int i;
        bst[] bstVarArr;
        ldb ldbVar;
        synchronized (this) {
            kuk kukVar = this.d;
            Object obj3 = kukVar.a;
            if (obj != null && !ksp.b(obj3, obj)) {
                return false;
            }
            if (ksp.b(obj3, obj2)) {
                return true;
            }
            kukVar.c(obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            bst[] bstVarArr2 = this.c;
            while (true) {
                if (bstVarArr2 != null) {
                    for (bst bstVar : bstVarArr2) {
                        if (bstVar != null) {
                            while (true) {
                                AtomicReference atomicReference = (AtomicReference) bstVar.a;
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (ldbVar = lak.b)) {
                                    ldb ldbVar2 = lak.a;
                                    if (obj4 != ldbVar2) {
                                        if (a.a(atomicReference, obj4, ldbVar2)) {
                                            ((kuw) obj4).ca(kow.a);
                                            break;
                                        }
                                    } else {
                                        if (a.a(atomicReference, obj4, ldbVar)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    bstVarArr = this.c;
                }
                bstVarArr2 = bstVarArr;
                i3 = i;
            }
        }
    }

    public lao() {
        throw null;
    }
}
