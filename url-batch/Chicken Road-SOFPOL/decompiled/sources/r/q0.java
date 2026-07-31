package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q0 extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f6396g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6397h;
    public final /* synthetic */ s0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f6398j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, i6.c cVar) {
        super(cVar);
        this.i = s0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f6397h = obj;
        this.f6398j |= Integer.MIN_VALUE;
        return s0.i(this.i, this);
    }
}
