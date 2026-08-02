package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class keg implements Runnable {
    final kef a;
    final /* synthetic */ String b;
    final /* synthetic */ kaa c;
    final /* synthetic */ kae d;
    final /* synthetic */ kmm e;
    final /* synthetic */ jww f;
    final /* synthetic */ keh g;

    public keg(keh kehVar, String str, kaa kaaVar, kae kaeVar, kmm kmmVar, jww jwwVar) {
        this.b = str;
        this.c = kaaVar;
        this.d = kaeVar;
        this.e = kmmVar;
        this.f = jwwVar;
        this.g = kehVar;
        this.a = new kef(str, kehVar.a, kehVar.e, kaaVar, kehVar, this, kehVar.c, kehVar.f, kaeVar, kmmVar, jwwVar, kehVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        keh kehVar = this.g;
        synchronized (kehVar.c) {
            if (kehVar.j) {
                this.a.r.f(kehVar.k, true, new kaa());
            } else {
                if (!kehVar.l) {
                    throw new AssertionError("Transport is not started");
                }
                kef kefVar = this.a;
                kehVar.d.add(kefVar);
                kefVar.r.A.q = kehVar.i;
            }
        }
    }
}
