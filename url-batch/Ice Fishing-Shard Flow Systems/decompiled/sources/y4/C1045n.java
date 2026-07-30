package y4;

/* renamed from: y4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045n extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8604d;

    /* renamed from: e, reason: collision with root package name */
    public int f8605e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1046o f8606i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1045n(C1046o c1046o, V5.b bVar) {
        super(bVar);
        this.f8606i = c1046o;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f8604d = obj;
        this.f8605e |= Integer.MIN_VALUE;
        return this.f8606i.a(null, this);
    }
}
