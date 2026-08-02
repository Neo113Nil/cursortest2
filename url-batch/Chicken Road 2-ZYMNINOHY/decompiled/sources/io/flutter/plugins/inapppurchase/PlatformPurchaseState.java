package io.flutter.plugins.inapppurchase;

import i3.InterfaceC0459a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlatformPurchaseState {
    private static final /* synthetic */ InterfaceC0459a $ENTRIES;
    private static final /* synthetic */ PlatformPurchaseState[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final PlatformPurchaseState UNSPECIFIED = new PlatformPurchaseState("UNSPECIFIED", 0, 0);
    public static final PlatformPurchaseState PURCHASED = new PlatformPurchaseState("PURCHASED", 1, 1);
    public static final PlatformPurchaseState PENDING = new PlatformPurchaseState("PENDING", 2, 2);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformPurchaseState ofRaw(int i4) {
            for (PlatformPurchaseState platformPurchaseState : PlatformPurchaseState.values()) {
                if (platformPurchaseState.getRaw() == i4) {
                    return platformPurchaseState;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformPurchaseState[] $values() {
        return new PlatformPurchaseState[]{UNSPECIFIED, PURCHASED, PENDING};
    }

    static {
        PlatformPurchaseState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = O3.d.m($values);
        Companion = new Companion(null);
    }

    private PlatformPurchaseState(String str, int i4, int i5) {
        this.raw = i5;
    }

    public static InterfaceC0459a getEntries() {
        return $ENTRIES;
    }

    public static PlatformPurchaseState valueOf(String str) {
        return (PlatformPurchaseState) Enum.valueOf(PlatformPurchaseState.class, str);
    }

    public static PlatformPurchaseState[] values() {
        return (PlatformPurchaseState[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
