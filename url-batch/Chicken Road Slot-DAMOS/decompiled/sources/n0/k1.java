package n0;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k1 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public Function1 f6736d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6737e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1 f6738i;

    /* renamed from: r, reason: collision with root package name */
    public int f6739r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, nd.c cVar) {
        super(cVar);
        this.f6738i = l1Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f6737e = obj;
        this.f6739r |= Integer.MIN_VALUE;
        return this.f6738i.s(null, this);
    }
}
