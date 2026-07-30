package P0;

import L.Q;

/* loaded from: classes.dex */
public final class j extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f788h;

    /* renamed from: i, reason: collision with root package name */
    public int f789i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f790j;

    /* renamed from: k, reason: collision with root package name */
    public Q f791k;

    /* renamed from: l, reason: collision with root package name */
    public e f792l;

    /* renamed from: m, reason: collision with root package name */
    public Q0.n f793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Q q2, w0.d dVar) {
        super(dVar);
        this.f790j = q2;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f788h = obj;
        this.f789i |= Integer.MIN_VALUE;
        return this.f790j.d(null, this);
    }
}
