package n2;

/* renamed from: n2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706l extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6352d;

    /* renamed from: e, reason: collision with root package name */
    public int f6353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G.d f6354f;

    /* renamed from: g, reason: collision with root package name */
    public G.d f6355g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0701g f6356h;

    /* renamed from: i, reason: collision with root package name */
    public o2.s f6357i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0706l(G.d dVar, P1.d dVar2) {
        super(dVar2);
        this.f6354f = dVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6352d = obj;
        this.f6353e |= Integer.MIN_VALUE;
        return this.f6354f.collect(null, this);
    }
}
