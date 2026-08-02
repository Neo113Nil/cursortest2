package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akv extends kqw {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ akw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akv(akw akwVar, kqj kqjVar) {
        super(kqjVar);
        this.d = akwVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.cg(null, this);
    }
}
