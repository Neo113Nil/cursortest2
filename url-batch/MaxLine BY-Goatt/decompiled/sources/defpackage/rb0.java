package defpackage;

import defpackage.aa2;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class rb0 extends ht2 {
    public int o;

    public rb0(int i) {
        super(false, 0L);
        this.o = i;
    }

    public abstract o30 d();

    public Throwable f(Object obj) {
        gx gxVar = obj instanceof gx ? (gx) obj : null;
        if (gxVar != null) {
            return gxVar.a;
        }
        return null;
    }

    public final void i(Throwable th) {
        zm3.B(new e50("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.g61) r5.m(defpackage.qb2.U);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            o30 d = d();
            d.getClass();
            pb0 pb0Var = (pb0) d;
            r30 r30Var = pb0Var.q;
            Object obj = pb0Var.s;
            CoroutineContext context = r30Var.getContext();
            Object c = zw2.c(context, obj);
            g61 g61Var = null;
            x13 c2 = c != zw2.a ? r40.c(r30Var, context, c) : null;
            try {
                CoroutineContext context2 = r30Var.getContext();
                Object j = j();
                Throwable f = f(j);
                if (f == null) {
                    int i = this.o;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (g61Var != null && !g61Var.b()) {
                    CancellationException v = g61Var.v();
                    b(v);
                    aa2.a aVar = aa2.m;
                    r30Var.resumeWith(ca2.a(v));
                } else if (f != null) {
                    aa2.a aVar2 = aa2.m;
                    r30Var.resumeWith(new ba2(f));
                } else {
                    aa2.a aVar3 = aa2.m;
                    r30Var.resumeWith(h(j));
                }
                Unit unit = Unit.a;
                if (c2 != null && !c2.o0()) {
                    return;
                }
                zw2.a(context, c);
            } catch (Throwable th) {
                if (c2 == null || c2.o0()) {
                    zw2.a(context, c);
                }
                throw th;
            }
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
