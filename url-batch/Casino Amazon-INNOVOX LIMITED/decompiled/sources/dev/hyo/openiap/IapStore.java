package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Ldev/hyo/openiap/IapStore;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Unknown", "Apple", "Google", "Horizon", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IapStore {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IapStore[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final IapStore Unknown = new IapStore("Unknown", 0, "unknown");
    public static final IapStore Apple = new IapStore("Apple", 1, "apple");
    public static final IapStore Google = new IapStore("Google", 2, "google");
    public static final IapStore Horizon = new IapStore("Horizon", 3, "horizon");

    private static final /* synthetic */ IapStore[] $values() {
        return new IapStore[]{Unknown, Apple, Google, Horizon};
    }

    public static EnumEntries<IapStore> getEntries() {
        return $ENTRIES;
    }

    public static IapStore valueOf(String str) {
        return (IapStore) Enum.valueOf(IapStore.class, str);
    }

    public static IapStore[] values() {
        return (IapStore[]) $VALUES.clone();
    }

    private IapStore(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        IapStore[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/IapStore$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/IapStore;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final IapStore fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1532845701:
                    if (value.equals("Horizon")) {
                        return IapStore.Horizon;
                    }
                    break;
                case -1240244679:
                    if (value.equals("google")) {
                        return IapStore.Google;
                    }
                    break;
                case -284840886:
                    if (value.equals("unknown")) {
                        return IapStore.Unknown;
                    }
                    break;
                case 63476538:
                    if (value.equals("Apple")) {
                        return IapStore.Apple;
                    }
                    break;
                case 93029210:
                    if (value.equals("apple")) {
                        return IapStore.Apple;
                    }
                    break;
                case 1097468315:
                    if (value.equals("horizon")) {
                        return IapStore.Horizon;
                    }
                    break;
                case 1379812394:
                    if (value.equals("Unknown")) {
                        return IapStore.Unknown;
                    }
                    break;
                case 2138589785:
                    if (value.equals("Google")) {
                        return IapStore.Google;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown IapStore value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
