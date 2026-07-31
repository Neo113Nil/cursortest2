package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0013"}, d2 = {"Ldev/hyo/openiap/IapkitPurchaseState;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Entitled", "PendingAcknowledgment", "Pending", "Canceled", "Expired", "ReadyToConsume", "Consumed", "Unknown", "Inauthentic", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IapkitPurchaseState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IapkitPurchaseState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final IapkitPurchaseState Entitled = new IapkitPurchaseState("Entitled", 0, "entitled");
    public static final IapkitPurchaseState PendingAcknowledgment = new IapkitPurchaseState("PendingAcknowledgment", 1, "pending-acknowledgment");
    public static final IapkitPurchaseState Pending = new IapkitPurchaseState("Pending", 2, "pending");
    public static final IapkitPurchaseState Canceled = new IapkitPurchaseState("Canceled", 3, "canceled");
    public static final IapkitPurchaseState Expired = new IapkitPurchaseState("Expired", 4, "expired");
    public static final IapkitPurchaseState ReadyToConsume = new IapkitPurchaseState("ReadyToConsume", 5, "ready-to-consume");
    public static final IapkitPurchaseState Consumed = new IapkitPurchaseState("Consumed", 6, "consumed");
    public static final IapkitPurchaseState Unknown = new IapkitPurchaseState("Unknown", 7, "unknown");
    public static final IapkitPurchaseState Inauthentic = new IapkitPurchaseState("Inauthentic", 8, "inauthentic");

    private static final /* synthetic */ IapkitPurchaseState[] $values() {
        return new IapkitPurchaseState[]{Entitled, PendingAcknowledgment, Pending, Canceled, Expired, ReadyToConsume, Consumed, Unknown, Inauthentic};
    }

    public static EnumEntries<IapkitPurchaseState> getEntries() {
        return $ENTRIES;
    }

    public static IapkitPurchaseState valueOf(String str) {
        return (IapkitPurchaseState) Enum.valueOf(IapkitPurchaseState.class, str);
    }

    public static IapkitPurchaseState[] values() {
        return (IapkitPurchaseState[]) $VALUES.clone();
    }

    private IapkitPurchaseState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        IapkitPurchaseState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/IapkitPurchaseState$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/IapkitPurchaseState;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final IapkitPurchaseState fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2102111499:
                    if (value.equals("entitled")) {
                        return IapkitPurchaseState.Entitled;
                    }
                    break;
                case -2037467371:
                    if (value.equals("Entitled")) {
                        return IapkitPurchaseState.Entitled;
                    }
                    break;
                case -1510374114:
                    if (value.equals("PendingAcknowledgment")) {
                        return IapkitPurchaseState.PendingAcknowledgment;
                    }
                    break;
                case -1309235419:
                    if (value.equals("expired")) {
                        return IapkitPurchaseState.Expired;
                    }
                    break;
                case -1003813128:
                    if (value.equals("Inauthentic")) {
                        return IapkitPurchaseState.Inauthentic;
                    }
                    break;
                case -1002383683:
                    if (value.equals("pending-acknowledgment")) {
                        return IapkitPurchaseState.PendingAcknowledgment;
                    }
                    break;
                case -682587753:
                    if (value.equals("pending")) {
                        return IapkitPurchaseState.Pending;
                    }
                    break;
                case -567770136:
                    if (value.equals("consumed")) {
                        return IapkitPurchaseState.Consumed;
                    }
                    break;
                case -503126008:
                    if (value.equals("Consumed")) {
                        return IapkitPurchaseState.Consumed;
                    }
                    break;
                case -332955372:
                    if (value.equals("ready-to-consume")) {
                        return IapkitPurchaseState.ReadyToConsume;
                    }
                    break;
                case -284840886:
                    if (value.equals("unknown")) {
                        return IapkitPurchaseState.Unknown;
                    }
                    break;
                case -123173735:
                    if (value.equals("canceled")) {
                        return IapkitPurchaseState.Canceled;
                    }
                    break;
                case -58529607:
                    if (value.equals("Canceled")) {
                        return IapkitPurchaseState.Canceled;
                    }
                    break;
                case 355417861:
                    if (value.equals("Expired")) {
                        return IapkitPurchaseState.Expired;
                    }
                    break;
                case 982065527:
                    if (value.equals("Pending")) {
                        return IapkitPurchaseState.Pending;
                    }
                    break;
                case 1243516606:
                    if (value.equals("ReadyToConsume")) {
                        return IapkitPurchaseState.ReadyToConsume;
                    }
                    break;
                case 1379812394:
                    if (value.equals("Unknown")) {
                        return IapkitPurchaseState.Unknown;
                    }
                    break;
                case 1623285528:
                    if (value.equals("inauthentic")) {
                        return IapkitPurchaseState.Inauthentic;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown IapkitPurchaseState value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
