package com.squareup.protos.banklin.data;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.common.Money;
import com.squareup.protos.employeejobs.Job;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StoredValueBalance extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StoredValueBalance> CREATOR;
    public final Money amount;
    public final String bank_account_fidelius_token;
    public final String customer_token;
    public final Boolean is_active;
    public final Boolean is_frozen;
    public final String reason_frozen;
    public final String stored_value_token;
    public final String symbol;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1225type;
    public final Long version;
    public final String wallet_address;

    static {
        StoredValueBalance$Companion$ADAPTER$1 storedValueBalance$Companion$ADAPTER$1 = new StoredValueBalance$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StoredValueBalance.class), "type.googleapis.com/squareup.banklin.StoredValueBalance", Syntax.PROTO_2, null, "squareup/banklin/stored_value_balance.proto");
        ADAPTER = storedValueBalance$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(storedValueBalance$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoredValueBalance(String str, Money money, Long l, String str2, Boolean bool, String str3, Type type2, String str4, String str5, Boolean bool2, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.stored_value_token = str;
        this.amount = money;
        this.version = l;
        this.bank_account_fidelius_token = str2;
        this.is_frozen = bool;
        this.wallet_address = str3;
        this.f1225type = type2;
        this.symbol = str4;
        this.customer_token = str5;
        this.is_active = bool2;
        this.reason_frozen = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoredValueBalance)) {
            return false;
        }
        StoredValueBalance storedValueBalance = (StoredValueBalance) obj;
        return Intrinsics.areEqual(unknownFields(), storedValueBalance.unknownFields()) && Intrinsics.areEqual(this.stored_value_token, storedValueBalance.stored_value_token) && Intrinsics.areEqual(this.amount, storedValueBalance.amount) && Intrinsics.areEqual(this.version, storedValueBalance.version) && Intrinsics.areEqual(this.bank_account_fidelius_token, storedValueBalance.bank_account_fidelius_token) && Intrinsics.areEqual(this.is_frozen, storedValueBalance.is_frozen) && Intrinsics.areEqual(this.wallet_address, storedValueBalance.wallet_address) && this.f1225type == storedValueBalance.f1225type && Intrinsics.areEqual(this.symbol, storedValueBalance.symbol) && Intrinsics.areEqual(this.customer_token, storedValueBalance.customer_token) && Intrinsics.areEqual(this.is_active, storedValueBalance.is_active) && Intrinsics.areEqual(this.reason_frozen, storedValueBalance.reason_frozen);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.stored_value_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.bank_account_fidelius_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.is_frozen;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.wallet_address;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Type type2 = this.f1225type;
        int hashCode8 = (hashCode7 + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str4 = this.symbol;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.customer_token;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_active;
        int hashCode11 = (hashCode10 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str6 = this.reason_frozen;
        int hashCode12 = hashCode11 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(3);
        builder.token = this.stored_value_token;
        builder.default_wage = this.amount;
        builder.created_at_timestamp_ms = this.version;
        builder.merchant_token = this.bank_account_fidelius_token;
        builder.tip_eligible = this.is_frozen;
        builder.title = this.wallet_address;
        builder.updated_at_timestamp_ms = this.f1225type;
        builder.deleted_at_timestamp_ms = this.symbol;
        builder.team_member_count = this.customer_token;
        builder.version = this.is_active;
        builder.default_color_scheme = this.reason_frozen;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.stored_value_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "stored_value_token=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        String str2 = this.bank_account_fidelius_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "bank_account_fidelius_token=", arrayList);
        }
        Boolean bool = this.is_frozen;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_frozen=", bool, arrayList);
        }
        String str3 = this.wallet_address;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "wallet_address=", arrayList);
        }
        Type type2 = this.f1225type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        String str4 = this.symbol;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "symbol=", arrayList);
        }
        String str5 = this.customer_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "customer_token=", arrayList);
        }
        Boolean bool2 = this.is_active;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_active=", bool2, arrayList);
        }
        String str6 = this.reason_frozen;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "reason_frozen=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StoredValueBalance{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"com/squareup/protos/banklin/data/StoredValueBalance$Type", "Lcom/squareup/wire/WireEnum;", "", "Lcom/squareup/protos/banklin/data/StoredValueBalance$Type;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "CURRENCY", "EQUITY", "SAVINGS", "LOAN", "INVEST_PAYMENT", "GIFT_CARD", "CCY_CLEARING", "EXT_INSTRUMENT", "OVERDRAFT", "P2P", "EXCHANGE", "FUNDING_PROMISE", "AFTERPAY_LOAN", "MONEY_POOL", "RESTRICTED_XFER", "ACH_CLEARING", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Type CURRENCY = new Type("CURRENCY", 0, 1);

        @Deprecated
        public static final Type EQUITY = new Type("EQUITY", 1, 2);
        public static final Type SAVINGS = new Type("SAVINGS", 2, 3);
        public static final Type LOAN = new Type("LOAN", 3, 4);
        public static final Type INVEST_PAYMENT = new Type("INVEST_PAYMENT", 4, 5);
        public static final Type GIFT_CARD = new Type("GIFT_CARD", 5, 6);
        public static final Type CCY_CLEARING = new Type("CCY_CLEARING", 6, 7);
        public static final Type EXT_INSTRUMENT = new Type("EXT_INSTRUMENT", 7, 8);
        public static final Type OVERDRAFT = new Type("OVERDRAFT", 8, 9);
        public static final Type P2P = new Type("P2P", 9, 10);
        public static final Type EXCHANGE = new Type("EXCHANGE", 10, 11);
        public static final Type FUNDING_PROMISE = new Type("FUNDING_PROMISE", 11, 12);
        public static final Type AFTERPAY_LOAN = new Type("AFTERPAY_LOAN", 12, 13);
        public static final Type MONEY_POOL = new Type("MONEY_POOL", 13, 14);
        public static final Type RESTRICTED_XFER = new Type("RESTRICTED_XFER", 14, 15);
        public static final Type ACH_CLEARING = new Type("ACH_CLEARING", 15, 16);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{CURRENCY, EQUITY, SAVINGS, LOAN, INVEST_PAYMENT, GIFT_CARD, CCY_CLEARING, EXT_INSTRUMENT, OVERDRAFT, P2P, EXCHANGE, FUNDING_PROMISE, AFTERPAY_LOAN, MONEY_POOL, RESTRICTED_XFER, ACH_CLEARING};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.banklin.data.StoredValueBalance$Type$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public StoredValueBalance.Type fromValue(int value) {
                    return StoredValueBalance.Type.INSTANCE.fromValue(value);
                }
            };
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/banklin/data/StoredValueBalance$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/banklin/data/StoredValueBalance$Type;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromValue(int value) {
                switch (value) {
                    case 1:
                        return Type.CURRENCY;
                    case 2:
                        return Type.EQUITY;
                    case 3:
                        return Type.SAVINGS;
                    case 4:
                        return Type.LOAN;
                    case 5:
                        return Type.INVEST_PAYMENT;
                    case 6:
                        return Type.GIFT_CARD;
                    case 7:
                        return Type.CCY_CLEARING;
                    case 8:
                        return Type.EXT_INSTRUMENT;
                    case 9:
                        return Type.OVERDRAFT;
                    case 10:
                        return Type.P2P;
                    case 11:
                        return Type.EXCHANGE;
                    case 12:
                        return Type.FUNDING_PROMISE;
                    case 13:
                        return Type.AFTERPAY_LOAN;
                    case 14:
                        return Type.MONEY_POOL;
                    case 15:
                        return Type.RESTRICTED_XFER;
                    case 16:
                        return Type.ACH_CLEARING;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }
}
