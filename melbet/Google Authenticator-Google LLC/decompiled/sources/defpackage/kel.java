package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kel implements kjc {
    public final Object a = new Object();
    public final kmt b;
    public final kjf c;
    public int d;
    public boolean e;
    public boolean f;
    public final int g;
    public final kmm h;
    public kfi i;
    public jxv j;
    public volatile boolean k;
    public boolean l;
    public kjf m;
    private boolean n;
    private boolean o;
    private Runnable p;
    private boolean q;

    protected kel(int i, kmm kmmVar, kmt kmtVar) {
        this.b = kmtVar;
        kjf kjfVar = new kjf(this, jxc.a, i, kmmVar, kmtVar);
        this.c = kjfVar;
        this.m = kjfVar;
        this.g = 32768;
        this.j = jxv.b;
        this.o = false;
        this.h = kmmVar;
    }

    @Override // defpackage.kjc
    public final void a(kmo kmoVar) {
        this.i.d(kmoVar);
    }

    public final void b() {
        boolean c;
        synchronized (this.a) {
            c = c();
            if (!c) {
                Logger logger = kem.t;
                if (logger.isLoggable(Level.FINEST)) {
                    logger.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.e), Integer.valueOf(this.d), Integer.valueOf(this.g), Boolean.valueOf(this.f)});
                }
            }
        }
        if (c) {
            this.i.e();
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.e && this.d < this.g && !this.f) {
                z = true;
            }
        }
        return z;
    }

    public final void d(kbq kbqVar, kfh kfhVar, kaa kaaVar) {
        if (this.n) {
            return;
        }
        this.n = true;
        this.h.c();
        kmt kmtVar = this.b;
        if (kbqVar.g()) {
            kmtVar.b++;
        } else {
            kmtVar.c++;
        }
        this.i.a(kbqVar, kfhVar, kaaVar);
    }

    @Override // defpackage.kjc
    public final void e(boolean z) {
        hoq.I(this.l, "status should have been reported on deframer closed");
        this.o = true;
        if (this.q && z) {
            f(kbq.k.e("Encountered end-of-stream mid-frame"), true, new kaa());
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            this.p = null;
        }
    }

    public final void f(kbq kbqVar, boolean z, kaa kaaVar) {
        kfh kfhVar = kfh.a;
        kbqVar.getClass();
        kaaVar.getClass();
        if (this.l) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.l = true;
        this.q = kbqVar.g();
        synchronized (this.a) {
            this.f = true;
        }
        if (this.o) {
            this.p = null;
            d(kbqVar, kfhVar, kaaVar);
            return;
        }
        this.p = new fv(this, kbqVar, kfhVar, kaaVar, 11);
        kjf kjfVar = this.m;
        if (z) {
            kjfVar.close();
        } else {
            if (kjfVar.b()) {
                return;
            }
            if (kjfVar.c()) {
                kjfVar.close();
            } else {
                kjfVar.f = true;
            }
        }
    }
}
