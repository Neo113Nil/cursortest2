package kotlinx.coroutines.android;

import android.view.Choreographer;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes4.dex */
public final /* synthetic */ class HandlerDispatcherKt$$ExternalSyntheticLambda0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HandlerDispatcherKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                ((CancellableContinuationImpl) obj).resumeUndispatched(MainDispatcherLoader.dispatcher, Long.valueOf(j));
                break;
            case 1:
                ((Runnable) obj).run();
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
    }
}
