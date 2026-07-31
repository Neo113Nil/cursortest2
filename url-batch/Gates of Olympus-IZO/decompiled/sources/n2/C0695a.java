package n2;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695a extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public o2.s f6324d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0677B f6326f;

    /* renamed from: g, reason: collision with root package name */
    public int f6327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0695a(C0677B c0677b, P1.d dVar) {
        super(dVar);
        this.f6326f = c0677b;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6325e = obj;
        this.f6327g |= Integer.MIN_VALUE;
        return this.f6326f.collect(null, this);
    }
}
