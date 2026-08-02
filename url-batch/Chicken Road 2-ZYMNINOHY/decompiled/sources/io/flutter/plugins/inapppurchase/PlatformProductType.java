package io.flutter.plugins.inapppurchase;

import i3.InterfaceC0459a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlatformProductType {
    private static final /* synthetic */ InterfaceC0459a $ENTRIES;
    private static final /* synthetic */ PlatformProductType[] $VALUES;
    public static final Companion Companion;
    public static final PlatformProductType INAPP = new PlatformProductType("INAPP", 0, 0);
    public static final PlatformProductType SUBS = new PlatformProductType("SUBS", 1, 1);
    private final int raw;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformProductType ofRaw(int i4) {
            for (PlatformProductType platformProductType : PlatformProductType.values()) {
                if (platformProductType.getRaw() == i4) {
                    return platformProductType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformProductType[] $values() {
        return new PlatformProductType[]{INAPP, SUBS};
    }

    static {
        PlatformProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = O3.d.m($values);
        Companion = new Companion(null);
    }

    private PlatformProductType(String str, int i4, int i5) {
        this.raw = i5;
    }

    public static InterfaceC0459a getEntries() {
        return $ENTRIES;
    }

    public static PlatformProductType valueOf(String str) {
        return (PlatformProductType) Enum.valueOf(PlatformProductType.class, str);
    }

    public static PlatformProductType[] values() {
        return (PlatformProductType[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
