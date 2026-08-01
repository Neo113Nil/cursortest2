package b5;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public String f1151d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f1152e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1153i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f1154r;

    /* renamed from: s, reason: collision with root package name */
    public int f1155s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, nd.c cVar) {
        super(cVar);
        this.f1154r = oVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f1153i = obj;
        this.f1155s |= Integer.MIN_VALUE;
        return this.f1154r.c(null, null, this);
    }
}
