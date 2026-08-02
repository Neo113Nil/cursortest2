package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lav implements kzr {
    final /* synthetic */ kys a;
    final /* synthetic */ int b;

    public lav(kys kysVar, int i) {
        this.a = kysVar;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        if (r7.h(r2, r0) == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.kzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cg(Object obj, kqj kqjVar) {
        lau lauVar;
        int i;
        lcc lccVar;
        Object obj2;
        kqp kqpVar;
        if (kqjVar instanceof lau) {
            lauVar = (lau) kqjVar;
            int i2 = lauVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lauVar.c = i2 - Integer.MIN_VALUE;
                Object obj3 = lauVar.a;
                kqp kqpVar2 = kqp.a;
                i = lauVar.c;
                if (i != 0) {
                    ixc.Y(obj3);
                    kys kysVar = this.a;
                    kpn kpnVar = new kpn(this.b, obj);
                    lauVar.c = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ixc.Y(obj3);
                        return obj3;
                    }
                    ixc.Y(obj3);
                }
                lauVar.c = 2;
                kqn bU = lauVar.bU();
                ixi.i(bU);
                kqj d = ixe.d(lauVar);
                lccVar = !(d instanceof lcc) ? (lcc) d : null;
                if (lccVar != null) {
                    obj2 = kow.a;
                } else {
                    if (lcd.c(lccVar.a, bU)) {
                        lccVar.a(bU, kow.a);
                    } else {
                        kyd kydVar = new kyd();
                        kqn plus = bU.plus(kydVar);
                        kow kowVar = kow.a;
                        lccVar.a(plus, kowVar);
                        if (kydVar.a) {
                            boolean z = kvo.a;
                            ThreadLocal threadLocal = kxv.a;
                            kwf a = kxv.a();
                            if (!a.q()) {
                                if (a.p()) {
                                    lccVar.c = kowVar;
                                    lccVar.e = 1;
                                    a.n(lccVar);
                                } else {
                                    a.o(true);
                                    try {
                                        lccVar.run();
                                        do {
                                        } while (a.r());
                                    } finally {
                                        try {
                                        } finally {
                                        }
                                    }
                                }
                            }
                            obj2 = kow.a;
                        }
                    }
                    obj2 = kqpVar2;
                }
                kqpVar = kqp.a;
                if (obj2 == kqpVar) {
                    lauVar.getClass();
                }
                if (obj2 != kqpVar) {
                    obj2 = kow.a;
                }
                return obj2 != kqpVar2 ? kqpVar2 : obj2;
            }
        }
        lauVar = new lau(this, kqjVar);
        Object obj32 = lauVar.a;
        kqp kqpVar22 = kqp.a;
        i = lauVar.c;
        if (i != 0) {
        }
        lauVar.c = 2;
        kqn bU2 = lauVar.bU();
        ixi.i(bU2);
        kqj d2 = ixe.d(lauVar);
        if (!(d2 instanceof lcc)) {
        }
        if (lccVar != null) {
        }
        kqpVar = kqp.a;
        if (obj2 == kqpVar) {
        }
        if (obj2 != kqpVar) {
        }
        if (obj2 != kqpVar22) {
        }
    }
}
