package m0;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618c extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0620e f5900d;

    /* renamed from: e, reason: collision with root package name */
    public long f5901e;

    /* renamed from: f, reason: collision with root package name */
    public long f5902f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0620e f5904h;

    /* renamed from: i, reason: collision with root package name */
    public int f5905i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0618c(C0620e c0620e, R1.c cVar) {
        super(cVar);
        this.f5904h = c0620e;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f5903g = obj;
        this.f5905i |= Integer.MIN_VALUE;
        return this.f5904h.w0(0L, 0L, this);
    }
}
