package j4;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f18182f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ s f18183g;

    r(s sVar, h hVar) {
        this.f18183g = sVar;
        this.f18182f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        d dVar;
        d dVar2;
        obj = this.f18183g.f18185b;
        synchronized (obj) {
            dVar = this.f18183g.f18186c;
            if (dVar != null) {
                dVar2 = this.f18183g.f18186c;
                dVar2.a(this.f18182f);
            }
        }
    }
}
