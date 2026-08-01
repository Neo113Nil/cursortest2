package z4;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public l f10765d;

    /* renamed from: e, reason: collision with root package name */
    public String f10766e;

    /* renamed from: i, reason: collision with root package name */
    public String[] f10767i;

    /* renamed from: r, reason: collision with root package name */
    public int f10768r;

    /* renamed from: s, reason: collision with root package name */
    public int f10769s;

    /* renamed from: t, reason: collision with root package name */
    public int f10770t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f10771u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n0 f10772v;

    /* renamed from: w, reason: collision with root package name */
    public int f10773w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, nd.c cVar) {
        super(cVar);
        this.f10772v = n0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10771u = obj;
        this.f10773w |= Integer.MIN_VALUE;
        return n0.c(this.f10772v, null, 0, this);
    }
}
