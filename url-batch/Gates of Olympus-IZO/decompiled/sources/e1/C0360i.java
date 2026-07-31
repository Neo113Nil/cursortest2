package e1;

/* renamed from: e1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360i extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public A2.k f4700d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A2.k f4702f;

    /* renamed from: g, reason: collision with root package name */
    public int f4703g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0360i(A2.k kVar, R1.c cVar) {
        super(cVar);
        this.f4702f = kVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4701e = obj;
        this.f4703g |= Integer.MIN_VALUE;
        return this.f4702f.g(this);
    }
}
