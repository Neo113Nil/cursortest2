package c3;

import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class g extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3779f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f3780g;

    /* renamed from: h, reason: collision with root package name */
    public int f3781h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f3780g = jVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f3779f = obj;
        this.f3781h |= Integer.MIN_VALUE;
        return j.a(this.f3780g, this);
    }
}
