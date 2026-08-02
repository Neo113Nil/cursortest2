package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gwx extends ixf {
    private final gvz a;
    private final ixf b;

    public gwx(ixf ixfVar, gvz gvzVar) {
        this.b = ixfVar;
        this.a = gvzVar;
    }

    @Override // defpackage.ixf
    public final void a() {
        gut a = this.a.a();
        try {
            this.b.a();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ixf
    public final void b() {
        gut a = this.a.a();
        try {
            this.b.b();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ixf
    public final void c() {
        gut a = this.a.a();
        try {
            this.b.c();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ixf
    public final void d(Object obj) {
        gut a = this.a.a();
        try {
            this.b.d(obj);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ixf
    public final void e() {
        gut a = this.a.a();
        try {
            this.b.e();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
