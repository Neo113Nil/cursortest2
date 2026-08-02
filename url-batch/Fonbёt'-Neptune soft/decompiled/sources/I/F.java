package I;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f525h;

    /* renamed from: i, reason: collision with root package name */
    public Object f526i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f527j;

    /* renamed from: k, reason: collision with root package name */
    public Q0.o f528k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f529l;

    /* renamed from: m, reason: collision with root package name */
    public int f530m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f531n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f532o;

    /* renamed from: p, reason: collision with root package name */
    public int f533p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(P p2, J0.b bVar) {
        super(bVar);
        this.f532o = p2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f531n = obj;
        this.f533p |= Integer.MIN_VALUE;
        return P.f(this.f532o, false, this);
    }
}
