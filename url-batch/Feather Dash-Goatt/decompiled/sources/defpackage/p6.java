package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class p6 extends ln {
    public static final cg1 q = ee0.b(p2.l);
    public static final n6 r = new n6();
    public final Choreographer g;
    public final Handler h;
    public boolean m;
    public boolean n;
    public final r6 p;
    public final Object i = new Object();
    public final m9 j = new m9();
    public ArrayList k = new ArrayList();
    public ArrayList l = new ArrayList();
    public final o6 o = new o6(this);

    public p6(Choreographer choreographer, Handler handler) {
        this.g = choreographer;
        this.h = handler;
        this.p = new r6(choreographer, this);
    }

    public static final void n(p6 p6Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (p6Var.i) {
                m9 m9Var = p6Var.j;
                runnable = (Runnable) (m9Var.isEmpty() ? null : m9Var.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (p6Var.i) {
                    m9 m9Var2 = p6Var.j;
                    runnable = (Runnable) (m9Var2.isEmpty() ? null : m9Var2.removeFirst());
                }
            }
            synchronized (p6Var.i) {
                if (p6Var.j.isEmpty()) {
                    z = false;
                    p6Var.m = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.ln
    public final void f(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.i) {
            this.j.addLast(runnable);
            if (!this.m) {
                this.m = true;
                this.h.post(this.o);
                if (!this.n) {
                    this.n = true;
                    this.g.postFrameCallback(this.o);
                }
            }
        }
    }
}
