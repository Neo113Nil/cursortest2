package K;

import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class A extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public N f646d;

    /* renamed from: e, reason: collision with root package name */
    public int f647e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f648g;

    /* renamed from: h, reason: collision with root package name */
    public int f649h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(N n3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f648g = n3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f = obj;
        this.f649h |= Integer.MIN_VALUE;
        return this.f648g.h(this);
    }
}
