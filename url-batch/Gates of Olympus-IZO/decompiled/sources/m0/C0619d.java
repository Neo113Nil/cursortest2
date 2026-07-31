package m0;

/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619d extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0620e f5906d;

    /* renamed from: e, reason: collision with root package name */
    public long f5907e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0620e f5909g;

    /* renamed from: h, reason: collision with root package name */
    public int f5910h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0619d(C0620e c0620e, R1.c cVar) {
        super(cVar);
        this.f5909g = c0620e;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f5908f = obj;
        this.f5910h |= Integer.MIN_VALUE;
        return this.f5909g.y0(0L, this);
    }
}
