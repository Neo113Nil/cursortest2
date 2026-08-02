package B0;

/* renamed from: B0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040s extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f184h;

    /* renamed from: i, reason: collision with root package name */
    public int f185i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f186j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040s(t tVar, H0.d dVar) {
        super(dVar);
        this.f186j = tVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f184h = obj;
        this.f185i |= Integer.MIN_VALUE;
        return this.f186j.a(null, this);
    }
}
