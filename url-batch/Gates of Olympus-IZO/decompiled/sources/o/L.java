package o;

/* loaded from: classes.dex */
public final class L extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public M f6450d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f6452f;

    /* renamed from: g, reason: collision with root package name */
    public int f6453g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m3, R1.c cVar) {
        super(cVar);
        this.f6452f = m3;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6451e = obj;
        this.f6453g |= Integer.MIN_VALUE;
        return this.f6452f.d(this);
    }
}
