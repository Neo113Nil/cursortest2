package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class htl extends htp {
    private static final hvh b = new hvh(htl.class);
    private heb c;
    private final boolean d;
    private final boolean e;

    public htl(heb hebVar, boolean z, boolean z2) {
        super(hebVar.size());
        hebVar.getClass();
        this.c = hebVar;
        this.d = z;
        this.e = z2;
    }

    private static void A(Throwable th) {
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean B(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void y(int i, hvi hviVar) {
        try {
            e(i, a.n(hviVar));
        } catch (ExecutionException e) {
            z(e.getCause());
        } catch (Throwable th) {
            z(th);
        }
    }

    private final void z(Throwable th) {
        th.getClass();
        if (this.d && !p(th)) {
            Set set = this.seenExceptionsField;
            if (set == null) {
                Set k = hnu.k();
                d(k);
                htp.a.b(this, k);
                set = this.seenExceptionsField;
                set.getClass();
            }
            if (B(set, th)) {
                A(th);
                return;
            }
        }
        if (th instanceof Error) {
            A(th);
        }
    }

    @Override // defpackage.hsw
    protected final String a() {
        heb hebVar = this.c;
        return hebVar != null ? "futures=".concat(hebVar.toString()) : super.a();
    }

    @Override // defpackage.hsw
    protected final void b() {
        heb hebVar = this.c;
        x(1);
        if ((hebVar != null) && isCancelled()) {
            boolean r = r();
            hjr it = hebVar.iterator();
            while (it.hasNext()) {
                ((hvi) it.next()).cancel(r);
            }
        }
    }

    @Override // defpackage.htp
    public final void d(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable j = j();
        j.getClass();
        B(set, j);
    }

    public abstract void e(int i, Object obj);

    public final void f(heb hebVar) {
        int a = htp.a.a(this);
        int i = 0;
        hoq.I(a >= 0, "Less than 0 remaining futures");
        if (a == 0) {
            if (hebVar != null) {
                hjr it = hebVar.iterator();
                while (it.hasNext()) {
                    hvi hviVar = (hvi) it.next();
                    if (!hviVar.isCancelled()) {
                        y(i, hviVar);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            g();
            x(2);
        }
    }

    public abstract void g();

    final void v() {
        heb hebVar = this.c;
        hebVar.getClass();
        if (hebVar.isEmpty()) {
            g();
            return;
        }
        boolean z = this.d;
        heb hebVar2 = this.c;
        if (!z) {
            final heb hebVar3 = true != this.e ? null : hebVar2;
            Runnable runnable = new Runnable() { // from class: htk
                @Override // java.lang.Runnable
                public final void run() {
                    htl.this.f(hebVar3);
                }
            };
            hjr it = hebVar2.iterator();
            while (it.hasNext()) {
                hvi hviVar = (hvi) it.next();
                if (hviVar.isDone()) {
                    f(hebVar3);
                } else {
                    hviVar.c(runnable, huf.a);
                }
            }
            return;
        }
        hjr it2 = hebVar2.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final hvi hviVar2 = (hvi) it2.next();
            int i2 = i + 1;
            if (hviVar2.isDone()) {
                w(i, hviVar2);
            } else {
                hviVar2.c(new Runnable() { // from class: htj
                    @Override // java.lang.Runnable
                    public final void run() {
                        htl.this.w(i, hviVar2);
                    }
                }, huf.a);
            }
            i = i2;
        }
    }

    public final void w(int i, hvi hviVar) {
        try {
            if (hviVar.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                y(i, hviVar);
            }
        } finally {
            f((heb) null);
        }
    }

    public void x(int i) {
        this.c = null;
    }
}
