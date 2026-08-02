package curtains;

import android.view.MotionEvent;
import curtains.internal.WindowCallbackWrapper$dispatchKeyEvent$dispatch$1;

/* loaded from: classes.dex */
public interface TouchEventInterceptor {
    DispatchState intercept(MotionEvent motionEvent, WindowCallbackWrapper$dispatchKeyEvent$dispatch$1 windowCallbackWrapper$dispatchKeyEvent$dispatch$1);
}
