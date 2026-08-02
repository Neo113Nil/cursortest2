package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class kaw extends kbg {
    @Override // defpackage.kbg
    public void a(kbq kbqVar, kaa kaaVar) {
        e().a(kbqVar, kaaVar);
    }

    @Override // defpackage.kbg
    public void b(kaa kaaVar) {
        e().b(kaaVar);
    }

    protected abstract kbg e();

    @Override // defpackage.kbg
    public void f() {
        throw null;
    }

    @Override // defpackage.kbg
    public final jwt g() {
        return e().g();
    }

    @Override // defpackage.kbg
    public final boolean h() {
        return e().h();
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", e());
        return T.toString();
    }
}
