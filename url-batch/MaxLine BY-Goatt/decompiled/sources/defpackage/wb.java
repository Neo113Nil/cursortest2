package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wb implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ xb m;

    public wb(xb xbVar) {
        this.m = xbVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.m.p.removeCallbacks(this);
        xb.R(this.m);
        xb xbVar = this.m;
        synchronized (xbVar.q) {
            if (xbVar.v) {
                xbVar.v = false;
                ArrayList arrayList = xbVar.s;
                xbVar.s = xbVar.t;
                xbVar.t = arrayList;
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
        xb.R(this.m);
        xb xbVar = this.m;
        synchronized (xbVar.q) {
            try {
                if (xbVar.s.isEmpty()) {
                    xbVar.o.removeFrameCallback(this);
                    xbVar.v = false;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
