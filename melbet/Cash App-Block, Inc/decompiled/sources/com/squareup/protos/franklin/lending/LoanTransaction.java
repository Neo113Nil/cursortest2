package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoanTransaction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoanTransaction> CREATOR;
    public final String activity_token;
    public final String credit_line_token;
    public final Long date;
    public final String detailDescription;
    public final LendingProduct lending_product;
    public final LoanAdjustment loan_adjustment;
    public final LoanCharge loan_charge;
    public final LoanDrawdown loan_drawdown;
    public final LoanPayment loan_payment;
    public final LoanRefund loan_refund;
    public final String loan_token;
    public final LocalizableString localizable_detailDescription;
    public final String token;
    public final String transaction_detail_text;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1395type;

    public final class LoanAdjustment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoanAdjustment> CREATOR;
        public final Money amount;

        static {
            LoanTransaction$LoanAdjustment$Companion$ADAPTER$1 loanTransaction$LoanAdjustment$Companion$ADAPTER$1 = new LoanTransaction$LoanAdjustment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanAdjustment.class), "type.googleapis.com/squareup.franklin.lending.LoanTransaction.LoanAdjustment", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = loanTransaction$LoanAdjustment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loanTransaction$LoanAdjustment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanAdjustment(Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoanAdjustment)) {
                return false;
            }
            LoanAdjustment loanAdjustment = (LoanAdjustment) obj;
            return Intrinsics.areEqual(unknownFields(), loanAdjustment.unknownFields()) && Intrinsics.areEqual(this.amount, loanAdjustment.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.amount;
            int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Entity.Payment.Builder builder = new Entity.Payment.Builder(6);
            builder.amount = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoanAdjustment{", "}", 0, null, null, 56);
        }
    }

    public final class LoanCharge extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoanCharge> CREATOR;
        public final Money amount;
        public final ChargeType charge_type;
        public final Money missed_amount;

        public enum ChargeType implements WireEnum {
            LATE_FEE(1),
            INTEREST(2);

            public final int value;
            public static final KeyScope.Companion Companion = new KeyScope.Companion();
            public static final LoanTransaction$LoanCharge$ChargeType$Companion$ADAPTER$1 ADAPTER = new LoanTransaction$LoanCharge$ChargeType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ChargeType.class), Syntax.PROTO_2, null);

            ChargeType(int i) {
                this.value = i;
            }

            public static final ChargeType fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return LATE_FEE;
                }
                if (i != 2) {
                    return null;
                }
                return INTEREST;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            LoanTransaction$LoanCharge$Companion$ADAPTER$1 loanTransaction$LoanCharge$Companion$ADAPTER$1 = new LoanTransaction$LoanCharge$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanCharge.class), "type.googleapis.com/squareup.franklin.lending.LoanTransaction.LoanCharge", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = loanTransaction$LoanCharge$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loanTransaction$LoanCharge$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanCharge(ChargeType chargeType, Money money, Money money2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.charge_type = chargeType;
            this.amount = money;
            this.missed_amount = money2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoanCharge)) {
                return false;
            }
            LoanCharge loanCharge = (LoanCharge) obj;
            return Intrinsics.areEqual(unknownFields(), loanCharge.unknownFields()) && this.charge_type == loanCharge.charge_type && Intrinsics.areEqual(this.amount, loanCharge.amount) && Intrinsics.areEqual(this.missed_amount, loanCharge.missed_amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ChargeType chargeType = this.charge_type;
            int hashCode2 = (hashCode + (chargeType != null ? chargeType.hashCode() : 0)) * 37;
            Money money = this.amount;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.missed_amount;
            int hashCode4 = hashCode3 + (money2 != null ? money2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Options.Builder builder = new GiftCard.Options.Builder(6);
            builder.label = this.charge_type;
            builder.localizable_label = this.amount;
            builder.client_scenario = this.missed_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ChargeType chargeType = this.charge_type;
            if (chargeType != null) {
                arrayList.add("charge_type=" + chargeType);
            }
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            Money money2 = this.missed_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("missed_amount=", money2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoanCharge{", "}", 0, null, null, 56);
        }
    }

    public final class LoanDrawdown extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoanDrawdown> CREATOR;
        public final Money amount;

        static {
            LoanTransaction$LoanDrawdown$Companion$ADAPTER$1 loanTransaction$LoanDrawdown$Companion$ADAPTER$1 = new LoanTransaction$LoanDrawdown$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanDrawdown.class), "type.googleapis.com/squareup.franklin.lending.LoanTransaction.LoanDrawdown", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = loanTransaction$LoanDrawdown$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loanTransaction$LoanDrawdown$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanDrawdown(Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoanDrawdown)) {
                return false;
            }
            LoanDrawdown loanDrawdown = (LoanDrawdown) obj;
            return Intrinsics.areEqual(unknownFields(), loanDrawdown.unknownFields()) && Intrinsics.areEqual(this.amount, loanDrawdown.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.amount;
            int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Entity.Payment.Builder builder = new Entity.Payment.Builder(7);
            builder.amount = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoanDrawdown{", "}", 0, null, null, 56);
        }
    }

    public final class LoanPayment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoanPayment> CREATOR;
        public final Money amount;
        public final State state;

        public enum State implements WireEnum {
            SCHEDULED(1),
            COMPLETED(2),
            SKIPPED(3),
            MISSED(4),
            OVERDUE(5),
            CANCELLED(6);

            public final int value;
            public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
            public static final LoanTransaction$LoanPayment$State$Companion$ADAPTER$1 ADAPTER = new LoanTransaction$LoanPayment$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

            State(int i) {
                this.value = i;
            }

            public static final State fromValue(int i) {
                Companion.getClass();
                switch (i) {
                    case 1:
                        return SCHEDULED;
                    case 2:
                        return COMPLETED;
                    case 3:
                        return SKIPPED;
                    case 4:
                        return MISSED;
                    case 5:
                        return OVERDUE;
                    case 6:
                        return CANCELLED;
                    default:
                        return null;
                }
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            LoanTransaction$LoanPayment$Companion$ADAPTER$1 loanTransaction$LoanPayment$Companion$ADAPTER$1 = new LoanTransaction$LoanPayment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanPayment.class), "type.googleapis.com/squareup.franklin.lending.LoanTransaction.LoanPayment", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = loanTransaction$LoanPayment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loanTransaction$LoanPayment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanPayment(State state, Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.state = state;
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoanPayment)) {
                return false;
            }
            LoanPayment loanPayment = (LoanPayment) obj;
            return Intrinsics.areEqual(unknownFields(), loanPayment.unknownFields()) && this.state == loanPayment.state && Intrinsics.areEqual(this.amount, loanPayment.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            State state = this.state;
            int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 37;
            Money money = this.amount;
            int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(28);
            builder.f1372android = this.state;
            builder.ios = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            State state = this.state;
            if (state != null) {
                arrayList.add("state=" + state);
            }
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoanPayment{", "}", 0, null, null, 56);
        }
    }

    public final class LoanRefund extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoanRefund> CREATOR;
        public final Money amount;

        static {
            LoanTransaction$LoanRefund$Companion$ADAPTER$1 loanTransaction$LoanRefund$Companion$ADAPTER$1 = new LoanTransaction$LoanRefund$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanRefund.class), "type.googleapis.com/squareup.franklin.lending.LoanTransaction.LoanRefund", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
            ADAPTER = loanTransaction$LoanRefund$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loanTransaction$LoanRefund$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanRefund(Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoanRefund)) {
                return false;
            }
            LoanRefund loanRefund = (LoanRefund) obj;
            return Intrinsics.areEqual(unknownFields(), loanRefund.unknownFields()) && Intrinsics.areEqual(this.amount, loanRefund.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.amount;
            int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Entity.Payment.Builder builder = new Entity.Payment.Builder(8);
            builder.amount = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoanRefund{", "}", 0, null, null, 56);
        }
    }

    public enum Type implements WireEnum {
        PAYMENT(1),
        DRAWDOWN(2),
        CHARGE(3),
        REFUND(4),
        ADJUSTMENT(5),
        OVERDUE_PAYMENT_PLAN_PAYMENT(6);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final LoanTransaction$Type$Companion$ADAPTER$1 ADAPTER = new LoanTransaction$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return PAYMENT;
                case 2:
                    return DRAWDOWN;
                case 3:
                    return CHARGE;
                case 4:
                    return REFUND;
                case 5:
                    return ADJUSTMENT;
                case 6:
                    return OVERDUE_PAYMENT_PLAN_PAYMENT;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LoanTransaction$Companion$ADAPTER$1 loanTransaction$Companion$ADAPTER$1 = new LoanTransaction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanTransaction.class), "type.googleapis.com/squareup.franklin.lending.LoanTransaction", Syntax.PROTO_2, null, "squareup/franklin/lending.proto");
        ADAPTER = loanTransaction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loanTransaction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanTransaction(Type type2, String str, String str2, String str3, Long l, LendingProduct lendingProduct, LoanPayment loanPayment, LoanDrawdown loanDrawdown, LoanCharge loanCharge, String str4, LoanRefund loanRefund, LoanAdjustment loanAdjustment, String str5, String str6, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1395type = type2;
        this.token = str;
        this.credit_line_token = str2;
        this.loan_token = str3;
        this.date = l;
        this.lending_product = lendingProduct;
        this.loan_payment = loanPayment;
        this.loan_drawdown = loanDrawdown;
        this.loan_charge = loanCharge;
        this.activity_token = str4;
        this.loan_refund = loanRefund;
        this.loan_adjustment = loanAdjustment;
        this.transaction_detail_text = str5;
        this.detailDescription = str6;
        this.localizable_detailDescription = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoanTransaction)) {
            return false;
        }
        LoanTransaction loanTransaction = (LoanTransaction) obj;
        return Intrinsics.areEqual(unknownFields(), loanTransaction.unknownFields()) && this.f1395type == loanTransaction.f1395type && Intrinsics.areEqual(this.token, loanTransaction.token) && Intrinsics.areEqual(this.credit_line_token, loanTransaction.credit_line_token) && Intrinsics.areEqual(this.loan_token, loanTransaction.loan_token) && Intrinsics.areEqual(this.date, loanTransaction.date) && this.lending_product == loanTransaction.lending_product && Intrinsics.areEqual(this.loan_payment, loanTransaction.loan_payment) && Intrinsics.areEqual(this.loan_drawdown, loanTransaction.loan_drawdown) && Intrinsics.areEqual(this.loan_charge, loanTransaction.loan_charge) && Intrinsics.areEqual(this.activity_token, loanTransaction.activity_token) && Intrinsics.areEqual(this.loan_refund, loanTransaction.loan_refund) && Intrinsics.areEqual(this.loan_adjustment, loanTransaction.loan_adjustment) && Intrinsics.areEqual(this.transaction_detail_text, loanTransaction.transaction_detail_text) && Intrinsics.areEqual(this.detailDescription, loanTransaction.detailDescription) && Intrinsics.areEqual(this.localizable_detailDescription, loanTransaction.localizable_detailDescription);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1395type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.credit_line_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.loan_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.date;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        LendingProduct lendingProduct = this.lending_product;
        int hashCode7 = (hashCode6 + (lendingProduct != null ? lendingProduct.hashCode() : 0)) * 37;
        LoanPayment loanPayment = this.loan_payment;
        int hashCode8 = (hashCode7 + (loanPayment != null ? loanPayment.hashCode() : 0)) * 37;
        LoanDrawdown loanDrawdown = this.loan_drawdown;
        int hashCode9 = (hashCode8 + (loanDrawdown != null ? loanDrawdown.hashCode() : 0)) * 37;
        LoanCharge loanCharge = this.loan_charge;
        int hashCode10 = (hashCode9 + (loanCharge != null ? loanCharge.hashCode() : 0)) * 37;
        String str4 = this.activity_token;
        int hashCode11 = (hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 37;
        LoanRefund loanRefund = this.loan_refund;
        int hashCode12 = (hashCode11 + (loanRefund != null ? loanRefund.hashCode() : 0)) * 37;
        LoanAdjustment loanAdjustment = this.loan_adjustment;
        int hashCode13 = (hashCode12 + (loanAdjustment != null ? loanAdjustment.hashCode() : 0)) * 37;
        String str5 = this.transaction_detail_text;
        int hashCode14 = (hashCode13 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.detailDescription;
        int hashCode15 = (hashCode14 + (str6 != null ? str6.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_detailDescription;
        int hashCode16 = hashCode15 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClientInfo.Builder builder = new ClientInfo.Builder(8);
        builder.accept_language = this.f1395type;
        builder.user_agent = this.token;
        builder.device_uuid = this.credit_line_token;
        builder.date_format = this.loan_token;
        builder.device_installation_id = this.date;
        builder.drm_id = this.lending_product;
        builder.device_vendor_id = this.loan_payment;
        builder.device_id = this.loan_drawdown;
        builder.threatmetrix_smart_id = this.loan_charge;
        builder.time_format = this.activity_token;
        builder.timestamp = this.loan_refund;
        builder.navigation_paradigm = this.loan_adjustment;
        builder.ip_address = this.transaction_detail_text;
        builder.device_name = this.detailDescription;
        builder.client_scenario = this.localizable_detailDescription;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1395type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.credit_line_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "credit_line_token=", arrayList);
        }
        String str3 = this.loan_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "loan_token=", arrayList);
        }
        Long l = this.date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("date=", l, arrayList);
        }
        LendingProduct lendingProduct = this.lending_product;
        if (lendingProduct != null) {
            arrayList.add("lending_product=" + lendingProduct);
        }
        LoanPayment loanPayment = this.loan_payment;
        if (loanPayment != null) {
            arrayList.add("loan_payment=" + loanPayment);
        }
        LoanDrawdown loanDrawdown = this.loan_drawdown;
        if (loanDrawdown != null) {
            arrayList.add("loan_drawdown=" + loanDrawdown);
        }
        LoanCharge loanCharge = this.loan_charge;
        if (loanCharge != null) {
            arrayList.add("loan_charge=" + loanCharge);
        }
        String str4 = this.activity_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "activity_token=", arrayList);
        }
        LoanRefund loanRefund = this.loan_refund;
        if (loanRefund != null) {
            arrayList.add("loan_refund=" + loanRefund);
        }
        LoanAdjustment loanAdjustment = this.loan_adjustment;
        if (loanAdjustment != null) {
            arrayList.add("loan_adjustment=" + loanAdjustment);
        }
        String str5 = this.transaction_detail_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "transaction_detail_text=", arrayList);
        }
        String str6 = this.detailDescription;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "detailDescription=", arrayList);
        }
        LocalizableString localizableString = this.localizable_detailDescription;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_detailDescription=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoanTransaction{", "}", 0, null, null, 56);
    }
}
