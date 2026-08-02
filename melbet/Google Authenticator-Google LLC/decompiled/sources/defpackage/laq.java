package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class laq extends kra implements krx {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laq(kvc kvcVar, krx krxVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.e = i;
        this.c = kvcVar;
        this.b = krxVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((laq) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        return ((laq) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kzr] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, krx] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        Throwable th;
        Object obj2;
        Throwable a;
        if (this.e == 0) {
            kqp kqpVar = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                kvm kvmVar = (kvm) this.d;
                ?? r2 = this.b;
                kzf e = ((lar) this.c).e(kvmVar);
                this.a = 1;
                if (ixj.f(r2, e, true, this) == kqpVar) {
                    return kqpVar;
                }
            }
            return kow.a;
        }
        kqp kqpVar2 = kqp.a;
        if (this.a != 0) {
            obj2 = (kvc) this.d;
            try {
                ixc.Y(obj);
            } catch (Throwable th2) {
                th = th2;
                obj = ixc.X(th);
                a = kon.a(obj);
                if (a == null) {
                }
                return kow.a;
            }
        } else {
            ixc.Y(obj);
            kvm kvmVar2 = (kvm) this.d;
            Object obj3 = this.c;
            ?? r3 = this.b;
            try {
                this.d = obj3;
                this.a = 1;
                obj = r3.a(kvmVar2, this);
                if (obj == kqpVar2) {
                    return kqpVar2;
                }
                obj2 = obj3;
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj3;
                obj = ixc.X(th);
                a = kon.a(obj);
                if (a == null) {
                }
                return kow.a;
            }
        }
        a = kon.a(obj);
        if (a == null) {
            ((kxb) obj2).Q(obj);
        } else {
            ((kxb) obj2).Q(new kve(a, false));
        }
        return kow.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kzr] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, krx] */
    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        if (this.e == 0) {
            laq laqVar = new laq((kzr) this.b, (lar) this.c, kqjVar, 0);
            laqVar.d = obj;
            return laqVar;
        }
        laq laqVar2 = new laq((kvc) this.c, (krx) this.b, kqjVar, 1);
        laqVar2.d = obj;
        return laqVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laq(kzr kzrVar, lar larVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.e = i;
        this.b = kzrVar;
        this.c = larVar;
    }
}
