package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kav extends iwr {
    public final iwr f;

    protected kav(iwr iwrVar) {
        this.f = iwrVar;
    }

    @Override // defpackage.iwr
    public void a(kbq kbqVar, kaa kaaVar) {
        this.f.a(kbqVar, kaaVar);
    }

    @Override // defpackage.iwr
    public void b(kaa kaaVar) {
        this.f.b(kaaVar);
    }

    @Override // defpackage.iwr
    public void c(Object obj) {
        this.f.c(obj);
    }

    @Override // defpackage.iwr
    public final void d() {
        this.f.d();
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", this.f);
        return T.toString();
    }
}
