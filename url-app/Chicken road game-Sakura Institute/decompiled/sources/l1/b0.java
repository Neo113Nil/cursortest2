package l1;

import c7.m1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public m1 f5774f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f5776h;

    /* renamed from: i, reason: collision with root package name */
    public int f5777i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, j6.a aVar) {
        super(aVar);
        this.f5776h = c0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f5775g = obj;
        this.f5777i |= Integer.MIN_VALUE;
        return this.f5776h.f(0L, null, this);
    }
}
