package r;

import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 implements t2 {

    /* renamed from: d, reason: collision with root package name */
    public Float f6214d;

    /* renamed from: e, reason: collision with root package name */
    public Float f6215e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.h1 f6216f;

    /* renamed from: g, reason: collision with root package name */
    public c1 f6217g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6218h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f6219j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0 f6220k;

    public a0(c0 c0Var, Float f6, Float f8, z zVar) {
        r1 r1Var = d.f6262j;
        this.f6220k = c0Var;
        this.f6214d = f6;
        this.f6215e = f8;
        this.f6216f = m0.b.q(f6);
        this.f6217g = new c1(zVar, r1Var, this.f6214d, this.f6215e, null);
    }

    @Override // m0.t2
    public final Object getValue() {
        return this.f6216f.getValue();
    }
}
