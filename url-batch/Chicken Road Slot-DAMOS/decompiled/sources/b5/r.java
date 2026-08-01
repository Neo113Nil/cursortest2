package b5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f1175e;

    /* renamed from: i, reason: collision with root package name */
    public int f1176i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, nd.c cVar) {
        super(cVar);
        this.f1175e = uVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f1174d = obj;
        this.f1176i |= Integer.MIN_VALUE;
        return this.f1175e.a(this);
    }
}
