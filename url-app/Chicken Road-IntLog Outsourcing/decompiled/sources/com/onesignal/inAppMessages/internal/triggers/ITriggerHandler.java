package com.onesignal.inAppMessages.internal.triggers;

/* loaded from: classes.dex */
public interface ITriggerHandler {
    void onTriggerChanged(String str);

    void onTriggerCompleted(String str);

    void onTriggerConditionChanged(String str);
}
