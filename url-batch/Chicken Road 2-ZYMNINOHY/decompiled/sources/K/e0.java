package K;

/* loaded from: classes.dex */
public final class e0 extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public F3.d f1350a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1351b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1352c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f1353d;

    /* renamed from: e, reason: collision with root package name */
    public int f1354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, h3.c cVar) {
        super(cVar);
        this.f1353d = g0Var;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1352c = obj;
        this.f1354e |= Integer.MIN_VALUE;
        return this.f1353d.c(null, this);
    }
}
