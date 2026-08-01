package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class yh extends i80 implements jf, le {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(yh.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public int h;
    public final bf i;
    public final x70 j;
    public Object k;
    public final Object l;

    public yh(bf bfVar, x70 x70Var) {
        super(0L, false);
        this.h = -1;
        this.i = bfVar;
        this.j = x70Var;
        this.k = la0.j;
        ye yeVar = x70Var.g;
        yeVar.getClass();
        Object f = yeVar.f(0, b9.n);
        f.getClass();
        this.l = f;
    }

    public final void a(Throwable th) {
        lf lfVar = new lf("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th);
        ye yeVar = this.j.g;
        yeVar.getClass();
        mz.t(yeVar, lfVar);
    }

    @Override // defpackage.jf
    public final jf c() {
        return this.j;
    }

    @Override // defpackage.le
    public final ye d() {
        ye yeVar = this.j.g;
        yeVar.getClass();
        return yeVar;
    }

    @Override // defpackage.le
    public final void e(Object obj) {
        Throwable th = obj instanceof q30 ? ((q30) obj).f : null;
        Object kcVar = th == null ? obj : new kc(th);
        x70 x70Var = this.j;
        ye yeVar = x70Var.g;
        yeVar.getClass();
        bf bfVar = this.i;
        if (bfVar.r(yeVar)) {
            this.k = kcVar;
            this.h = 0;
            yeVar.getClass();
            bfVar.q(yeVar, this);
            return;
        }
        ThreadLocal threadLocal = a90.a;
        sk skVar = (sk) threadLocal.get();
        if (skVar == null) {
            skVar = new n8(Thread.currentThread());
            threadLocal.set(skVar);
        }
        long j = skVar.h;
        if (j >= 4294967296L) {
            this.k = kcVar;
            this.h = 0;
            q6 q6Var = skVar.j;
            if (q6Var == null) {
                q6Var = new q6();
                skVar.j = q6Var;
            }
            q6Var.addLast(this);
            return;
        }
        skVar.h = 4294967296L + j;
        try {
            yeVar.getClass();
            Object V = b9.V(yeVar, this.l);
            try {
                x70Var.e(obj);
                while (skVar.y()) {
                }
            } finally {
                b9.O(yeVar, V);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        try {
            x70 x70Var = this.j;
            ye yeVar = x70Var.g;
            Object obj = this.l;
            yeVar.getClass();
            Object V = b9.V(yeVar, obj);
            if (V != b9.m && yeVar.h(va0.f) != null) {
                jf jfVar = x70Var;
                do {
                    jfVar = jfVar.c();
                } while (jfVar != null);
            }
            try {
                yeVar.getClass();
                Object obj2 = this.k;
                this.k = la0.j;
                ur urVar = null;
                kc kcVar = obj2 instanceof kc ? (kc) obj2 : null;
                Throwable th = kcVar != null ? kcVar.a : null;
                if (th == null && ((i = this.h) == 1 || i == 2)) {
                    urVar = (ur) yeVar.h(ej.l);
                }
                if (urVar != null && !urVar.s()) {
                    x70Var.e(new q30(urVar.m()));
                } else if (th != null) {
                    x70Var.e(new q30(th));
                } else {
                    x70Var.e(obj2);
                }
                b9.O(yeVar, V);
            } catch (Throwable th2) {
                b9.O(yeVar, V);
                throw th2;
            }
        } catch (Throwable th3) {
            a(th3);
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.i + ", " + xf.N(this.j) + ']';
    }
}
