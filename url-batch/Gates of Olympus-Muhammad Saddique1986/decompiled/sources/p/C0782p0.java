package p;

/* renamed from: p.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782p0 extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public f2.t f7745g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7746h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0793v0 f7747i;

    /* renamed from: j, reason: collision with root package name */
    public int f7748j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0782p0(C0793v0 c0793v0, X1.c cVar) {
        super(cVar);
        this.f7747i = c0793v0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f7746h = obj;
        this.f7748j |= Integer.MIN_VALUE;
        return this.f7747i.b(0L, this);
    }
}
