package p;

/* loaded from: classes.dex */
public final class G extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public C0776m0 f7515g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7516h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7517i;

    /* renamed from: j, reason: collision with root package name */
    public int f7518j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0776m0 c0776m0, X1.c cVar) {
        super(cVar);
        this.f7517i = c0776m0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f7516h = obj;
        this.f7518j |= Integer.MIN_VALUE;
        return C0776m0.B0(this.f7517i, this);
    }
}
