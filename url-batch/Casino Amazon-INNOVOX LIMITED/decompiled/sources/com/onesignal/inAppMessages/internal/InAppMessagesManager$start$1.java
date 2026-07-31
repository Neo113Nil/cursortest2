package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.repositories.IInAppRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$start$1", f = "InAppMessagesManager.kt", i = {}, l = {236, 239}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class InAppMessagesManager$start$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessagesManager$start$1(InAppMessagesManager inAppMessagesManager, Continuation<? super InAppMessagesManager$start$1> continuation) {
        super(1, continuation);
        this.this$0 = inAppMessagesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InAppMessagesManager$start$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((InAppMessagesManager$start$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r5.cleanCachedInAppMessages(r4) == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068 A[LOOP:0: B:7:0x0062->B:9:0x0068, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IInAppRepository iInAppRepository;
        List list;
        IInAppRepository iInAppRepository2;
        List list2;
        List list3;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            iInAppRepository = this.this$0._repository;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                list2.addAll((Collection) obj);
                list3 = this.this$0.redisplayedInAppMessages;
                it = list3.iterator();
                while (it.hasNext()) {
                    ((InAppMessage) it.next()).setDisplayedInSession(false);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        list = this.this$0.redisplayedInAppMessages;
        iInAppRepository2 = this.this$0._repository;
        this.L$0 = list;
        this.label = 2;
        Object listInAppMessages = iInAppRepository2.listInAppMessages(this);
        if (listInAppMessages != coroutine_suspended) {
            list2 = list;
            obj = listInAppMessages;
            list2.addAll((Collection) obj);
            list3 = this.this$0.redisplayedInAppMessages;
            it = list3.iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
