package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glr implements aec {
    private final gsu a;
    private final ael b;

    public glr(gsu gsuVar, ael aelVar) {
        this.b = aelVar;
        this.a = gsuVar;
    }

    @Override // defpackage.aec
    public final void a(aer aerVar) {
        gta.i();
        try {
            this.b.b(aej.ON_CREATE);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        gut c = this.a.c();
        try {
            this.b.b(aej.ON_DESTROY);
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aec
    public final void bJ(aer aerVar) {
        gta.i();
        try {
            this.b.b(aej.ON_PAUSE);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aec
    public final void d(aer aerVar) {
        gsu gsuVar = this.a;
        gsf gsfVar = new gsf(gsuVar, gsuVar.c(), 6);
        try {
            this.b.b(aej.ON_RESUME);
            gsfVar.close();
        } catch (Throwable th) {
            try {
                gsfVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aec
    public final void e(aer aerVar) {
        gta.i();
        try {
            this.b.b(aej.ON_START);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aec
    public final void f(aer aerVar) {
        gta.i();
        try {
            this.b.b(aej.ON_STOP);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
