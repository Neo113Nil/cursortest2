package x1;

import b2.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public o f9661f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9662g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f9663h;

    /* renamed from: i, reason: collision with root package name */
    public int f9664i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, j6.c cVar) {
        super(cVar);
        this.f9663h = oVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f9662g = obj;
        this.f9664i |= Integer.MIN_VALUE;
        return this.f9663h.b(0.0f, this);
    }
}
