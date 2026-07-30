package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u6 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ v6 rtx2ld2ELZv4;

    public u6(v6 v6Var) {
        this.rtx2ld2ELZv4 = v6Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.rtx2ld2ELZv4.dgRBjINgWbAK.removeCallbacks(this);
        v6.zf8DYfih6EZu(this.rtx2ld2ELZv4);
        v6 v6Var = this.rtx2ld2ELZv4;
        synchronized (v6Var.x50lh2ztY7Y5) {
            if (v6Var.BRwzKIf41E4i) {
                v6Var.BRwzKIf41E4i = false;
                ArrayList arrayList = v6Var.r3s1LDPKFs1S;
                v6Var.r3s1LDPKFs1S = v6Var.QrzZRwfaDlRX;
                v6Var.QrzZRwfaDlRX = arrayList;
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
        v6.zf8DYfih6EZu(this.rtx2ld2ELZv4);
        v6 v6Var = this.rtx2ld2ELZv4;
        synchronized (v6Var.x50lh2ztY7Y5) {
            if (v6Var.r3s1LDPKFs1S.isEmpty()) {
                v6Var.wdg6QnbFHrFF.removeFrameCallback(this);
                v6Var.BRwzKIf41E4i = false;
            }
        }
    }
}
