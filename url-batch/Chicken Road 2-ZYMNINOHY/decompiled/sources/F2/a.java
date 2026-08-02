package F2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i f755a;

    public a(i iVar) {
        this.f755a = iVar;
    }

    public static a a(b bVar) {
        i iVar = (i) bVar;
        if (iVar.f785e.f1751c != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        V3.b.e(iVar);
        a aVar = new a(iVar);
        iVar.f785e.f1751c = aVar;
        return aVar;
    }

    public final void b() {
        i iVar = this.f755a;
        V3.b.a(iVar);
        iVar.f782b.getClass();
        if (iVar.f790j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        M2.a aVar = iVar.f785e;
        J2.i.f1185a.a(aVar.g(), "publishLoadedEvent", null, aVar.f1749a);
        iVar.f790j = true;
    }
}
