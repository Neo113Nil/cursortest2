package io.flutter.plugins.inapppurchase;

import i3.InterfaceC0459a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlatformBillingClientFeature {
    private static final /* synthetic */ InterfaceC0459a $ENTRIES;
    private static final /* synthetic */ PlatformBillingClientFeature[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final PlatformBillingClientFeature ALTERNATIVE_BILLING_ONLY = new PlatformBillingClientFeature("ALTERNATIVE_BILLING_ONLY", 0, 0);
    public static final PlatformBillingClientFeature BILLING_CONFIG = new PlatformBillingClientFeature("BILLING_CONFIG", 1, 1);
    public static final PlatformBillingClientFeature EXTERNAL_OFFER = new PlatformBillingClientFeature("EXTERNAL_OFFER", 2, 2);
    public static final PlatformBillingClientFeature IN_APP_MESSAGING = new PlatformBillingClientFeature("IN_APP_MESSAGING", 3, 3);
    public static final PlatformBillingClientFeature PRICE_CHANGE_CONFIRMATION = new PlatformBillingClientFeature("PRICE_CHANGE_CONFIRMATION", 4, 4);
    public static final PlatformBillingClientFeature PRODUCT_DETAILS = new PlatformBillingClientFeature("PRODUCT_DETAILS", 5, 5);
    public static final PlatformBillingClientFeature SUBSCRIPTIONS = new PlatformBillingClientFeature("SUBSCRIPTIONS", 6, 6);
    public static final PlatformBillingClientFeature SUBSCRIPTIONS_UPDATE = new PlatformBillingClientFeature("SUBSCRIPTIONS_UPDATE", 7, 7);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformBillingClientFeature ofRaw(int i4) {
            for (PlatformBillingClientFeature platformBillingClientFeature : PlatformBillingClientFeature.values()) {
                if (platformBillingClientFeature.getRaw() == i4) {
                    return platformBillingClientFeature;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformBillingClientFeature[] $values() {
        return new PlatformBillingClientFeature[]{ALTERNATIVE_BILLING_ONLY, BILLING_CONFIG, EXTERNAL_OFFER, IN_APP_MESSAGING, PRICE_CHANGE_CONFIRMATION, PRODUCT_DETAILS, SUBSCRIPTIONS, SUBSCRIPTIONS_UPDATE};
    }

    static {
        PlatformBillingClientFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = O3.d.m($values);
        Companion = new Companion(null);
    }

    private PlatformBillingClientFeature(String str, int i4, int i5) {
        this.raw = i5;
    }

    public static InterfaceC0459a getEntries() {
        return $ENTRIES;
    }

    public static PlatformBillingClientFeature valueOf(String str) {
        return (PlatformBillingClientFeature) Enum.valueOf(PlatformBillingClientFeature.class, str);
    }

    public static PlatformBillingClientFeature[] values() {
        return (PlatformBillingClientFeature[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
