package io.flutter.plugins.inapppurchase;

import i3.InterfaceC0459a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlatformBillingResponse {
    private static final /* synthetic */ InterfaceC0459a $ENTRIES;
    private static final /* synthetic */ PlatformBillingResponse[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final PlatformBillingResponse SERVICE_TIMEOUT = new PlatformBillingResponse("SERVICE_TIMEOUT", 0, 0);
    public static final PlatformBillingResponse FEATURE_NOT_SUPPORTED = new PlatformBillingResponse("FEATURE_NOT_SUPPORTED", 1, 1);
    public static final PlatformBillingResponse SERVICE_DISCONNECTED = new PlatformBillingResponse("SERVICE_DISCONNECTED", 2, 2);
    public static final PlatformBillingResponse OK = new PlatformBillingResponse("OK", 3, 3);
    public static final PlatformBillingResponse USER_CANCELED = new PlatformBillingResponse("USER_CANCELED", 4, 4);
    public static final PlatformBillingResponse SERVICE_UNAVAILABLE = new PlatformBillingResponse("SERVICE_UNAVAILABLE", 5, 5);
    public static final PlatformBillingResponse BILLING_UNAVAILABLE = new PlatformBillingResponse("BILLING_UNAVAILABLE", 6, 6);
    public static final PlatformBillingResponse ITEM_UNAVAILABLE = new PlatformBillingResponse("ITEM_UNAVAILABLE", 7, 7);
    public static final PlatformBillingResponse DEVELOPER_ERROR = new PlatformBillingResponse("DEVELOPER_ERROR", 8, 8);
    public static final PlatformBillingResponse ERROR = new PlatformBillingResponse("ERROR", 9, 9);
    public static final PlatformBillingResponse ITEM_ALREADY_OWNED = new PlatformBillingResponse("ITEM_ALREADY_OWNED", 10, 10);
    public static final PlatformBillingResponse ITEM_NOT_OWNED = new PlatformBillingResponse("ITEM_NOT_OWNED", 11, 11);
    public static final PlatformBillingResponse NETWORK_ERROR = new PlatformBillingResponse("NETWORK_ERROR", 12, 12);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformBillingResponse ofRaw(int i4) {
            for (PlatformBillingResponse platformBillingResponse : PlatformBillingResponse.values()) {
                if (platformBillingResponse.getRaw() == i4) {
                    return platformBillingResponse;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformBillingResponse[] $values() {
        return new PlatformBillingResponse[]{SERVICE_TIMEOUT, FEATURE_NOT_SUPPORTED, SERVICE_DISCONNECTED, OK, USER_CANCELED, SERVICE_UNAVAILABLE, BILLING_UNAVAILABLE, ITEM_UNAVAILABLE, DEVELOPER_ERROR, ERROR, ITEM_ALREADY_OWNED, ITEM_NOT_OWNED, NETWORK_ERROR};
    }

    static {
        PlatformBillingResponse[] $values = $values();
        $VALUES = $values;
        $ENTRIES = O3.d.m($values);
        Companion = new Companion(null);
    }

    private PlatformBillingResponse(String str, int i4, int i5) {
        this.raw = i5;
    }

    public static InterfaceC0459a getEntries() {
        return $ENTRIES;
    }

    public static PlatformBillingResponse valueOf(String str) {
        return (PlatformBillingResponse) Enum.valueOf(PlatformBillingResponse.class, str);
    }

    public static PlatformBillingResponse[] values() {
        return (PlatformBillingResponse[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
