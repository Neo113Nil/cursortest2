package B0;

/* renamed from: B0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017s extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f114h;

    /* renamed from: i, reason: collision with root package name */
    public int f115i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0018t f116j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017s(C0018t c0018t, I0.b bVar) {
        super(bVar);
        this.f116j = c0018t;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f114h = obj;
        this.f115i |= Integer.MIN_VALUE;
        return this.f116j.a(null, this);
    }
}
