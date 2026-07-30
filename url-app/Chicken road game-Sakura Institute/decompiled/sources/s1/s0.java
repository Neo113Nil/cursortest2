package s1;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t0 f8415f;

    public s0(t0 t0Var) {
        this.f8415f = t0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        this.f8415f.f8423i.removeCallbacks(this);
        t0.Z(this.f8415f);
        t0 t0Var = this.f8415f;
        synchronized (t0Var.f8424j) {
            if (t0Var.f8429o) {
                t0Var.f8429o = false;
                ArrayList arrayList = t0Var.f8426l;
                t0Var.f8426l = t0Var.f8427m;
                t0Var.f8427m = arrayList;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((Choreographer.FrameCallback) arrayList.get(i7)).doFrame(j8);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        t0.Z(this.f8415f);
        t0 t0Var = this.f8415f;
        synchronized (t0Var.f8424j) {
            if (t0Var.f8426l.isEmpty()) {
                t0Var.f8422h.removeFrameCallback(this);
                t0Var.f8429o = false;
            }
        }
    }
}
