package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class InAppMessagePromptFactory implements IInAppMessagePromptFactory {
    private final ILocationManager _locationManager;
    private final INotificationsManager _notificationsManager;

    public InAppMessagePromptFactory(INotificationsManager _notificationsManager, ILocationManager _locationManager) {
        i.e(_notificationsManager, "_notificationsManager");
        i.e(_locationManager, "_locationManager");
        this._notificationsManager = _notificationsManager;
        this._locationManager = _locationManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.IInAppMessagePromptFactory
    public InAppMessagePrompt createPrompt(String promptType) {
        i.e(promptType, "promptType");
        if (promptType.equals(InAppMessagePromptTypes.PUSH_PROMPT_KEY)) {
            return new InAppMessagePushPrompt(this._notificationsManager);
        }
        if (promptType.equals(InAppMessagePromptTypes.LOCATION_PROMPT_KEY)) {
            return new InAppMessageLocationPrompt(this._locationManager);
        }
        return null;
    }
}
