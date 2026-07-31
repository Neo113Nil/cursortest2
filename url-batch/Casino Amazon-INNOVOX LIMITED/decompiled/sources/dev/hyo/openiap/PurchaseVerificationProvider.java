package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Ldev/hyo/openiap/PurchaseVerificationProvider;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Iapkit", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PurchaseVerificationProvider {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PurchaseVerificationProvider[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PurchaseVerificationProvider Iapkit = new PurchaseVerificationProvider("Iapkit", 0, "iapkit");
    private final String rawValue;

    private static final /* synthetic */ PurchaseVerificationProvider[] $values() {
        return new PurchaseVerificationProvider[]{Iapkit};
    }

    public static EnumEntries<PurchaseVerificationProvider> getEntries() {
        return $ENTRIES;
    }

    public static PurchaseVerificationProvider valueOf(String str) {
        return (PurchaseVerificationProvider) Enum.valueOf(PurchaseVerificationProvider.class, str);
    }

    public static PurchaseVerificationProvider[] values() {
        return (PurchaseVerificationProvider[]) $VALUES.clone();
    }

    private PurchaseVerificationProvider(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        PurchaseVerificationProvider[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/PurchaseVerificationProvider$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PurchaseVerificationProvider;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PurchaseVerificationProvider fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.areEqual(value, "iapkit") && !Intrinsics.areEqual(value, "Iapkit")) {
                throw new IllegalArgumentException("Unknown PurchaseVerificationProvider value: " + value);
            }
            return PurchaseVerificationProvider.Iapkit;
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
