package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeTypeIOS;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Browser", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExternalPurchaseCustomLinkNoticeTypeIOS {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExternalPurchaseCustomLinkNoticeTypeIOS[] $VALUES;
    public static final ExternalPurchaseCustomLinkNoticeTypeIOS Browser = new ExternalPurchaseCustomLinkNoticeTypeIOS("Browser", 0, "browser");

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;

    private static final /* synthetic */ ExternalPurchaseCustomLinkNoticeTypeIOS[] $values() {
        return new ExternalPurchaseCustomLinkNoticeTypeIOS[]{Browser};
    }

    public static EnumEntries<ExternalPurchaseCustomLinkNoticeTypeIOS> getEntries() {
        return $ENTRIES;
    }

    public static ExternalPurchaseCustomLinkNoticeTypeIOS valueOf(String str) {
        return (ExternalPurchaseCustomLinkNoticeTypeIOS) Enum.valueOf(ExternalPurchaseCustomLinkNoticeTypeIOS.class, str);
    }

    public static ExternalPurchaseCustomLinkNoticeTypeIOS[] values() {
        return (ExternalPurchaseCustomLinkNoticeTypeIOS[]) $VALUES.clone();
    }

    private ExternalPurchaseCustomLinkNoticeTypeIOS(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        ExternalPurchaseCustomLinkNoticeTypeIOS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeTypeIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeTypeIOS;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ExternalPurchaseCustomLinkNoticeTypeIOS fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.areEqual(value, "browser") && !Intrinsics.areEqual(value, "Browser")) {
                throw new IllegalArgumentException("Unknown ExternalPurchaseCustomLinkNoticeTypeIOS value: " + value);
            }
            return ExternalPurchaseCustomLinkNoticeTypeIOS.Browser;
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
