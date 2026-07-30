package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public f f6134f;

    /* renamed from: g, reason: collision with root package name */
    public long f6135g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6136h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f6137i;

    /* renamed from: j, reason: collision with root package name */
    public int f6138j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, j6.c cVar) {
        super(cVar);
        this.f6137i = fVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f6136h = obj;
        this.f6138j |= Integer.MIN_VALUE;
        return this.f6137i.c(0L, null, this);
    }
}
