package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klk extends kbg {
    private static final Logger d = Logger.getLogger(klk.class.getName());
    public final kae a;
    public final jxk b;
    public volatile boolean c;
    private final kma e;
    private final byte[] f;
    private final jxv g;
    private final kev h;
    private boolean i;
    private boolean j;
    private jxe k;
    private boolean l;

    public klk(kma kmaVar, kae kaeVar, kaa kaaVar, jxk jxkVar, jxv jxvVar, kev kevVar) {
        this.e = kmaVar;
        this.a = kaeVar;
        this.b = jxkVar;
        this.f = (byte[]) kaaVar.c(khd.d);
        this.g = jxvVar;
        this.h = kevVar;
        kevVar.b();
    }

    private final void i(Throwable th) {
        d.logp(Level.WARNING, "io.grpc.internal.ServerCallImpl", "handleInternalError", "Cancelling the stream because of internal error", th);
        this.e.c(th instanceof kbt ? ((kbt) th).a : kbq.k.d(th).e("Internal error so cancelling stream."));
        this.h.a(false);
    }

    private final void j(Object obj) {
        hoq.I(this.i, "sendHeaders has not been called");
        hoq.I(!this.j, "call is closed");
        kae kaeVar = this.a;
        if (kaeVar.a.a() && this.l) {
            i(new kbt(kbq.k.e("Too many responses"), null));
            return;
        }
        this.l = true;
        try {
            this.e.j(kaeVar.e.a(obj));
        } catch (Error e) {
            a(kbq.c.e("Server sendMessage() failed with Error"), new kaa());
            throw e;
        } catch (RuntimeException e2) {
            i(e2);
        }
    }

    @Override // defpackage.kbg
    public final void a(kbq kbqVar, kaa kaaVar) {
        kev kevVar;
        int i = kob.a;
        hoq.I(!this.j, "call already closed");
        try {
            this.j = true;
            if (kbqVar.g() && this.a.a.a() && !this.l) {
                i(new kbt(kbq.k.e("Completed without a response"), null));
                kevVar = this.h;
            } else {
                this.e.d(kbqVar, kaaVar);
                kevVar = this.h;
            }
            kevVar.a(kbqVar.g());
        } catch (Throwable th) {
            this.h.a(kbqVar.g());
            throw th;
        }
    }

    @Override // defpackage.kbg
    public final void b(kaa kaaVar) {
        int i = kob.a;
        hoq.I(!this.i, "sendHeaders has already been called");
        hoq.I(!this.j, "call is closed");
        kaaVar.f(khd.g);
        jzw jzwVar = khd.c;
        kaaVar.f(jzwVar);
        if (this.k == null) {
            this.k = jxc.a;
        } else {
            byte[] bArr = this.f;
            if (bArr != null) {
                Iterator it = khd.k.c(new String(bArr, khd.a)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.k = jxc.a;
                        break;
                    } else if (Objects.equals(it.next(), "identity")) {
                        break;
                    }
                }
            } else {
                this.k = jxc.a;
            }
        }
        kaaVar.h(jzwVar, "identity");
        jzw jzwVar2 = khd.d;
        kaaVar.f(jzwVar2);
        byte[] bArr2 = this.g.c;
        if (bArr2.length != 0) {
            kaaVar.h(jzwVar2, bArr2);
        }
        this.i = true;
        kma kmaVar = this.e;
        kad kadVar = this.a.a;
        kmaVar.l(kaaVar);
    }

    @Override // defpackage.kbg
    public final kae c() {
        return this.a;
    }

    @Override // defpackage.kbg
    public final void d(Object obj) {
        int i = kob.a;
        j(obj);
    }

    @Override // defpackage.kbg
    public final void f() {
        int i = kob.a;
        this.e.g(1);
    }

    @Override // defpackage.kbg
    public final jwt g() {
        return this.e.a();
    }

    @Override // defpackage.kbg
    public final boolean h() {
        if (this.j) {
            return false;
        }
        return this.e.k();
    }
}
