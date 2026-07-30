package f7;

import d0.e1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public e1 f3511f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3512g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3513h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e1 f3514i;

    /* renamed from: j, reason: collision with root package name */
    public int f3515j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e1 e1Var, h6.d dVar) {
        super(dVar);
        this.f3514i = e1Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3513h = obj;
        this.f3515j |= Integer.MIN_VALUE;
        return this.f3514i.k(null, this);
    }
}
