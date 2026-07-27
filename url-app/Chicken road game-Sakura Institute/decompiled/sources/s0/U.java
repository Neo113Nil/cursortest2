package s0;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class U implements Choreographer.FrameCallback, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f10137d;

    public U(V v4) {
        this.f10137d = v4;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        this.f10137d.f10142j.removeCallbacks(this);
        V.A(this.f10137d);
        V v4 = this.f10137d;
        synchronized (v4.f10143k) {
            if (v4.f10148p) {
                v4.f10148p = false;
                ArrayList arrayList = v4.f10145m;
                v4.f10145m = v4.f10146n;
                v4.f10146n = arrayList;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Choreographer.FrameCallback) arrayList.get(i2)).doFrame(j4);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        V.A(this.f10137d);
        V v4 = this.f10137d;
        synchronized (v4.f10143k) {
            try {
                if (v4.f10145m.isEmpty()) {
                    v4.f10141i.removeFrameCallback(this);
                    v4.f10148p = false;
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
