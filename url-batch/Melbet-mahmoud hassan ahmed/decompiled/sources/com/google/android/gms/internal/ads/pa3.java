package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class pa3<InputT, OutputT> extends va3<OutputT> {

    /* renamed from: t, reason: collision with root package name */
    private static final Logger f10151t = Logger.getLogger(pa3.class.getName());

    /* renamed from: q, reason: collision with root package name */
    private z63<? extends cc3<? extends InputT>> f10152q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f10153r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f10154s;

    pa3(z63<? extends cc3<? extends InputT>> z63Var, boolean z6, boolean z7) {
        super(z63Var.size());
        this.f10152q = z63Var;
        this.f10153r = z6;
        this.f10154s = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void N(int i7, Future<? extends InputT> future) {
        try {
            S(i7, rb3.p(future));
        } catch (ExecutionException e7) {
            P(e7.getCause());
        } catch (Throwable th) {
            P(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void W(z63<? extends Future<? extends InputT>> z63Var) {
        int F = F();
        int i7 = 0;
        q43.g(F >= 0, "Less than 0 remaining futures");
        if (F == 0) {
            if (z63Var != null) {
                h93<? extends Future<? extends InputT>> it = z63Var.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> next = it.next();
                    if (!next.isCancelled()) {
                        N(i7, next);
                    }
                    i7++;
                }
            }
            K();
            T();
            M(2);
        }
    }

    private final void P(Throwable th) {
        Objects.requireNonNull(th);
        if (this.f10153r && !x(th) && R(H(), th)) {
            Q(th);
        } else if (th instanceof Error) {
            Q(th);
        }
    }

    private static void Q(Throwable th) {
        f10151t.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean R(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.va3
    final void L(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable a7 = a();
        a7.getClass();
        R(set, a7);
    }

    void M(int i7) {
        this.f10152q = null;
    }

    abstract void S(int i7, InputT inputt);

    abstract void T();

    final void U() {
        z63<? extends cc3<? extends InputT>> z63Var = this.f10152q;
        z63Var.getClass();
        if (z63Var.isEmpty()) {
            T();
            return;
        }
        if (!this.f10153r) {
            final z63<? extends cc3<? extends InputT>> z63Var2 = this.f10154s ? this.f10152q : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.na3
                @Override // java.lang.Runnable
                public final void run() {
                    pa3.this.W(z63Var2);
                }
            };
            h93<? extends cc3<? extends InputT>> it = this.f10152q.iterator();
            while (it.hasNext()) {
                it.next().b(runnable, fb3.INSTANCE);
            }
            return;
        }
        h93<? extends cc3<? extends InputT>> it2 = this.f10152q.iterator();
        final int i7 = 0;
        while (it2.hasNext()) {
            final cc3<? extends InputT> next = it2.next();
            next.b(new Runnable() { // from class: com.google.android.gms.internal.ads.oa3
                @Override // java.lang.Runnable
                public final void run() {
                    pa3.this.V(next, i7);
                }
            }, fb3.INSTANCE);
            i7++;
        }
    }

    final /* synthetic */ void V(cc3 cc3Var, int i7) {
        try {
            if (cc3Var.isCancelled()) {
                this.f10152q = null;
                cancel(false);
            } else {
                N(i7, cc3Var);
            }
        } finally {
            W(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final String i() {
        z63<? extends cc3<? extends InputT>> z63Var = this.f10152q;
        return z63Var != null ? "futures=".concat(z63Var.toString()) : super.i();
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final void j() {
        z63<? extends cc3<? extends InputT>> z63Var = this.f10152q;
        M(1);
        if ((z63Var != null) && isCancelled()) {
            boolean z6 = z();
            h93<? extends cc3<? extends InputT>> it = z63Var.iterator();
            while (it.hasNext()) {
                it.next().cancel(z6);
            }
        }
    }
}
