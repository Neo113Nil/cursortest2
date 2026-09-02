package K;

/* loaded from: classes.dex */
public final class T extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public U f1303a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1304b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1305c;

    /* renamed from: d, reason: collision with root package name */
    public W f1306d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U f1308f;

    /* renamed from: g, reason: collision with root package name */
    public int f1309g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u4, h3.c cVar) {
        super(cVar);
        this.f1308f = u4;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1307e = obj;
        this.f1309g |= Integer.MIN_VALUE;
        return this.f1308f.b(null, this);
    }
}
