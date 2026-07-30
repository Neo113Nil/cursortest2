package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4186f;

    /* renamed from: g, reason: collision with root package name */
    public int f4187g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0.y f4188h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(d0.y yVar, h6.d dVar) {
        super(dVar);
        this.f4188h = yVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4186f = obj;
        this.f4187g |= Integer.MIN_VALUE;
        return this.f4188h.k(null, this);
    }
}
