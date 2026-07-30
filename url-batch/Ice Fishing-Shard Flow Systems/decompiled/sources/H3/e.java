package H3;

/* loaded from: classes.dex */
public final class e extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public f f972d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f973e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f974i;

    /* renamed from: l, reason: collision with root package name */
    public int f975l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, X5.c cVar) {
        super(cVar);
        this.f974i = fVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f973e = obj;
        this.f975l |= Integer.MIN_VALUE;
        return this.f974i.a(this);
    }
}
