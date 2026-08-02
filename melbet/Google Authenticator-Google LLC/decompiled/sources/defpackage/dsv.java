package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dsv extends kra implements krt {
    int a;
    final /* synthetic */ dtd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsv(dtd dtdVar, kqj kqjVar) {
        super(1, kqjVar);
        this.b = dtdVar;
    }

    @Override // defpackage.krt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new dsv(this.b, (kqj) obj).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        kqp kqpVar = kqp.a;
        int i = this.a;
        ixc.Y(obj);
        if (i == 0) {
            dtd dtdVar = this.b;
            ggb a = chy.a();
            a.i("com.google");
            ddi b = dtdVar.l.b(a.h());
            this.a = 1;
            obj = jav.i(b, this);
            if (obj == kqpVar) {
                return kqpVar;
            }
        }
        List list = ((chz) obj).a;
        list.getClass();
        return list;
    }
}
