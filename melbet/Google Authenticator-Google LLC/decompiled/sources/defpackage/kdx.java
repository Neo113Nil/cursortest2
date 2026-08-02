package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kdx implements kma {
    private final kdb a;
    private final jwt b;
    private kaa c;
    private InputStream d;
    private final kdp e;

    public kdx(kdb kdbVar, kdp kdpVar, jwt jwtVar) {
        this.a = kdbVar;
        this.e = kdpVar;
        this.b = jwtVar;
    }

    @Override // defpackage.kma
    public final jwt a() {
        return this.b;
    }

    @Override // defpackage.kma
    public final kmm b() {
        return this.e.c;
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
            kdp kdpVar = this.e;
            synchronized (kdpVar) {
                kaa kaaVar2 = this.c;
                InputStream inputStream = this.d;
                if (kdpVar.e == null) {
                    if (kaaVar2 != null) {
                        kdpVar.d = kaaVar2;
                    }
                    kdpVar.b();
                    if (inputStream != null) {
                        kdpVar.a(inputStream);
                    }
                    hoq.H(kdpVar.f == null);
                    kdpVar.e = kbqVar;
                    kdpVar.f = kaaVar;
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
            kdbVar.j(this.e, kmbVar);
        }
    }

    @Override // defpackage.kmn
    public final void j(InputStream inputStream) {
        if (this.d == null) {
            this.d = inputStream;
            return;
        }
        kdb kdbVar = this.a;
        synchronized (kdbVar) {
            kbq e = kbq.k.e("too many messages");
            kdbVar.f(e, e, false);
        }
    }

    @Override // defpackage.kmn
    public final boolean k() {
        return this.e.e();
    }

    @Override // defpackage.kma
    public final void l(kaa kaaVar) {
        this.c = kaaVar;
    }

    @Override // defpackage.kma
    public final void m() {
    }

    public final String toString() {
        kdp kdpVar = this.e;
        return "SingleMessageServerStream[" + this.a.toString() + "/" + kdpVar.toString() + "]";
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
