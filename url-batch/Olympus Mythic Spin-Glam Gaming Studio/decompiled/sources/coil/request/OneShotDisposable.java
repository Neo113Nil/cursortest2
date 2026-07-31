package coil.request;

import kotlinx.coroutines.Deferred;

/* compiled from: Disposable.kt */
/* loaded from: classes14.dex */
public final class OneShotDisposable implements Disposable {
    private final Deferred job;

    public OneShotDisposable(Deferred deferred) {
        this.job = deferred;
    }
}
