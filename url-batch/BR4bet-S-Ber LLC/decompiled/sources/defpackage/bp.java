package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class bp extends bf implements ah {
    public final Handler h;
    public final boolean i;
    public final bp j;

    public bp(Handler handler, boolean z) {
        this.h = handler;
        this.i = z;
        this.j = z ? this : new bp(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        return bpVar.h == this.h && bpVar.i == this.i;
    }

    public final int hashCode() {
        return (this.i ? 1231 : 1237) ^ System.identityHashCode(this.h);
    }

    @Override // defpackage.bf
    public final void q(ye yeVar, Runnable runnable) {
        if (this.h.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        ur urVar = (ur) yeVar.h(ej.l);
        if (urVar != null) {
            urVar.a(cancellationException);
        }
        og ogVar = zh.a;
        eg.h.q(yeVar, runnable);
    }

    @Override // defpackage.bf
    public final boolean r(ye yeVar) {
        return (this.i && kr.b(Looper.myLooper(), this.h.getLooper())) ? false : true;
    }

    @Override // defpackage.bf
    public final String toString() {
        bp bpVar;
        String str;
        og ogVar = zh.a;
        bp bpVar2 = ou.a;
        if (this == bpVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                bpVar = bpVar2.j;
            } catch (UnsupportedOperationException unused) {
                bpVar = null;
            }
            str = this == bpVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.h.toString();
        if (!this.i) {
            return handler;
        }
        return handler + ".immediate";
    }
}
