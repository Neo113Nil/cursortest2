package o;

/* loaded from: classes.dex */
public final class I extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public C0891i0 f8634j;

    /* renamed from: k, reason: collision with root package name */
    public C0913u f8635k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8636l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8637m;

    /* renamed from: n, reason: collision with root package name */
    public int f8638n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C0891i0 c0891i0, E2.c cVar) {
        super(cVar);
        this.f8637m = c0891i0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f8636l = obj;
        this.f8638n |= Integer.MIN_VALUE;
        return C0891i0.G0(this.f8637m, null, this);
    }
}
