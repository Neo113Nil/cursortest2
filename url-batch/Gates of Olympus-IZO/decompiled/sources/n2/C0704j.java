package n2;

/* renamed from: n2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704j extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6345d;

    /* renamed from: e, reason: collision with root package name */
    public int f6346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0705k f6347f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6348g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0701g f6349h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0704j(C0705k c0705k, P1.d dVar) {
        super(dVar);
        this.f6347f = c0705k;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6345d = obj;
        this.f6346e |= Integer.MIN_VALUE;
        return this.f6347f.collect(null, this);
    }
}
