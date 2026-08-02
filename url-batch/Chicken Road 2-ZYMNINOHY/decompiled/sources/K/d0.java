package K;

/* loaded from: classes.dex */
public final class d0 extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f1341a;

    /* renamed from: b, reason: collision with root package name */
    public F3.d f1342b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f1344d;

    /* renamed from: e, reason: collision with root package name */
    public int f1345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, h3.c cVar) {
        super(cVar);
        this.f1344d = g0Var;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1343c = obj;
        this.f1345e |= Integer.MIN_VALUE;
        return this.f1344d.b(null, this);
    }
}
