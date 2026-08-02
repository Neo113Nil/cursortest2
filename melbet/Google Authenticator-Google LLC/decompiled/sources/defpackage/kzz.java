package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzz implements kzr {
    final /* synthetic */ kzr a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public kzz(kzr kzrVar, Object obj, int i) {
        this.c = i;
        this.a = kzrVar;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r9.cg(r10, r0) != r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r9.cg(r11, r0) != r2) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kow] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, krx] */
    @Override // defpackage.kzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cg(Object obj, kqj kqjVar) {
        kzy kzyVar;
        int i;
        knh knhVar;
        int i2;
        kzr kzrVar;
        lad ladVar;
        int i3;
        kzr kzrVar2;
        int i4 = this.c;
        if (i4 == 0) {
            try {
                if (kqjVar instanceof kzy) {
                    kzyVar = (kzy) kqjVar;
                    int i5 = kzyVar.c;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        kzyVar.c = i5 - Integer.MIN_VALUE;
                        Object obj2 = kzyVar.a;
                        kqp kqpVar = kqp.a;
                        i = kzyVar.c;
                        if (i != 0) {
                            ixc.Y(obj2);
                            kzr kzrVar3 = this.a;
                            kzyVar.c = 1;
                            if (kzrVar3.cg(obj, kzyVar) == kqpVar) {
                                return kqpVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ixc.Y(obj2);
                        }
                        this = kow.a;
                        return this;
                    }
                }
                if (i != 0) {
                }
                this = kow.a;
                return this;
            } catch (Throwable th) {
                ((ksw) this.b).a = th;
                throw th;
            }
            kzyVar = new kzy(this, kqjVar);
            Object obj22 = kzyVar.a;
            kqp kqpVar2 = kqp.a;
            i = kzyVar.c;
        } else if (i4 != 1) {
            if (kqjVar instanceof lad) {
                ladVar = (lad) kqjVar;
                int i6 = ladVar.b;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    ladVar.b = i6 - Integer.MIN_VALUE;
                    Object obj3 = ladVar.a;
                    kqp kqpVar3 = kqp.a;
                    i3 = ladVar.b;
                    if (i3 != 0) {
                        ixc.Y(obj3);
                        kzr kzrVar4 = this.a;
                        ?? r9 = this.b;
                        ladVar.c = obj;
                        ladVar.d = kzrVar4;
                        ladVar.b = 1;
                        if (r9.a(obj, ladVar) != kqpVar3) {
                            kzrVar2 = kzrVar4;
                        }
                        return kqpVar3;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ixc.Y(obj3);
                        return kow.a;
                    }
                    Object obj4 = ladVar.d;
                    obj = ladVar.c;
                    ixc.Y(obj3);
                    kzrVar2 = obj4;
                    ladVar.c = null;
                    ladVar.d = null;
                    ladVar.b = 2;
                }
            }
            ladVar = new lad(this, kqjVar);
            Object obj32 = ladVar.a;
            kqp kqpVar32 = kqp.a;
            i3 = ladVar.b;
            if (i3 != 0) {
            }
            ladVar.c = null;
            ladVar.d = null;
            ladVar.b = 2;
        } else {
            if (kqjVar instanceof knh) {
                knhVar = (knh) kqjVar;
                int i7 = knhVar.b;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    knhVar.b = i7 - Integer.MIN_VALUE;
                    Object obj5 = knhVar.a;
                    kqp kqpVar4 = kqp.a;
                    i2 = knhVar.b;
                    if (i2 != 0) {
                        ixc.Y(obj5);
                        kzr kzrVar5 = this.a;
                        ?? r92 = this.b;
                        knhVar.c = kzrVar5;
                        knhVar.b = 1;
                        Object a = r92.a(obj, knhVar);
                        if (a != kqpVar4) {
                            obj5 = a;
                            kzrVar = kzrVar5;
                        }
                        return kqpVar4;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ixc.Y(obj5);
                        return kow.a;
                    }
                    Object obj6 = knhVar.c;
                    ixc.Y(obj5);
                    kzrVar = obj6;
                    knhVar.c = null;
                    knhVar.b = 2;
                }
            }
            knhVar = new knh(this, kqjVar);
            Object obj52 = knhVar.a;
            kqp kqpVar42 = kqp.a;
            i2 = knhVar.b;
            if (i2 != 0) {
            }
            knhVar.c = null;
            knhVar.b = 2;
        }
    }
}
