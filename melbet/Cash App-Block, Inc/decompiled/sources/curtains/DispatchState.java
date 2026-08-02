package curtains;

import android.view.MotionEvent;
import android.view.Window;
import curtains.internal.WindowCallbackWrapper;
import curtains.internal.WindowCallbackWrapper$dispatchKeyEvent$dispatch$1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import papa.PapaEvent;
import papa.internal.ViewTreeObserversKt$onNextTouchEvent$1;

/* loaded from: classes9.dex */
public abstract class DispatchState {
    public static final NotConsumed NotConsumedInternalOnly = new NotConsumed();

    public abstract class Companion {
        public static DispatchState from$curtains_release(boolean z) {
            return z ? Consumed.INSTANCE : DispatchState.NotConsumedInternalOnly;
        }

        public static DispatchState intercept(ViewTreeObserversKt$onNextTouchEvent$1 viewTreeObserversKt$onNextTouchEvent$1, MotionEvent motionEvent, WindowCallbackWrapper$dispatchKeyEvent$dispatch$1 windowCallbackWrapper$dispatchKeyEvent$dispatch$1) {
            motionEvent.getClass();
            viewTreeObserversKt$onNextTouchEvent$1.$callback.invoke(motionEvent);
            Window window = viewTreeObserversKt$onNextTouchEvent$1.$this_onNextTouchEvent.getWindow();
            window.getClass();
            Lazy lazy = WindowsKt.tooltipString$delegate;
            Lazy lazy2 = WindowCallbackWrapper.jetpackWrapperClass$delegate;
            ((CopyOnWriteArrayList) PapaEvent.getListeners(window).socket).remove(viewTreeObserversKt$onNextTouchEvent$1);
            return (DispatchState) windowCallbackWrapper$dispatchKeyEvent$dispatch$1.invoke(motionEvent);
        }
    }

    public final class Consumed extends DispatchState {
        public static final Consumed INSTANCE = new Consumed();
    }

    public final class NotConsumed extends DispatchState {
    }
}
