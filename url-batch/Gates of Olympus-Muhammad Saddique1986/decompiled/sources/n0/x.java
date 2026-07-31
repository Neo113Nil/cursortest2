package n0;

import q2.m0;

/* loaded from: classes.dex */
public final class x extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public m0 f7337g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0700A f7339i;

    /* renamed from: j, reason: collision with root package name */
    public int f7340j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0700A c0700a, X1.a aVar) {
        super(aVar);
        this.f7339i = c0700a;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f7338h = obj;
        this.f7340j |= Integer.MIN_VALUE;
        return this.f7339i.f(0L, null, this);
    }
}
