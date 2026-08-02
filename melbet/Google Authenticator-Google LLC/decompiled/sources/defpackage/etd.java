package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etd {
    public final Context c;
    public final hac d;
    public final hac e;
    public final ewg f;
    public final hac g;
    public final evs h;
    public final ldt i = new ldt((byte[]) null);
    private final hac m;
    private final hac n;
    private static final Object j = new Object();
    public static final AtomicReference a = new AtomicReference();
    private static volatile etd k = null;
    private static volatile etd l = null;
    public static final hac b = hoq.v(new csm(19));

    public etd(Context context, hac hacVar, hac hacVar2, hac hacVar3, hac hacVar4, hac hacVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        hacVar.getClass();
        hacVar2.getClass();
        hacVar3.getClass();
        hacVar4.getClass();
        hacVar5.getClass();
        hac v = hoq.v(hacVar);
        hac v2 = hoq.v(hacVar2);
        hac v3 = hoq.v(new eks(hacVar3, 15));
        hac v4 = hoq.v(hacVar4);
        hac v5 = hoq.v(hacVar5);
        this.c = applicationContext;
        this.m = v;
        this.n = v2;
        this.d = v3;
        this.e = v4;
        this.f = new ewg(applicationContext, v, v2);
        this.g = v5;
        this.h = new evs(applicationContext, v, v3, v2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static etd a(Context context) {
        boolean z;
        etd etdVar = k;
        if (etdVar != null) {
            return etdVar;
        }
        Context applicationContext = context.getApplicationContext();
        try {
        } catch (IllegalStateException unused) {
            z = false;
        }
        try {
            return (etd) ((gzs) ((etc) hnu.bp(applicationContext, etc.class)).k()).a;
        } catch (IllegalStateException unused2) {
            z = true;
            synchronized (j) {
                if (k != null) {
                    return k;
                }
                gzp gzpVar = gyf.a;
                boolean z2 = applicationContext instanceof etc;
                if (z2) {
                    gzpVar = ((etc) applicationContext).k();
                }
                etd etdVar2 = (etd) gzpVar.c(new eks(applicationContext, 12));
                k = etdVar2;
                if (!z && !z2) {
                    eos.N(Level.CONFIG, etdVar2.d(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                }
                return etdVar2;
            }
        }
    }

    public static hac c(Context context) {
        return hoq.v(new eks(context, 13));
    }

    public static void e(Context context) {
        Context context2;
        if (a.get() != null) {
            return;
        }
        try {
            context2 = context.getApplicationContext();
        } catch (NullPointerException unused) {
            f();
            eos.N(Level.WARNING, (Executor) b.bB(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            context2 = null;
        }
        if (context2 != null) {
            a.j(a, context2);
        }
    }

    public static void f() {
        etf.a();
        if (a.get() == null && etf.a == null) {
            etf.a = new ete();
        }
    }

    public final etp b() {
        return (etp) this.n.bB();
    }

    public final hvm d() {
        return (hvm) this.m.bB();
    }
}
