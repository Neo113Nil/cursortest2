package p;

/* renamed from: p.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754b0 extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public long f7643g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7644h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0756c0 f7645i;

    /* renamed from: j, reason: collision with root package name */
    public int f7646j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0754b0(C0756c0 c0756c0, X1.c cVar) {
        super(cVar);
        this.f7645i = c0756c0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f7644h = obj;
        this.f7646j |= Integer.MIN_VALUE;
        return this.f7645i.a(0L, 0L, this);
    }
}
