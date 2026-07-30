package E3;

/* loaded from: classes.dex */
public final class n extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public String f693d;

    /* renamed from: e, reason: collision with root package name */
    public I4.i f694e;

    /* renamed from: i, reason: collision with root package name */
    public C4.b f695i;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f696l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f697m;

    /* renamed from: n, reason: collision with root package name */
    public int f698n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, X5.c cVar) {
        super(cVar);
        this.f697m = oVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f696l = obj;
        this.f698n |= Integer.MIN_VALUE;
        return this.f697m.a(null, null, null, null, null, null, this);
    }
}
