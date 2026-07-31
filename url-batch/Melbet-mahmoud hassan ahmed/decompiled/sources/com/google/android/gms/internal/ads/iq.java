package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import r3.c;

/* loaded from: classes.dex */
public final class iq {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f6740a = new eq(this);

    /* renamed from: b, reason: collision with root package name */
    private final Object f6741b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private lq f6742c;

    /* renamed from: d, reason: collision with root package name */
    private Context f6743d;

    /* renamed from: e, reason: collision with root package name */
    private oq f6744e;

    static /* bridge */ /* synthetic */ void h(iq iqVar) {
        synchronized (iqVar.f6741b) {
            lq lqVar = iqVar.f6742c;
            if (lqVar == null) {
                return;
            }
            if (lqVar.a() || iqVar.f6742c.k()) {
                iqVar.f6742c.d();
            }
            iqVar.f6742c = null;
            iqVar.f6744e = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f6741b) {
            if (this.f6743d != null && this.f6742c == null) {
                lq d7 = d(new gq(this), new hq(this));
                this.f6742c = d7;
                d7.q();
            }
        }
    }

    public final long a(mq mqVar) {
        synchronized (this.f6741b) {
            if (this.f6744e == null) {
                return -2L;
            }
            if (this.f6742c.i0()) {
                try {
                    return this.f6744e.C3(mqVar);
                } catch (RemoteException e7) {
                    io0.e("Unable to call into cache service.", e7);
                }
            }
            return -2L;
        }
    }

    public final jq b(mq mqVar) {
        synchronized (this.f6741b) {
            if (this.f6744e == null) {
                return new jq();
            }
            try {
                if (this.f6742c.i0()) {
                    return this.f6744e.C5(mqVar);
                }
                return this.f6744e.o4(mqVar);
            } catch (RemoteException e7) {
                io0.e("Unable to call into cache service.", e7);
                return new jq();
            }
        }
    }

    protected final synchronized lq d(c.a aVar, c.b bVar) {
        return new lq(this.f6743d, y2.t.u().b(), aVar, bVar);
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f6741b) {
            if (this.f6743d != null) {
                return;
            }
            this.f6743d = context.getApplicationContext();
            if (((Boolean) sw.c().b(m10.L2)).booleanValue()) {
                l();
            } else {
                if (((Boolean) sw.c().b(m10.K2)).booleanValue()) {
                    y2.t.c().c(new fq(this));
                }
            }
        }
    }

    public final void j() {
        if (((Boolean) sw.c().b(m10.M2)).booleanValue()) {
            synchronized (this.f6741b) {
                l();
                s33 s33Var = a3.g2.f72i;
                s33Var.removeCallbacks(this.f6740a);
                s33Var.postDelayed(this.f6740a, ((Long) sw.c().b(m10.N2)).longValue());
            }
        }
    }
}
