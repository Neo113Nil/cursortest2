package F;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028j extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0032n f379h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f380i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0032n f381j;

    /* renamed from: k, reason: collision with root package name */
    public int f382k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028j(C0032n c0032n, I0.b bVar) {
        super(bVar);
        this.f381j = c0032n;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f380i = obj;
        this.f382k |= Integer.MIN_VALUE;
        return this.f381j.d(this);
    }
}
