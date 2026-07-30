package K;

import O7.C0382g;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: n, reason: collision with root package name */
    public final C0382g f1477n;

    public h(C0382g c0382g) {
        super(false);
        this.f1477n = c0382g;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f1477n.resumeWith(com.bumptech.glide.f.e(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f1477n.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
