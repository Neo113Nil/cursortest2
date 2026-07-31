package b6;

/* loaded from: classes.dex */
public final class k extends a6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f3666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3667f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, w wVar, l lVar) {
        super(str);
        this.f3666e = wVar;
        this.f3667f = lVar;
    }

    @Override // a6.a
    public final long a() {
        v vVar;
        w wVar = this.f3666e;
        try {
            vVar = wVar.g();
        } catch (Throwable th) {
            vVar = new v(wVar, th, 2);
        }
        l lVar = this.f3667f;
        if (!lVar.f3672e.contains(wVar)) {
            return -1L;
        }
        lVar.f3673f.put(vVar);
        return -1L;
    }
}
