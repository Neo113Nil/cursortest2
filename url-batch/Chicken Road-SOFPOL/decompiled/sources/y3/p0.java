package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f8921g;

    /* renamed from: h, reason: collision with root package name */
    public i7.c f8922h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0 f8923j;

    /* renamed from: k, reason: collision with root package name */
    public int f8924k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, i6.c cVar) {
        super(cVar);
        this.f8923j = r0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.i = obj;
        this.f8924k |= Integer.MIN_VALUE;
        return this.f8923j.b(null, this);
    }
}
