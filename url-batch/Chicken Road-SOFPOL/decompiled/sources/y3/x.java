package y3;

import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public boolean f8960g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8961h;
    public q6.s i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f8962j;

    /* renamed from: k, reason: collision with root package name */
    public int f8963k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8964l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f8965m;

    /* renamed from: n, reason: collision with root package name */
    public int f8966n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, i6.c cVar) {
        super(cVar);
        this.f8965m = b0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f8964l = obj;
        this.f8966n |= Integer.MIN_VALUE;
        return b0.f(this.f8965m, false, this);
    }
}
