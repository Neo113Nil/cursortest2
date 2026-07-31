package coil.request;

import android.view.View;
import kotlinx.coroutines.Deferred;

/* compiled from: Disposable.kt */
/* loaded from: classes12.dex */
public final class ViewTargetDisposable implements Disposable {
    private volatile Deferred job;
    private final View view;

    public ViewTargetDisposable(View view, Deferred deferred) {
        this.view = view;
        this.job = deferred;
    }

    public void setJob(Deferred deferred) {
        this.job = deferred;
    }
}
