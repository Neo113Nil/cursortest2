package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pi0 extends ju implements rx {
    public final pi0 cpQdD2nAriOS;
    public final String dgRBjINgWbAK;
    public final Handler wdg6QnbFHrFF;
    public final boolean x50lh2ztY7Y5;

    public pi0(Handler handler, String str, boolean z) {
        this.wdg6QnbFHrFF = handler;
        this.dgRBjINgWbAK = str;
        this.x50lh2ztY7Y5 = z;
        this.cpQdD2nAriOS = z ? this : new pi0(handler, str, true);
    }

    @Override // defpackage.ju
    public final boolean POWyO8hTM6YC(hu huVar) {
        return (this.x50lh2ztY7Y5 && cs0.wdg6QnbFHrFF(Looper.myLooper(), this.wdg6QnbFHrFF.getLooper())) ? false : true;
    }

    @Override // defpackage.ju
    public final void Pf0ThKz3j5YS(hu huVar, Runnable runnable) {
        if (this.wdg6QnbFHrFF.post(runnable)) {
            return;
        }
        zf8DYfih6EZu(huVar, runnable);
    }

    @Override // defpackage.rx
    public final s00 cpQdD2nAriOS(long j, final ak2 ak2Var, hu huVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.wdg6QnbFHrFF.postDelayed(ak2Var, j)) {
            return new s00() { // from class: oi0
                @Override // defpackage.s00
                public final void PxuCJdSBwIXG() {
                    pi0.this.wdg6QnbFHrFF.removeCallbacks(ak2Var);
                }
            };
        }
        zf8DYfih6EZu(huVar, ak2Var);
        return wd1.rtx2ld2ELZv4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pi0)) {
            return false;
        }
        pi0 pi0Var = (pi0) obj;
        return pi0Var.wdg6QnbFHrFF == this.wdg6QnbFHrFF && pi0Var.x50lh2ztY7Y5 == this.x50lh2ztY7Y5;
    }

    @Override // defpackage.rx
    public final void gPXPFXrUH4XX(long j, bi biVar) {
        sh shVar = new sh(1, biVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.wdg6QnbFHrFF.postDelayed(shVar, j)) {
            biVar.IAToe7bXGz4N(new e9gEMXR7LXtO(13, this, shVar));
        } else {
            zf8DYfih6EZu(biVar.x50lh2ztY7Y5, shVar);
        }
    }

    public final int hashCode() {
        return (this.x50lh2ztY7Y5 ? 1231 : 1237) ^ System.identityHashCode(this.wdg6QnbFHrFF);
    }

    @Override // defpackage.ju
    public final String toString() {
        pi0 pi0Var;
        String str;
        yw ywVar = j00.PxuCJdSBwIXG;
        pi0 pi0Var2 = h41.PxuCJdSBwIXG;
        if (this == pi0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                pi0Var = pi0Var2.cpQdD2nAriOS;
            } catch (UnsupportedOperationException unused) {
                pi0Var = null;
            }
            str = this == pi0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.dgRBjINgWbAK;
        if (str2 == null) {
            str2 = this.wdg6QnbFHrFF.toString();
        }
        if (!this.x50lh2ztY7Y5) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public final void zf8DYfih6EZu(hu huVar, Runnable runnable) {
        ki0.XL4ISE6Oc65B(huVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        yw ywVar = j00.PxuCJdSBwIXG;
        qw.wdg6QnbFHrFF.Pf0ThKz3j5YS(huVar, runnable);
    }

    public pi0(Handler handler) {
        this(handler, null, false);
    }
}
