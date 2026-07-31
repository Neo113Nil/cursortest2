package q2;

import java.util.concurrent.CancellationException;
import o2.AbstractC3338k0;

/* loaded from: classes3.dex */
abstract /* synthetic */ class l {
    public static final void a(t tVar, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = AbstractC3338k0.a("Channel was consumed, consumer had failed", th);
            }
        }
        tVar.cancel(r0);
    }
}
