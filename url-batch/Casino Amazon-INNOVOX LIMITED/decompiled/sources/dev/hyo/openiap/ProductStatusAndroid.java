package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Ldev/hyo/openiap/ProductStatusAndroid;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Ok", "NotFound", "NoOffersAvailable", "Unknown", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductStatusAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductStatusAndroid[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ProductStatusAndroid Ok = new ProductStatusAndroid("Ok", 0, "ok");
    public static final ProductStatusAndroid NotFound = new ProductStatusAndroid("NotFound", 1, "not-found");
    public static final ProductStatusAndroid NoOffersAvailable = new ProductStatusAndroid("NoOffersAvailable", 2, "no-offers-available");
    public static final ProductStatusAndroid Unknown = new ProductStatusAndroid("Unknown", 3, "unknown");

    private static final /* synthetic */ ProductStatusAndroid[] $values() {
        return new ProductStatusAndroid[]{Ok, NotFound, NoOffersAvailable, Unknown};
    }

    public static EnumEntries<ProductStatusAndroid> getEntries() {
        return $ENTRIES;
    }

    public static ProductStatusAndroid valueOf(String str) {
        return (ProductStatusAndroid) Enum.valueOf(ProductStatusAndroid.class, str);
    }

    public static ProductStatusAndroid[] values() {
        return (ProductStatusAndroid[]) $VALUES.clone();
    }

    private ProductStatusAndroid(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        ProductStatusAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/ProductStatusAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductStatusAndroid;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ProductStatusAndroid fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2098666799:
                    if (value.equals("NoOffersAvailable")) {
                        return ProductStatusAndroid.NoOffersAvailable;
                    }
                    break;
                case -1861164897:
                    if (value.equals("no-offers-available")) {
                        return ProductStatusAndroid.NoOffersAvailable;
                    }
                    break;
                case -284840886:
                    if (value.equals("unknown")) {
                        return ProductStatusAndroid.Unknown;
                    }
                    break;
                case 2556:
                    if (value.equals("Ok")) {
                        return ProductStatusAndroid.Ok;
                    }
                    break;
                case 3548:
                    if (value.equals("ok")) {
                        return ProductStatusAndroid.Ok;
                    }
                    break;
                case 184069128:
                    if (value.equals("not-found")) {
                        return ProductStatusAndroid.NotFound;
                    }
                    break;
                case 1379812394:
                    if (value.equals("Unknown")) {
                        return ProductStatusAndroid.Unknown;
                    }
                    break;
                case 1617964175:
                    if (value.equals("NotFound")) {
                        return ProductStatusAndroid.NotFound;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown ProductStatusAndroid value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
