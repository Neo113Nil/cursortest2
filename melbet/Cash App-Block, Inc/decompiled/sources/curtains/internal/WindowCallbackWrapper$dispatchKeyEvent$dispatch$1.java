package curtains.internal;

import android.view.KeyEvent;
import android.view.MotionEvent;
import curtains.DispatchState;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class WindowCallbackWrapper$dispatchKeyEvent$dispatch$1 implements Function1 {
    public final /* synthetic */ Iterator $iterator;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WindowCallbackWrapper this$0;

    public /* synthetic */ WindowCallbackWrapper$dispatchKeyEvent$dispatch$1(WindowCallbackWrapper windowCallbackWrapper, Iterator it, int i) {
        this.$r8$classId = i;
        this.this$0 = windowCallbackWrapper;
        this.$iterator = it;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        DispatchState.NotConsumed notConsumed = DispatchState.NotConsumedInternalOnly;
        DispatchState.Consumed consumed = DispatchState.Consumed.INSTANCE;
        WindowCallbackWrapper windowCallbackWrapper = this.this$0;
        Iterator it = this.$iterator;
        switch (i) {
            case 0:
                KeyEvent keyEvent = (KeyEvent) obj;
                keyEvent.getClass();
                if (!it.hasNext()) {
                    if (windowCallbackWrapper.delegate.dispatchKeyEvent(keyEvent)) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                motionEvent.getClass();
                if (!it.hasNext()) {
                    if (windowCallbackWrapper.delegate.dispatchTouchEvent(motionEvent)) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return consumed;
    }
}
