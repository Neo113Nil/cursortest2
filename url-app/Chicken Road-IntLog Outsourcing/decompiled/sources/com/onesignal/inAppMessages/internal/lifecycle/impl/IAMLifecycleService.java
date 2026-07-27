package com.onesignal.inAppMessages.internal.lifecycle.impl;

import com.onesignal.common.events.EventProducer;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageClickResult;
import com.onesignal.inAppMessages.internal.InAppMessagePage;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleEventHandler;
import com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class IAMLifecycleService extends EventProducer<IInAppLifecycleEventHandler> implements IInAppLifecycleService {
    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageActionOccurredOnMessage(InAppMessage message, InAppMessageClickResult action) {
        i.e(message, "message");
        i.e(action, "action");
        fire(new IAMLifecycleService$messageActionOccurredOnMessage$1(message, action));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageActionOccurredOnPreview(InAppMessage message, InAppMessageClickResult action) {
        i.e(message, "message");
        i.e(action, "action");
        fire(new IAMLifecycleService$messageActionOccurredOnPreview$1(message, action));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messagePageChanged(InAppMessage message, InAppMessagePage page) {
        i.e(message, "message");
        i.e(page, "page");
        fire(new IAMLifecycleService$messagePageChanged$1(message, page));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageWasDismissed(InAppMessage message) {
        i.e(message, "message");
        fire(new IAMLifecycleService$messageWasDismissed$1(message));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageWasDisplayed(InAppMessage message) {
        i.e(message, "message");
        fire(new IAMLifecycleService$messageWasDisplayed$1(message));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageWillDismiss(InAppMessage message) {
        i.e(message, "message");
        fire(new IAMLifecycleService$messageWillDismiss$1(message));
    }

    @Override // com.onesignal.inAppMessages.internal.lifecycle.IInAppLifecycleService
    public void messageWillDisplay(InAppMessage message) {
        i.e(message, "message");
        fire(new IAMLifecycleService$messageWillDisplay$1(message));
    }
}
