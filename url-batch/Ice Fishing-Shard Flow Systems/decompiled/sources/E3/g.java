package E3;

/* loaded from: classes.dex */
public final class g extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f673e;

    /* renamed from: i, reason: collision with root package name */
    public int f674i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, X5.c cVar) {
        super(cVar);
        this.f673e = jVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f672d = obj;
        this.f674i |= Integer.MIN_VALUE;
        return j.a(this.f673e, this);
    }
}
