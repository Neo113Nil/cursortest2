package c3;

import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class i extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public j f3786f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f3788h;

    /* renamed from: i, reason: collision with root package name */
    public int f3789i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f3788h = jVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f3787g = obj;
        this.f3789i |= Integer.MIN_VALUE;
        return this.f3788h.c(this);
    }
}
