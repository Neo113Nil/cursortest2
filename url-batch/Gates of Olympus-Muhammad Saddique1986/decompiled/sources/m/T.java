package m;

/* loaded from: classes.dex */
public final class T extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public U f6665g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6666h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6667i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U f6668j;

    /* renamed from: k, reason: collision with root package name */
    public int f6669k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u3, X1.c cVar) {
        super(cVar);
        this.f6668j = u3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6667i = obj;
        this.f6669k |= Integer.MIN_VALUE;
        return U.j(this.f6668j, this);
    }
}
