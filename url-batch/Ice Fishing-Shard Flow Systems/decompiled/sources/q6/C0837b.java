package q6;

/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0837b extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public p6.q f7356d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7357e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f7358i;

    /* renamed from: l, reason: collision with root package name */
    public int f7359l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0837b(c cVar, X5.c cVar2) {
        super(cVar2);
        this.f7358i = cVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f7357e = obj;
        this.f7359l |= Integer.MIN_VALUE;
        return this.f7358i.a(null, this);
    }
}
