package u0;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class V implements Choreographer.FrameCallback, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f9275d;

    public V(W w2) {
        this.f9275d = w2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f9275d.f9281g.removeCallbacks(this);
        W.H(this.f9275d);
        W w2 = this.f9275d;
        synchronized (w2.f9282h) {
            if (w2.f9287m) {
                w2.f9287m = false;
                ArrayList arrayList = w2.f9284j;
                w2.f9284j = w2.f9285k;
                w2.f9285k = arrayList;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Choreographer.FrameCallback) arrayList.get(i3)).doFrame(j3);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        W.H(this.f9275d);
        W w2 = this.f9275d;
        synchronized (w2.f9282h) {
            if (w2.f9284j.isEmpty()) {
                w2.f9280f.removeFrameCallback(this);
                w2.f9287m = false;
            }
        }
    }
}
