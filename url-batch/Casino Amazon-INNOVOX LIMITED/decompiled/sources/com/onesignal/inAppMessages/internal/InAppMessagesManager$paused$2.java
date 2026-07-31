package com.onesignal.inAppMessages.internal;

import androidx.compose.runtime.ComposerKt;
import com.onesignal.inAppMessages.internal.triggers.ITriggerController;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: InAppMessagesManager.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$paused$2", f = "InAppMessagesManager.kt", i = {0}, l = {1119, ComposerKt.referenceKey, ComposerKt.reuseKey}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class InAppMessagesManager$paused$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessagesManager$paused$2(InAppMessagesManager inAppMessagesManager, Continuation<? super InAppMessagesManager$paused$2> continuation) {
        super(1, continuation);
        this.this$0 = inAppMessagesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InAppMessagesManager$paused$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((InAppMessagesManager$paused$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (r8 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        final InAppMessagesManager inAppMessagesManager;
        Mutex mutex2;
        List list;
        Object evaluateInAppMessages;
        Object attemptToShowInAppMessage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.this$0.messageDisplayQueueMutex;
                inAppMessagesManager = this.this$0;
                this.L$0 = mutex;
                this.L$1 = inAppMessagesManager;
                this.label = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    mutex2 = mutex;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                inAppMessagesManager = (InAppMessagesManager) this.L$1;
                mutex2 = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.label = 3;
                attemptToShowInAppMessage = this.this$0.attemptToShowInAppMessage(this);
            }
            list = inAppMessagesManager.messageDisplayQueue;
            CollectionsKt.removeAll(list, (Function1) new Function1<InAppMessage, Boolean>() { // from class: com.onesignal.inAppMessages.internal.InAppMessagesManager$paused$2$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(InAppMessage it) {
                    ITriggerController iTriggerController;
                    boolean z;
                    Set set;
                    Intrinsics.checkNotNullParameter(it, "it");
                    iTriggerController = InAppMessagesManager.this._triggerController;
                    if (iTriggerController.evaluateMessageTriggers(it) && !it.isFinished()) {
                        set = InAppMessagesManager.this.dismissedMessages;
                        if (!set.contains(it.getMessageId())) {
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
            });
            mutex2.unlock(null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            evaluateInAppMessages = this.this$0.evaluateInAppMessages(this);
        } catch (Throwable th) {
            mutex2.unlock(null);
            throw th;
        }
    }
}
