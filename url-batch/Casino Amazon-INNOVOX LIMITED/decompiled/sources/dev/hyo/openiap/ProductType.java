package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Ldev/hyo/openiap/ProductType;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "InApp", "Subs", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ProductType InApp = new ProductType("InApp", 0, "in-app");
    public static final ProductType Subs = new ProductType("Subs", 1, "subs");
    private final String rawValue;

    private static final /* synthetic */ ProductType[] $values() {
        return new ProductType[]{InApp, Subs};
    }

    public static EnumEntries<ProductType> getEntries() {
        return $ENTRIES;
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) $VALUES.clone();
    }

    private ProductType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        ProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/ProductType$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductType;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ProductType fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1185881735:
                    if (value.equals("in-app")) {
                        return ProductType.InApp;
                    }
                    break;
                case 2588243:
                    if (value.equals("Subs")) {
                        return ProductType.Subs;
                    }
                    break;
                case 3541555:
                    if (value.equals("subs")) {
                        return ProductType.Subs;
                    }
                    break;
                case 70760092:
                    if (value.equals("InApp")) {
                        return ProductType.InApp;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown ProductType value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
