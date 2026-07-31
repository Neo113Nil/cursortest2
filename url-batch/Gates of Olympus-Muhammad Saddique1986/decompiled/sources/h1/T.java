package h1;

/* loaded from: classes.dex */
public final class T extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f6117g;

    /* renamed from: h, reason: collision with root package name */
    public y2.c f6118h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6119i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W f6120j;

    /* renamed from: k, reason: collision with root package name */
    public int f6121k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(W w2, X1.c cVar) {
        super(cVar);
        this.f6120j = w2;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6119i = obj;
        this.f6121k |= Integer.MIN_VALUE;
        return this.f6120j.b(null, this);
    }
}
