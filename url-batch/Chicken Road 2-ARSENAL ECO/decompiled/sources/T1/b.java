package T1;

import a.AbstractC0219a;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
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
        $ENTRIES = AbstractC0219a.n($values);
    }

    private b(String str, int i7) {
    }

    public static InterfaceC0620a getEntries() {
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
