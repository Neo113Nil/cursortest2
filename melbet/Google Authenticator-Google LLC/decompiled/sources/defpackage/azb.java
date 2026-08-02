package defpackage;

/* loaded from: classes2.dex */
public final class azb extends kqw {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ lab c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azb(lab labVar, kqj kqjVar) {
        super(kqjVar);
        this.c = labVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.cg(null, this);
    }
}
