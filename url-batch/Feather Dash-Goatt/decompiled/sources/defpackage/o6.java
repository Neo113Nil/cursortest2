package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o6 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ p6 d;

    public o6(p6 p6Var) {
        this.d = p6Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.d.h.removeCallbacks(this);
        p6.n(this.d);
        p6 p6Var = this.d;
        synchronized (p6Var.i) {
            if (p6Var.n) {
                p6Var.n = false;
                ArrayList arrayList = p6Var.k;
                p6Var.k = p6Var.l;
                p6Var.l = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        p6.n(this.d);
        p6 p6Var = this.d;
        synchronized (p6Var.i) {
            if (p6Var.k.isEmpty()) {
                p6Var.g.removeFrameCallback(this);
                p6Var.n = false;
            }
        }
    }
}
