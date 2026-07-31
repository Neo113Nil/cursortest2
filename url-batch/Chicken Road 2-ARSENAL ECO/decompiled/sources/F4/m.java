package F4;

/* loaded from: classes.dex */
public final class m extends D4.k {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f778d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final m[] f779e = new m[0];

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f780b;

    /* renamed from: c, reason: collision with root package name */
    public final D4.f f781c;

    public m(byte[] bArr, D4.k kVar) {
        super(D4.j.d(K4.d.f1383b, kVar) + D4.j.b(K4.d.f1382a, bArr));
        this.f780b = bArr;
        this.f781c = kVar;
    }

    public static m[] d(V3.c cVar) {
        if (cVar.isEmpty()) {
            return f779e;
        }
        m[] mVarArr = new m[cVar.size()];
        cVar.forEach(new h(mVarArr, 1));
        return mVarArr;
    }

    @Override // D4.f
    public final void c(D4.n nVar) {
        nVar.v(K4.d.f1382a, this.f780b);
        nVar.a(K4.d.f1383b, this.f781c);
    }
}
