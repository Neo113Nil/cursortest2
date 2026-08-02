package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dsw extends kra implements krt {
    int a;
    final /* synthetic */ dtd b;
    final /* synthetic */ cid c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsw(dtd dtdVar, cid cidVar, String str, boolean z, kqj kqjVar) {
        super(1, kqjVar);
        this.b = dtdVar;
        this.c = cidVar;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.krt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new dsw(this.b, this.c, this.d, this.e, (kqj) obj).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        kqp kqpVar = kqp.a;
        int i = this.a;
        ixc.Y(obj);
        if (i == 0) {
            ddi d = this.b.l.d(new cie(this.c, ixc.b(this.d)));
            this.a = 1;
            obj = jav.i(d, this);
            if (obj == kqpVar) {
                return kqpVar;
            }
        }
        Integer num = (Integer) obj;
        return Boolean.valueOf((num == null || num.intValue() != 1) ? (num != null && num.intValue() == 2) ? false : this.e : true);
    }
}
