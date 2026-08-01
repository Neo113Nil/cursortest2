package b5;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public String f1102d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f1103e;

    /* renamed from: i, reason: collision with root package name */
    public i f1104i;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1105r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0 f1106s;

    /* renamed from: t, reason: collision with root package name */
    public int f1107t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, nd.c cVar) {
        super(cVar);
        this.f1106s = b0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f1105r = obj;
        this.f1107t |= Integer.MIN_VALUE;
        return this.f1106s.c(null, null, this);
    }
}
