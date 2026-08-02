package K;

import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class f0 extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public B2.d f762d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f763e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h0 f764g;

    /* renamed from: h, reason: collision with root package name */
    public int f765h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f764g = h0Var;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f = obj;
        this.f765h |= Integer.MIN_VALUE;
        return this.f764g.c(null, this);
    }
}
