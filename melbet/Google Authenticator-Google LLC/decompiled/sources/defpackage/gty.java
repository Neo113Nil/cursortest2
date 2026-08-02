package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gty implements Runnable, gut {
    private guq a;
    private guq b;
    private final boolean c = fao.h(Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public gty(guq guqVar, boolean z) {
        this.f = false;
        this.a = guqVar;
        this.b = guqVar;
        this.f = z;
    }

    private final void c() {
        this.d = true;
        this.a.p(this.c && !this.e && fao.g());
        this.a = null;
    }

    public final void a(htz htzVar) {
        b(htzVar.c());
    }

    public final void b(hvi hviVar) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.e) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.e = true;
        this.a.t();
        hviVar.c(this, huf.a);
    }

    @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        guq guqVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                c();
            }
            if (guqVar != null) {
                guqVar.close();
            }
            if (this.f) {
                gta.f(gtw.a);
            }
        } catch (Throwable th) {
            if (guqVar != null) {
                try {
                    guqVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d || !this.e) {
            fao.e(new cov(11));
        } else {
            c();
        }
    }
}
