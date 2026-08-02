package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kni implements kzq {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public kni(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:54|(2:56|(9:58|59|60|(1:(1:(1:(5:65|66|67|68|69)(2:74|75))(2:76|77))(2:78|79))(2:90|91)|80|81|82|(3:84|68|69)|85))|98|59|60|(0)(0)|80|81|82|(0)|85) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (r9.a(r1, r0) != r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0107, code lost:
    
        if (r11.a(r10, r0) == r5) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012e, code lost:
    
        r11 = new defpackage.lam(r10);
        r9 = r9.b;
        r0.c = r10;
        r0.b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013d, code lost:
    
        if (defpackage.ixk.d(r11, r9, r10, r0) != r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0141, code lost:
    
        throw r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, krz] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, kry] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kry] */
    @Override // defpackage.kzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kzr kzrVar, kqj kqjVar) {
        kzv kzvVar;
        kqp kqpVar;
        int i;
        lbe lbeVar;
        Throwable th;
        lbe lbeVar2;
        ?? r9;
        kzw kzwVar;
        int i2;
        lbe lbeVar3;
        kzr kzrVar2;
        int i3 = this.c;
        if (i3 == 0) {
            Object a = this.a.a(new kzz(kzrVar, this.b, 1), kqjVar);
            return a == kqp.a ? a : kow.a;
        }
        if (i3 == 1) {
            Object obj = this.a;
            Object f = ixl.f(kzrVar, (kzq[]) obj, new dfh(obj, 15), new dwh(null, (eau) this.b), kqjVar);
            return f == kqp.a ? f : kow.a;
        }
        if (i3 == 2) {
            try {
                if (kqjVar instanceof kzv) {
                    kzvVar = (kzv) kqjVar;
                    int i4 = kzvVar.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kzvVar.b = i4 - Integer.MIN_VALUE;
                        Object obj2 = kzvVar.a;
                        kqpVar = kqp.a;
                        i = kzvVar.b;
                        if (i != 0) {
                            ixc.Y(obj2);
                            ?? r11 = this.a;
                            kzvVar.c = kzrVar;
                            kzvVar.b = 1;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    Throwable th2 = (Throwable) kzvVar.c;
                                    ixc.Y(obj2);
                                    throw th2;
                                }
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                lbeVar2 = (lbe) kzvVar.c;
                                try {
                                    ixc.Y(obj2);
                                    lbeVar2.h();
                                    return kow.a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    lbeVar2.h();
                                    throw th;
                                }
                            }
                            kzrVar = (kzr) kzvVar.c;
                            ixc.Y(obj2);
                        }
                        lbeVar = new lbe(kzrVar, kzvVar.bU());
                        r9 = this.b;
                        kzvVar.c = lbeVar;
                        kzvVar.b = 3;
                        if (r9.a(lbeVar, null, kzvVar) != kqpVar) {
                            lbeVar2 = lbeVar;
                            lbeVar2.h();
                            return kow.a;
                        }
                        return kqpVar;
                    }
                }
                r9 = this.b;
                kzvVar.c = lbeVar;
                kzvVar.b = 3;
                if (r9.a(lbeVar, null, kzvVar) != kqpVar) {
                }
                return kqpVar;
            } catch (Throwable th4) {
                th = th4;
                lbeVar2 = lbeVar;
                lbeVar2.h();
                throw th;
            }
            kzvVar = new kzv(this, kqjVar);
            Object obj22 = kzvVar.a;
            kqpVar = kqp.a;
            i = kzvVar.b;
            if (i != 0) {
            }
            lbeVar = new lbe(kzrVar, kzvVar.bU());
        } else {
            if (i3 != 3) {
                if (i3 != 4) {
                    Object f2 = ixl.f(kzrVar, (kzq[]) this.a, new aji(17), new laf((kqj) null, (krz) this.b, 1), kqjVar);
                    return f2 == kqp.a ? f2 : kow.a;
                }
                Object a2 = this.a.a(new kzz(kzrVar, this.b, 2), kqjVar);
                return a2 == kqp.a ? a2 : kow.a;
            }
            if (kqjVar instanceof kzw) {
                kzwVar = (kzw) kqjVar;
                int i5 = kzwVar.b;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    kzwVar.b = i5 - Integer.MIN_VALUE;
                    Object obj3 = kzwVar.a;
                    kqp kqpVar2 = kqp.a;
                    i2 = kzwVar.b;
                    if (i2 != 0) {
                        ixc.Y(obj3);
                        lbe lbeVar4 = new lbe(kzrVar, kzwVar.bU());
                        try {
                            ?? r3 = this.b;
                            kzwVar.c = kzrVar;
                            kzwVar.d = lbeVar4;
                            kzwVar.b = 1;
                            if (r3.a(lbeVar4, kzwVar) != kqpVar2) {
                                kzrVar2 = kzrVar;
                                lbeVar3 = lbeVar4;
                            }
                            return kqpVar2;
                        } catch (Throwable th5) {
                            th = th5;
                            lbeVar3 = lbeVar4;
                            lbeVar3.h();
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ixc.Y(obj3);
                        return kow.a;
                    }
                    lbeVar3 = kzwVar.d;
                    Object obj4 = kzwVar.c;
                    try {
                        ixc.Y(obj3);
                        kzrVar2 = obj4;
                    } catch (Throwable th6) {
                        th = th6;
                        lbeVar3.h();
                        throw th;
                    }
                    lbeVar3.h();
                    ?? r92 = this.a;
                    kzwVar.c = null;
                    kzwVar.d = null;
                    kzwVar.b = 2;
                }
            }
            kzwVar = new kzw(this, kqjVar);
            Object obj32 = kzwVar.a;
            kqp kqpVar22 = kqp.a;
            i2 = kzwVar.b;
            if (i2 != 0) {
            }
            lbeVar3.h();
            ?? r922 = this.a;
            kzwVar.c = null;
            kzwVar.d = null;
            kzwVar.b = 2;
        }
    }

    public kni(krx krxVar, kzq kzqVar, int i) {
        this.c = i;
        this.b = krxVar;
        this.a = kzqVar;
    }
}
