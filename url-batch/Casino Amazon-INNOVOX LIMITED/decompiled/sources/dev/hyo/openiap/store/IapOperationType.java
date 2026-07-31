package dev.hyo.openiap.store;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Ldev/hyo/openiap/store/IapOperationType;", "", "<init>", "(Ljava/lang/String;I)V", "InitConnection", "EndConnection", "FetchProducts", "RequestPurchase", "FinishTransaction", "RestorePurchases", "ValidateReceipt", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IapOperationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IapOperationType[] $VALUES;
    public static final IapOperationType InitConnection = new IapOperationType("InitConnection", 0);
    public static final IapOperationType EndConnection = new IapOperationType("EndConnection", 1);
    public static final IapOperationType FetchProducts = new IapOperationType("FetchProducts", 2);
    public static final IapOperationType RequestPurchase = new IapOperationType("RequestPurchase", 3);
    public static final IapOperationType FinishTransaction = new IapOperationType("FinishTransaction", 4);
    public static final IapOperationType RestorePurchases = new IapOperationType("RestorePurchases", 5);
    public static final IapOperationType ValidateReceipt = new IapOperationType("ValidateReceipt", 6);

    private static final /* synthetic */ IapOperationType[] $values() {
        return new IapOperationType[]{InitConnection, EndConnection, FetchProducts, RequestPurchase, FinishTransaction, RestorePurchases, ValidateReceipt};
    }

    public static EnumEntries<IapOperationType> getEntries() {
        return $ENTRIES;
    }

    public static IapOperationType valueOf(String str) {
        return (IapOperationType) Enum.valueOf(IapOperationType.class, str);
    }

    public static IapOperationType[] values() {
        return (IapOperationType[]) $VALUES.clone();
    }

    private IapOperationType(String str, int i) {
    }

    static {
        IapOperationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
