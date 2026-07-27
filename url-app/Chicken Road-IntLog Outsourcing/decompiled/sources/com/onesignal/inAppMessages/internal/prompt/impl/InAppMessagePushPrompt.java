package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import com.onesignal.notifications.INotificationsManager;
import e5.g;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class InAppMessagePushPrompt extends InAppMessagePrompt {
    private final INotificationsManager _notificationsManager;

    public InAppMessagePushPrompt(INotificationsManager _notificationsManager) {
        i.e(_notificationsManager, "_notificationsManager");
        this._notificationsManager = _notificationsManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    public String getPromptKey() {
        return InAppMessagePromptTypes.PUSH_PROMPT_KEY;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(InterfaceC1218d interfaceC1218d) {
        InAppMessagePushPrompt$handlePrompt$1 inAppMessagePushPrompt$handlePrompt$1;
        int i2;
        if (interfaceC1218d instanceof InAppMessagePushPrompt$handlePrompt$1) {
            inAppMessagePushPrompt$handlePrompt$1 = (InAppMessagePushPrompt$handlePrompt$1) interfaceC1218d;
            int i3 = inAppMessagePushPrompt$handlePrompt$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagePushPrompt$handlePrompt$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppMessagePushPrompt$handlePrompt$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagePushPrompt$handlePrompt$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    INotificationsManager iNotificationsManager = this._notificationsManager;
                    inAppMessagePushPrompt$handlePrompt$1.label = 1;
                    obj = iNotificationsManager.requestPermission(true, inAppMessagePushPrompt$handlePrompt$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return !((Boolean) obj).booleanValue() ? InAppMessagePrompt.PromptActionResult.PERMISSION_GRANTED : InAppMessagePrompt.PromptActionResult.PERMISSION_DENIED;
            }
        }
        inAppMessagePushPrompt$handlePrompt$1 = new InAppMessagePushPrompt$handlePrompt$1(this, interfaceC1218d);
        Object obj2 = inAppMessagePushPrompt$handlePrompt$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagePushPrompt$handlePrompt$1.label;
        if (i2 != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }
}
