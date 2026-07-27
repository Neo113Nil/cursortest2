package M;

import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class h0 extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public L4.d f1697a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1698b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1699c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f1700d;

    /* renamed from: e, reason: collision with root package name */
    public int f1701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1700d = j0Var;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1699c = obj;
        this.f1701e |= Integer.MIN_VALUE;
        return this.f1700d.c(null, this);
    }
}
