package t4;

import y7.InterfaceC5255a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ InterfaceC5255a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NOTIFICATION_CLICK = new b("NOTIFICATION_CLICK", 0);
    public static final b APP_OPEN = new b("APP_OPEN", 1);
    public static final b APP_CLOSE = new b("APP_CLOSE", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{NOTIFICATION_CLICK, APP_OPEN, APP_CLOSE};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = W2.e.d($values);
    }

    private b(String str, int i) {
    }

    public static InterfaceC5255a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
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
