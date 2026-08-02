package defpackage;

/* loaded from: classes2.dex */
public final class knh extends kqw {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    final /* synthetic */ kzz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knh(kzz kzzVar, kqj kqjVar) {
        super(kqjVar);
        this.d = kzzVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.cg(null, this);
    }
}
