package m;

/* loaded from: classes.dex */
public final class M extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public U f6637g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6638h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U f6639i;

    /* renamed from: j, reason: collision with root package name */
    public int f6640j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(U u3, X1.c cVar) {
        super(cVar);
        this.f6639i = u3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f6638h = obj;
        this.f6640j |= Integer.MIN_VALUE;
        return U.h(this.f6639i, this);
    }
}
