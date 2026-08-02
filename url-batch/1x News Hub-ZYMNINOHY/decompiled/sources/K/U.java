package K;

import f2.AbstractC0326c;

/* loaded from: classes.dex */
public final class U extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public W f718d;

    /* renamed from: e, reason: collision with root package name */
    public P f719e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f720g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ W f721h;

    /* renamed from: i, reason: collision with root package name */
    public int f722i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f721h = w3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f720g = obj;
        this.f722i |= Integer.MIN_VALUE;
        return this.f721h.a(null, this);
    }
}
