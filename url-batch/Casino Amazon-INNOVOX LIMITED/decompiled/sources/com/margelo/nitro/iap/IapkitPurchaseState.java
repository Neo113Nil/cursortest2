package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IapkitPurchaseState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/margelo/nitro/iap/IapkitPurchaseState;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PENDING", "UNKNOWN", "ENTITLED", "PENDING_ACKNOWLEDGMENT", "CANCELED", "EXPIRED", "READY_TO_CONSUME", "CONSUMED", "INAUTHENTIC", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IapkitPurchaseState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IapkitPurchaseState[] $VALUES;
    private final int value;
    public static final IapkitPurchaseState PENDING = new IapkitPurchaseState("PENDING", 0, 0);
    public static final IapkitPurchaseState UNKNOWN = new IapkitPurchaseState("UNKNOWN", 1, 1);
    public static final IapkitPurchaseState ENTITLED = new IapkitPurchaseState("ENTITLED", 2, 2);
    public static final IapkitPurchaseState PENDING_ACKNOWLEDGMENT = new IapkitPurchaseState("PENDING_ACKNOWLEDGMENT", 3, 3);
    public static final IapkitPurchaseState CANCELED = new IapkitPurchaseState("CANCELED", 4, 4);
    public static final IapkitPurchaseState EXPIRED = new IapkitPurchaseState("EXPIRED", 5, 5);
    public static final IapkitPurchaseState READY_TO_CONSUME = new IapkitPurchaseState("READY_TO_CONSUME", 6, 6);
    public static final IapkitPurchaseState CONSUMED = new IapkitPurchaseState("CONSUMED", 7, 7);
    public static final IapkitPurchaseState INAUTHENTIC = new IapkitPurchaseState("INAUTHENTIC", 8, 8);

    private static final /* synthetic */ IapkitPurchaseState[] $values() {
        return new IapkitPurchaseState[]{PENDING, UNKNOWN, ENTITLED, PENDING_ACKNOWLEDGMENT, CANCELED, EXPIRED, READY_TO_CONSUME, CONSUMED, INAUTHENTIC};
    }

    public static EnumEntries<IapkitPurchaseState> getEntries() {
        return $ENTRIES;
    }

    private IapkitPurchaseState(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        IapkitPurchaseState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static IapkitPurchaseState valueOf(String str) {
        return (IapkitPurchaseState) Enum.valueOf(IapkitPurchaseState.class, str);
    }

    public static IapkitPurchaseState[] values() {
        return (IapkitPurchaseState[]) $VALUES.clone();
    }
}
