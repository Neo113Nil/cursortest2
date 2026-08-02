package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixk {
    public static final Object a(kqn kqnVar, Object obj, Object obj2, krx krxVar, kqj kqjVar) {
        Object a;
        Object b = ldd.b(kqnVar, obj2);
        try {
            lbj lbjVar = new lbj(kqjVar, kqnVar);
            if (krxVar instanceof kqu) {
                ksy.b(krxVar, 2);
                a = krxVar.a(obj, lbjVar);
            } else {
                a = ixe.b(krxVar, obj, lbjVar);
            }
            ldd.c(kqnVar, b);
            if (a == kqp.a) {
                kqjVar.getClass();
            }
            return a;
        } catch (Throwable th) {
            ldd.c(kqnVar, b);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(kzq kzqVar, kqj kqjVar) {
        lac lacVar;
        int i;
        ksw kswVar;
        lan e;
        lab labVar;
        Object obj;
        if (kqjVar instanceof lac) {
            lacVar = (lac) kqjVar;
            int i2 = lacVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lacVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = lacVar.a;
                Object obj3 = kqp.a;
                i = lacVar.b;
                if (i != 0) {
                    ixc.Y(obj2);
                    ksw kswVar2 = new ksw();
                    kswVar2.a = lbd.a;
                    lab labVar2 = new lab(kswVar2, 0);
                    try {
                        lacVar.c = kswVar2;
                        lacVar.d = labVar2;
                        lacVar.b = 1;
                        if (kzqVar.a(labVar2, lacVar) == obj3) {
                            return obj3;
                        }
                        kswVar = kswVar2;
                    } catch (lan e2) {
                        kswVar = kswVar2;
                        e = e2;
                        labVar = labVar2;
                        if (e.a == labVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    labVar = lacVar.d;
                    kswVar = lacVar.c;
                    try {
                        ixc.Y(obj2);
                    } catch (lan e3) {
                        e = e3;
                        if (e.a == labVar) {
                            throw e;
                        }
                        ixi.i(lacVar.bU());
                        obj = kswVar.a;
                        if (obj != lbd.a) {
                        }
                    }
                }
                obj = kswVar.a;
                if (obj != lbd.a) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        lacVar = new lac(kqjVar);
        Object obj22 = lacVar.a;
        Object obj32 = kqp.a;
        i = lacVar.b;
        if (i != 0) {
        }
        obj = kswVar.a;
        if (obj != lbd.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(kzq kzqVar, kzr kzrVar, kqj kqjVar) {
        kzx kzxVar;
        int i;
        Throwable th;
        ksw kswVar;
        Throwable th2;
        kwu kwuVar;
        if (kqjVar instanceof kzx) {
            kzxVar = (kzx) kqjVar;
            int i2 = kzxVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kzxVar.b = i2 - Integer.MIN_VALUE;
                Object obj = kzxVar.a;
                Object obj2 = kqp.a;
                i = kzxVar.b;
                if (i != 0) {
                    ixc.Y(obj);
                    ksw kswVar2 = new ksw();
                    try {
                        kzr kzzVar = new kzz(kzrVar, kswVar2, 0);
                        kzxVar.c = kswVar2;
                        kzxVar.b = 1;
                        if (kzqVar.a(kzzVar, kzxVar) == obj2) {
                            return obj2;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        kswVar = kswVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kswVar = kzxVar.c;
                    try {
                        ixc.Y(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) kswVar.a;
                if (!e(th, th2) || ((kwuVar = (kwu) kzxVar.bU().get(kwu.d)) != null && kwuVar.ce() && e(th, kwuVar.p()))) {
                    throw th;
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    koc.b(th2, th);
                    throw th2;
                }
                koc.b(th, th2);
                throw th;
            }
        }
        kzxVar = new kzx(kqjVar);
        Object obj3 = kzxVar.a;
        Object obj22 = kqp.a;
        i = kzxVar.b;
        if (i != 0) {
        }
        th2 = (Throwable) kswVar.a;
        if (e(th, th2)) {
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(kzr kzrVar, kry kryVar, Throwable th, kqj kqjVar) {
        kzu kzuVar;
        int i;
        try {
            if (kqjVar instanceof kzu) {
                kzuVar = (kzu) kqjVar;
                int i2 = kzuVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kzuVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = kzuVar.b;
                    Object obj2 = kqp.a;
                    i = kzuVar.c;
                    if (i != 0) {
                        ixc.Y(obj);
                        kzuVar.a = th;
                        kzuVar.c = 1;
                        Object a = kryVar.a(kzrVar, th, kzuVar);
                        th = th;
                        if (a == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj3 = kzuVar.a;
                        ixc.Y(obj);
                        th = obj3;
                    }
                    return kow.a;
                }
            }
            if (i != 0) {
            }
            return kow.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                koc.b(th2, th);
            }
            throw th2;
        }
        kzuVar = new kzu(kqjVar);
        Object obj4 = kzuVar.b;
        Object obj22 = kqp.a;
        i = kzuVar.c;
    }

    private static final boolean e(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        boolean z = lbp.a;
        boolean z2 = lbp.a;
        if (!z2 && kvo.b) {
            th2 = lda.c(th2);
        }
        if (!z2 && kvo.b) {
            th = lda.c(th);
        }
        return ksp.b(th2, th);
    }
}
