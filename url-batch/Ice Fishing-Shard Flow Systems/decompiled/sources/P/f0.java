package P;

import v6.InterfaceC0979a;

/* loaded from: classes.dex */
public final class f0 extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public P0.n f2080d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0979a f2081e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2082i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P0.n f2083l;

    /* renamed from: m, reason: collision with root package name */
    public int f2084m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(P0.n nVar, X5.c cVar) {
        super(cVar);
        this.f2083l = nVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2082i = obj;
        this.f2084m |= Integer.MIN_VALUE;
        return this.f2083l.i(this);
    }
}
