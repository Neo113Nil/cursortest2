package j4;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f18178f;

    p(q qVar) {
        this.f18178f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f18178f.f18180b;
        synchronized (obj) {
            cVar = this.f18178f.f18181c;
            if (cVar != null) {
                cVar2 = this.f18178f.f18181c;
                cVar2.b();
            }
        }
    }
}
