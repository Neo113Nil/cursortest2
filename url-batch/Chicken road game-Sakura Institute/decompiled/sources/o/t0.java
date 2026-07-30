package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public long f6743f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m4.z f6745h;

    /* renamed from: i, reason: collision with root package name */
    public int f6746i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(m4.z zVar, j6.c cVar) {
        super(cVar);
        this.f6745h = zVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f6744g = obj;
        this.f6746i |= Integer.MIN_VALUE;
        return this.f6745h.a(0L, 0L, this);
    }
}
