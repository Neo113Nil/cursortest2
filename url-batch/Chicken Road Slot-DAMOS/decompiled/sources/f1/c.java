package f1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public ie.b f4040d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4041e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f4042i;

    /* renamed from: r, reason: collision with root package name */
    public int f4043r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, nd.c cVar) {
        super(cVar);
        this.f4042i = eVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f4041e = obj;
        this.f4043r |= Integer.MIN_VALUE;
        return this.f4042i.b(this);
    }
}
