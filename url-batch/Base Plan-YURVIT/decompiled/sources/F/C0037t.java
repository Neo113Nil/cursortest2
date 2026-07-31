package F;

/* renamed from: F.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037t extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f427h;

    /* renamed from: i, reason: collision with root package name */
    public int f428i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B0.D f429j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037t(B0.D d2, I0.b bVar) {
        super(bVar);
        this.f429j = d2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f427h = obj;
        this.f428i |= Integer.MIN_VALUE;
        return this.f429j.a(null, this);
    }
}
