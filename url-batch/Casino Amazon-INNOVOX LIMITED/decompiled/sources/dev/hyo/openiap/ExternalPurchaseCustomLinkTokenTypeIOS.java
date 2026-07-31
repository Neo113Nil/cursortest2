package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenTypeIOS;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Acquisition", "Services", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExternalPurchaseCustomLinkTokenTypeIOS {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExternalPurchaseCustomLinkTokenTypeIOS[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final ExternalPurchaseCustomLinkTokenTypeIOS Acquisition = new ExternalPurchaseCustomLinkTokenTypeIOS("Acquisition", 0, "acquisition");
    public static final ExternalPurchaseCustomLinkTokenTypeIOS Services = new ExternalPurchaseCustomLinkTokenTypeIOS("Services", 1, "services");

    private static final /* synthetic */ ExternalPurchaseCustomLinkTokenTypeIOS[] $values() {
        return new ExternalPurchaseCustomLinkTokenTypeIOS[]{Acquisition, Services};
    }

    public static EnumEntries<ExternalPurchaseCustomLinkTokenTypeIOS> getEntries() {
        return $ENTRIES;
    }

    public static ExternalPurchaseCustomLinkTokenTypeIOS valueOf(String str) {
        return (ExternalPurchaseCustomLinkTokenTypeIOS) Enum.valueOf(ExternalPurchaseCustomLinkTokenTypeIOS.class, str);
    }

    public static ExternalPurchaseCustomLinkTokenTypeIOS[] values() {
        return (ExternalPurchaseCustomLinkTokenTypeIOS[]) $VALUES.clone();
    }

    private ExternalPurchaseCustomLinkTokenTypeIOS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        ExternalPurchaseCustomLinkTokenTypeIOS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenTypeIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenTypeIOS;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ExternalPurchaseCustomLinkTokenTypeIOS fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1354746003:
                    if (value.equals("Acquisition")) {
                        return ExternalPurchaseCustomLinkTokenTypeIOS.Acquisition;
                    }
                    break;
                case 1272352653:
                    if (value.equals("acquisition")) {
                        return ExternalPurchaseCustomLinkTokenTypeIOS.Acquisition;
                    }
                    break;
                case 1379209310:
                    if (value.equals("services")) {
                        return ExternalPurchaseCustomLinkTokenTypeIOS.Services;
                    }
                    break;
                case 1443853438:
                    if (value.equals("Services")) {
                        return ExternalPurchaseCustomLinkTokenTypeIOS.Services;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown ExternalPurchaseCustomLinkTokenTypeIOS value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
