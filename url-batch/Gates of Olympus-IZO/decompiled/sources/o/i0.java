package o;

/* loaded from: classes.dex */
public final class i0 extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public Z1.s f6538d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f6540f;

    /* renamed from: g, reason: collision with root package name */
    public int f6541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(o0 o0Var, R1.c cVar) {
        super(cVar);
        this.f6540f = o0Var;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6539e = obj;
        this.f6541g |= Integer.MIN_VALUE;
        return this.f6540f.b(0L, this);
    }
}
