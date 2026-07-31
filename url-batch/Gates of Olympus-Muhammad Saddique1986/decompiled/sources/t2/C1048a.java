package t2;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1048a extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public u2.y f9007g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9008h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H1.c f9009i;

    /* renamed from: j, reason: collision with root package name */
    public int f9010j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048a(H1.c cVar, V1.d dVar) {
        super(dVar);
        this.f9009i = cVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f9008h = obj;
        this.f9010j |= Integer.MIN_VALUE;
        return this.f9009i.d(null, this);
    }
}
