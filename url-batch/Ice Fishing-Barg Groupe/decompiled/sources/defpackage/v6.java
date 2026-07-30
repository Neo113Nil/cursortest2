package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v6 extends ju {
    public static final t6 Companion = new t6();
    public static final qc2 EcgxDIVH5in8 = new qc2(g2.RfyTYNmI9Srp);
    public static final s6 S9EYkSpbGuxq = new s6(0);
    public boolean BRwzKIf41E4i;
    public final x6 RfyTYNmI9Srp;
    public final Handler dgRBjINgWbAK;
    public boolean gPXPFXrUH4XX;
    public final Choreographer wdg6QnbFHrFF;
    public final Object x50lh2ztY7Y5 = new Object();
    public final da cpQdD2nAriOS = new da();
    public ArrayList r3s1LDPKFs1S = new ArrayList();
    public ArrayList QrzZRwfaDlRX = new ArrayList();
    public final u6 XL4ISE6Oc65B = new u6(this);

    public v6(Choreographer choreographer, Handler handler) {
        this.wdg6QnbFHrFF = choreographer;
        this.dgRBjINgWbAK = handler;
        this.RfyTYNmI9Srp = new x6(choreographer, this);
    }

    public static final void zf8DYfih6EZu(v6 v6Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (v6Var.x50lh2ztY7Y5) {
                da daVar = v6Var.cpQdD2nAriOS;
                runnable = (Runnable) (daVar.isEmpty() ? null : daVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (v6Var.x50lh2ztY7Y5) {
                    da daVar2 = v6Var.cpQdD2nAriOS;
                    runnable = (Runnable) (daVar2.isEmpty() ? null : daVar2.removeFirst());
                }
            }
            synchronized (v6Var.x50lh2ztY7Y5) {
                if (v6Var.cpQdD2nAriOS.isEmpty()) {
                    z = false;
                    v6Var.gPXPFXrUH4XX = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.ju
    public final void Pf0ThKz3j5YS(hu huVar, Runnable runnable) {
        synchronized (this.x50lh2ztY7Y5) {
            this.cpQdD2nAriOS.addLast(runnable);
            if (!this.gPXPFXrUH4XX) {
                this.gPXPFXrUH4XX = true;
                this.dgRBjINgWbAK.post(this.XL4ISE6Oc65B);
                if (!this.BRwzKIf41E4i) {
                    this.BRwzKIf41E4i = true;
                    this.wdg6QnbFHrFF.postFrameCallback(this.XL4ISE6Oc65B);
                }
            }
        }
    }
}
