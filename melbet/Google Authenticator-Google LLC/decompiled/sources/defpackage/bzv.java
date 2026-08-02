package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bzv extends kqw {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzw c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzv(bzw bzwVar, kqj kqjVar) {
        super(kqjVar);
        this.c = bzwVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
