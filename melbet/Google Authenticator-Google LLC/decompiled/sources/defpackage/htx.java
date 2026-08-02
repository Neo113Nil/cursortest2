package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htx {
    public final AtomicReference a = new AtomicReference(hty.a);
    public final htu b;
    public final hvc c;

    public htx(hvc hvcVar, htu htuVar) {
        this.c = hvcVar;
        this.b = htuVar;
    }

    final void a(htu htuVar) {
        b(hty.a, hty.b);
        htuVar.a(this.b, huf.a);
    }

    public final void b(hty htyVar, hty htyVar2) {
        hoq.M(d(htyVar, htyVar2), "Expected status to be %s, but it was %s", htyVar, htyVar2);
    }

    public final void c() {
        htz.a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture$State", "close", "closing {0}", this);
        this.b.close();
    }

    public final boolean d(hty htyVar, hty htyVar2) {
        return a.a(this.a, htyVar, htyVar2);
    }

    final hvc e() {
        htx htxVar;
        if (d(hty.a, hty.c)) {
            htxVar = this;
            htz.a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture$State", "finishToFuture", "will close {0}", htxVar);
            htxVar.c.c(new gfm(htxVar, 20), huf.a);
        } else {
            htxVar = this;
            int ordinal = ((hty) htxVar.a.get()).ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            }
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (ordinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return htxVar.c;
    }

    public final String toString() {
        gzo gzoVar = new gzo("ClosingFuture");
        gzoVar.b("status", this.a.get());
        gzoVar.a(this.c);
        return gzoVar.toString();
    }
}
