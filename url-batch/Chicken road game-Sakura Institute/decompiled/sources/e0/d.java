package e0;

import a0.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2673f;

    /* renamed from: g, reason: collision with root package name */
    public int f2674g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0 f2675h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l0 l0Var, h6.d dVar) {
        super(dVar);
        this.f2675h = l0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f2673f = obj;
        this.f2674g |= Integer.MIN_VALUE;
        return this.f2675h.k(null, this);
    }
}
