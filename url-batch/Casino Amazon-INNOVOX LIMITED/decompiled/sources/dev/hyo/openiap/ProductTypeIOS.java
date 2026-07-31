package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Ldev/hyo/openiap/ProductTypeIOS;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Consumable", "NonConsumable", "AutoRenewableSubscription", "NonRenewingSubscription", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductTypeIOS {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductTypeIOS[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ProductTypeIOS Consumable = new ProductTypeIOS("Consumable", 0, "consumable");
    public static final ProductTypeIOS NonConsumable = new ProductTypeIOS("NonConsumable", 1, "non-consumable");
    public static final ProductTypeIOS AutoRenewableSubscription = new ProductTypeIOS("AutoRenewableSubscription", 2, "auto-renewable-subscription");
    public static final ProductTypeIOS NonRenewingSubscription = new ProductTypeIOS("NonRenewingSubscription", 3, "non-renewing-subscription");

    private static final /* synthetic */ ProductTypeIOS[] $values() {
        return new ProductTypeIOS[]{Consumable, NonConsumable, AutoRenewableSubscription, NonRenewingSubscription};
    }

    public static EnumEntries<ProductTypeIOS> getEntries() {
        return $ENTRIES;
    }

    public static ProductTypeIOS valueOf(String str) {
        return (ProductTypeIOS) Enum.valueOf(ProductTypeIOS.class, str);
    }

    public static ProductTypeIOS[] values() {
        return (ProductTypeIOS[]) $VALUES.clone();
    }

    private ProductTypeIOS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        ProductTypeIOS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/ProductTypeIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductTypeIOS;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ProductTypeIOS fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1586574943:
                    if (value.equals("auto-renewable-subscription")) {
                        return ProductTypeIOS.AutoRenewableSubscription;
                    }
                    break;
                case -796411329:
                    if (value.equals("NonRenewingSubscription")) {
                        return ProductTypeIOS.NonRenewingSubscription;
                    }
                    break;
                case -425074283:
                    if (value.equals("AutoRenewableSubscription")) {
                        return ProductTypeIOS.AutoRenewableSubscription;
                    }
                    break;
                case -390443677:
                    if (value.equals("non-consumable")) {
                        return ProductTypeIOS.NonConsumable;
                    }
                    break;
                case -166371741:
                    if (value.equals("consumable")) {
                        return ProductTypeIOS.Consumable;
                    }
                    break;
                case 94848693:
                    if (value.equals("non-renewing-subscription")) {
                        return ProductTypeIOS.NonRenewingSubscription;
                    }
                    break;
                case 1763621104:
                    if (value.equals("NonConsumable")) {
                        return ProductTypeIOS.NonConsumable;
                    }
                    break;
                case 1827093123:
                    if (value.equals("Consumable")) {
                        return ProductTypeIOS.Consumable;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown ProductTypeIOS value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
