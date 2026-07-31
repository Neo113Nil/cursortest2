package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import com.onesignal.notifications.INotificationsManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessagePushPrompt.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePushPrompt;", "Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt;", "_notificationsManager", "Lcom/onesignal/notifications/INotificationsManager;", "(Lcom/onesignal/notifications/INotificationsManager;)V", "promptKey", "", "getPromptKey", "()Ljava/lang/String;", "handlePrompt", "Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt$PromptActionResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppMessagePushPrompt extends InAppMessagePrompt {
    private final INotificationsManager _notificationsManager;

    public InAppMessagePushPrompt(INotificationsManager _notificationsManager) {
        Intrinsics.checkNotNullParameter(_notificationsManager, "_notificationsManager");
        this._notificationsManager = _notificationsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(Continuation<? super InAppMessagePrompt.PromptActionResult> continuation) {
        InAppMessagePushPrompt$handlePrompt$1 inAppMessagePushPrompt$handlePrompt$1;
        int i;
        if (continuation instanceof InAppMessagePushPrompt$handlePrompt$1) {
            inAppMessagePushPrompt$handlePrompt$1 = (InAppMessagePushPrompt$handlePrompt$1) continuation;
            if ((inAppMessagePushPrompt$handlePrompt$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagePushPrompt$handlePrompt$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessagePushPrompt$handlePrompt$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagePushPrompt$handlePrompt$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    INotificationsManager iNotificationsManager = this._notificationsManager;
                    inAppMessagePushPrompt$handlePrompt$1.label = 1;
                    obj = iNotificationsManager.requestPermission(true, inAppMessagePushPrompt$handlePrompt$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return !((Boolean) obj).booleanValue() ? InAppMessagePrompt.PromptActionResult.PERMISSION_GRANTED : InAppMessagePrompt.PromptActionResult.PERMISSION_DENIED;
            }
        }
        inAppMessagePushPrompt$handlePrompt$1 = new InAppMessagePushPrompt$handlePrompt$1(this, continuation);
        Object obj2 = inAppMessagePushPrompt$handlePrompt$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagePushPrompt$handlePrompt$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    public String getPromptKey() {
        return InAppMessagePromptTypes.PUSH_PROMPT_KEY;
    }
}
