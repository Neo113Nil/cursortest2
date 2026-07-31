package o;

/* renamed from: o.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721A extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public g0 f6403d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f6405f;

    /* renamed from: g, reason: collision with root package name */
    public int f6406g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721A(g0 g0Var, R1.c cVar) {
        super(cVar);
        this.f6405f = g0Var;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6404e = obj;
        this.f6406g |= Integer.MIN_VALUE;
        return g0.y0(this.f6405f, this);
    }
}
