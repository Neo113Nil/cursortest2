package F;

/* renamed from: F.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098h0 extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public C0100i0 f1556g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1557h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0100i0 f1558i;

    /* renamed from: j, reason: collision with root package name */
    public int f1559j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098h0(C0100i0 c0100i0, X1.c cVar) {
        super(cVar);
        this.f1558i = c0100i0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f1557h = obj;
        this.f1559j |= Integer.MIN_VALUE;
        return this.f1558i.b(this);
    }
}
