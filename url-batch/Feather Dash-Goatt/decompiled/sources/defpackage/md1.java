package defpackage;

/* loaded from: classes.dex */
public final class md1 extends fn {
    public /* synthetic */ Object h;
    public int i;
    public final /* synthetic */ m8 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md1(m8 m8Var, dn dnVar) {
        super(dnVar);
        this.j = m8Var;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return this.j.e(null, this);
    }
}
