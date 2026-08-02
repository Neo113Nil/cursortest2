package K;

/* loaded from: classes.dex */
public final class r extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1406a;

    /* renamed from: b, reason: collision with root package name */
    public int f1407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A3.q f1408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(A3.q qVar, h3.c cVar) {
        super(cVar);
        this.f1408c = qVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1406a = obj;
        this.f1407b |= Integer.MIN_VALUE;
        return this.f1408c.emit(null, this);
    }
}
