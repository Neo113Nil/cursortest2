package y3;

/* loaded from: classes.dex */
public final class o extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f8913g;

    /* renamed from: h, reason: collision with root package name */
    public int f8914h;
    public final /* synthetic */ b6.p i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b6.p pVar, g6.c cVar) {
        super(cVar);
        this.i = pVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f8913g = obj;
        this.f8914h |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
