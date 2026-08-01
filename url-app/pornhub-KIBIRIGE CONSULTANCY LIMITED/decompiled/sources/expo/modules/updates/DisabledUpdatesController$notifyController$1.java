package expo.modules.updates;

import com.facebook.imageutils.JfifUtil;
import expo.modules.updates.launcher.Launcher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: DisabledUpdatesController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.DisabledUpdatesController$notifyController$1", f = "DisabledUpdatesController.kt", i = {0}, l = {JfifUtil.MARKER_RST0}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class DisabledUpdatesController$notifyController$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DisabledUpdatesController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisabledUpdatesController$notifyController$1(DisabledUpdatesController disabledUpdatesController, Continuation<? super DisabledUpdatesController$notifyController$1> continuation) {
        super(2, continuation);
        this.this$0 = disabledUpdatesController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DisabledUpdatesController$notifyController$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DisabledUpdatesController$notifyController$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        DisabledUpdatesController disabledUpdatesController;
        CompletableDeferred completableDeferred;
        Launcher launcher;
        CompletableDeferred completableDeferred2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.this$0.loaderTaskFinishedMutex;
            DisabledUpdatesController disabledUpdatesController2 = this.this$0;
            this.L$0 = mutex;
            this.L$1 = disabledUpdatesController2;
            this.label = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            disabledUpdatesController = disabledUpdatesController2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            disabledUpdatesController = (DisabledUpdatesController) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            completableDeferred = disabledUpdatesController.loaderTaskFinishedDeferred;
            if (!completableDeferred.isCompleted()) {
                launcher = disabledUpdatesController.launcher;
                if (launcher != null) {
                    completableDeferred2 = disabledUpdatesController.loaderTaskFinishedDeferred;
                    completableDeferred2.complete(Unit.INSTANCE);
                } else {
                    throw new AssertionError("UpdatesController.notifyController was called with a null launcher, which is an error. This method should only be called when an update is ready to launch.");
                }
            }
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
