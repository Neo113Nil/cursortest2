package D1;

/* renamed from: D1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017e extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0018f f542d;

    /* renamed from: e, reason: collision with root package name */
    public String f543e;

    /* renamed from: f, reason: collision with root package name */
    public long f544f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f545g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0018f f546h;

    /* renamed from: i, reason: collision with root package name */
    public int f547i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017e(C0018f c0018f, R1.c cVar) {
        super(cVar);
        this.f546h = c0018f;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f545g = obj;
        this.f547i |= Integer.MIN_VALUE;
        return this.f546h.b(this);
    }
}
