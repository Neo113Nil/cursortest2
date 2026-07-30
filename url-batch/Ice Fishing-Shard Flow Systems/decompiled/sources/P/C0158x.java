package P;

import n6.C0781n;

/* renamed from: P.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158x extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f2170d;

    /* renamed from: e, reason: collision with root package name */
    public Q f2171e;

    /* renamed from: i, reason: collision with root package name */
    public C0781n f2172i;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2173l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q f2174m;

    /* renamed from: n, reason: collision with root package name */
    public int f2175n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158x(Q q4, X5.c cVar) {
        super(cVar);
        this.f2174m = q4;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2173l = obj;
        this.f2175n |= Integer.MIN_VALUE;
        return Q.c(this.f2174m, null, this);
    }
}
