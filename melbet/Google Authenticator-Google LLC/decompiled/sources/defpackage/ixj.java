package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ixj {
    public static /* synthetic */ kzq e(kzq kzqVar) {
        return kzqVar instanceof lba ? ((lba) kzqVar).cf() : new las(kzqVar, kqo.a, 0, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:12:0x002f, B:14:0x0058, B:21:0x006d, B:23:0x0075, B:34:0x0045, B:38:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0089 -> B:14:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(kzr kzrVar, kzf kzfVar, boolean z, kqj kqjVar) {
        kzs kzsVar;
        kqp kqpVar;
        int i;
        kyk A;
        kzf kzfVar2;
        kzs kzsVar2;
        kyk kykVar;
        Object a;
        try {
            if (kqjVar instanceof kzs) {
                kzsVar = (kzs) kqjVar;
                int i2 = kzsVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kzsVar.e = i2 - Integer.MIN_VALUE;
                    Object obj = kzsVar.d;
                    kqpVar = kqp.a;
                    i = kzsVar.e;
                    CancellationException cancellationException = null;
                    if (i != 0) {
                        ixc.Y(obj);
                        if (kzrVar instanceof lam) {
                            throw ((lam) kzrVar).a;
                        }
                        A = kzfVar.A();
                        kzfVar = kzfVar;
                    } else {
                        if (i == 1) {
                            z = kzsVar.c;
                            kyk kykVar2 = kzsVar.f;
                            Object obj2 = kzsVar.b;
                            Object obj3 = kzsVar.a;
                            ixc.Y(obj);
                            kzsVar2 = kzsVar;
                            kykVar = kykVar2;
                            kzrVar = obj3;
                            kzfVar2 = obj2;
                            kzs kzsVar3 = kzsVar2;
                            if (((Boolean) obj).booleanValue()) {
                                if (z) {
                                    kzfVar2.s(null);
                                }
                                return kow.a;
                            }
                            Object b = kykVar.b();
                            kzsVar3.a = kzrVar;
                            kzsVar3.b = kzfVar2;
                            kzsVar3.f = kykVar;
                            kzsVar3.c = z;
                            kzsVar3.e = 2;
                            if (kzrVar.cg(b, kzsVar3) != kqpVar) {
                                A = kykVar;
                                kzsVar = kzsVar3;
                                kzfVar = kzfVar2;
                            }
                            return kqpVar;
                        }
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = kzsVar.c;
                        kyk kykVar3 = kzsVar.f;
                        Object obj4 = kzsVar.b;
                        Object obj5 = kzsVar.a;
                        ixc.Y(obj);
                        A = kykVar3;
                        kzrVar = obj5;
                        kzfVar = obj4;
                    }
                    kzsVar.a = kzrVar;
                    kzsVar.b = kzfVar;
                    kzsVar.f = A;
                    kzsVar.c = z;
                    kzsVar.e = 1;
                    a = A.a(kzsVar);
                    if (a != kqpVar) {
                        return kqpVar;
                    }
                    kzsVar2 = kzsVar;
                    kykVar = A;
                    obj = a;
                    kzfVar2 = kzfVar;
                    kzs kzsVar32 = kzsVar2;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i != 0) {
            }
            kzsVar.a = kzrVar;
            kzsVar.b = kzfVar;
            kzsVar.f = A;
            kzsVar.c = z;
            kzsVar.e = 1;
            a = A.a(kzsVar);
            if (a != kqpVar) {
            }
        } finally {
        }
        kzsVar = new kzs(kqjVar);
        Object obj6 = kzsVar.d;
        kqpVar = kqp.a;
        i = kzsVar.e;
        CancellationException cancellationException2 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object g(kzd kzdVar, kri kriVar, kqj kqjVar) {
        kzb kzbVar;
        int i;
        try {
            if (kqjVar instanceof kzb) {
                kzbVar = (kzb) kqjVar;
                int i2 = kzbVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kzbVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = kzbVar.b;
                    kqp kqpVar = kqp.a;
                    i = kzbVar.c;
                    if (i != 0) {
                        ixc.Y(obj);
                        if (kzbVar.bU().get(kwu.d) != kzdVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        kzbVar.a = kriVar;
                        kzbVar.c = 1;
                        kuw kuwVar = new kuw(ixe.d(kzbVar), 1);
                        kuwVar.y();
                        kzdVar.b.r(new kzc(kuwVar, 0));
                        kriVar = kriVar;
                        if (kuwVar.l() == kqpVar) {
                            return kqpVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = kzbVar.a;
                        ixc.Y(obj);
                        kriVar = obj2;
                    }
                    kriVar.a();
                    return kow.a;
                }
            }
            if (i != 0) {
            }
            kriVar.a();
            return kow.a;
        } catch (Throwable th) {
            kriVar.a();
            throw th;
        }
        kzbVar = new kzb(kqjVar);
        Object obj3 = kzbVar.b;
        kqp kqpVar2 = kqp.a;
        i = kzbVar.c;
    }

    public static /* synthetic */ kys h(int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i == -2) {
            return i2 == 1 ? new kyo(kyr.a) : new kza(1, i2);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? i2 == 1 ? new kyo(i) : new kza(i, i2) : new kyo(Integer.MAX_VALUE) : i2 == 1 ? new kyo(0) : new kza(1, i2);
        }
        if (i2 == 1) {
            return new kza(1, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public void b(long j) {
    }

    public void c(long j) {
    }
}
