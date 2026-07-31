package dev.hyo.openiap;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/AlternativeBillingModeAndroid;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "None", "UserChoice", "AlternativeOnly", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlternativeBillingModeAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlternativeBillingModeAndroid[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final AlternativeBillingModeAndroid None = new AlternativeBillingModeAndroid("None", 0, ViewProps.NONE);
    public static final AlternativeBillingModeAndroid UserChoice = new AlternativeBillingModeAndroid("UserChoice", 1, "user-choice");
    public static final AlternativeBillingModeAndroid AlternativeOnly = new AlternativeBillingModeAndroid("AlternativeOnly", 2, "alternative-only");

    private static final /* synthetic */ AlternativeBillingModeAndroid[] $values() {
        return new AlternativeBillingModeAndroid[]{None, UserChoice, AlternativeOnly};
    }

    public static EnumEntries<AlternativeBillingModeAndroid> getEntries() {
        return $ENTRIES;
    }

    public static AlternativeBillingModeAndroid valueOf(String str) {
        return (AlternativeBillingModeAndroid) Enum.valueOf(AlternativeBillingModeAndroid.class, str);
    }

    public static AlternativeBillingModeAndroid[] values() {
        return (AlternativeBillingModeAndroid[]) $VALUES.clone();
    }

    private AlternativeBillingModeAndroid(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        AlternativeBillingModeAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/AlternativeBillingModeAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/AlternativeBillingModeAndroid;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AlternativeBillingModeAndroid fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2044784157:
                    if (value.equals("user-choice")) {
                        return AlternativeBillingModeAndroid.UserChoice;
                    }
                    break;
                case -1514152500:
                    if (value.equals("alternative-only")) {
                        return AlternativeBillingModeAndroid.AlternativeOnly;
                    }
                    break;
                case -1178612372:
                    if (value.equals("UserChoice")) {
                        return AlternativeBillingModeAndroid.UserChoice;
                    }
                    break;
                case 2433880:
                    if (value.equals("None")) {
                        return AlternativeBillingModeAndroid.None;
                    }
                    break;
                case 3387192:
                    if (value.equals(ViewProps.NONE)) {
                        return AlternativeBillingModeAndroid.None;
                    }
                    break;
                case 1033360601:
                    if (value.equals("AlternativeOnly")) {
                        return AlternativeBillingModeAndroid.AlternativeOnly;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown AlternativeBillingModeAndroid value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
