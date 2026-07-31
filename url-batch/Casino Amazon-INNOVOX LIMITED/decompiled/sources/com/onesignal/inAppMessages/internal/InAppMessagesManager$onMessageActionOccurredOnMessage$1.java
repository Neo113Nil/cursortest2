package com.onesignal.inAppMessages.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: InAppMessagesManager.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageActionOccurredOnMessage$1", f = "InAppMessagesManager.kt", i = {}, l = {816, 817, 819, 821}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class InAppMessagesManager$onMessageActionOccurredOnMessage$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ InAppMessageClickResult $action;
    final /* synthetic */ InAppMessage $message;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessagesManager$onMessageActionOccurredOnMessage$1(InAppMessageClickResult inAppMessageClickResult, InAppMessage inAppMessage, InAppMessagesManager inAppMessagesManager, Continuation<? super InAppMessagesManager$onMessageActionOccurredOnMessage$1> continuation) {
        super(1, continuation);
        this.$action = inAppMessageClickResult;
        this.$message = inAppMessage;
        this.this$0 = inAppMessagesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InAppMessagesManager$onMessageActionOccurredOnMessage$1(this.$action, this.$message, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((InAppMessagesManager$onMessageActionOccurredOnMessage$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r9 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object firePublicClickHandler;
        Object beginProcessingPrompts;
        Object fireRESTCallForClick;
        Object fireOutcomesForClick;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$action.setFirstClick(this.$message.takeActionAsUnique());
            this.label = 1;
            firePublicClickHandler = this.this$0.firePublicClickHandler(this.$message, this.$action, this);
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            this.this$0.fireClickAction(this.$action);
            this.label = 3;
            fireRESTCallForClick = this.this$0.fireRESTCallForClick(this.$message, this.$action, this);
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.fireTagCallForClick(this.$action);
            this.label = 4;
            fireOutcomesForClick = this.this$0.fireOutcomesForClick(this.$message.getMessageId(), this.$action.getOutcomes(), this);
        }
        this.label = 2;
        beginProcessingPrompts = this.this$0.beginProcessingPrompts(this.$message, this.$action.getPrompts(), this);
    }
}
