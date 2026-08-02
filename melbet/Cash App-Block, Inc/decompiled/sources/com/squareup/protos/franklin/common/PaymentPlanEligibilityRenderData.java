package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzdx;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.person.Alias;
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
public final class PaymentPlanEligibilityRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentPlanEligibilityRenderData> CREATOR;
    public final Long expire_at;
    public final Boolean is_p2p_eligible_customer;
    public final Source source;
    public final UiState ui_state;
    public final zzdx ui_state_data;

    public final class ConvertedUiData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ConvertedUiData> CREATOR;
        public final Money downpayment_amount;
        public final Money drawdown_amount;
        public final String loan_token;
        public final String order_id;
        public final String start_plasma_flow_url;

        static {
            PaymentPlanEligibilityRenderData$ConvertedUiData$Companion$ADAPTER$1 paymentPlanEligibilityRenderData$ConvertedUiData$Companion$ADAPTER$1 = new PaymentPlanEligibilityRenderData$ConvertedUiData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConvertedUiData.class), "type.googleapis.com/squareup.franklin.PaymentPlanEligibilityRenderData.ConvertedUiData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = paymentPlanEligibilityRenderData$ConvertedUiData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentPlanEligibilityRenderData$ConvertedUiData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConvertedUiData(String str, Money money, Money money2, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.start_plasma_flow_url = str;
            this.downpayment_amount = money;
            this.drawdown_amount = money2;
            this.loan_token = str2;
            this.order_id = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConvertedUiData)) {
                return false;
            }
            ConvertedUiData convertedUiData = (ConvertedUiData) obj;
            return Intrinsics.areEqual(unknownFields(), convertedUiData.unknownFields()) && Intrinsics.areEqual(this.start_plasma_flow_url, convertedUiData.start_plasma_flow_url) && Intrinsics.areEqual(this.downpayment_amount, convertedUiData.downpayment_amount) && Intrinsics.areEqual(this.drawdown_amount, convertedUiData.drawdown_amount) && Intrinsics.areEqual(this.loan_token, convertedUiData.loan_token) && Intrinsics.areEqual(this.order_id, convertedUiData.order_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.start_plasma_flow_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.downpayment_amount;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.drawdown_amount;
            int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
            String str2 = this.loan_token;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.order_id;
            int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(13, false);
            builder.alias = this.start_plasma_flow_url;
            builder.verified = this.downpayment_amount;
            builder.expires_at = this.drawdown_amount;
            builder.version = this.loan_token;
            builder.display_date = this.order_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.start_plasma_flow_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_plasma_flow_url=", arrayList);
            }
            Money money = this.downpayment_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("downpayment_amount=", money, arrayList);
            }
            Money money2 = this.drawdown_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("drawdown_amount=", money2, arrayList);
            }
            String str2 = this.loan_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "loan_token=", arrayList);
            }
            String str3 = this.order_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "order_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ConvertedUiData{", "}", 0, null, null, 56);
        }
    }

    public final class EligibilityUiData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EligibilityUiData> CREATOR;
        public final LoanDuration loan_duration;
        public final String start_plasma_flow_url;

        static {
            PaymentPlanEligibilityRenderData$EligibilityUiData$Companion$ADAPTER$1 paymentPlanEligibilityRenderData$EligibilityUiData$Companion$ADAPTER$1 = new PaymentPlanEligibilityRenderData$EligibilityUiData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EligibilityUiData.class), "type.googleapis.com/squareup.franklin.PaymentPlanEligibilityRenderData.EligibilityUiData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = paymentPlanEligibilityRenderData$EligibilityUiData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentPlanEligibilityRenderData$EligibilityUiData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibilityUiData(LoanDuration loanDuration, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.loan_duration = loanDuration;
            this.start_plasma_flow_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EligibilityUiData)) {
                return false;
            }
            EligibilityUiData eligibilityUiData = (EligibilityUiData) obj;
            return Intrinsics.areEqual(unknownFields(), eligibilityUiData.unknownFields()) && Intrinsics.areEqual(this.loan_duration, eligibilityUiData.loan_duration) && Intrinsics.areEqual(this.start_plasma_flow_url, eligibilityUiData.start_plasma_flow_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LoanDuration loanDuration = this.loan_duration;
            int hashCode2 = (hashCode + (loanDuration != null ? loanDuration.hashCode() : 0)) * 37;
            String str = this.start_plasma_flow_url;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(12);
            builder.f1372android = this.loan_duration;
            builder.ios = this.start_plasma_flow_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LoanDuration loanDuration = this.loan_duration;
            if (loanDuration != null) {
                arrayList.add("loan_duration=" + loanDuration);
            }
            String str = this.start_plasma_flow_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_plasma_flow_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EligibilityUiData{", "}", 0, null, null, 56);
        }
    }

    public final class EligibleUiData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EligibleUiData> CREATOR;
        public final Money eligible_amount;
        public final Money eligible_loan_amount;
        public final Boolean has_downpayment;
        public final Boolean is_partial_retro;
        public final LoanDuration loan_duration;
        public final String start_plasma_flow_url;
        public final String url_to_open;

        static {
            PaymentPlanEligibilityRenderData$EligibleUiData$Companion$ADAPTER$1 paymentPlanEligibilityRenderData$EligibleUiData$Companion$ADAPTER$1 = new PaymentPlanEligibilityRenderData$EligibleUiData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EligibleUiData.class), "type.googleapis.com/squareup.franklin.PaymentPlanEligibilityRenderData.EligibleUiData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = paymentPlanEligibilityRenderData$EligibleUiData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentPlanEligibilityRenderData$EligibleUiData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibleUiData(LoanDuration loanDuration, String str, Money money, Boolean bool, String str2, Money money2, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.loan_duration = loanDuration;
            this.start_plasma_flow_url = str;
            this.eligible_amount = money;
            this.has_downpayment = bool;
            this.url_to_open = str2;
            this.eligible_loan_amount = money2;
            this.is_partial_retro = bool2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EligibleUiData)) {
                return false;
            }
            EligibleUiData eligibleUiData = (EligibleUiData) obj;
            return Intrinsics.areEqual(unknownFields(), eligibleUiData.unknownFields()) && Intrinsics.areEqual(this.loan_duration, eligibleUiData.loan_duration) && Intrinsics.areEqual(this.start_plasma_flow_url, eligibleUiData.start_plasma_flow_url) && Intrinsics.areEqual(this.eligible_amount, eligibleUiData.eligible_amount) && Intrinsics.areEqual(this.has_downpayment, eligibleUiData.has_downpayment) && Intrinsics.areEqual(this.url_to_open, eligibleUiData.url_to_open) && Intrinsics.areEqual(this.eligible_loan_amount, eligibleUiData.eligible_loan_amount) && Intrinsics.areEqual(this.is_partial_retro, eligibleUiData.is_partial_retro);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LoanDuration loanDuration = this.loan_duration;
            int hashCode2 = (hashCode + (loanDuration != null ? loanDuration.hashCode() : 0)) * 37;
            String str = this.start_plasma_flow_url;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.eligible_amount;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            Boolean bool = this.has_downpayment;
            int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str2 = this.url_to_open;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Money money2 = this.eligible_loan_amount;
            int hashCode7 = (hashCode6 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Boolean bool2 = this.is_partial_retro;
            int hashCode8 = hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Alias.Builder builder = new Alias.Builder(7, false);
            builder.f1407type = this.loan_duration;
            builder.scope = this.start_plasma_flow_url;
            builder.first_verified_at_ms = this.eligible_amount;
            builder.last_verified_at_ms = this.has_downpayment;
            builder.value = this.url_to_open;
            builder.created_at = this.eligible_loan_amount;
            builder.updated_at = this.is_partial_retro;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LoanDuration loanDuration = this.loan_duration;
            if (loanDuration != null) {
                arrayList.add("loan_duration=" + loanDuration);
            }
            String str = this.start_plasma_flow_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_plasma_flow_url=", arrayList);
            }
            Money money = this.eligible_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("eligible_amount=", money, arrayList);
            }
            Boolean bool = this.has_downpayment;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("has_downpayment=", bool, arrayList);
            }
            String str2 = this.url_to_open;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url_to_open=", arrayList);
            }
            Money money2 = this.eligible_loan_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("eligible_loan_amount=", money2, arrayList);
            }
            Boolean bool2 = this.is_partial_retro;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_partial_retro=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EligibleUiData{", "}", 0, null, null, 56);
        }
    }

    public final class LoanDuration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoanDuration> CREATOR;
        public final Long amount;
        public final TimeUnit time_unit;

        public enum TimeUnit implements WireEnum {
            WEEK(1),
            BIWEEKLY(2);

            public final int value;
            public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
            public static final PaymentPlanEligibilityRenderData$LoanDuration$TimeUnit$Companion$ADAPTER$1 ADAPTER = new PaymentPlanEligibilityRenderData$LoanDuration$TimeUnit$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TimeUnit.class), Syntax.PROTO_2, null);

            TimeUnit(int i) {
                this.value = i;
            }

            public static final TimeUnit fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return WEEK;
                }
                if (i != 2) {
                    return null;
                }
                return BIWEEKLY;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            PaymentPlanEligibilityRenderData$LoanDuration$Companion$ADAPTER$1 paymentPlanEligibilityRenderData$LoanDuration$Companion$ADAPTER$1 = new PaymentPlanEligibilityRenderData$LoanDuration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanDuration.class), "type.googleapis.com/squareup.franklin.PaymentPlanEligibilityRenderData.LoanDuration", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = paymentPlanEligibilityRenderData$LoanDuration$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentPlanEligibilityRenderData$LoanDuration$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanDuration(TimeUnit timeUnit, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.time_unit = timeUnit;
            this.amount = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoanDuration)) {
                return false;
            }
            LoanDuration loanDuration = (LoanDuration) obj;
            return Intrinsics.areEqual(unknownFields(), loanDuration.unknownFields()) && this.time_unit == loanDuration.time_unit && Intrinsics.areEqual(this.amount, loanDuration.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TimeUnit timeUnit = this.time_unit;
            int hashCode2 = (hashCode + (timeUnit != null ? timeUnit.hashCode() : 0)) * 37;
            Long l = this.amount;
            int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(13);
            builder.f1372android = this.time_unit;
            builder.ios = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            TimeUnit timeUnit = this.time_unit;
            if (timeUnit != null) {
                arrayList.add("time_unit=" + timeUnit);
            }
            Long l = this.amount;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("amount=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoanDuration{", "}", 0, null, null, 56);
        }
    }

    public enum Source implements WireEnum {
        CASH_CARD(1),
        CASH_APP_PAY(2),
        P2P(3);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final PaymentPlanEligibilityRenderData$Source$Companion$ADAPTER$1 ADAPTER = new PaymentPlanEligibilityRenderData$Source$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Source.class), Syntax.PROTO_2, null);

        Source(int i) {
            this.value = i;
        }

        public static final Source fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return CASH_CARD;
            }
            if (i == 2) {
                return CASH_APP_PAY;
            }
            if (i != 3) {
                return null;
            }
            return P2P;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum UiState implements WireEnum {
        ELIGIBLE(1),
        NOT_ELIGIBLE(2),
        CONVERTED_TO_PAYMENT_PLAN(3);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final PaymentPlanEligibilityRenderData$UiState$Companion$ADAPTER$1 ADAPTER = new PaymentPlanEligibilityRenderData$UiState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UiState.class), Syntax.PROTO_2, null);

        UiState(int i) {
            this.value = i;
        }

        public static final UiState fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ELIGIBLE;
            }
            if (i == 2) {
                return NOT_ELIGIBLE;
            }
            if (i != 3) {
                return null;
            }
            return CONVERTED_TO_PAYMENT_PLAN;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PaymentPlanEligibilityRenderData$Companion$ADAPTER$1 paymentPlanEligibilityRenderData$Companion$ADAPTER$1 = new PaymentPlanEligibilityRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentPlanEligibilityRenderData.class), "type.googleapis.com/squareup.franklin.PaymentPlanEligibilityRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = paymentPlanEligibilityRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentPlanEligibilityRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentPlanEligibilityRenderData(UiState uiState, zzdx zzdxVar, Source source, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.ui_state = uiState;
        this.ui_state_data = zzdxVar;
        this.source = source;
        this.is_p2p_eligible_customer = bool;
        this.expire_at = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentPlanEligibilityRenderData)) {
            return false;
        }
        PaymentPlanEligibilityRenderData paymentPlanEligibilityRenderData = (PaymentPlanEligibilityRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), paymentPlanEligibilityRenderData.unknownFields()) && this.ui_state == paymentPlanEligibilityRenderData.ui_state && Intrinsics.areEqual(this.ui_state_data, paymentPlanEligibilityRenderData.ui_state_data) && this.source == paymentPlanEligibilityRenderData.source && Intrinsics.areEqual(this.is_p2p_eligible_customer, paymentPlanEligibilityRenderData.is_p2p_eligible_customer) && Intrinsics.areEqual(this.expire_at, paymentPlanEligibilityRenderData.expire_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiState uiState = this.ui_state;
        int hashCode2 = (hashCode + (uiState != null ? uiState.hashCode() : 0)) * 37;
        zzdx zzdxVar = this.ui_state_data;
        int hashCode3 = (hashCode2 + (zzdxVar != null ? zzdxVar.hashCode() : 0)) * 37;
        Source source = this.source;
        int hashCode4 = (hashCode3 + (source != null ? source.hashCode() : 0)) * 37;
        Boolean bool = this.is_p2p_eligible_customer;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.expire_at;
        int hashCode6 = hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(12, false);
        builder.alias = this.ui_state;
        builder.version = this.ui_state_data;
        builder.display_date = this.source;
        builder.verified = this.is_p2p_eligible_customer;
        builder.expires_at = this.expire_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiState uiState = this.ui_state;
        if (uiState != null) {
            arrayList.add("ui_state=" + uiState);
        }
        zzdx zzdxVar = this.ui_state_data;
        if (zzdxVar != null) {
            arrayList.add("ui_state_data=" + zzdxVar);
        }
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        Boolean bool = this.is_p2p_eligible_customer;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_p2p_eligible_customer=", bool, arrayList);
        }
        Long l = this.expire_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentPlanEligibilityRenderData{", "}", 0, null, null, 56);
    }
}
