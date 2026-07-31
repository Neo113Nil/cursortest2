package com.onesignal.inAppMessages.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.onesignal.common.consistency.IamFetchReadyCondition;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.user.IUserManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: InAppMessagesManager.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$fetchMessagesWhenConditionIsMet$1", f = "InAppMessagesManager.kt", i = {}, l = {TypedValues.Attributes.TYPE_EASING, TypedValues.Attributes.TYPE_PIVOT_TARGET, 321}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class InAppMessagesManager$fetchMessagesWhenConditionIsMet$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessagesManager$fetchMessagesWhenConditionIsMet$1(InAppMessagesManager inAppMessagesManager, Continuation<? super InAppMessagesManager$fetchMessagesWhenConditionIsMet$1> continuation) {
        super(1, continuation);
        this.this$0 = inAppMessagesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InAppMessagesManager$fetchMessagesWhenConditionIsMet$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((InAppMessagesManager$fetchMessagesWhenConditionIsMet$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IUserManager iUserManager;
        IConsistencyManager iConsistencyManager;
        Object fetchMessages;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            iUserManager = this.this$0._userManager;
            String onesignalId = iUserManager.getOnesignalId();
            iConsistencyManager = this.this$0._consistencyManager;
            this.label = 1;
            obj = iConsistencyManager.getRywDataFromAwaitableCondition(new IamFetchReadyCondition(onesignalId), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                RywData rywData = (RywData) obj;
                if (rywData != null) {
                    this.label = 3;
                    fetchMessages = this.this$0.fetchMessages(rywData, this);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        obj = ((CompletableDeferred) obj).await(this);
    }
}
