package io.flutter.plugins.inapppurchase;

import i3.InterfaceC0459a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlatformReplacementMode {
    private static final /* synthetic */ InterfaceC0459a $ENTRIES;
    private static final /* synthetic */ PlatformReplacementMode[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final PlatformReplacementMode UNKNOWN_REPLACEMENT_MODE = new PlatformReplacementMode("UNKNOWN_REPLACEMENT_MODE", 0, 0);
    public static final PlatformReplacementMode WITH_TIME_PRORATION = new PlatformReplacementMode("WITH_TIME_PRORATION", 1, 1);
    public static final PlatformReplacementMode CHARGE_PRORATED_PRICE = new PlatformReplacementMode("CHARGE_PRORATED_PRICE", 2, 2);
    public static final PlatformReplacementMode WITHOUT_PRORATION = new PlatformReplacementMode("WITHOUT_PRORATION", 3, 3);
    public static final PlatformReplacementMode DEFERRED = new PlatformReplacementMode("DEFERRED", 4, 4);
    public static final PlatformReplacementMode CHARGE_FULL_PRICE = new PlatformReplacementMode("CHARGE_FULL_PRICE", 5, 5);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformReplacementMode ofRaw(int i4) {
            for (PlatformReplacementMode platformReplacementMode : PlatformReplacementMode.values()) {
                if (platformReplacementMode.getRaw() == i4) {
                    return platformReplacementMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformReplacementMode[] $values() {
        return new PlatformReplacementMode[]{UNKNOWN_REPLACEMENT_MODE, WITH_TIME_PRORATION, CHARGE_PRORATED_PRICE, WITHOUT_PRORATION, DEFERRED, CHARGE_FULL_PRICE};
    }

    static {
        PlatformReplacementMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = O3.d.m($values);
        Companion = new Companion(null);
    }

    private PlatformReplacementMode(String str, int i4, int i5) {
        this.raw = i5;
    }

    public static InterfaceC0459a getEntries() {
        return $ENTRIES;
    }

    public static PlatformReplacementMode valueOf(String str) {
        return (PlatformReplacementMode) Enum.valueOf(PlatformReplacementMode.class, str);
    }

    public static PlatformReplacementMode[] values() {
        return (PlatformReplacementMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
