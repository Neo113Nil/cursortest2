package c3;

import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class h extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public j f3782f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3783g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f3784h;

    /* renamed from: i, reason: collision with root package name */
    public int f3785i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f3784h = jVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f3783g = obj;
        this.f3785i |= Integer.MIN_VALUE;
        return j.b(this.f3784h, this);
    }
}
