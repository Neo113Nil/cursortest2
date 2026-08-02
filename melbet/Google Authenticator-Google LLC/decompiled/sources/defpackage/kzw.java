package defpackage;

/* loaded from: classes2.dex */
public final class kzw extends kqw {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public lbe d;
    final /* synthetic */ kni e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzw(kni kniVar, kqj kqjVar) {
        super(kqjVar);
        this.e = kniVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
