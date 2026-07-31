package h1;

/* loaded from: classes.dex */
public final class K extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public f2.s f6081g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6082h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f6083i;

    /* renamed from: j, reason: collision with root package name */
    public int f6084j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(M m3, X1.c cVar) {
        super(cVar);
        this.f6083i = m3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6082h = obj;
        this.f6084j |= Integer.MIN_VALUE;
        return this.f6083i.i(null, false, this);
    }
}
