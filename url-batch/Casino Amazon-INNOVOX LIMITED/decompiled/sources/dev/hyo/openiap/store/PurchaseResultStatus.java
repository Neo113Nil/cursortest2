package dev.hyo.openiap.store;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ldev/hyo/openiap/store/PurchaseResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Success", "Info", "Error", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PurchaseResultStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PurchaseResultStatus[] $VALUES;
    public static final PurchaseResultStatus Success = new PurchaseResultStatus("Success", 0);
    public static final PurchaseResultStatus Info = new PurchaseResultStatus("Info", 1);
    public static final PurchaseResultStatus Error = new PurchaseResultStatus("Error", 2);

    private static final /* synthetic */ PurchaseResultStatus[] $values() {
        return new PurchaseResultStatus[]{Success, Info, Error};
    }

    public static EnumEntries<PurchaseResultStatus> getEntries() {
        return $ENTRIES;
    }

    public static PurchaseResultStatus valueOf(String str) {
        return (PurchaseResultStatus) Enum.valueOf(PurchaseResultStatus.class, str);
    }

    public static PurchaseResultStatus[] values() {
        return (PurchaseResultStatus[]) $VALUES.clone();
    }

    static {
        PurchaseResultStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PurchaseResultStatus(String str, int i) {
    }
}
