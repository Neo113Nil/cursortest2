package i3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public i f4904f;

    /* renamed from: g, reason: collision with root package name */
    public c f4905g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4906h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4907i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f4908j;

    /* renamed from: k, reason: collision with root package name */
    public int f4909k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, j6.c cVar) {
        super(cVar);
        this.f4908j = iVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4907i = obj;
        this.f4909k |= Integer.MIN_VALUE;
        return this.f4908j.a(null, this);
    }
}
