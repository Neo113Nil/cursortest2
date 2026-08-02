package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class kgu implements kfi {
    @Override // defpackage.kfi
    public void a(kbq kbqVar, kfh kfhVar, kaa kaaVar) {
        throw null;
    }

    protected abstract kfi b();

    @Override // defpackage.kfi
    public final void c(kaa kaaVar) {
        b().c(kaaVar);
    }

    @Override // defpackage.kmp
    public final void d(kmo kmoVar) {
        b().d(kmoVar);
    }

    @Override // defpackage.kmp
    public final void e() {
        b().e();
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", b());
        return T.toString();
    }
}
