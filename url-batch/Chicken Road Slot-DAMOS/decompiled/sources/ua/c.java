package ua;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c NONE = new c("NONE", 0);
    public static final c FATAL = new c("FATAL", 1);
    public static final c ERROR = new c("ERROR", 2);
    public static final c WARN = new c("WARN", 3);
    public static final c INFO = new c("INFO", 4);
    public static final c DEBUG = new c("DEBUG", 5);
    public static final c VERBOSE = new c("VERBOSE", 6);

    private static final /* synthetic */ c[] $values() {
        return new c[]{NONE, FATAL, ERROR, WARN, INFO, DEBUG, VERBOSE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = i7.a.J($values);
        Companion = new a(null);
    }

    private c(String str, int i3) {
    }

    public static final c fromInt(int i3) {
        return Companion.fromInt(i3);
    }

    public static od.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c fromInt(int i3) {
            return c.values()[i3];
        }

        private a() {
        }
    }
}
