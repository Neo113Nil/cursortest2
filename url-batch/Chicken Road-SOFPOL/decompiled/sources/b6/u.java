package b6;

/* loaded from: classes.dex */
public final class u extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1463g;

    /* renamed from: h, reason: collision with root package name */
    public int f1464h;
    public final /* synthetic */ p i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar, g6.c cVar) {
        super(cVar);
        this.i = pVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f1463g = obj;
        this.f1464h |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
