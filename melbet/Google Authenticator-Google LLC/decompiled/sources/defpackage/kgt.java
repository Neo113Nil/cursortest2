package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class kgt implements kfg {
    @Override // defpackage.kfg
    public final jwt a() {
        throw null;
    }

    protected abstract kfg b();

    @Override // defpackage.kmn
    public final void e() {
        b().e();
    }

    @Override // defpackage.kmn
    public final void f() {
        b().f();
    }

    @Override // defpackage.kmn
    public final void g(int i) {
        b().g(i);
    }

    @Override // defpackage.kmn
    public final void h(jxe jxeVar) {
        b().h(jxeVar);
    }

    @Override // defpackage.kmn
    public final void j(InputStream inputStream) {
        b().j(inputStream);
    }

    @Override // defpackage.kmn
    public final boolean k() {
        return b().k();
    }

    @Override // defpackage.kfg
    public final void m(khi khiVar) {
        b().m(khiVar);
    }

    @Override // defpackage.kfg
    public final void n(kbq kbqVar) {
        b().n(kbqVar);
    }

    @Override // defpackage.kfg
    public final void o() {
        b().o();
    }

    @Override // defpackage.kfg
    public final void p(jxs jxsVar) {
        b().p(jxsVar);
    }

    @Override // defpackage.kfg
    public final void q(jxv jxvVar) {
        b().q(jxvVar);
    }

    @Override // defpackage.kfg
    public final void r(int i) {
        b().r(i);
    }

    @Override // defpackage.kfg
    public final void s(int i) {
        b().s(i);
    }

    @Override // defpackage.kfg
    public void t(kfi kfiVar) {
        throw null;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", b());
        return T.toString();
    }
}
