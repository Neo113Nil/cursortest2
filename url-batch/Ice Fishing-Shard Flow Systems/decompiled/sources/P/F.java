package P;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f1969d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1970e;

    /* renamed from: i, reason: collision with root package name */
    public Serializable f1971i;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.D f1972l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1973m;

    /* renamed from: n, reason: collision with root package name */
    public int f1974n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1975o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Q f1976p;

    /* renamed from: q, reason: collision with root package name */
    public int f1977q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Q q4, X5.c cVar) {
        super(cVar);
        this.f1976p = q4;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f1975o = obj;
        this.f1977q |= Integer.MIN_VALUE;
        return Q.f(this.f1976p, false, this);
    }
}
