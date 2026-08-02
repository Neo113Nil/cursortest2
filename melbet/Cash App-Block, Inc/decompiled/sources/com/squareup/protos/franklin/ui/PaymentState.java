package com.squareup.protos.franklin.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PAYMENT_NOT_KNOWN", "SCHEDULED", "WAITING_ON_SENDER", "WAITING_ON_RECIPIENT", "PROCESSING", "COMPLETE", "WAITING_ON_RISK", "RECIPIENT_EMAIL_BOUNCED", "RECIPIENT_REJECTED", "SENDER_CANCELED", "EXPIRED", "BLOCKED_BY_RISK", "FAILED", "WAITING_ON_EXTERNAL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentState[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final PaymentState PAYMENT_NOT_KNOWN = new PaymentState("PAYMENT_NOT_KNOWN", 0, 1);
    public static final PaymentState SCHEDULED = new PaymentState("SCHEDULED", 1, 14);
    public static final PaymentState WAITING_ON_SENDER = new PaymentState("WAITING_ON_SENDER", 2, 2);
    public static final PaymentState WAITING_ON_RECIPIENT = new PaymentState("WAITING_ON_RECIPIENT", 3, 3);
    public static final PaymentState PROCESSING = new PaymentState("PROCESSING", 4, 4);
    public static final PaymentState COMPLETE = new PaymentState("COMPLETE", 5, 5);
    public static final PaymentState WAITING_ON_RISK = new PaymentState("WAITING_ON_RISK", 6, 12);
    public static final PaymentState RECIPIENT_EMAIL_BOUNCED = new PaymentState("RECIPIENT_EMAIL_BOUNCED", 7, 6);
    public static final PaymentState RECIPIENT_REJECTED = new PaymentState("RECIPIENT_REJECTED", 8, 7);
    public static final PaymentState SENDER_CANCELED = new PaymentState("SENDER_CANCELED", 9, 8);
    public static final PaymentState EXPIRED = new PaymentState("EXPIRED", 10, 9);
    public static final PaymentState BLOCKED_BY_RISK = new PaymentState("BLOCKED_BY_RISK", 11, 10);
    public static final PaymentState FAILED = new PaymentState("FAILED", 12, 11);
    public static final PaymentState WAITING_ON_EXTERNAL = new PaymentState("WAITING_ON_EXTERNAL", 13, 13);

    private static final /* synthetic */ PaymentState[] $values() {
        return new PaymentState[]{PAYMENT_NOT_KNOWN, SCHEDULED, WAITING_ON_SENDER, WAITING_ON_RECIPIENT, PROCESSING, COMPLETE, WAITING_ON_RISK, RECIPIENT_EMAIL_BOUNCED, RECIPIENT_REJECTED, SENDER_CANCELED, EXPIRED, BLOCKED_BY_RISK, FAILED, WAITING_ON_EXTERNAL};
    }

    static {
        PaymentState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentState.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentState$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public PaymentState fromValue(int value) {
                return PaymentState.INSTANCE.fromValue(value);
            }
        };
    }

    private PaymentState(String str, int i, int i2) {
        this.value = i2;
    }

    public static final PaymentState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PaymentState valueOf(String str) {
        return (PaymentState) Enum.valueOf(PaymentState.class, str);
    }

    public static PaymentState[] values() {
        return (PaymentState[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentState;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentState fromValue(int value) {
            switch (value) {
                case 1:
                    return PaymentState.PAYMENT_NOT_KNOWN;
                case 2:
                    return PaymentState.WAITING_ON_SENDER;
                case 3:
                    return PaymentState.WAITING_ON_RECIPIENT;
                case 4:
                    return PaymentState.PROCESSING;
                case 5:
                    return PaymentState.COMPLETE;
                case 6:
                    return PaymentState.RECIPIENT_EMAIL_BOUNCED;
                case 7:
                    return PaymentState.RECIPIENT_REJECTED;
                case 8:
                    return PaymentState.SENDER_CANCELED;
                case 9:
                    return PaymentState.EXPIRED;
                case 10:
                    return PaymentState.BLOCKED_BY_RISK;
                case 11:
                    return PaymentState.FAILED;
                case 12:
                    return PaymentState.WAITING_ON_RISK;
                case 13:
                    return PaymentState.WAITING_ON_EXTERNAL;
                case 14:
                    return PaymentState.SCHEDULED;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
