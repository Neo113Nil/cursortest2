package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akz extends kqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ald c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akz(ald aldVar, kqj kqjVar) {
        super(kqjVar);
        this.c = aldVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
