package E3;

/* loaded from: classes.dex */
public final class h extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public j f675d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f676e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f677i;

    /* renamed from: l, reason: collision with root package name */
    public int f678l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, X5.c cVar) {
        super(cVar);
        this.f677i = jVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f676e = obj;
        this.f678l |= Integer.MIN_VALUE;
        return j.b(this.f677i, this);
    }
}
