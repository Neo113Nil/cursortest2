package com.onesignal.core.internal.application;

import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AppEntryAction {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ AppEntryAction[] $VALUES;
    public static final AppEntryAction NOTIFICATION_CLICK = new AppEntryAction("NOTIFICATION_CLICK", 0);
    public static final AppEntryAction APP_OPEN = new AppEntryAction("APP_OPEN", 1);
    public static final AppEntryAction APP_CLOSE = new AppEntryAction("APP_CLOSE", 2);

    private static final /* synthetic */ AppEntryAction[] $values() {
        return new AppEntryAction[]{NOTIFICATION_CLICK, APP_OPEN, APP_CLOSE};
    }

    static {
        AppEntryAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
    }

    private AppEntryAction(String str, int i2) {
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static AppEntryAction valueOf(String str) {
        return (AppEntryAction) Enum.valueOf(AppEntryAction.class, str);
    }

    public static AppEntryAction[] values() {
        return (AppEntryAction[]) $VALUES.clone();
    }

    public final boolean isAppClose() {
        return this == APP_CLOSE;
    }

    public final boolean isAppOpen() {
        return this == APP_OPEN;
    }

    public final boolean isNotificationClick() {
        return this == NOTIFICATION_CLICK;
    }
}
