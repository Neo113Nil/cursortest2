package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public k f4113f;

    /* renamed from: g, reason: collision with root package name */
    public k7.a f4114g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4115h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f4116i;

    /* renamed from: j, reason: collision with root package name */
    public int f4117j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k kVar, j6.c cVar) {
        super(cVar);
        this.f4116i = kVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4115h = obj;
        this.f4117j |= Integer.MIN_VALUE;
        return this.f4116i.w(this);
    }
}
