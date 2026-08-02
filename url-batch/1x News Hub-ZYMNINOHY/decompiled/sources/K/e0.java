package K;

import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class e0 extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public Object f757d;

    /* renamed from: e, reason: collision with root package name */
    public B2.d f758e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h0 f759g;

    /* renamed from: h, reason: collision with root package name */
    public int f760h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f759g = h0Var;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f = obj;
        this.f760h |= Integer.MIN_VALUE;
        return this.f759g.b(null, this);
    }
}
