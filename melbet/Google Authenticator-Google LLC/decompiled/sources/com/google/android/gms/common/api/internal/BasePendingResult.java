package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.cmv;
import defpackage.cmy;
import defpackage.cmz;
import defpackage.cna;
import defpackage.cnc;
import defpackage.cnd;
import defpackage.cne;
import defpackage.cnu;
import defpackage.cnv;
import defpackage.cnw;
import defpackage.coh;
import defpackage.cpd;
import defpackage.cqq;
import defpackage.oy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class BasePendingResult extends cmz {
    public static final ThreadLocal b = new cnu();
    private final CountDownLatch a;
    public final Object c;
    protected final cnv d;
    public cnc e;
    public boolean f;
    public cqq g;
    private final ArrayList h;
    private cnd i;
    private final AtomicReference j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    private boolean n;
    private volatile cne o;
    private cnw resultGuardian;

    protected BasePendingResult(cmv cmvVar) {
        this.c = new Object();
        this.a = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.f = false;
        this.d = new cnv(((coh) cmvVar).a.f);
        new WeakReference(cmvVar);
    }

    private final cnc b() {
        cnc cncVar;
        synchronized (this.c) {
            oy.aq(!this.l, "Result has already been consumed.");
            oy.aq(m(), "Result is not ready.");
            cncVar = this.e;
            this.e = null;
            this.i = null;
            this.l = true;
        }
        cpd cpdVar = (cpd) this.j.getAndSet(null);
        if (cpdVar != null) {
            cpdVar.a();
        }
        oy.at(cncVar);
        return cncVar;
    }

    private final void g(cnc cncVar) {
        this.e = cncVar;
        this.k = cncVar.b();
        this.g = null;
        this.a.countDown();
        if (this.m) {
            this.i = null;
        } else {
            cnd cndVar = this.i;
            if (cndVar != null) {
                cnv cnvVar = this.d;
                cnvVar.removeMessages(2);
                cnvVar.a(cndVar, b());
            } else if (this.e instanceof cna) {
                this.resultGuardian = new cnw(this);
            }
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cmy) arrayList.get(i)).a(this.k);
        }
        arrayList.clear();
    }

    public static void k(cnc cncVar) {
        if (cncVar instanceof cna) {
            try {
                ((cna) cncVar).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(cncVar))), e);
            }
        }
    }

    protected abstract cnc a(Status status);

    @Override // defpackage.cmz
    public final void c(cmy cmyVar) {
        synchronized (this.c) {
            if (m()) {
                cmyVar.a(this.k);
            } else {
                this.h.add(cmyVar);
            }
        }
    }

    @Override // defpackage.cmz
    public final void d() {
        synchronized (this.c) {
            if (!this.m && !this.l) {
                cqq cqqVar = this.g;
                if (cqqVar != null) {
                    try {
                        cqqVar.d(2, cqqVar.a());
                    } catch (RemoteException unused) {
                    }
                }
                k(this.e);
                this.m = true;
                g(a(Status.e));
            }
        }
    }

    @Override // defpackage.cmz
    public final void e(TimeUnit timeUnit) {
        oy.aq(!this.l, "Result has already been consumed.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                j(Status.d);
            }
        } catch (InterruptedException unused) {
            j(Status.b);
        }
        oy.aq(m(), "Result is not ready.");
        b();
    }

    @Override // defpackage.cmz
    public final void f(cnd cndVar, TimeUnit timeUnit) {
        boolean z;
        Object obj = this.c;
        synchronized (obj) {
            oy.aq(!this.l, "Result has already been consumed.");
            synchronized (obj) {
                z = this.m;
            }
        }
        if (z) {
            return;
        }
        if (m()) {
            this.d.a(cndVar, b());
        } else {
            this.i = cndVar;
            cnv cnvVar = this.d;
            cnvVar.sendMessageDelayed(cnvVar.obtainMessage(2, this), timeUnit.toMillis(3L));
        }
    }

    @Deprecated
    public final void j(Status status) {
        synchronized (this.c) {
            if (!m()) {
                l(a(status));
                this.n = true;
            }
        }
    }

    public final void l(cnc cncVar) {
        synchronized (this.c) {
            if (this.n || this.m) {
                k(cncVar);
                return;
            }
            m();
            oy.aq(!m(), "Results have already been set");
            oy.aq(!this.l, "Result has already been consumed");
            g(cncVar);
        }
    }

    public final boolean m() {
        return this.a.getCount() == 0;
    }

    @Deprecated
    BasePendingResult() {
        this.c = new Object();
        this.a = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.f = false;
        this.d = new cnv(Looper.getMainLooper());
        new WeakReference(null);
    }
}
