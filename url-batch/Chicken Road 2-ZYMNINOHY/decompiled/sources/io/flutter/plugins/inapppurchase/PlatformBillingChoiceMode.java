package io.flutter.plugins.inapppurchase;

import i3.InterfaceC0459a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlatformBillingChoiceMode {
    private static final /* synthetic */ InterfaceC0459a $ENTRIES;
    private static final /* synthetic */ PlatformBillingChoiceMode[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final PlatformBillingChoiceMode PLAY_BILLING_ONLY = new PlatformBillingChoiceMode("PLAY_BILLING_ONLY", 0, 0);
    public static final PlatformBillingChoiceMode ALTERNATIVE_BILLING_ONLY = new PlatformBillingChoiceMode("ALTERNATIVE_BILLING_ONLY", 1, 1);
    public static final PlatformBillingChoiceMode USER_CHOICE_BILLING = new PlatformBillingChoiceMode("USER_CHOICE_BILLING", 2, 2);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformBillingChoiceMode ofRaw(int i4) {
            for (PlatformBillingChoiceMode platformBillingChoiceMode : PlatformBillingChoiceMode.values()) {
                if (platformBillingChoiceMode.getRaw() == i4) {
                    return platformBillingChoiceMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformBillingChoiceMode[] $values() {
        return new PlatformBillingChoiceMode[]{PLAY_BILLING_ONLY, ALTERNATIVE_BILLING_ONLY, USER_CHOICE_BILLING};
    }

    static {
        PlatformBillingChoiceMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = O3.d.m($values);
        Companion = new Companion(null);
    }

    private PlatformBillingChoiceMode(String str, int i4, int i5) {
        this.raw = i5;
    }

    public static InterfaceC0459a getEntries() {
        return $ENTRIES;
    }

    public static PlatformBillingChoiceMode valueOf(String str) {
        return (PlatformBillingChoiceMode) Enum.valueOf(PlatformBillingChoiceMode.class, str);
    }

    public static PlatformBillingChoiceMode[] values() {
        return (PlatformBillingChoiceMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
