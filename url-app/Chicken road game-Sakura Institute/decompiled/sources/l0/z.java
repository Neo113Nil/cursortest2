package l0;

/* loaded from: classes.dex */
public final class z extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f7959j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0800A f7960k;

    /* renamed from: l, reason: collision with root package name */
    public int f7961l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0800A c0800a, E2.a aVar) {
        super(aVar);
        this.f7960k = c0800a;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f7959j = obj;
        this.f7961l |= Integer.MIN_VALUE;
        return this.f7960k.g(0L, null, this);
    }
}
