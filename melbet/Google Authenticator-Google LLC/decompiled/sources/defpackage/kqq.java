package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqq extends kqy {
    final /* synthetic */ krx a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqq(kqj kqjVar, krx krxVar, Object obj) {
        super(kqjVar);
        this.a = krxVar;
        this.b = obj;
    }

    @Override // defpackage.kqu
    protected final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            ixc.Y(obj);
            return obj;
        }
        this.c = 1;
        ixc.Y(obj);
        krx krxVar = this.a;
        ksy.b(krxVar, 2);
        return krxVar.a(this.b, this);
    }
}
