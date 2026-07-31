package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseNoticeAction;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Continue", "Dismissed", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExternalPurchaseNoticeAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExternalPurchaseNoticeAction[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ExternalPurchaseNoticeAction Continue = new ExternalPurchaseNoticeAction("Continue", 0, "continue");
    public static final ExternalPurchaseNoticeAction Dismissed = new ExternalPurchaseNoticeAction("Dismissed", 1, "dismissed");
    private final String rawValue;

    private static final /* synthetic */ ExternalPurchaseNoticeAction[] $values() {
        return new ExternalPurchaseNoticeAction[]{Continue, Dismissed};
    }

    public static EnumEntries<ExternalPurchaseNoticeAction> getEntries() {
        return $ENTRIES;
    }

    public static ExternalPurchaseNoticeAction valueOf(String str) {
        return (ExternalPurchaseNoticeAction) Enum.valueOf(ExternalPurchaseNoticeAction.class, str);
    }

    public static ExternalPurchaseNoticeAction[] values() {
        return (ExternalPurchaseNoticeAction[]) $VALUES.clone();
    }

    private ExternalPurchaseNoticeAction(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        ExternalPurchaseNoticeAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseNoticeAction$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ExternalPurchaseNoticeAction;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ExternalPurchaseNoticeAction fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2131532663:
                    if (value.equals("Dismissed")) {
                        return ExternalPurchaseNoticeAction.Dismissed;
                    }
                    break;
                case -567202649:
                    if (value.equals("continue")) {
                        return ExternalPurchaseNoticeAction.Continue;
                    }
                    break;
                case -502558521:
                    if (value.equals("Continue")) {
                        return ExternalPurchaseNoticeAction.Continue;
                    }
                    break;
                case 159466665:
                    if (value.equals("dismissed")) {
                        return ExternalPurchaseNoticeAction.Dismissed;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown ExternalPurchaseNoticeAction value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
