package h1;

/* renamed from: h1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491i extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public G1.g f6153g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6154h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G1.g f6155i;

    /* renamed from: j, reason: collision with root package name */
    public int f6156j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0491i(G1.g gVar, X1.c cVar) {
        super(cVar);
        this.f6155i = gVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6154h = obj;
        this.f6156j |= Integer.MIN_VALUE;
        return this.f6155i.c(this);
    }
}
