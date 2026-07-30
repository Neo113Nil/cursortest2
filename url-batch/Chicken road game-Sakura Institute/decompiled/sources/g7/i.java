package g7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public j f4492f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4493g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4494h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f4495i;

    /* renamed from: j, reason: collision with root package name */
    public int f4496j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, h6.d dVar) {
        super(dVar);
        this.f4495i = jVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4494h = obj;
        this.f4496j |= Integer.MIN_VALUE;
        return this.f4495i.k(null, this);
    }
}
