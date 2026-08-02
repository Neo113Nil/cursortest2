package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehp extends kra implements krx {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehp(ekx ekxVar, kri kriVar, boolean z, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.f = i;
        this.c = ekxVar;
        this.d = kriVar;
        this.b = z;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((ehp) c((ald) obj, (kqj) obj2)).b(kow.a);
        }
        return ((ehp) c((kzd) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r8.a(r7) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kri] */
    /* JADX WARN: Type inference failed for: r5v2, types: [dqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, krt] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        ald aldVar;
        if (this.f == 0) {
            kqp kqpVar = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                kzd kzdVar = (kzd) this.e;
                boolean z = this.b;
                ?? r3 = this.d;
                eho ehoVar = new eho(z, kzdVar, r3);
                Object obj2 = this.c;
                ?? r5 = ((ekx) obj2).c;
                r5.e(ehoVar);
                if (r5.d()) {
                    kzdVar.j(r3.a());
                }
                awb awbVar = new awb(obj2, ehoVar, 11);
                this.a = 1;
                if (ixj.g(kzdVar, awbVar, this) == kqpVar) {
                    return kqpVar;
                }
            }
            return kow.a;
        }
        kqp kqpVar2 = kqp.a;
        int i = this.a;
        if (i == 0) {
            ixc.Y(obj);
            ald aldVar2 = (ald) this.e;
            aldVar2.getClass();
            return this.d.a(aldVar2.a);
        }
        if (i == 1) {
            aldVar = (ald) this.e;
            ixc.Y(obj);
            if (!((Boolean) obj).booleanValue()) {
                ajk b = ((ajw) this.c).b();
                this.e = aldVar;
                this.a = 2;
            }
        } else {
            if (i != 2) {
                Object obj3 = this.e;
                if (i != 3) {
                    ixc.Y(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        ((ajw) this.c).b().b();
                    }
                    return obj3;
                }
                aldVar = (ald) obj3;
                ixc.Y(obj);
                if (this.b) {
                    return obj;
                }
                this.e = obj;
                this.a = 4;
                Object e = aldVar.e();
                if (e != kqpVar2) {
                    obj3 = obj;
                    obj = e;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj3;
                }
                return kqpVar2;
            }
            aldVar = (ald) this.e;
            ixc.Y(obj);
        }
        aln alnVar = new aln(null, this.d, 2, null);
        this.e = aldVar;
        this.a = 3;
        obj = aldVar.d(null, alnVar, this);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kri] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, krt] */
    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        if (this.f == 0) {
            ehp ehpVar = new ehp((ekx) this.c, (kri) this.d, this.b, kqjVar, 0);
            ehpVar.e = obj;
            return ehpVar;
        }
        ehp ehpVar2 = new ehp(this.b, (ajw) this.c, kqjVar, (krt) this.d, 1);
        ehpVar2.e = obj;
        return ehpVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehp(boolean z, ajw ajwVar, kqj kqjVar, krt krtVar, int i) {
        super(2, kqjVar);
        this.f = i;
        this.b = z;
        this.c = ajwVar;
        this.d = krtVar;
    }
}
