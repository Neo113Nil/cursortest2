package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class alb extends kra implements krt {
    final /* synthetic */ ald a;
    final /* synthetic */ String b;
    final /* synthetic */ krt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alb(ald aldVar, String str, krt krtVar, kqj kqjVar) {
        super(1, kqjVar);
        this.a = aldVar;
        this.b = str;
        this.c = krtVar;
    }

    @Override // defpackage.krt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new alb(this.a, this.b, this.c, (kqj) obj).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        ixc.Y(obj);
        ana anaVar = this.a.a;
        String str = this.b;
        krt krtVar = this.c;
        amh a = anaVar.a(str);
        try {
            Object a2 = krtVar.a(a);
            ixf.i(a, null);
            return a2;
        } finally {
        }
    }
}
