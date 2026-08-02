package K;

import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class c0 extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public B0.p f746d;

    /* renamed from: e, reason: collision with root package name */
    public B2.a f747e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ B0.p f748g;

    /* renamed from: h, reason: collision with root package name */
    public int f749h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(B0.p pVar, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f748g = pVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f = obj;
        this.f749h |= Integer.MIN_VALUE;
        return this.f748g.g(this);
    }
}
