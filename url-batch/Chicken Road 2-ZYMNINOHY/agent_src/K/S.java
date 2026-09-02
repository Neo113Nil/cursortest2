package K;

/* loaded from: classes.dex */
public final class S extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public U f1297a;

    /* renamed from: b, reason: collision with root package name */
    public O f1298b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1299c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U f1301e;

    /* renamed from: f, reason: collision with root package name */
    public int f1302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u4, h3.c cVar) {
        super(cVar);
        this.f1301e = u4;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1300d = obj;
        this.f1302f |= Integer.MIN_VALUE;
        return this.f1301e.a(null, this);
    }
}
