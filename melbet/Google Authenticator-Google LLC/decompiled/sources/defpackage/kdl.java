package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kdl implements kma {
    private final kdb a;
    private final jwt b;
    private final kdp c;

    public kdl(kdb kdbVar, kdp kdpVar, jwt jwtVar) {
        this.a = kdbVar;
        this.c = kdpVar;
        this.b = jwtVar;
    }

    @Override // defpackage.kma
    public final jwt a() {
        return this.b;
    }

    @Override // defpackage.kma
    public final kmm b() {
        return this.c.c;
    }

    @Override // defpackage.kma
    public final void c(kbq kbqVar) {
        kdb kdbVar = this.a;
        synchronized (kdbVar) {
            kdbVar.g(kbqVar);
        }
    }

    @Override // defpackage.kma
    public final void d(kbq kbqVar, kaa kaaVar) {
        try {
            kdp kdpVar = this.c;
            synchronized (kdpVar) {
                if (kdpVar.e == null) {
                    hoq.H(kdpVar.f == null);
                    kdpVar.e = kbqVar;
                    kdpVar.f = kaaVar;
                    kdpVar.b();
                    kdpVar.c();
                    kdpVar.d();
                }
            }
            kdb kdbVar = this.a;
            synchronized (kdbVar) {
                kdbVar.d();
            }
        } catch (kbr e) {
            kdb kdbVar2 = this.a;
            synchronized (kdbVar2) {
                kbq kbqVar2 = e.a;
                kdbVar2.f(kbqVar2, kbqVar2, false);
            }
        }
    }

    @Override // defpackage.kmn
    public final void g(int i) {
        kdb kdbVar = this.a;
        synchronized (kdbVar) {
            kdbVar.m();
        }
    }

    @Override // defpackage.kma
    public final void i(kmb kmbVar) {
        kdb kdbVar = this.a;
        synchronized (kdbVar) {
            kdbVar.j(this.c, kmbVar);
        }
    }

    @Override // defpackage.kmn
    public final void j(InputStream inputStream) {
        try {
            kdp kdpVar = this.c;
            synchronized (kdpVar) {
                kdpVar.a(inputStream);
                kdpVar.d();
            }
        } catch (kbr e) {
            kdb kdbVar = this.a;
            synchronized (kdbVar) {
                kbq kbqVar = e.a;
                kdbVar.f(kbqVar, kbqVar, false);
            }
        }
    }

    @Override // defpackage.kmn
    public final boolean k() {
        return this.c.e();
    }

    @Override // defpackage.kma
    public final void l(kaa kaaVar) {
        try {
            kdp kdpVar = this.c;
            synchronized (kdpVar) {
                kdpVar.d = kaaVar;
                kdpVar.b();
                kdpVar.d();
            }
        } catch (kbr e) {
            kdb kdbVar = this.a;
            synchronized (kdbVar) {
                kbq kbqVar = e.a;
                kdbVar.f(kbqVar, kbqVar, false);
            }
        }
    }

    @Override // defpackage.kma
    public final void m() {
    }

    public final String toString() {
        kdp kdpVar = this.c;
        return "MultiMessageServerStream[" + this.a.toString() + "/" + kdpVar.toString() + "]";
    }

    @Override // defpackage.kmn
    public final void e() {
    }

    @Override // defpackage.kmn
    public final void f() {
    }

    @Override // defpackage.kmn
    public final void h(jxe jxeVar) {
    }
}
