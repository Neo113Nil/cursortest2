package defpackage;

/* loaded from: classes2.dex */
public final class kzv extends kqw {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    final /* synthetic */ kni d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzv(kni kniVar, kqj kqjVar) {
        super(kqjVar);
        this.d = kniVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
