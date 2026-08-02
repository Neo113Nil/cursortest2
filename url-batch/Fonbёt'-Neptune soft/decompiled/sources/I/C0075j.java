package I;

/* renamed from: I.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075j extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0079n f658h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f659i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0079n f660j;

    /* renamed from: k, reason: collision with root package name */
    public int f661k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075j(C0079n c0079n, J0.b bVar) {
        super(bVar);
        this.f660j = c0079n;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f659i = obj;
        this.f661k |= Integer.MIN_VALUE;
        return this.f660j.c(this);
    }
}
