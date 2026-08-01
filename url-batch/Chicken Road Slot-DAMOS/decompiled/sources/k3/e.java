package k3;

import android.os.OutcomeReceiver;
import hd.l;
import hd.n;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: d, reason: collision with root package name */
    private final ld.a f5381d;

    public e(ge.h hVar) {
        super(false);
        this.f5381d = hVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            ld.a aVar = this.f5381d;
            l lVar = n.f4511e;
            aVar.resumeWith(cf.c.n(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            ld.a aVar = this.f5381d;
            l lVar = n.f4511e;
            aVar.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
