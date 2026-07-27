package A3;

/* loaded from: classes.dex */
public final class n extends y3.i {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f76d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final n[] f77e = new n[0];

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f78b;

    /* renamed from: c, reason: collision with root package name */
    public final y3.i f79c;

    public n(byte[] bArr, y3.i iVar) {
        super(y3.h.d(F3.d.f689b, iVar) + y3.h.b(F3.d.f688a, bArr));
        this.f78b = bArr;
        this.f79c = iVar;
    }

    public static n[] d(Q2.c cVar) {
        if (cVar.isEmpty()) {
            return f77e;
        }
        n[] nVarArr = new n[cVar.size()];
        cVar.forEach(new i(nVarArr, 1));
        return nVarArr;
    }

    @Override // y3.AbstractC1571e
    public final void c(y3.m mVar) {
        mVar.y(F3.d.f688a, this.f78b);
        mVar.a(F3.d.f689b, this.f79c);
    }
}
