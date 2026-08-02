package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifu extends iwr {
    public final iwr a;
    private final gvz b = gvz.b();

    public ifu(iwr iwrVar) {
        this.a = iwrVar;
    }

    private final void e(Runnable runnable) {
        if (gta.u()) {
            runnable.run();
        } else {
            gvz.d(this.b, runnable).run();
        }
    }

    @Override // defpackage.iwr
    public final void a(kbq kbqVar, kaa kaaVar) {
        e(new kfu(this, kbqVar, kaaVar, 1));
    }

    @Override // defpackage.iwr
    public final void b(kaa kaaVar) {
        e(new iep(this, kaaVar, 15));
    }

    @Override // defpackage.iwr
    public final void c(Object obj) {
        e(new iep(this, obj, 16));
    }

    @Override // defpackage.iwr
    public final void d() {
        e(new iaq(this.a, 7));
    }
}
