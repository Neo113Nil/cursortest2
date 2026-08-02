package papa.internal;

import android.app.Activity;
import android.view.MotionEvent;
import curtains.DispatchState;
import curtains.TouchEventInterceptor;
import curtains.internal.WindowCallbackWrapper$dispatchKeyEvent$dispatch$1;

/* loaded from: classes3.dex */
public final class ViewTreeObserversKt$onNextTouchEvent$1 implements TouchEventInterceptor {
    public final /* synthetic */ ViewTreeObservers$$ExternalSyntheticLambda3 $callback;
    public final /* synthetic */ Activity $this_onNextTouchEvent;

    public ViewTreeObserversKt$onNextTouchEvent$1(ViewTreeObservers$$ExternalSyntheticLambda3 viewTreeObservers$$ExternalSyntheticLambda3, Activity activity) {
        this.$callback = viewTreeObservers$$ExternalSyntheticLambda3;
        this.$this_onNextTouchEvent = activity;
    }

    @Override // curtains.TouchEventInterceptor
    public final DispatchState intercept(MotionEvent motionEvent, WindowCallbackWrapper$dispatchKeyEvent$dispatch$1 windowCallbackWrapper$dispatchKeyEvent$dispatch$1) {
        return DispatchState.Companion.intercept(this, motionEvent, windowCallbackWrapper$dispatchKeyEvent$dispatch$1);
    }
}
