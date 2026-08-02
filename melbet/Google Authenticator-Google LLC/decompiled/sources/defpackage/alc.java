package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class alc extends kra implements krt {
    int a;
    final /* synthetic */ ald b;
    final /* synthetic */ akg c;
    final /* synthetic */ krx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alc(ald aldVar, akg akgVar, krx krxVar, kqj kqjVar) {
        super(1, kqjVar);
        this.b = aldVar;
        this.c = akgVar;
        this.d = krxVar;
    }

    @Override // defpackage.krt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new alc(this.b, this.c, this.d, (kqj) obj).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        kqp kqpVar = kqp.a;
        int i = this.a;
        ixc.Y(obj);
        if (i != 0) {
            return obj;
        }
        ald aldVar = this.b;
        akg akgVar = this.c;
        krx krxVar = this.d;
        this.a = 1;
        Object c = aldVar.c(akgVar, krxVar, this);
        return c == kqpVar ? kqpVar : c;
    }
}
