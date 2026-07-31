package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import com.onesignal.location.ILocationManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageLocationPrompt.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessageLocationPrompt;", "Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt;", "_locationManager", "Lcom/onesignal/location/ILocationManager;", "(Lcom/onesignal/location/ILocationManager;)V", "promptKey", "", "getPromptKey", "()Ljava/lang/String;", "handlePrompt", "Lcom/onesignal/inAppMessages/internal/prompt/impl/InAppMessagePrompt$PromptActionResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppMessageLocationPrompt extends InAppMessagePrompt {
    private final ILocationManager _locationManager;

    public InAppMessageLocationPrompt(ILocationManager _locationManager) {
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
        this._locationManager = _locationManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(Continuation<? super InAppMessagePrompt.PromptActionResult> continuation) {
        InAppMessageLocationPrompt$handlePrompt$1 inAppMessageLocationPrompt$handlePrompt$1;
        int i;
        boolean booleanValue;
        if (continuation instanceof InAppMessageLocationPrompt$handlePrompt$1) {
            inAppMessageLocationPrompt$handlePrompt$1 = (InAppMessageLocationPrompt$handlePrompt$1) continuation;
            if ((inAppMessageLocationPrompt$handlePrompt$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessageLocationPrompt$handlePrompt$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessageLocationPrompt$handlePrompt$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessageLocationPrompt$handlePrompt$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ILocationManager iLocationManager = this._locationManager;
                    inAppMessageLocationPrompt$handlePrompt$1.label = 1;
                    obj = iLocationManager.requestPermission(inAppMessageLocationPrompt$handlePrompt$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return InAppMessagePrompt.PromptActionResult.PERMISSION_GRANTED;
                }
                if (!booleanValue) {
                    return InAppMessagePrompt.PromptActionResult.PERMISSION_DENIED;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        inAppMessageLocationPrompt$handlePrompt$1 = new InAppMessageLocationPrompt$handlePrompt$1(this, continuation);
        Object obj2 = inAppMessageLocationPrompt$handlePrompt$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessageLocationPrompt$handlePrompt$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    public String getPromptKey() {
        return InAppMessagePromptTypes.LOCATION_PROMPT_KEY;
    }
}
