package u0;

import d1.AbstractC0095c;

/* renamed from: u0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382u extends AbstractC0095c {
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public long f4221e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0383v f4223g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0382u(C0383v c0383v, AbstractC0095c abstractC0095c) {
        super(abstractC0095c);
        this.f4223g = c0383v;
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        this.f4222f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f4223g.e(0L, this);
    }
}
