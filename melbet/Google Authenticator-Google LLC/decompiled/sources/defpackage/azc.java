package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azc implements kzq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public azc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r13 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if (r13 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0064  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x009f -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b2 -> B:30:0x00b3). Please report as a decompilation issue!!! */
    @Override // defpackage.kzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kzr kzrVar, kqj kqjVar) {
        laa laaVar;
        int i;
        long j;
        kzr kzrVar2;
        ?? r8;
        Object obj;
        boolean z;
        kzr kzrVar3;
        int i2 = this.b;
        if (i2 == 0) {
            Object a = this.a.a(new lab(kzrVar, 1), kqjVar);
            return a == kqp.a ? a : kow.a;
        }
        if (i2 == 1) {
            Object obj2 = this.a;
            Object f = ixl.f(kzrVar, (kzq[]) obj2, new dfh(obj2, 1), new dwj(null, 1, null), kqjVar);
            return f == kqp.a ? f : kow.a;
        }
        if (i2 == 2) {
            Object obj3 = this.a;
            Object f2 = ixl.f(kzrVar, (kzq[]) obj3, new dfh(obj3, 16), new dwj(null, 0), kqjVar);
            return f2 == kqp.a ? f2 : kow.a;
        }
        if (i2 == 3) {
            Object cg = kzrVar.cg(this.a, kqjVar);
            return cg == kqp.a ? cg : kow.a;
        }
        if (i2 != 4) {
            Object a2 = this.a.a(new lab(kzrVar, 2), kqjVar);
            return a2 == kqp.a ? a2 : kow.a;
        }
        if (kqjVar instanceof laa) {
            laaVar = (laa) kqjVar;
            int i3 = laaVar.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                laaVar.b = i3 - Integer.MIN_VALUE;
                Object obj4 = laaVar.a;
                kqp kqpVar = kqp.a;
                i = laaVar.b;
                if (i != 0) {
                    ixc.Y(obj4);
                    j = 0;
                    kzrVar3 = kzrVar;
                    laaVar.c = kzrVar3;
                    laaVar.d = null;
                    laaVar.e = j;
                    laaVar.b = 1;
                    obj4 = ixk.c(this.a, kzrVar3, laaVar);
                    kzrVar2 = kzrVar3;
                } else if (i == 1) {
                    j = laaVar.e;
                    ?? r12 = laaVar.c;
                    ixc.Y(obj4);
                    kzrVar2 = r12;
                    r8 = kzrVar2;
                    obj = (Throwable) obj4;
                    if (obj != null) {
                        Long l = new Long(j);
                        laaVar.c = r8;
                        laaVar.d = obj;
                        laaVar.e = j;
                        laaVar.b = 2;
                        long longValue = l.longValue();
                        aug augVar = new aug(laaVar);
                        augVar.b = obj;
                        augVar.c = longValue;
                        obj4 = augVar.b(kow.a);
                    } else {
                        z = false;
                        kzrVar3 = r8;
                        if (!z) {
                        }
                        laaVar.c = kzrVar3;
                        laaVar.d = null;
                        laaVar.e = j;
                        laaVar.b = 1;
                        obj4 = ixk.c(this.a, kzrVar3, laaVar);
                        kzrVar2 = kzrVar3;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = laaVar.e;
                    obj = laaVar.d;
                    r8 = laaVar.c;
                    ixc.Y(obj4);
                    if (!((Boolean) obj4).booleanValue()) {
                        throw ((Throwable) obj);
                    }
                    j++;
                    z = true;
                    kzrVar3 = r8;
                    if (!z) {
                        return kow.a;
                    }
                    laaVar.c = kzrVar3;
                    laaVar.d = null;
                    laaVar.e = j;
                    laaVar.b = 1;
                    obj4 = ixk.c(this.a, kzrVar3, laaVar);
                    kzrVar2 = kzrVar3;
                }
            }
        }
        laaVar = new laa(this, kqjVar);
        Object obj42 = laaVar.a;
        kqp kqpVar2 = kqp.a;
        i = laaVar.b;
        if (i != 0) {
        }
    }
}
