package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.p2p.engine.api.v1.PaymentSponsorApprovalStatus;
import com.squareup.cash.p2p.engine.api.v1.PaymentType;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.hieroglyph.KeyScope;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes8.dex */
public final class FiatP2pRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FiatP2pRenderData> CREATOR;
    public final AllowanceRenderData allowance_data;
    public final String cancel_payment_url;
    public final CustomerRequiredAction customer_required_action;
    public final Boolean is_cash_for_business;
    public final PaymentSource payment_source;
    public final PaymentSponsorApprovalStatus payment_sponsor_approval_status;
    public final PaymentType payment_type;
    public final String raw_p2p_engine_payment_state_code;
    public final RecurringPaymentRenderData recurring_payment_data;
    public final String refund_payment_url;
    public final String resume_payment_url;
    public final SquarePayrollRenderData square_payroll_data;

    public enum CustomerRequiredAction implements WireEnum {
        IDV(1),
        CONFIRM(2),
        KNOW_YOUR_CUSTOMER_REFRESH(3),
        SOURCE_OF_FUNDS_REFRESH(4),
        PROVIDE_LEGAL_NAME(5),
        PASSCODE_AUTHENTICATION(6),
        GENERIC_ACTION_REQUIRED(7);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final FiatP2pRenderData$CustomerRequiredAction$Companion$ADAPTER$1 ADAPTER = new FiatP2pRenderData$CustomerRequiredAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CustomerRequiredAction.class), Syntax.PROTO_2, null);

        CustomerRequiredAction(int i) {
            this.value = i;
        }

        public static final CustomerRequiredAction fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return IDV;
                case 2:
                    return CONFIRM;
                case 3:
                    return KNOW_YOUR_CUSTOMER_REFRESH;
                case 4:
                    return SOURCE_OF_FUNDS_REFRESH;
                case 5:
                    return PROVIDE_LEGAL_NAME;
                case 6:
                    return PASSCODE_AUTHENTICATION;
                case 7:
                    return GENERIC_ACTION_REQUIRED;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum PaymentSource implements WireEnum {
        FIATLY(1),
        P2P_ENCORE(2),
        SQUARE_PAYROLL(3);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final FiatP2pRenderData$PaymentSource$Companion$ADAPTER$1 ADAPTER = new FiatP2pRenderData$PaymentSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentSource.class), Syntax.PROTO_2, null);

        PaymentSource(int i) {
            this.value = i;
        }

        public static final PaymentSource fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return FIATLY;
            }
            if (i == 2) {
                return P2P_ENCORE;
            }
            if (i != 3) {
                return null;
            }
            return SQUARE_PAYROLL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FiatP2pRenderData$Companion$ADAPTER$1 fiatP2pRenderData$Companion$ADAPTER$1 = new FiatP2pRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FiatP2pRenderData.class), "type.googleapis.com/squareup.franklin.FiatP2pRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = fiatP2pRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fiatP2pRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiatP2pRenderData(PaymentSource paymentSource, AllowanceRenderData allowanceRenderData, CustomerRequiredAction customerRequiredAction, String str, String str2, String str3, SquarePayrollRenderData squarePayrollRenderData, String str4, Boolean bool, PaymentSponsorApprovalStatus paymentSponsorApprovalStatus, PaymentType paymentType, RecurringPaymentRenderData recurringPaymentRenderData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_source = paymentSource;
        this.allowance_data = allowanceRenderData;
        this.customer_required_action = customerRequiredAction;
        this.cancel_payment_url = str;
        this.refund_payment_url = str2;
        this.resume_payment_url = str3;
        this.square_payroll_data = squarePayrollRenderData;
        this.raw_p2p_engine_payment_state_code = str4;
        this.is_cash_for_business = bool;
        this.payment_sponsor_approval_status = paymentSponsorApprovalStatus;
        this.payment_type = paymentType;
        this.recurring_payment_data = recurringPaymentRenderData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FiatP2pRenderData)) {
            return false;
        }
        FiatP2pRenderData fiatP2pRenderData = (FiatP2pRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), fiatP2pRenderData.unknownFields()) && this.payment_source == fiatP2pRenderData.payment_source && Intrinsics.areEqual(this.allowance_data, fiatP2pRenderData.allowance_data) && this.customer_required_action == fiatP2pRenderData.customer_required_action && Intrinsics.areEqual(this.cancel_payment_url, fiatP2pRenderData.cancel_payment_url) && Intrinsics.areEqual(this.refund_payment_url, fiatP2pRenderData.refund_payment_url) && Intrinsics.areEqual(this.resume_payment_url, fiatP2pRenderData.resume_payment_url) && Intrinsics.areEqual(this.square_payroll_data, fiatP2pRenderData.square_payroll_data) && Intrinsics.areEqual(this.raw_p2p_engine_payment_state_code, fiatP2pRenderData.raw_p2p_engine_payment_state_code) && Intrinsics.areEqual(this.is_cash_for_business, fiatP2pRenderData.is_cash_for_business) && this.payment_sponsor_approval_status == fiatP2pRenderData.payment_sponsor_approval_status && this.payment_type == fiatP2pRenderData.payment_type && Intrinsics.areEqual(this.recurring_payment_data, fiatP2pRenderData.recurring_payment_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PaymentSource paymentSource = this.payment_source;
        int hashCode2 = (hashCode + (paymentSource != null ? paymentSource.hashCode() : 0)) * 37;
        AllowanceRenderData allowanceRenderData = this.allowance_data;
        int hashCode3 = (hashCode2 + (allowanceRenderData != null ? allowanceRenderData.hashCode() : 0)) * 37;
        CustomerRequiredAction customerRequiredAction = this.customer_required_action;
        int hashCode4 = (hashCode3 + (customerRequiredAction != null ? customerRequiredAction.hashCode() : 0)) * 37;
        String str = this.cancel_payment_url;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.refund_payment_url;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.resume_payment_url;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        SquarePayrollRenderData squarePayrollRenderData = this.square_payroll_data;
        int hashCode8 = (hashCode7 + (squarePayrollRenderData != null ? squarePayrollRenderData.hashCode() : 0)) * 37;
        String str4 = this.raw_p2p_engine_payment_state_code;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.is_cash_for_business;
        int hashCode10 = (hashCode9 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        PaymentSponsorApprovalStatus paymentSponsorApprovalStatus = this.payment_sponsor_approval_status;
        int hashCode11 = (hashCode10 + (paymentSponsorApprovalStatus != null ? paymentSponsorApprovalStatus.hashCode() : 0)) * 37;
        PaymentType paymentType = this.payment_type;
        int hashCode12 = (hashCode11 + (paymentType != null ? paymentType.hashCode() : 0)) * 37;
        RecurringPaymentRenderData recurringPaymentRenderData = this.recurring_payment_data;
        int hashCode13 = hashCode12 + (recurringPaymentRenderData != null ? recurringPaymentRenderData.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(20, false);
        builder.key_path_ref = this.payment_source;
        builder.int_literal = this.allowance_data;
        builder.float_literal = this.customer_required_action;
        builder.string_literal = this.cancel_payment_url;
        builder.blob_literal = this.refund_payment_url;
        builder.unary_op = this.resume_payment_url;
        builder.binary_op = this.square_payroll_data;
        builder.conditional_op = this.raw_p2p_engine_payment_state_code;
        builder.bool_literal = this.is_cash_for_business;
        builder.filter_op = this.payment_sponsor_approval_status;
        builder.collection_literal = this.payment_type;
        builder.format_string_op = this.recurring_payment_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PaymentSource paymentSource = this.payment_source;
        if (paymentSource != null) {
            arrayList.add("payment_source=" + paymentSource);
        }
        AllowanceRenderData allowanceRenderData = this.allowance_data;
        if (allowanceRenderData != null) {
            arrayList.add("allowance_data=" + allowanceRenderData);
        }
        CustomerRequiredAction customerRequiredAction = this.customer_required_action;
        if (customerRequiredAction != null) {
            arrayList.add("customer_required_action=" + customerRequiredAction);
        }
        String str = this.cancel_payment_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cancel_payment_url=", arrayList);
        }
        String str2 = this.refund_payment_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "refund_payment_url=", arrayList);
        }
        String str3 = this.resume_payment_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "resume_payment_url=", arrayList);
        }
        SquarePayrollRenderData squarePayrollRenderData = this.square_payroll_data;
        if (squarePayrollRenderData != null) {
            arrayList.add("square_payroll_data=" + squarePayrollRenderData);
        }
        String str4 = this.raw_p2p_engine_payment_state_code;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "raw_p2p_engine_payment_state_code=", arrayList);
        }
        Boolean bool = this.is_cash_for_business;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_for_business=", bool, arrayList);
        }
        PaymentSponsorApprovalStatus paymentSponsorApprovalStatus = this.payment_sponsor_approval_status;
        if (paymentSponsorApprovalStatus != null) {
            arrayList.add("payment_sponsor_approval_status=" + paymentSponsorApprovalStatus);
        }
        PaymentType paymentType = this.payment_type;
        if (paymentType != null) {
            arrayList.add("payment_type=" + paymentType);
        }
        RecurringPaymentRenderData recurringPaymentRenderData = this.recurring_payment_data;
        if (recurringPaymentRenderData != null) {
            arrayList.add("recurring_payment_data=" + recurringPaymentRenderData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FiatP2pRenderData{", "}", 0, null, null, 56);
    }
}
