package K;

import f2.AbstractC0326c;

/* renamed from: K.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056u extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public N f815d;

    /* renamed from: e, reason: collision with root package name */
    public B2.d f816e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f817g;

    /* renamed from: h, reason: collision with root package name */
    public int f818h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0056u(N n3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f817g = n3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f = obj;
        this.f818h |= Integer.MIN_VALUE;
        return N.b(this.f817g, this);
    }
}
