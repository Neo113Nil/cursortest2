package M;

import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class g0 extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public Object f1686a;

    /* renamed from: b, reason: collision with root package name */
    public L4.d f1687b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1688c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f1689d;

    /* renamed from: e, reason: collision with root package name */
    public int f1690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1689d = j0Var;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1688c = obj;
        this.f1690e |= Integer.MIN_VALUE;
        return this.f1689d.b(null, this);
    }
}
