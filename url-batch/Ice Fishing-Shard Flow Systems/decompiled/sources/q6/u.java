package q6;

import n6.X;

/* loaded from: classes.dex */
public final class u extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public v f7412d;

    /* renamed from: e, reason: collision with root package name */
    public e f7413e;

    /* renamed from: i, reason: collision with root package name */
    public x f7414i;

    /* renamed from: l, reason: collision with root package name */
    public X f7415l;

    /* renamed from: m, reason: collision with root package name */
    public Object f7416m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f7417n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f7418o;

    /* renamed from: p, reason: collision with root package name */
    public int f7419p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, V5.b bVar) {
        super(bVar);
        this.f7418o = vVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f7417n = obj;
        this.f7419p |= Integer.MIN_VALUE;
        this.f7418o.e(null, this);
        return W5.a.f2787d;
    }
}
