package j4;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f18187f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ u f18188g;

    t(u uVar, h hVar) {
        this.f18188g = uVar;
        this.f18187f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f18188g.f18190b;
        synchronized (obj) {
            eVar = this.f18188g.f18191c;
            if (eVar != null) {
                eVar2 = this.f18188g.f18191c;
                eVar2.d((Exception) r3.o.i(this.f18187f.i()));
            }
        }
    }
}
