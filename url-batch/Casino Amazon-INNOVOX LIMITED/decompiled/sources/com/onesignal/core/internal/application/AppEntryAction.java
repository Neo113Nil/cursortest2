package com.onesignal.core.internal.application;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppEntryAction.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/onesignal/core/internal/application/AppEntryAction;", "", "(Ljava/lang/String;I)V", "isAppClose", "", "()Z", "isAppOpen", "isNotificationClick", "NOTIFICATION_CLICK", "APP_OPEN", "APP_CLOSE", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppEntryAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppEntryAction[] $VALUES;
    public static final AppEntryAction NOTIFICATION_CLICK = new AppEntryAction("NOTIFICATION_CLICK", 0);
    public static final AppEntryAction APP_OPEN = new AppEntryAction("APP_OPEN", 1);
    public static final AppEntryAction APP_CLOSE = new AppEntryAction("APP_CLOSE", 2);

    private static final /* synthetic */ AppEntryAction[] $values() {
        return new AppEntryAction[]{NOTIFICATION_CLICK, APP_OPEN, APP_CLOSE};
    }

    public static EnumEntries<AppEntryAction> getEntries() {
        return $ENTRIES;
    }

    public static AppEntryAction valueOf(String str) {
        return (AppEntryAction) Enum.valueOf(AppEntryAction.class, str);
    }

    public static AppEntryAction[] values() {
        return (AppEntryAction[]) $VALUES.clone();
    }

    private AppEntryAction(String str, int i) {
    }

    static {
        AppEntryAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final boolean isNotificationClick() {
        return this == NOTIFICATION_CLICK;
    }

    public final boolean isAppOpen() {
        return this == APP_OPEN;
    }

    public final boolean isAppClose() {
        return this == APP_CLOSE;
    }
}
