package l;

/* loaded from: classes.dex */
public final class T extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public U f7627j;

    /* renamed from: k, reason: collision with root package name */
    public Object f7628k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f7630m;

    /* renamed from: n, reason: collision with root package name */
    public int f7631n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u4, E2.c cVar) {
        super(cVar);
        this.f7630m = u4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f7629l = obj;
        this.f7631n |= Integer.MIN_VALUE;
        return U.u(this.f7630m, this);
    }
}
