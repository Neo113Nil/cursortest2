package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kyn extends kqw {
    /* synthetic */ Object a;
    final /* synthetic */ kyo b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyn(kyo kyoVar, kqj kqjVar) {
        super(kqjVar);
        this.b = kyoVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object g = this.b.g(null, 0, 0L, this);
        return g == kqp.a ? g : new kyw(g);
    }
}
