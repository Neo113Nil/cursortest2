package K;

import f2.AbstractC0326c;

/* renamed from: K.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059x extends AbstractC0326c {

    /* renamed from: d, reason: collision with root package name */
    public N f825d;

    /* renamed from: e, reason: collision with root package name */
    public B2.d f826e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f827g;

    /* renamed from: h, reason: collision with root package name */
    public int f828h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0059x(N n3, AbstractC0326c abstractC0326c) {
        super(abstractC0326c);
        this.f827g = n3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        this.f = obj;
        this.f828h |= Integer.MIN_VALUE;
        return N.d(this.f827g, this);
    }
}
