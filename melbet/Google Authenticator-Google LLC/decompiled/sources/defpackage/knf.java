package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knf implements kzr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public knf(ksu ksuVar, kzr kzrVar, Object obj, int i) {
        this.e = i;
        this.a = ksuVar;
        this.d = kzrVar;
        this.b = "request";
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        if (((defpackage.kuq) r9).b(r0) == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, kzr] */
    @Override // defpackage.kzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cg(Object obj, kqj kqjVar) {
        kne kneVar;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        if (this.e != 0) {
            ksu ksuVar = (ksu) this.a;
            if (!ksuVar.a) {
                ksuVar.a = true;
                return this.d.cg(obj, kqjVar);
            }
            Object obj8 = this.b;
            Object obj9 = this.c;
            throw new kbr(kbq.k.e("Expected one " + ((String) obj8) + " for " + obj9 + " but received two"));
        }
        try {
            if (kqjVar instanceof kne) {
                kneVar = (kne) kqjVar;
                int i2 = kneVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kneVar.e = i2 - Integer.MIN_VALUE;
                    Object obj10 = kneVar.c;
                    kqp kqpVar = kqp.a;
                    i = kneVar.e;
                    if (i != 0) {
                        ixc.Y(obj10);
                        if (((AtomicBoolean) this.a).compareAndSet(false, true)) {
                            Object obj11 = this.d;
                            Object obj12 = this.c;
                            kneVar.a = obj;
                            ldx ldxVar = (ldx) obj11;
                            kneVar.f = ldxVar;
                            kneVar.b = obj12;
                            kneVar.e = 1;
                            if (ldxVar.b(kneVar) != kqpVar) {
                                obj2 = obj;
                                obj3 = obj12;
                                obj4 = obj11;
                            }
                            return kqpVar;
                        }
                        Object obj13 = this.b;
                        kneVar.a = obj;
                        kneVar.f = null;
                        kneVar.b = null;
                        kneVar.e = 2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj5 = kneVar.b;
                                obj7 = kneVar.f;
                                obj6 = kneVar.a;
                                ixc.Y(obj10);
                                try {
                                    ((kbg) obj5).d(obj6);
                                    ((ldx) obj4).c();
                                    return kow.a;
                                } finally {
                                }
                            }
                            obj = kneVar.a;
                            ixc.Y(obj10);
                            Object obj14 = this.d;
                            obj5 = this.c;
                            kneVar.a = obj;
                            ldx ldxVar2 = (ldx) obj14;
                            kneVar.f = ldxVar2;
                            kneVar.b = obj5;
                            kneVar.e = 3;
                            if (ldxVar2.b(kneVar) != kqpVar) {
                                obj6 = obj;
                                obj7 = obj14;
                                ((kbg) obj5).d(obj6);
                                ((ldx) obj4).c();
                                return kow.a;
                            }
                            return kqpVar;
                        }
                        obj3 = kneVar.b;
                        obj4 = kneVar.f;
                        obj2 = kneVar.a;
                        ixc.Y(obj10);
                    }
                    ((kbg) obj3).b(new kaa());
                    ((ldx) obj4).c();
                    obj = obj2;
                    Object obj132 = this.b;
                    kneVar.a = obj;
                    kneVar.f = null;
                    kneVar.b = null;
                    kneVar.e = 2;
                }
            }
            ((kbg) obj3).b(new kaa());
            ((ldx) obj4).c();
            obj = obj2;
            Object obj1322 = this.b;
            kneVar.a = obj;
            kneVar.f = null;
            kneVar.b = null;
            kneVar.e = 2;
        } finally {
        }
        kneVar = new kne(this, kqjVar);
        Object obj102 = kneVar.c;
        kqp kqpVar2 = kqp.a;
        i = kneVar.e;
        if (i != 0) {
        }
    }

    public knf(AtomicBoolean atomicBoolean, ldx ldxVar, kuq kuqVar, kbg kbgVar, int i) {
        this.e = i;
        this.a = atomicBoolean;
        this.d = ldxVar;
        this.b = kuqVar;
        this.c = kbgVar;
    }
}
