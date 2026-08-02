package b1;

import B0.t;

/* loaded from: classes.dex */
public final class k extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public t f1931h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1932i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1933j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t f1934k;

    /* renamed from: l, reason: collision with root package name */
    public int f1935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar, H0.d dVar) {
        super(dVar);
        this.f1934k = tVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f1933j = obj;
        this.f1935l |= Integer.MIN_VALUE;
        return this.f1934k.a(null, this);
    }
}
