package u;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935c extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public P1.k f8058d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0936d f8060f;

    /* renamed from: g, reason: collision with root package name */
    public int f8061g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0935c(C0936d c0936d, R1.c cVar) {
        super(cVar);
        this.f8060f = c0936d;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f8059e = obj;
        this.f8061g |= Integer.MIN_VALUE;
        return this.f8060f.h(this);
    }
}
