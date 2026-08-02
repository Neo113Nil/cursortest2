package papa;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import papa.MainThreadMessageSpy;

/* loaded from: classes3.dex */
public abstract class Handlers {
    public static final Lazy mainThreadHandler$delegate = LazyKt.lazy(new Handlers$$ExternalSyntheticLambda1(0));

    public static void checkOnMainThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Handlers$$ExternalSyntheticBUOutline0.m(Thread.currentThread(), "Should be called from the main thread, not ");
    }

    public static Handler getMainThreadHandler() {
        return (Handler) mainThreadHandler$delegate.getValue();
    }

    public static void onCurrentMainThreadMessageFinished(final Function0 function0) {
        checkOnMainThread();
        int i = 0;
        if (MainThreadMessageSpy.enabled) {
            checkOnMainThread();
            if (MainThreadMessageSpy.currentMessageAsString != null && (!StringsKt.contains((CharSequence) r0, (CharSequence) "androidx.test.espresso", false))) {
                MainThreadMessageSpy.tracers.add(new MainThreadMessageSpy.Tracer() { // from class: papa.MainThreadMessageSpy$onCurrentMessageFinished$1
                    @Override // papa.MainThreadMessageSpy.Tracer
                    public final void onMessageDispatch(String str, boolean z) {
                        MainThreadMessageSpy.tracers.remove(this);
                        Function0.this.invoke();
                    }
                });
                return;
            }
        }
        Handler mainThreadHandler = getMainThreadHandler();
        Message obtain = Message.obtain(mainThreadHandler, new Handlers$$ExternalSyntheticLambda2(i, function0));
        obtain.setAsynchronous(true);
        mainThreadHandler.sendMessageAtFrontOfQueue(obtain);
    }
}
