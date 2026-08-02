package K;

/* loaded from: classes.dex */
public final class a0 extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public G1.c f1326a;

    /* renamed from: b, reason: collision with root package name */
    public F3.a f1327b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G1.c f1329d;

    /* renamed from: e, reason: collision with root package name */
    public int f1330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(G1.c cVar, h3.c cVar2) {
        super(cVar2);
        this.f1329d = cVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1328c = obj;
        this.f1330e |= Integer.MIN_VALUE;
        return this.f1329d.j(this);
    }
}
