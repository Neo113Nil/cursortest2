package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class asl extends kra implements krx {
    int a;
    final /* synthetic */ krx b;
    final /* synthetic */ rm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asl(krx krxVar, rm rmVar, kqj kqjVar) {
        super(2, kqjVar);
        this.b = krxVar;
        this.c = rmVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asl) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        kqp kqpVar = kqp.a;
        try {
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                kvm kvmVar = (kvm) this.d;
                krx krxVar = this.b;
                this.a = 1;
                obj = krxVar.a(kvmVar, this);
                if (obj == kqpVar) {
                    return kqpVar;
                }
            }
            this.c.c(obj);
        } catch (CancellationException unused) {
            rm rmVar = this.c;
            rmVar.d = true;
            rq rqVar = rmVar.b;
            if (rqVar != null && rqVar.b.cancel(true)) {
                rmVar.b();
            }
        } catch (Throwable th) {
            this.c.d(th);
        }
        return kow.a;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        asl aslVar = new asl(this.b, this.c, kqjVar);
        aslVar.d = obj;
        return aslVar;
    }
}
