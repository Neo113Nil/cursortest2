package j4;

/* loaded from: classes.dex */
final class v implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f18192f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ w f18193g;

    v(w wVar, h hVar) {
        this.f18193g = wVar;
        this.f18192f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        f fVar;
        f fVar2;
        obj = this.f18193g.f18195b;
        synchronized (obj) {
            fVar = this.f18193g.f18196c;
            if (fVar != null) {
                fVar2 = this.f18193g.f18196c;
                fVar2.c(this.f18192f.j());
            }
        }
    }
}
