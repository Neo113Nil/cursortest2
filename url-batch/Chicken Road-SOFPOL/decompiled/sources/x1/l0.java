package x1;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f8494d;

    public l0(m0 m0Var) {
        this.f8494d = m0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f8494d.f8501g.removeCallbacks(this);
        m0.m(this.f8494d);
        m0 m0Var = this.f8494d;
        synchronized (m0Var.f8502h) {
            if (m0Var.f8506m) {
                m0Var.f8506m = false;
                ArrayList arrayList = m0Var.f8503j;
                m0Var.f8503j = m0Var.f8504k;
                m0Var.f8504k = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j7);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0.m(this.f8494d);
        m0 m0Var = this.f8494d;
        synchronized (m0Var.f8502h) {
            if (m0Var.f8503j.isEmpty()) {
                m0Var.f8500f.removeFrameCallback(this);
                m0Var.f8506m = false;
            }
        }
    }
}
