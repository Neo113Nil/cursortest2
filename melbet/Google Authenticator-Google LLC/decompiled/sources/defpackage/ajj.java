package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajj extends kra implements kry {
    final /* synthetic */ ajk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajj(ajk ajkVar, kqj kqjVar) {
        super(3, kqjVar);
        this.a = ajkVar;
    }

    @Override // defpackage.kry
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new ajj(this.a, (kqj) obj3).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        ixc.Y(obj);
        this.a.e.decrementAndGet();
        return kow.a;
    }
}
