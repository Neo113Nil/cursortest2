package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alo extends kra implements krx {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ajw f;
    final /* synthetic */ krt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alo(boolean z, boolean z2, ajw ajwVar, kqj kqjVar, krt krtVar) {
        super(2, kqjVar);
        this.d = z;
        this.e = z2;
        this.f = ajwVar;
        this.g = krtVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alo) c((ald) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r8 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r8.a(r7) != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        ald aldVar;
        Object obj2;
        ald aldVar2;
        Object obj3;
        kqp kqpVar = kqp.a;
        int i = this.b;
        if (i == 0) {
            ixc.Y(obj);
            ald aldVar3 = (ald) this.c;
            if (!this.d) {
                aldVar3.getClass();
                return this.g.a(aldVar3.a);
            }
            boolean z = this.e;
            akg akgVar = z ? akg.a : akg.b;
            if (!z) {
                this.c = aldVar3;
                this.a = akgVar;
                this.b = 1;
                Object e = aldVar3.e();
                if (e != kqpVar) {
                    aldVar2 = aldVar3;
                    obj = e;
                    obj2 = akgVar;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    aldVar = aldVar2;
                    aln alnVar = new aln((kqj) null, this.g, 0);
                    this.c = aldVar;
                    this.a = null;
                    this.b = 3;
                    obj = aldVar.d((akg) obj2, alnVar, this);
                }
                return kqpVar;
            }
            aldVar = aldVar3;
            obj2 = akgVar;
            aln alnVar2 = new aln((kqj) null, this.g, 0);
            this.c = aldVar;
            this.a = null;
            this.b = 3;
            obj = aldVar.d((akg) obj2, alnVar2, this);
        } else if (i == 1) {
            obj2 = this.a;
            aldVar2 = (ald) this.c;
            ixc.Y(obj);
            if (!((Boolean) obj).booleanValue()) {
                ajk b = this.f.b();
                this.c = aldVar2;
                this.a = obj2;
                this.b = 2;
            }
            aldVar = aldVar2;
            aln alnVar22 = new aln((kqj) null, this.g, 0);
            this.c = aldVar;
            this.a = null;
            this.b = 3;
            obj = aldVar.d((akg) obj2, alnVar22, this);
        } else if (i != 2) {
            obj3 = this.c;
            if (i == 3) {
                aldVar = (ald) obj3;
                ixc.Y(obj);
                if (this.e) {
                    return obj;
                }
                this.c = obj;
                this.b = 4;
                Object e2 = aldVar.e();
                if (e2 != kqpVar) {
                    obj3 = obj;
                    obj = e2;
                }
                return kqpVar;
            }
            ixc.Y(obj);
        } else {
            obj2 = this.a;
            aldVar = (ald) this.c;
            ixc.Y(obj);
            aln alnVar222 = new aln((kqj) null, this.g, 0);
            this.c = aldVar;
            this.a = null;
            this.b = 3;
            obj = aldVar.d((akg) obj2, alnVar222, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            this.f.b().b();
        }
        return obj3;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        alo aloVar = new alo(this.d, this.e, this.f, kqjVar, this.g);
        aloVar.c = obj;
        return aloVar;
    }
}
