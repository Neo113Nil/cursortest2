package com.squareup.cash.support.chat.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.chat.views.ChatView$30$1;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.protos.cash.supportal.app.SendUserTypingRequest;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SafeFlow;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ChatPresenter$models$10$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatPresenter$models$10$1(ChatPresenter chatPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = chatPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ChatPresenter chatPresenter = this.this$0;
        switch (i) {
            case 0:
                return new ChatPresenter$models$10$1(chatPresenter, continuation, 0);
            default:
                return new ChatPresenter$models$10$1(chatPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ChatPresenter$models$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ChatPresenter chatPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SupportalAppService supportalAppService = chatPresenter.appService;
                        SendUserTypingRequest sendUserTypingRequest = new SendUserTypingRequest(ByteString.EMPTY);
                        this.label = 1;
                        if (supportalAppService.sendUserTyping(sendUserTypingRequest, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (Exception unused) {
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow = new SafeFlow(new BufferCountKt$bufferSkip$1(new SupportHomePresenter$models$lambda$5$$inlined$map$1(chatPresenter.conversationService.allMessages(), 10), null));
                    ChatView$30$1 chatView$30$1 = new ChatView$30$1(chatPresenter, 4);
                    this.label = 1;
                    if (safeFlow.collect(chatView$30$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
