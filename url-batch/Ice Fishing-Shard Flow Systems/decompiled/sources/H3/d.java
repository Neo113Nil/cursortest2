package H3;

import P0.l;

/* loaded from: classes.dex */
public final class d extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public l f967d;

    /* renamed from: e, reason: collision with root package name */
    public C4.b f968e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f969i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f970l;

    /* renamed from: m, reason: collision with root package name */
    public int f971m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, X5.c cVar) {
        super(cVar);
        this.f970l = lVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f969i = obj;
        this.f971m |= Integer.MIN_VALUE;
        return this.f970l.d(null, null, this);
    }
}
