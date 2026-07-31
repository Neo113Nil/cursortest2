package o;

/* loaded from: classes.dex */
public final class y0 extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public A0 f6665d;

    /* renamed from: e, reason: collision with root package name */
    public L1.e f6666e;

    /* renamed from: f, reason: collision with root package name */
    public Y1.a f6667f;

    /* renamed from: g, reason: collision with root package name */
    public float f6668g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6669h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A0 f6670i;

    /* renamed from: j, reason: collision with root package name */
    public int f6671j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(A0 a02, R1.c cVar) {
        super(cVar);
        this.f6670i = a02;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6669h = obj;
        this.f6671j |= Integer.MIN_VALUE;
        return this.f6670i.a(null, null, this);
    }
}
