package com.squareup.protos.cash.local.client.v1;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalPaymentOption;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOCAL_PAYMENT_OPTION_UNSPECIFIED", "LOCAL_PAYMENT_OPTION_MANUAL_CARD_ENTRY", "LOCAL_PAYMENT_OPTION_APPLE_PAY", "LOCAL_PAYMENT_OPTION_GOOGLE_PAY", "LOCAL_PAYMENT_OPTION_CASH_APP_PAY", "LOCAL_PAYMENT_OPTION_NO_REQUIREMENT", "LOCAL_PAYMENT_OPTION_STORED_INSTRUMENT", "LOCAL_PAYMENT_OPTION_AFTERPAY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalPaymentOption implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocalPaymentOption[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LocalPaymentOption LOCAL_PAYMENT_OPTION_AFTERPAY;
    public static final LocalPaymentOption LOCAL_PAYMENT_OPTION_APPLE_PAY;
    public static final LocalPaymentOption LOCAL_PAYMENT_OPTION_CASH_APP_PAY;
    public static final LocalPaymentOption LOCAL_PAYMENT_OPTION_GOOGLE_PAY;
    public static final LocalPaymentOption LOCAL_PAYMENT_OPTION_MANUAL_CARD_ENTRY;
    public static final LocalPaymentOption LOCAL_PAYMENT_OPTION_NO_REQUIREMENT;
    public static final LocalPaymentOption LOCAL_PAYMENT_OPTION_STORED_INSTRUMENT;
    public static final LocalPaymentOption LOCAL_PAYMENT_OPTION_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ LocalPaymentOption[] $values() {
        return new LocalPaymentOption[]{LOCAL_PAYMENT_OPTION_UNSPECIFIED, LOCAL_PAYMENT_OPTION_MANUAL_CARD_ENTRY, LOCAL_PAYMENT_OPTION_APPLE_PAY, LOCAL_PAYMENT_OPTION_GOOGLE_PAY, LOCAL_PAYMENT_OPTION_CASH_APP_PAY, LOCAL_PAYMENT_OPTION_NO_REQUIREMENT, LOCAL_PAYMENT_OPTION_STORED_INSTRUMENT, LOCAL_PAYMENT_OPTION_AFTERPAY};
    }

    static {
        final LocalPaymentOption localPaymentOption = new LocalPaymentOption("LOCAL_PAYMENT_OPTION_UNSPECIFIED", 0, 0);
        LOCAL_PAYMENT_OPTION_UNSPECIFIED = localPaymentOption;
        LOCAL_PAYMENT_OPTION_MANUAL_CARD_ENTRY = new LocalPaymentOption("LOCAL_PAYMENT_OPTION_MANUAL_CARD_ENTRY", 1, 1);
        LOCAL_PAYMENT_OPTION_APPLE_PAY = new LocalPaymentOption("LOCAL_PAYMENT_OPTION_APPLE_PAY", 2, 2);
        LOCAL_PAYMENT_OPTION_GOOGLE_PAY = new LocalPaymentOption("LOCAL_PAYMENT_OPTION_GOOGLE_PAY", 3, 3);
        LOCAL_PAYMENT_OPTION_CASH_APP_PAY = new LocalPaymentOption("LOCAL_PAYMENT_OPTION_CASH_APP_PAY", 4, 4);
        LOCAL_PAYMENT_OPTION_NO_REQUIREMENT = new LocalPaymentOption("LOCAL_PAYMENT_OPTION_NO_REQUIREMENT", 5, 5);
        LOCAL_PAYMENT_OPTION_STORED_INSTRUMENT = new LocalPaymentOption("LOCAL_PAYMENT_OPTION_STORED_INSTRUMENT", 6, 6);
        LOCAL_PAYMENT_OPTION_AFTERPAY = new LocalPaymentOption("LOCAL_PAYMENT_OPTION_AFTERPAY", 7, 7);
        LocalPaymentOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalPaymentOption.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, localPaymentOption) { // from class: com.squareup.protos.cash.local.client.v1.LocalPaymentOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public LocalPaymentOption fromValue(int value) {
                return LocalPaymentOption.INSTANCE.fromValue(value);
            }
        };
    }

    private LocalPaymentOption(String str, int i, int i2) {
        this.value = i2;
    }

    public static final LocalPaymentOption fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static LocalPaymentOption valueOf(String str) {
        return (LocalPaymentOption) Enum.valueOf(LocalPaymentOption.class, str);
    }

    public static LocalPaymentOption[] values() {
        return (LocalPaymentOption[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalPaymentOption$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/LocalPaymentOption;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocalPaymentOption fromValue(int value) {
            switch (value) {
                case 0:
                    return LocalPaymentOption.LOCAL_PAYMENT_OPTION_UNSPECIFIED;
                case 1:
                    return LocalPaymentOption.LOCAL_PAYMENT_OPTION_MANUAL_CARD_ENTRY;
                case 2:
                    return LocalPaymentOption.LOCAL_PAYMENT_OPTION_APPLE_PAY;
                case 3:
                    return LocalPaymentOption.LOCAL_PAYMENT_OPTION_GOOGLE_PAY;
                case 4:
                    return LocalPaymentOption.LOCAL_PAYMENT_OPTION_CASH_APP_PAY;
                case 5:
                    return LocalPaymentOption.LOCAL_PAYMENT_OPTION_NO_REQUIREMENT;
                case 6:
                    return LocalPaymentOption.LOCAL_PAYMENT_OPTION_STORED_INSTRUMENT;
                case 7:
                    return LocalPaymentOption.LOCAL_PAYMENT_OPTION_AFTERPAY;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
