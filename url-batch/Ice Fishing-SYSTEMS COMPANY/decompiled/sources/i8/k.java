package i8;

/* loaded from: classes2.dex */
public final class k extends h8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f38376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f38377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, w wVar, l lVar) {
        super(str);
        this.f38376e = wVar;
        this.f38377f = lVar;
    }

    @Override // h8.a
    public final long a() {
        v vVar;
        w wVar = this.f38376e;
        try {
            vVar = wVar.c();
        } catch (Throwable th) {
            vVar = new v(wVar, th, 2);
        }
        l lVar = this.f38377f;
        if (!lVar.f38382x.contains(wVar)) {
            return -1L;
        }
        lVar.f38383y.put(vVar);
        return -1L;
    }
}
