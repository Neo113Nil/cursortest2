package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xb extends t40 {
    public static final y91 y = ya1.b(k8.v);
    public static final vb z = new vb(0);
    public final Choreographer o;
    public final Handler p;
    public boolean u;
    public boolean v;
    public final zb x;
    public final Object q = new Object();
    public final bi r = new bi();
    public ArrayList s = new ArrayList();
    public ArrayList t = new ArrayList();
    public final wb w = new wb(this);

    public xb(Choreographer choreographer, Handler handler) {
        this.o = choreographer;
        this.p = handler;
        this.x = new zb(choreographer, this);
    }

    public static final void R(xb xbVar) {
        Runnable runnable;
        boolean z2;
        do {
            synchronized (xbVar.q) {
                bi biVar = xbVar.r;
                runnable = (Runnable) (biVar.isEmpty() ? null : biVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (xbVar.q) {
                    bi biVar2 = xbVar.r;
                    runnable = (Runnable) (biVar2.isEmpty() ? null : biVar2.removeFirst());
                }
            }
            synchronized (xbVar.q) {
                if (xbVar.r.isEmpty()) {
                    z2 = false;
                    xbVar.u = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    @Override // defpackage.t40
    public final void N(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.q) {
            try {
                this.r.addLast(runnable);
                if (!this.u) {
                    this.u = true;
                    this.p.post(this.w);
                    if (!this.v) {
                        this.v = true;
                        this.o.postFrameCallback(this.w);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
