package k0;

/* loaded from: classes.dex */
public final class d extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public e f7364j;

    /* renamed from: k, reason: collision with root package name */
    public long f7365k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7366l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f7367m;

    /* renamed from: n, reason: collision with root package name */
    public int f7368n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, E2.c cVar) {
        super(cVar);
        this.f7367m = eVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f7366l = obj;
        this.f7368n |= Integer.MIN_VALUE;
        return this.f7367m.E0(0L, this);
    }
}
