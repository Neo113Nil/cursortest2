package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class kau extends iws {
    @Override // defpackage.iws
    public void c() {
        f().c();
    }

    @Override // defpackage.iws
    public void d(int i) {
        f().d(i);
    }

    protected abstract iws f();

    @Override // defpackage.iws
    public void r(String str, Throwable th) {
        f().r(str, th);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", f());
        return T.toString();
    }
}
