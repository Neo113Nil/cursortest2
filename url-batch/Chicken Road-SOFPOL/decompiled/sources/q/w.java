package q;

import r.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f5924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p6.c f5925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f5926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0 f5927h;
    public final /* synthetic */ u0.c i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5928j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l1 l1Var, p6.c cVar, m0 m0Var, n0 n0Var, u0.c cVar2, int i) {
        super(2);
        this.f5924e = l1Var;
        this.f5925f = cVar;
        this.f5926g = m0Var;
        this.f5927h = n0Var;
        this.i = cVar2;
        this.f5928j = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        androidx.compose.animation.b.c(this.f5924e, this.f5925f, this.f5926g, this.f5927h, this.i, (m0.s) obj, m0.b.w(this.f5928j | 1));
        return c6.m.f1757a;
    }
}
