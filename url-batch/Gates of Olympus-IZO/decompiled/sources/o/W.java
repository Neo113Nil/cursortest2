package o;

/* loaded from: classes.dex */
public final class W extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public long f6473d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X f6475f;

    /* renamed from: g, reason: collision with root package name */
    public int f6476g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x3, R1.c cVar) {
        super(cVar);
        this.f6475f = x3;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6474e = obj;
        this.f6476g |= Integer.MIN_VALUE;
        return this.f6475f.a(0L, 0L, this);
    }
}
