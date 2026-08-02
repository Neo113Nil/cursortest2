package io.flutter.plugins.inapppurchase;

import i3.InterfaceC0459a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlatformRecurrenceMode {
    private static final /* synthetic */ InterfaceC0459a $ENTRIES;
    private static final /* synthetic */ PlatformRecurrenceMode[] $VALUES;
    public static final Companion Companion;
    public static final PlatformRecurrenceMode FINITE_RECURRING = new PlatformRecurrenceMode("FINITE_RECURRING", 0, 0);
    public static final PlatformRecurrenceMode INFINITE_RECURRING = new PlatformRecurrenceMode("INFINITE_RECURRING", 1, 1);
    public static final PlatformRecurrenceMode NON_RECURRING = new PlatformRecurrenceMode("NON_RECURRING", 2, 2);
    private final int raw;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformRecurrenceMode ofRaw(int i4) {
            for (PlatformRecurrenceMode platformRecurrenceMode : PlatformRecurrenceMode.values()) {
                if (platformRecurrenceMode.getRaw() == i4) {
                    return platformRecurrenceMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformRecurrenceMode[] $values() {
        return new PlatformRecurrenceMode[]{FINITE_RECURRING, INFINITE_RECURRING, NON_RECURRING};
    }

    static {
        PlatformRecurrenceMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = O3.d.m($values);
        Companion = new Companion(null);
    }

    private PlatformRecurrenceMode(String str, int i4, int i5) {
        this.raw = i5;
    }

    public static InterfaceC0459a getEntries() {
        return $ENTRIES;
    }

    public static PlatformRecurrenceMode valueOf(String str) {
        return (PlatformRecurrenceMode) Enum.valueOf(PlatformRecurrenceMode.class, str);
    }

    public static PlatformRecurrenceMode[] values() {
        return (PlatformRecurrenceMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
