package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kfe implements kfi {
    public kbq a;
    final /* synthetic */ kff b;
    public final iwr c;

    public kfe(kff kffVar, iwr iwrVar) {
        this.b = kffVar;
        this.c = iwrVar;
    }

    @Override // defpackage.kfi
    public final void a(kbq kbqVar, kfh kfhVar, kaa kaaVar) {
        int i = kob.a;
        kff kffVar = this.b;
        jxs f = kffVar.f();
        if (kbqVar.o == kbn.CANCELLED && f != null && f.f()) {
            kbqVar = kffVar.f.b();
            kaaVar = new kaa();
        }
        kffVar.c.execute(new kfc(this, kbqVar, kaaVar));
    }

    public final void b(kbq kbqVar) {
        this.a = kbqVar;
        this.b.h.n(kbqVar);
    }

    @Override // defpackage.kfi
    public final void c(kaa kaaVar) {
        int i = kob.a;
        this.b.c.execute(new kfa(this, kaaVar));
    }

    @Override // defpackage.kmp
    public final void d(kmo kmoVar) {
        int i = kob.a;
        this.b.c.execute(new kfb(this, kmoVar));
    }

    @Override // defpackage.kmp
    public final void e() {
        kad kadVar = kad.a;
        kff kffVar = this.b;
        kad kadVar2 = kffVar.b.a;
        if (kadVar2 == kadVar || kadVar2 == kad.c) {
            return;
        }
        int i = kob.a;
        kffVar.c.execute(new kfd(this));
    }
}
