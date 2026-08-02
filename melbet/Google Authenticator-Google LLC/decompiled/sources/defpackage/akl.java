package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akl extends kra implements krx {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akl(kzq kzqVar, Object obj, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.f = i;
        this.d = kzqVar;
        this.c = "request";
        this.b = obj;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((akl) c((kzr) obj, (kqj) obj2)).b(kow.a);
        }
        if (i != 1) {
            return ((akl) c((kzr) obj, (kqj) obj2)).b(kow.a);
        }
        return ((akl) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0181, code lost:
    
        if (r5.F(r7, r22) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0183, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
    
        if (defpackage.ixg.f((defpackage.kqn) r4, r9, r22) != r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0149, code lost:
    
        if (r4 != r0) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019f A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:42:0x0198, B:44:0x019f, B:46:0x01b1, B:48:0x01b4, B:52:0x01b9, B:54:0x01bd), top: B:41:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013b  */
    /* JADX WARN: Type inference failed for: r0v10, types: [kqj] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kzq] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        kzr kzrVar;
        long j;
        boolean z;
        Object f;
        Throwable th;
        Object obj2;
        ajn ajnVar;
        int length;
        boolean z2;
        Object f2;
        ?? r0;
        ksu ksuVar;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                kqp kqpVar = kqp.a;
                if (this.a != 0) {
                    kqj kqjVar = (kqj) this.e;
                    ixc.Y(obj);
                    f2 = obj;
                    r0 = kqjVar;
                } else {
                    ixc.Y(obj);
                    kql kqlVar = ((kvm) this.e).bV().get(kqk.b);
                    kqlVar.getClass();
                    Object obj3 = this.b;
                    kqk kqkVar = (kqk) kqlVar;
                    kqn plus = kqkVar.plus(new ake(kqkVar));
                    kqn plus2 = plus.plus(new lde(plus, ((ajw) obj3).f));
                    Object obj4 = this.d;
                    ?? r5 = this.c;
                    this.e = obj4;
                    this.a = 1;
                    f2 = ixg.f(plus2, r5, this);
                    if (f2 == kqpVar) {
                        return kqpVar;
                    }
                    r0 = obj4;
                }
                r0.ca(f2);
                return kow.a;
            }
            kqp kqpVar2 = kqp.a;
            if (this.a != 0) {
                ksuVar = (ksu) this.e;
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                kzr kzrVar2 = (kzr) this.e;
                ksu ksuVar2 = new ksu();
                ?? r52 = this.d;
                knf knfVar = new knf(ksuVar2, kzrVar2, this.b, 1);
                this.e = ksuVar2;
                this.a = 1;
                if (r52.a(knfVar, this) == kqpVar2) {
                    return kqpVar2;
                }
                ksuVar = ksuVar2;
            }
            if (ksuVar.a) {
                return kow.a;
            }
            Object obj5 = this.c;
            Object obj6 = this.b;
            throw new kbr(kbq.k.e("Expected one " + ((String) obj5) + " for " + obj6 + " but received none"));
        }
        kqp kqpVar3 = kqp.a;
        int i2 = this.a;
        if (i2 == 0) {
            ixc.Y(obj);
            kzrVar = (kzr) this.e;
            Object obj7 = this.b;
            Object obj8 = this.c;
            ajn ajnVar2 = ((akt) obj7).e;
            ajnVar2.a.lock();
            try {
                int length2 = ((int[]) obj8).length;
                boolean z3 = false;
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = ((int[]) obj8)[i3];
                    long[] jArr = ajnVar2.b;
                    long j2 = jArr[i4];
                    jArr[i4] = j2 + 1;
                    if (j2 == 0) {
                        ajnVar2.d = true;
                        z3 = true;
                    }
                }
                j = 1;
                if (!z3 && !ajnVar2.d) {
                    if (!ajnVar2.f) {
                        z = false;
                        if (z) {
                            Object obj9 = this.b;
                            this.e = kzrVar;
                            this.a = 1;
                            f = abf.f(((akt) obj9).a, this);
                        }
                        ksw kswVar = new ksw();
                        brn brnVar = ((akt) this.b).g;
                        akk akkVar = new akk(kswVar, kzrVar, (String[]) this.d, (int[]) this.c);
                        this.e = null;
                        this.a = 3;
                    }
                }
                z = true;
                if (z) {
                }
                ksw kswVar2 = new ksw();
                brn brnVar2 = ((akt) this.b).g;
                akk akkVar2 = new akk(kswVar2, kzrVar, (String[]) this.d, (int[]) this.c);
                this.e = null;
                this.a = 3;
            } finally {
            }
        } else if (i2 == 1) {
            kzrVar = (kzr) this.e;
            ixc.Y(obj);
            f = obj;
            j = 1;
            aki akiVar = new aki((akt) this.b, (kqj) null, 0);
            this.e = kzrVar;
            this.a = 2;
        } else {
            if (i2 != 2) {
                try {
                    ixc.Y(obj);
                    j = 1;
                    throw new koh();
                } catch (Throwable th2) {
                    th = th2;
                    j = 1;
                    Object obj10 = this.b;
                    obj2 = this.c;
                    ajnVar = ((akt) obj10).e;
                    ajnVar.a.lock();
                    length = ((int[]) obj2).length;
                    z2 = false;
                    while (r8 < length) {
                    }
                    if (!z2) {
                        boolean z4 = ajnVar.f;
                    }
                    throw th;
                }
            }
            kzrVar = (kzr) this.e;
            ixc.Y(obj);
            j = 1;
            try {
                ksw kswVar22 = new ksw();
                brn brnVar22 = ((akt) this.b).g;
                akk akkVar22 = new akk(kswVar22, kzrVar, (String[]) this.d, (int[]) this.c);
                this.e = null;
                this.a = 3;
            } catch (Throwable th3) {
                th = th3;
                Object obj102 = this.b;
                obj2 = this.c;
                ajnVar = ((akt) obj102).e;
                ajnVar.a.lock();
                try {
                    length = ((int[]) obj2).length;
                    z2 = false;
                    for (int i5 = 0; i5 < length; i5++) {
                        int i6 = ((int[]) obj2)[i5];
                        long[] jArr2 = ajnVar.b;
                        long j3 = jArr2[i6];
                        jArr2[i6] = (-1) + j3;
                        if (j3 == j) {
                            ajnVar.d = true;
                            z2 = true;
                        }
                    }
                    if (!z2 && !ajnVar.d) {
                        boolean z42 = ajnVar.f;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kuv] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, krx] */
    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.b;
            akt aktVar = (akt) obj2;
            akl aklVar = new akl(aktVar, (int[]) this.c, (String[]) this.d, kqjVar, 0);
            aklVar.e = obj;
            return aklVar;
        }
        if (i != 1) {
            akl aklVar2 = new akl(this.d, this.b, kqjVar, 2);
            aklVar2.e = obj;
            return aklVar2;
        }
        akl aklVar3 = new akl((ajw) this.b, (kuv) this.d, (krx) this.c, kqjVar, 1);
        aklVar3.e = obj;
        return aklVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akl(akt aktVar, int[] iArr, String[] strArr, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.f = i;
        this.b = aktVar;
        this.c = iArr;
        this.d = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akl(ajw ajwVar, kuv kuvVar, krx krxVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.f = i;
        this.b = ajwVar;
        this.d = kuvVar;
        this.c = krxVar;
    }
}
