package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Ldev/hyo/openiap/IapEvent;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "PurchaseUpdated", "PurchaseError", "PromotedProductIos", "UserChoiceBillingAndroid", "DeveloperProvidedBillingAndroid", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IapEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IapEvent[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final IapEvent PurchaseUpdated = new IapEvent("PurchaseUpdated", 0, "purchase-updated");
    public static final IapEvent PurchaseError = new IapEvent("PurchaseError", 1, "purchase-error");
    public static final IapEvent PromotedProductIos = new IapEvent("PromotedProductIos", 2, "promoted-product-ios");
    public static final IapEvent UserChoiceBillingAndroid = new IapEvent("UserChoiceBillingAndroid", 3, "user-choice-billing-android");
    public static final IapEvent DeveloperProvidedBillingAndroid = new IapEvent("DeveloperProvidedBillingAndroid", 4, "developer-provided-billing-android");

    private static final /* synthetic */ IapEvent[] $values() {
        return new IapEvent[]{PurchaseUpdated, PurchaseError, PromotedProductIos, UserChoiceBillingAndroid, DeveloperProvidedBillingAndroid};
    }

    public static EnumEntries<IapEvent> getEntries() {
        return $ENTRIES;
    }

    public static IapEvent valueOf(String str) {
        return (IapEvent) Enum.valueOf(IapEvent.class, str);
    }

    public static IapEvent[] values() {
        return (IapEvent[]) $VALUES.clone();
    }

    private IapEvent(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        IapEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/IapEvent$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/IapEvent;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final IapEvent fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2056159949:
                    if (value.equals("user-choice-billing-android")) {
                        return IapEvent.UserChoiceBillingAndroid;
                    }
                    break;
                case -1913374737:
                    if (value.equals("purchase-updated")) {
                        return IapEvent.PurchaseUpdated;
                    }
                    break;
                case -578836480:
                    if (value.equals("UserChoiceBillingAndroid")) {
                        return IapEvent.UserChoiceBillingAndroid;
                    }
                    break;
                case -548928153:
                    if (value.equals("PurchaseError")) {
                        return IapEvent.PurchaseError;
                    }
                    break;
                case -354907690:
                    if (value.equals("developer-provided-billing-android")) {
                        return IapEvent.DeveloperProvidedBillingAndroid;
                    }
                    break;
                case 465987132:
                    if (value.equals("purchase-error")) {
                        return IapEvent.PurchaseError;
                    }
                    break;
                case 1139571841:
                    if (value.equals("DeveloperProvidedBillingAndroid")) {
                        return IapEvent.DeveloperProvidedBillingAndroid;
                    }
                    break;
                case 1323052678:
                    if (value.equals("promoted-product-ios")) {
                        return IapEvent.PromotedProductIos;
                    }
                    break;
                case 2005579866:
                    if (value.equals("PurchaseUpdated")) {
                        return IapEvent.PurchaseUpdated;
                    }
                    break;
                case 2116728962:
                    if (value.equals("PromotedProductIOS")) {
                        return IapEvent.PromotedProductIos;
                    }
                    break;
                case 2116729986:
                    if (value.equals("PromotedProductIos")) {
                        return IapEvent.PromotedProductIos;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown IapEvent value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
