package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public o f2398g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2399h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f2400j;

    /* renamed from: k, reason: collision with root package name */
    public int f2401k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, g6.c cVar) {
        super(cVar);
        this.f2400j = oVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.i = obj;
        this.f2401k |= Integer.MIN_VALUE;
        return this.f2400j.a(null, this);
    }
}
