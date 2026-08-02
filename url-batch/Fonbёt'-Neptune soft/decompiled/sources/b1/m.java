package b1;

import B0.C0038p;

/* loaded from: classes.dex */
public final class m extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0038p f1940h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1941i;

    /* renamed from: j, reason: collision with root package name */
    public int f1942j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0038p f1943k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1944l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0038p c0038p, H0.d dVar) {
        super(dVar);
        this.f1943k = c0038p;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f1941i = obj;
        this.f1942j |= Integer.MIN_VALUE;
        return this.f1943k.a(null, this);
    }
}
