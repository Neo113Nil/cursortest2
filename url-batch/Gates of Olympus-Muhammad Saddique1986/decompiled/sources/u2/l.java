package u2;

import n.C0659B;

/* loaded from: classes.dex */
public final class l extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public C0659B f9702g;

    /* renamed from: h, reason: collision with root package name */
    public Object f9703h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9704i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0659B f9705j;

    /* renamed from: k, reason: collision with root package name */
    public int f9706k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0659B c0659b, V1.d dVar) {
        super(dVar);
        this.f9705j = c0659b;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f9704i = obj;
        this.f9706k |= Integer.MIN_VALUE;
        return this.f9705j.e(null, this);
    }
}
