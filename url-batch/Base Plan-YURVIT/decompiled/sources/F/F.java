package F;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f243h;

    /* renamed from: i, reason: collision with root package name */
    public Object f244i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f245j;

    /* renamed from: k, reason: collision with root package name */
    public P0.o f246k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f247l;

    /* renamed from: m, reason: collision with root package name */
    public int f248m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f249n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f250o;

    /* renamed from: p, reason: collision with root package name */
    public int f251p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(P p2, I0.b bVar) {
        super(bVar);
        this.f250o = p2;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f249n = obj;
        this.f251p |= Integer.MIN_VALUE;
        return P.e(this.f250o, false, this);
    }
}
