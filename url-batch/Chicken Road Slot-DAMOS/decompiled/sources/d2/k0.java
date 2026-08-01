package d2;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f3452d;

    public k0(l0 l0Var) {
        this.f3452d = l0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f3452d.f3457r.removeCallbacks(this);
        l0.P(this.f3452d);
        l0 l0Var = this.f3452d;
        synchronized (l0Var.f3458s) {
            if (l0Var.f3463x) {
                l0Var.f3463x = false;
                ArrayList arrayList = l0Var.f3460u;
                l0Var.f3460u = l0Var.f3461v;
                l0Var.f3461v = arrayList;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Choreographer.FrameCallback) arrayList.get(i3)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0.P(this.f3452d);
        l0 l0Var = this.f3452d;
        synchronized (l0Var.f3458s) {
            if (l0Var.f3460u.isEmpty()) {
                l0Var.f3456i.removeFrameCallback(this);
                l0Var.f3463x = false;
            }
        }
    }
}
