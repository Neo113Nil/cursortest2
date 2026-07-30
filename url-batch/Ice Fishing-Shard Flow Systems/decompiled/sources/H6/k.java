package H6;

/* loaded from: classes.dex */
public final class k extends G6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f1056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f1057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, w wVar, l lVar) {
        super(str);
        this.f1056e = wVar;
        this.f1057f = lVar;
    }

    @Override // G6.a
    public final long a() {
        v vVar;
        w wVar = this.f1056e;
        try {
            vVar = wVar.g();
        } catch (Throwable th) {
            vVar = new v(wVar, th, 2);
        }
        l lVar = this.f1057f;
        if (!lVar.f1062e.contains(wVar)) {
            return -1L;
        }
        lVar.f1063f.put(vVar);
        return -1L;
    }
}
