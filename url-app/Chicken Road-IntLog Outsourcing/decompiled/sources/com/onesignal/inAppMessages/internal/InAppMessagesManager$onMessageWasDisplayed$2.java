package com.onesignal.inAppMessages.internal;

import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import e5.g;
import f4.v;
import java.util.Set;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageWasDisplayed$2", f = "InAppMessagesManager.kt", l = {766}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessagesManager$onMessageWasDisplayed$2 extends h implements InterfaceC1441l {
    final /* synthetic */ InAppMessage $message;
    final /* synthetic */ String $variantId;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$onMessageWasDisplayed$2(InAppMessagesManager inAppMessagesManager, String str, InAppMessage inAppMessage, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = inAppMessagesManager;
        this.$variantId = str;
        this.$message = inAppMessage;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new InAppMessagesManager$onMessageWasDisplayed$2(this.this$0, this.$variantId, this.$message, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Set set;
        IInAppBackendService iInAppBackendService;
        ConfigModelStore configModelStore;
        ISubscriptionManager iSubscriptionManager;
        IInAppPreferencesController iInAppPreferencesController;
        Set<String> set2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                g.y(obj);
                iInAppBackendService = this.this$0._backend;
                configModelStore = this.this$0._configModelStore;
                String appId = configModelStore.getModel().getAppId();
                iSubscriptionManager = this.this$0._subscriptionManager;
                String id = iSubscriptionManager.getSubscriptions().getPush().getId();
                String str = this.$variantId;
                String messageId = this.$message.getMessageId();
                this.label = 1;
                if (iInAppBackendService.sendIAMImpression(appId, id, str, messageId, this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
            iInAppPreferencesController = this.this$0._prefs;
            set2 = this.this$0.impressionedMessages;
            iInAppPreferencesController.setImpressionesMessagesId(set2);
        } catch (BackendException unused) {
            set = this.this$0.impressionedMessages;
            set.remove(this.$message.getMessageId());
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((InAppMessagesManager$onMessageWasDisplayed$2) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
