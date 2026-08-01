package u0;

import d1.AbstractC0095c;

/* renamed from: u0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379r extends AbstractC0095c {
    public C0383v d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0383v f4208f;

    /* renamed from: g, reason: collision with root package name */
    public int f4209g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0379r(C0383v c0383v, AbstractC0095c abstractC0095c) {
        super(abstractC0095c);
        this.f4208f = c0383v;
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        this.f4207e = obj;
        this.f4209g |= Integer.MIN_VALUE;
        return this.f4208f.b(this);
    }
}
