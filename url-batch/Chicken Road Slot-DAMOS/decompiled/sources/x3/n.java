package x3;

import d2.r1;

/* loaded from: classes.dex */
public final class n extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10412d;

    /* renamed from: e, reason: collision with root package name */
    public int f10413e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r1 f10414i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r1 r1Var, ld.a aVar) {
        super(aVar);
        this.f10414i = r1Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10412d = obj;
        this.f10413e |= Integer.MIN_VALUE;
        return this.f10414i.b(null, this);
    }
}
