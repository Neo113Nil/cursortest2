package ke;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f5527d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5528e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f5529i;

    /* renamed from: r, reason: collision with root package name */
    public int f5530r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ld.a aVar) {
        super(aVar);
        this.f5529i = kVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f5528e = obj;
        this.f5530r |= Integer.MIN_VALUE;
        return this.f5529i.b(null, this);
    }
}
