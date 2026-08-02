package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dtc extends kra implements krx {
    Object a;
    Object b;
    Object c;
    Object d;
    boolean e;
    int f;
    final /* synthetic */ dtd g;
    final /* synthetic */ boolean h;
    final /* synthetic */ cid i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtc(dtd dtdVar, boolean z, cid cidVar, kqj kqjVar) {
        super(2, kqjVar);
        this.g = dtdVar;
        this.h = z;
        this.i = cidVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtc) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0173, code lost:
    
        if (r4 != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e4, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013f  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v9, types: [kvs] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v8, types: [kvs] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kvs] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v8, types: [kvs] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v7, types: [kvs] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        kvm kvmVar;
        boolean z;
        kvs g;
        Boolean bool;
        Object b;
        ?? a;
        Boolean bool2;
        Object obj2;
        Object b2;
        Object obj3;
        Object obj4;
        Boolean bool3;
        Object obj5;
        Object obj6;
        Object obj7;
        ?? r9;
        Boolean bool4;
        Boolean bool5;
        Object b3;
        Object obj8;
        Object obj9;
        ?? r12;
        Object obj10;
        Object obj11;
        Boolean bool6;
        Boolean bool7;
        Object b4;
        Object obj12;
        Object obj13;
        Object obj14;
        ?? r6;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Object b5;
        Object obj15;
        Object obj16;
        ?? r11;
        Boolean bool11;
        Object b6;
        Boolean bool12;
        Object obj17;
        kqp kqpVar = kqp.a;
        int i = this.f;
        if (i == 0) {
            ixc.Y(obj);
            kvmVar = (kvm) this.j;
            dtd dtdVar = this.g;
            boolean z2 = this.h;
            boolean j = dtdVar.m.j();
            if (z2 || j) {
                z = j;
                g = ixg.g(kvmVar, new alg(dtdVar, this.i, (kqj) null, 7, (short[]) null));
            } else {
                z = j;
                g = null;
            }
            if (g != null) {
                this.j = kvmVar;
                this.e = z;
                this.f = 1;
                b = g.b(this);
            } else {
                bool = null;
                boolean z3 = z;
                kvm kvmVar2 = kvmVar;
                if (!this.h && !z3) {
                    bool = null;
                }
                dtb dtbVar = new dtb(z3, kvmVar2, this.g, this.i, 0);
                a = dtbVar.a(dtd.e);
                Object a2 = dtbVar.a(dtd.f);
                Object a3 = dtbVar.a(dtd.g);
                Object a4 = dtbVar.a(dtd.h);
                Object a5 = dtbVar.a(dtd.i);
                if (a == 0) {
                    this.j = bool;
                    this.a = a2;
                    this.b = a3;
                    this.c = a4;
                    this.d = a5;
                    this.f = 2;
                    b2 = a.b(this);
                    if (b2 != kqpVar) {
                        Boolean bool13 = bool;
                        obj3 = a2;
                        obj4 = a3;
                        bool3 = bool13;
                        obj5 = a4;
                        obj9 = a5;
                        bool2 = (Boolean) b2;
                        Boolean bool14 = bool3;
                        obj6 = obj4;
                        r9 = obj3;
                        bool = bool14;
                        obj2 = obj5;
                        obj7 = obj9;
                        if (r9 != 0) {
                        }
                    }
                    return kqpVar;
                }
                bool2 = null;
                obj2 = a4;
                r9 = a2;
                obj7 = a5;
                obj6 = a3;
                if (r9 != 0) {
                }
            }
        } else if (i == 1) {
            z = this.e;
            kvmVar = (kvm) this.j;
            ixc.Y(obj);
            b = obj;
        } else if (i == 2) {
            kvs kvsVar = (kvs) this.d;
            kvs kvsVar2 = (kvs) this.c;
            obj4 = (kvs) this.b;
            obj3 = (kvs) this.a;
            Boolean bool15 = (Boolean) this.j;
            ixc.Y(obj);
            bool3 = bool15;
            obj9 = kvsVar;
            b2 = obj;
            obj5 = kvsVar2;
            bool2 = (Boolean) b2;
            Boolean bool142 = bool3;
            obj6 = obj4;
            r9 = obj3;
            bool = bool142;
            obj2 = obj5;
            obj7 = obj9;
            if (r9 != 0) {
                this.j = bool;
                this.a = obj6;
                this.b = obj2;
                this.c = obj7;
                this.d = bool2;
                this.f = 3;
                b3 = r9.b(this);
                if (b3 != kqpVar) {
                    obj8 = obj6;
                    obj13 = obj2;
                    obj12 = obj7;
                    Boolean bool16 = (Boolean) b3;
                    bool4 = bool2;
                    bool5 = bool16;
                    r12 = obj8;
                    obj11 = obj13;
                    obj10 = obj12;
                    bool6 = bool;
                    if (r12 != 0) {
                    }
                }
                return kqpVar;
            }
            bool4 = bool2;
            bool5 = null;
            obj11 = obj2;
            obj10 = obj7;
            r12 = obj6;
            bool6 = bool;
            if (r12 != 0) {
            }
        } else if (i == 3) {
            bool2 = (Boolean) this.d;
            kvs kvsVar3 = (kvs) this.c;
            kvs kvsVar4 = (kvs) this.b;
            obj8 = (kvs) this.a;
            bool = (Boolean) this.j;
            ixc.Y(obj);
            obj12 = kvsVar3;
            b3 = obj;
            obj13 = kvsVar4;
            Boolean bool162 = (Boolean) b3;
            bool4 = bool2;
            bool5 = bool162;
            r12 = obj8;
            obj11 = obj13;
            obj10 = obj12;
            bool6 = bool;
            if (r12 != 0) {
                this.j = bool6;
                this.a = obj11;
                this.b = obj10;
                this.c = bool4;
                this.d = bool5;
                this.f = 4;
                b4 = r12.b(this);
                obj16 = obj11;
                obj15 = obj10;
            } else {
                bool7 = null;
                r6 = obj11;
                obj14 = obj10;
                if (r6 == 0) {
                }
            }
        } else if (i != 4) {
            bool7 = (Boolean) this.d;
            if (i != 5) {
                bool12 = (Boolean) this.c;
                bool5 = (Boolean) this.b;
                bool8 = (Boolean) this.a;
                Boolean bool17 = (Boolean) this.j;
                ixc.Y(obj);
                bool10 = bool17;
                b6 = obj;
                bool11 = (Boolean) b6;
                bool9 = bool7;
                bool7 = bool12;
                if (ksp.b(bool11, true)) {
                    return jho.f;
                }
                if (ksp.b(bool9, true)) {
                    return jho.e;
                }
                if (ksp.b(bool7, true)) {
                    return jho.d;
                }
                if (ksp.b(bool5, true)) {
                    return jho.c;
                }
                if (ksp.b(bool8, true) || ksp.b(bool10, true)) {
                    return jho.b;
                }
                if (ksp.b(bool10, false)) {
                    return jho.a;
                }
                return null;
            }
            bool5 = (Boolean) this.c;
            Boolean bool18 = (Boolean) this.b;
            kvs kvsVar5 = (kvs) this.a;
            bool10 = (Boolean) this.j;
            ixc.Y(obj);
            obj17 = kvsVar5;
            bool4 = bool18;
            b5 = obj;
            Boolean bool19 = bool4;
            bool9 = (Boolean) b5;
            bool8 = bool19;
            r11 = obj17;
            if (r11 != 0) {
                this.j = bool10;
                this.a = bool8;
                this.b = bool5;
                this.c = bool7;
                this.d = bool9;
                this.f = 6;
                b6 = r11.b(this);
                if (b6 != kqpVar) {
                    bool12 = bool7;
                    bool7 = bool9;
                    bool11 = (Boolean) b6;
                    bool9 = bool7;
                    bool7 = bool12;
                    if (ksp.b(bool11, true)) {
                    }
                }
                return kqpVar;
            }
            bool11 = null;
            if (ksp.b(bool11, true)) {
            }
        } else {
            bool5 = (Boolean) this.d;
            Boolean bool20 = (Boolean) this.c;
            kvs kvsVar6 = (kvs) this.b;
            kvs kvsVar7 = (kvs) this.a;
            bool6 = (Boolean) this.j;
            ixc.Y(obj);
            obj15 = kvsVar6;
            bool4 = bool20;
            b4 = obj;
            obj16 = kvsVar7;
            bool7 = (Boolean) b4;
            r6 = obj16;
            obj14 = obj15;
            if (r6 == 0) {
                this.j = bool6;
                this.a = obj14;
                this.b = bool4;
                this.c = bool5;
                this.d = bool7;
                this.f = 5;
                b5 = r6.b(this);
                if (b5 != kqpVar) {
                    bool10 = bool6;
                    obj17 = obj14;
                    Boolean bool192 = bool4;
                    bool9 = (Boolean) b5;
                    bool8 = bool192;
                    r11 = obj17;
                    if (r11 != 0) {
                    }
                }
                return kqpVar;
            }
            bool8 = bool4;
            bool9 = null;
            bool10 = bool6;
            r11 = obj14;
            if (r11 != 0) {
            }
        }
        bool = (Boolean) b;
        boolean z32 = z;
        kvm kvmVar22 = kvmVar;
        if (!this.h) {
            bool = null;
        }
        dtb dtbVar2 = new dtb(z32, kvmVar22, this.g, this.i, 0);
        a = dtbVar2.a(dtd.e);
        Object a22 = dtbVar2.a(dtd.f);
        Object a32 = dtbVar2.a(dtd.g);
        Object a42 = dtbVar2.a(dtd.h);
        Object a52 = dtbVar2.a(dtd.i);
        if (a == 0) {
        }
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        dtc dtcVar = new dtc(this.g, this.h, this.i, kqjVar);
        dtcVar.j = obj;
        return dtcVar;
    }
}
