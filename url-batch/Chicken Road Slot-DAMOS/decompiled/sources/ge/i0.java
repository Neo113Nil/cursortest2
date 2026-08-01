package ge;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i0 extends ne.h {

    /* renamed from: i, reason: collision with root package name */
    public int f4361i;

    public i0(int i3) {
        super(false, 0L);
        this.f4361i = i3;
    }

    public abstract ld.a c();

    public Throwable d(Object obj) {
        q qVar = obj instanceof q ? (q) obj : null;
        if (qVar != null) {
            return qVar.f4394a;
        }
        return null;
    }

    public final void i(Throwable th) {
        a0.o(new z("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r4 = (ge.c1) r5.m(ge.u.f4403e);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            ld.a c10 = c();
            c10.getClass();
            le.g gVar = (le.g) c10;
            nd.c cVar = gVar.f5974s;
            Object obj = gVar.f5976u;
            CoroutineContext context = cVar.getContext();
            Object c11 = le.v.c(context, obj);
            c1 c1Var = null;
            z1 c12 = c11 != le.v.f6002a ? r.c(cVar, context, c11) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object j = j();
                Throwable d10 = d(j);
                if (d10 == null) {
                    int i3 = this.f4361i;
                    boolean z10 = true;
                    if (i3 != 1 && i3 != 2) {
                        z10 = false;
                    }
                }
                if (c1Var != null && !c1Var.d()) {
                    CancellationException x10 = c1Var.x();
                    b(x10);
                    hd.l lVar = hd.n.f4511e;
                    cVar.resumeWith(cf.c.n(x10));
                } else if (d10 != null) {
                    hd.l lVar2 = hd.n.f4511e;
                    cVar.resumeWith(new hd.m(d10));
                } else {
                    hd.l lVar3 = hd.n.f4511e;
                    cVar.resumeWith(h(j));
                }
                if (c12 == null || c12.j0()) {
                    le.v.a(context, c11);
                }
            } catch (Throwable th) {
                if (c12 == null || c12.j0()) {
                    le.v.a(context, c11);
                }
                throw th;
            }
        } catch (g0 e2) {
            a0.o(e2.f4351d, c().getContext());
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
