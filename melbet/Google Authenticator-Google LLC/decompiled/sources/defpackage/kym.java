package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kym extends kqw {
    /* synthetic */ Object a;
    final /* synthetic */ kyo b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kym(kyo kyoVar, kqj kqjVar) {
        super(kqjVar);
        this.b = kyoVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object f = kyo.f(this.b, this);
        return f == kqp.a ? f : new kyw(f);
    }
}
