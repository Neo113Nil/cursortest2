package r;

import m.p0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public s f7664f;

    /* renamed from: g, reason: collision with root package name */
    public p0 f7665g;

    /* renamed from: h, reason: collision with root package name */
    public j6.i f7666h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7667i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f7668j;

    /* renamed from: k, reason: collision with root package name */
    public int f7669k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, j6.c cVar) {
        super(cVar);
        this.f7668j = sVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f7667i = obj;
        this.f7669k |= Integer.MIN_VALUE;
        return this.f7668j.b(null, null, this);
    }
}
