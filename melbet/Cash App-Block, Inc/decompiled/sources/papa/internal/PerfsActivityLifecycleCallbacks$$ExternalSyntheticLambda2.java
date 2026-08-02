package papa.internal;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import papa.Handlers;

/* loaded from: classes3.dex */
public final /* synthetic */ class PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PerfsActivityLifecycleCallbacks f$0;
    public final /* synthetic */ Activity f$1;

    public /* synthetic */ PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2(PerfsActivityLifecycleCallbacks perfsActivityLifecycleCallbacks, Activity activity, int i) {
        this.$r8$classId = i;
        this.f$0 = perfsActivityLifecycleCallbacks;
        this.f$1 = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Activity activity = this.f$1;
        PerfsActivityLifecycleCallbacks perfsActivityLifecycleCallbacks = this.f$0;
        switch (i) {
            case 0:
                if (!perfsActivityLifecycleCallbacks.firstGlobalLayout) {
                    perfsActivityLifecycleCallbacks.firstGlobalLayout = true;
                    perfsActivityLifecycleCallbacks.updateAppStart(activity.getClass().getName(), new SaversKt$$ExternalSyntheticLambda5(25));
                }
                break;
            case 1:
                if (!perfsActivityLifecycleCallbacks.firstPreDraw) {
                    perfsActivityLifecycleCallbacks.firstPreDraw = true;
                    perfsActivityLifecycleCallbacks.updateAppStart(activity.getClass().getName(), new SaversKt$$ExternalSyntheticLambda5(24));
                }
                break;
            default:
                if (!perfsActivityLifecycleCallbacks.firstDraw) {
                    perfsActivityLifecycleCallbacks.firstDraw = true;
                    String name = activity.getClass().getName();
                    perfsActivityLifecycleCallbacks.updateAppStart(name, new SaversKt$$ExternalSyntheticLambda5(20));
                    final PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda13 perfsActivityLifecycleCallbacks$$ExternalSyntheticLambda13 = new PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda13(perfsActivityLifecycleCallbacks, name, 0);
                    Handlers.checkOnMainThread();
                    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: papa.internal.MainThreadKt$$ExternalSyntheticLambda0
                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda13.this.invoke();
                            return false;
                        }
                    });
                    Handlers.onCurrentMainThreadMessageFinished(new PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda13(perfsActivityLifecycleCallbacks, name, 1));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
