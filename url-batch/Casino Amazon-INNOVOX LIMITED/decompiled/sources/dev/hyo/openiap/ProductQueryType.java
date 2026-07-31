package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/ProductQueryType;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "InApp", "Subs", "All", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductQueryType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductQueryType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ProductQueryType InApp = new ProductQueryType("InApp", 0, "in-app");
    public static final ProductQueryType Subs = new ProductQueryType("Subs", 1, "subs");
    public static final ProductQueryType All = new ProductQueryType("All", 2, "all");

    private static final /* synthetic */ ProductQueryType[] $values() {
        return new ProductQueryType[]{InApp, Subs, All};
    }

    public static EnumEntries<ProductQueryType> getEntries() {
        return $ENTRIES;
    }

    public static ProductQueryType valueOf(String str) {
        return (ProductQueryType) Enum.valueOf(ProductQueryType.class, str);
    }

    public static ProductQueryType[] values() {
        return (ProductQueryType[]) $VALUES.clone();
    }

    private ProductQueryType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        ProductQueryType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/ProductQueryType$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductQueryType;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ProductQueryType fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1185881735:
                    if (value.equals("in-app")) {
                        return ProductQueryType.InApp;
                    }
                    break;
                case 65921:
                    if (value.equals("All")) {
                        return ProductQueryType.All;
                    }
                    break;
                case 96673:
                    if (value.equals("all")) {
                        return ProductQueryType.All;
                    }
                    break;
                case 2588243:
                    if (value.equals("Subs")) {
                        return ProductQueryType.Subs;
                    }
                    break;
                case 3541555:
                    if (value.equals("subs")) {
                        return ProductQueryType.Subs;
                    }
                    break;
                case 70760092:
                    if (value.equals("InApp")) {
                        return ProductQueryType.InApp;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown ProductQueryType value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
