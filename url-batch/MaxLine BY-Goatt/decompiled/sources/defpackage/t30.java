package defpackage;

import android.os.OutcomeReceiver;
import defpackage.aa2;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t30 extends AtomicBoolean implements OutcomeReceiver {
    public final fs m;

    public t30(fs fsVar) {
        super(false);
        this.m = fsVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            aa2.a aVar = aa2.m;
            this.m.resumeWith(ca2.a(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            aa2.a aVar = aa2.m;
            this.m.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
