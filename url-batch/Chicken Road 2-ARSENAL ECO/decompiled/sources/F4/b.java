package F4;

/* loaded from: classes.dex */
public final class b extends D4.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f753b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final D4.f[] f754c;

    public b(m[] mVarArr) {
        super(D4.j.e(K4.e.f1384a, mVarArr));
        this.f754c = mVarArr;
    }

    @Override // D4.f
    public final void c(D4.n nVar) {
        switch (this.f753b) {
            case 0:
                nVar.h(K4.b.f1378a, this.f754c);
                break;
            default:
                nVar.h(K4.e.f1384a, this.f754c);
                break;
        }
    }

    public b(D4.f[] fVarArr) {
        super(D4.j.e(K4.b.f1378a, fVarArr));
        this.f754c = fVarArr;
    }
}
