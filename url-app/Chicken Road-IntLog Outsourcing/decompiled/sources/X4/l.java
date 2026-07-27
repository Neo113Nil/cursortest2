package X4;

/* loaded from: classes.dex */
public final class l extends W4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f3575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f3576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, x xVar, m mVar) {
        super(str, true);
        this.f3575e = xVar;
        this.f3576f = mVar;
    }

    @Override // W4.a
    public final long a() {
        w wVar;
        x xVar = this.f3575e;
        try {
            wVar = xVar.g();
        } catch (Throwable th) {
            wVar = new w(xVar, th, 2);
        }
        m mVar = this.f3576f;
        if (!mVar.f3581e.contains(xVar)) {
            return -1L;
        }
        mVar.f3582f.put(wVar);
        return -1L;
    }
}
