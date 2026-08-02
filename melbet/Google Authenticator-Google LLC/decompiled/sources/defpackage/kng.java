package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kng extends kra implements krx {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ krt e;
    final /* synthetic */ kzq f;
    final /* synthetic */ kbg g;
    final /* synthetic */ kuq h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kng(krt krtVar, kzq kzqVar, kuq kuqVar, kbg kbgVar, kqj kqjVar) {
        super(2, kqjVar);
        this.e = krtVar;
        this.f = kzqVar;
        this.h = kuqVar;
        this.g = kbgVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kng) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0 A[LOOP:0: B:24:0x00d0->B:29:0x00e2, LOOP_START, PHI: r13
      0x00d0: PHI (r13v17 java.lang.Throwable) = (r13v14 java.lang.Throwable), (r13v21 java.lang.Throwable) binds: [B:23:0x00cd, B:29:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0084  */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kzq] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        Throwable th;
        AtomicBoolean atomicBoolean;
        ldx ldxVar;
        Object X;
        Throwable a;
        Object obj2;
        Throwable th2;
        ldx ldxVar2;
        ldx ldxVar3;
        ldx ldxVar4;
        kaa kaaVar;
        kaa kaaVar2;
        kbq kbqVar;
        Object obj3;
        Object obj4;
        kqp kqpVar = kqp.a;
        int i = this.d;
        kaa kaaVar3 = null;
        if (i == 0) {
            ixc.Y(obj);
            ldx ldxVar5 = new ldx();
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            krt krtVar = this.e;
            kzq kzqVar = this.f;
            kuq kuqVar = this.h;
            kbg kbgVar = this.g;
            try {
                ?? a2 = krtVar.a(kzqVar);
                knf knfVar = new knf(atomicBoolean2, ldxVar5, kuqVar, kbgVar, 0);
                this.i = ldxVar5;
                this.a = atomicBoolean2;
                this.d = 1;
                if (a2.a(knfVar, this) != kqpVar) {
                    atomicBoolean = atomicBoolean2;
                    ldxVar = ldxVar5;
                }
            } catch (Throwable th3) {
                th = th3;
                atomicBoolean = atomicBoolean2;
                ldxVar = ldxVar5;
                X = ixc.X(th);
                ldx ldxVar6 = ldxVar;
                a = kon.a(X);
                ldxVar4 = ldxVar6;
                if (a == null) {
                }
                if (a != null) {
                }
                if (a != null) {
                }
                kaaVar = new kaa();
                kbg kbgVar2 = this.g;
                this.i = r2;
                this.a = kaaVar;
                this.b = ldxVar4;
                this.c = kbgVar2;
                this.d = 3;
                if (ldxVar4.b(this) != kqpVar) {
                }
                return kqpVar;
            }
            return kqpVar;
        }
        if (i != 1) {
            obj2 = this.c;
            if (i != 2) {
                Object obj5 = this.b;
                kaaVar2 = (kaa) this.a;
                kbqVar = (kbq) this.i;
                ixc.Y(obj);
                obj3 = obj5;
                obj4 = obj3;
                try {
                    ((kbg) obj2).a(kbqVar, kaaVar2);
                    ((ldx) obj4).c();
                    return kow.a;
                } catch (Throwable th4) {
                    ((ldx) obj4).c();
                    throw th4;
                }
            }
            Object obj6 = this.b;
            th2 = (Throwable) this.a;
            ldxVar3 = (ldx) this.i;
            ixc.Y(obj);
            ldxVar2 = obj6;
            try {
                ((kbg) obj2).b(new kaa());
                ldxVar2.c();
                a = th2;
                ldxVar4 = ldxVar3;
                kbq d = a != null ? kbq.b : a instanceof CancellationException ? kbq.c.d(a) : kbq.c(a);
                if (a != null) {
                    while (true) {
                        if (a == null) {
                            break;
                        }
                        if (a instanceof kbr) {
                            break;
                        }
                        if (a instanceof kbt) {
                            kaaVar3 = ((kbt) a).b;
                            break;
                        }
                        a = a.getCause();
                    }
                    if (kaaVar3 != null) {
                        kaaVar = kaaVar3;
                        kbg kbgVar22 = this.g;
                        this.i = d;
                        this.a = kaaVar;
                        this.b = ldxVar4;
                        this.c = kbgVar22;
                        this.d = 3;
                        if (ldxVar4.b(this) != kqpVar) {
                            kaaVar2 = kaaVar;
                            kbqVar = d;
                            obj2 = kbgVar22;
                            obj3 = ldxVar4;
                            obj4 = obj3;
                            ((kbg) obj2).a(kbqVar, kaaVar2);
                            ((ldx) obj4).c();
                            return kow.a;
                        }
                        return kqpVar;
                    }
                }
                kaaVar = new kaa();
                kbg kbgVar222 = this.g;
                this.i = d;
                this.a = kaaVar;
                this.b = ldxVar4;
                this.c = kbgVar222;
                this.d = 3;
                if (ldxVar4.b(this) != kqpVar) {
                }
                return kqpVar;
            } catch (Throwable th5) {
                ldxVar2.c();
                throw th5;
            }
        }
        atomicBoolean = (AtomicBoolean) this.a;
        ldxVar = (ldx) this.i;
        try {
            ixc.Y(obj);
        } catch (Throwable th6) {
            th = th6;
            X = ixc.X(th);
            ldx ldxVar62 = ldxVar;
            a = kon.a(X);
            ldxVar4 = ldxVar62;
            if (a == null) {
            }
            if (a != null) {
            }
            if (a != null) {
            }
            kaaVar = new kaa();
            kbg kbgVar2222 = this.g;
            this.i = d;
            this.a = kaaVar;
            this.b = ldxVar4;
            this.c = kbgVar2222;
            this.d = 3;
            if (ldxVar4.b(this) != kqpVar) {
            }
            return kqpVar;
        }
        X = kow.a;
        ldx ldxVar622 = ldxVar;
        a = kon.a(X);
        ldxVar4 = ldxVar622;
        if (a == null) {
            ldxVar4 = ldxVar622;
            if (atomicBoolean.compareAndSet(false, true)) {
                obj2 = this.g;
                this.i = ldxVar622;
                this.a = null;
                this.b = ldxVar622;
                this.c = obj2;
                this.d = 2;
                if (ldxVar622.b(this) != kqpVar) {
                    th2 = a;
                    ldxVar2 = ldxVar622;
                    ldxVar3 = ldxVar2;
                    ((kbg) obj2).b(new kaa());
                    ldxVar2.c();
                    a = th2;
                    ldxVar4 = ldxVar3;
                }
                return kqpVar;
            }
        }
        if (a != null) {
        }
        if (a != null) {
        }
        kaaVar = new kaa();
        kbg kbgVar22222 = this.g;
        this.i = d;
        this.a = kaaVar;
        this.b = ldxVar4;
        this.c = kbgVar22222;
        this.d = 3;
        if (ldxVar4.b(this) != kqpVar) {
        }
        return kqpVar;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        kng kngVar = new kng(this.e, this.f, this.h, this.g, kqjVar);
        kngVar.i = obj;
        return kngVar;
    }
}
