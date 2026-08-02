package curtains.internal;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bugsnag.android.Client;
import papa.internal.PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2;

/* loaded from: classes.dex */
public final class NextDrawListener implements ViewTreeObserver.OnDrawListener, View.OnAttachStateChangeListener {
    public boolean invoked;
    public final PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2 onDrawCallback;
    public final View view;

    public NextDrawListener(View view, PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2 perfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2) {
        view.getClass();
        this.view = view;
        this.onDrawCallback = perfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.invoked) {
            return;
        }
        this.invoked = true;
        this.view.removeOnAttachStateChangeListener(this);
        ((Handler) HandlersKt.mainHandler$delegate.getValue()).post(new Client.AnonymousClass3(this, 7));
        this.onDrawCallback.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.getViewTreeObserver().addOnDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        view.getViewTreeObserver().removeOnDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
    }
}
